package co.com.belatrix.utils;

/**
 * 
 * @author alejo
 *
 */
public abstract class Constant 
{
	
	public static final String TWITTER = "TWITTER";
	
	public static final String HASH_TAG = "HASH";	
	
	public static final String ANY = "ANY";
	
	public static final String FINAL_FILE_NAME = "final";
	
	public static final String EXTENSION = ".txt";
	
	public static final String HTML_EXTENSION = ".html";
	
	public static final String UNDERSCORE = "_";
	
	public static final String WWW = "www";
	
	public static final String SLASH = "/";
	
	public static final String HTML_DIRECTORY = "/html/";
	
	public static final String ACCEPT_LANGUAGE = "Accept-Language";
	
	public static final String ACCEPT_LANGUAGE_VALUE = "en-US,en;q=0.8";
	
	public static final String USER_AGENT = "User-Agent";
	
	public static final String USER_AGENT_VALUE = "Mozilla";
	
	public static final String REFERER = "Referer";
	
	public static final String REFERER_VALUE = "google.com";
	
	public static final String LOCATION = "Location";
	
	public static final String COMMA = ",";
	
	
	
	/**
	 * 
	 * @author alejo
	 *
	 */
	public abstract class ConstantRegex
	{
		public static final String ONLY_HASH = "\\";
		
		public static final String ONLY_TWITTER = "\\"; 
		
		public static final String ONLY_2 = "[A-Za-z0-9]+";
		
		public static final String REGEX_NAME_PAGE = "(http|https)\\:\\//(.+)?\\.com";
		
		public static final String REGEX_NAME_PAGE_WWW = "(http|https)\\:\\//\\www\\.(.+)?\\.com";
		
	}
	
	/**
	 * 
	 * @author alejo
	 *
	 */
	public abstract class ConstantMessage
	{
		public static final String CANNOT_READ_FILE = "We cant read file! Try again and see the log after. Exception: ";
		
		public static final String ARG_INVALID = "Arg invalid, please send a valid arg (HASH, TWITTER OR ANY)";
		
		public static final String RESPONSE_CODE = "Response Code ... ";
		
		public static final String REDIRECT_URL = "Redirect to URL : ";
		
		public static final String REQUEST_URL = "Request URL ... ";
		
		public static final String CREATE_INVALID_DIRECTORY = "Try create directory and failed. See log. Error: ";
		
		public static final String CANNOT_WRITE_FILE = "File write failed!. Error: ";
		
		public static final String DIRECTORY_EXISTS = "Directory already exists"; 
		
	    public static final String GET_HTML_FROM = "get HTML from ";
	    
	    public static final String IS_FAILED = " is failed";
	    
	    public static final String NULL_PARAMETERS = "Null arguments";
	    
	    public static final String MINOR_3_ARGUMENTS = "Minor 3 arguments";
	    
	    public static final String MAJOR_4_ARGUMENTS = "Major 3 arguments";
	    
	    public static final String DONE = "Done";
	    
	    public static final String FINISH = "Finish!";
		
	}
	

}

