/**
 * 
 */
package co.com.belatrix.to;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author alejo
 *
 */
public class Page 
{
	private String name;
	
	private String content;
	
	public Page(){};

	public Page(String name, String content) 
	{
		super();
		this.name = name;
		this.content = content;
	}
	public Page(String name) 
	{
		super();
		this.name = name;		
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getContent() 
	{
		return content;
	}

	public void setContent(String content) 
	{
		this.content = content;
	}	
	
	public static List<Page> buildFromArray(ConcurrentHashMap<String, String> _elementos) 
	{
		List<Page> resultado = new ArrayList<>();
		_elementos.entrySet().stream().parallel().map(pagina -> new Page(pagina.getKey(), pagina.getValue())).forEach(resultado::add);	    
	    return resultado;
	}

}