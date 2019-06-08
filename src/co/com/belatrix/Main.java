package co.com.belatrix;

import co.com.belatrix.facade.URLFacade;
import co.com.belatrix.utils.Constant.ConstantMessage;

/**
 * 
 */

/**
 * @author alejo
 *
 */
public class Main 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		if(args == null)
		{
			throw new IllegalArgumentException(ConstantMessage.NULL_PARAMETERS);
		}
		if(args.length <= 3)
		{
			throw new IllegalArgumentException(ConstantMessage.MINOR_3_ARGUMENTS);
		}
		if(args.length > 4)
		{
			throw new IllegalArgumentException(ConstantMessage.MAJOR_4_ARGUMENTS);
		}
		
		URLFacade facade = new URLFacade();
		
		facade.processFinalFile(args[0], args[1], args[2], args[3]);				
		
		System.out.println(ConstantMessage.FINISH);

	}

}
