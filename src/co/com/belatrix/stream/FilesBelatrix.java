package co.com.belatrix.stream;	

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import co.com.belatrix.utils.Constant.ConstantMessage;

/**
 * 
 * @author alejo
 *
 */
public abstract class FilesBelatrix 
{
	/**
	 * 
	 * @param _path
	 * @param _content
	 */
	public static synchronized void writeFile(String _path, String _content)
	{				 
		try 
		{
			Files.write(Paths.get(_path), _content.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
		} catch (IOException e) 
		{
			throw new IllegalStateException(ConstantMessage.CANNOT_WRITE_FILE.concat(e.getMessage()));
		}
	}
	
	/**
	 * 
	 * @param _path
	 */
	public static synchronized void createDirectory(String _path)
	{
        Path path = Paths.get(_path);

        if (!Files.exists(path)) 
        {
            try 
            {
				Files.createDirectory(path);
			} catch (IOException e) 
            {
				throw new IllegalAccessError(ConstantMessage.CREATE_INVALID_DIRECTORY.concat(e.getMessage()));
			}
            
        } else 
        {
            
            System.out.println(ConstantMessage.DIRECTORY_EXISTS);
        }
	}
	
}