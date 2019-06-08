	package co.com.belatrix.stream;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import co.com.belatrix.utils.Constant;
import co.com.belatrix.utils.Utils;

/**
 * 
 * @author alejo
 *
 */
public class RegularExpressions 
{
	/**
	 * 
	 * @param _expression
	 * @param value
	 * @return
	 */
	public static synchronized String getValueFromExpression(String _expression, String _value)
	{
		StringBuilder _return_ = new StringBuilder();
		Pattern pattern = Pattern.compile(_expression, Pattern.MULTILINE);
		Matcher match = pattern.matcher(_value);
		
		while(match.find())
		{
		
			_return_.append(match.group()).append(Constant.COMMA);
			
		}
		
		return _return_.toString();
	}
	
	/**
	 * 
	 * @param _expression
	 * @param _value
	 * @param _group
	 * @return
	 */
	public static synchronized String getValueFromExpression(String _expression, String _value, String _group)
	{
		StringBuilder _return_ = new StringBuilder();
		Pattern pattern = Pattern.compile(_expression, Pattern.MULTILINE);
		Matcher match = pattern.matcher(_value);
		
		while(match.find())
		{
			if(_group == null)
			{
				_return_.append(match.group());
			}
			else if(_group != null && !_group.isEmpty())
			{
				int group = Utils.isNumeric(_group);
				_return_.append(match.group(group));
			}else
			{
				_return_.append(match.group());
			}
		}
		
		return _return_.toString();
	}
	
	

}
