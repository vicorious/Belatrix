package co.com.belatrix.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import co.com.belatrix.stream.FilesBelatrix;
import co.com.belatrix.stream.RegularExpressions;
import co.com.belatrix.stream.URLBelatrix;
import co.com.belatrix.utils.Constant;
import co.com.belatrix.utils.Constant.ConstantMessage;
import co.com.belatrix.utils.Constant.ConstantRegex;

/**
 * Class stored method's about of processing URLS index 
 * @author alejo
 *
 */
public class URLFacade 
{
	/**
	 * 
	 * @param _path
	 * @param _arg
	 * @return
	 */
	public void processFinalFile(String _path, String _arg, String _matcher, String _path_out)
	{	
		List<String> pages = new ArrayList<>();
		
		if(!(_arg.equalsIgnoreCase(Constant.HASH_TAG) || _arg.equalsIgnoreCase(Constant.TWITTER) || _arg.equalsIgnoreCase(Constant.ANY)))
		{
			throw new IllegalArgumentException(ConstantMessage.ARG_INVALID);
		}
		 
		try (BufferedReader br = Files.newBufferedReader(Paths.get(_path))) 
		{
			pages = br.lines().collect(Collectors.toList());
			
			String html_out_path = _path_out.concat(Constant.HTML_DIRECTORY);
			
			FilesBelatrix.createDirectory(html_out_path);
			
			for(String page: pages)
			{	
				String html = new String();
				Optional<Object> html_optional = this.processInitialFile(page);
				
				if(html_optional.isPresent())
				{
					html = html_optional.get().toString();
					
				}else
				{
					System.out.println(ConstantMessage.GET_HTML_FROM.concat(page).concat(ConstantMessage.IS_FAILED));
					continue;
				}
			
				String result =  new String();						
			
				switch(_arg)
				{
					case Constant.HASH_TAG:
					
						result = RegularExpressions.getValueFromExpression(ConstantRegex.ONLY_HASH.concat(_matcher).concat(ConstantRegex.ONLY_2), html);
					
					case Constant.TWITTER:
					
						result = RegularExpressions.getValueFromExpression(ConstantRegex.ONLY_TWITTER.concat(_matcher).concat(ConstantRegex.ONLY_2), html);
						
					case Constant.ANY:
						
						result = RegularExpressions.getValueFromExpression(_matcher, html);	
					default:
						break;
										
				}
				
				String normalize_name = new String();
				
				if(page.contains(Constant.WWW))
				{
					normalize_name = RegularExpressions.getValueFromExpression(ConstantRegex.REGEX_NAME_PAGE_WWW, page, "2");
				}else
				{
					normalize_name = RegularExpressions.getValueFromExpression(ConstantRegex.REGEX_NAME_PAGE, page, "2");
				}
				
				FilesBelatrix.writeFile(html_out_path.concat(normalize_name).concat(Constant.HTML_EXTENSION), html);
				
				String name_file = normalize_name.concat(Constant.UNDERSCORE).concat(_arg).concat(Constant.UNDERSCORE).concat(Constant.FINAL_FILE_NAME).concat(Constant.EXTENSION);
			
				FilesBelatrix.writeFile(_path_out.concat(Constant.SLASH).concat(name_file), result);
			}
			
		} catch (IOException e) 
		{
			throw new IllegalArgumentException(ConstantMessage.CANNOT_READ_FILE.concat(e.getMessage()));			
		}						
	}
	
	/**
	 * 
	 * @param _page
	 * @return
	 * @throws IOException
	 */
	private Optional<Object> processInitialFile(String _page) throws IOException
	{
		Optional<Object> html = URLBelatrix.getHtmlFromPage(_page);
		return  html.isPresent() ? html : Optional.empty() ;
		
	}		

}

