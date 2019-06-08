/**
 * 
 */
package co.com.belatrix.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Optional;

import co.com.belatrix.utils.Constant;
import co.com.belatrix.utils.Constant.ConstantMessage;

/**
 * @author digital
 *
 */
public abstract class URLBelatrix 
{
	/**
	 * 
	 * @param _page
	 * @return
	 * @throws IOException
	 */
	public static synchronized Optional<Object> getHtmlFromPage(String _page) throws IOException
	{
		URL obj = new URL(_page);
		HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
		conn.setReadTimeout(5000);
		conn.addRequestProperty(Constant.ACCEPT_LANGUAGE, Constant.ACCEPT_LANGUAGE_VALUE);
		conn.addRequestProperty(Constant.USER_AGENT, Constant.USER_AGENT_VALUE);
		conn.addRequestProperty(Constant.REFERER, Constant.REFERER_VALUE);

		System.out.println(ConstantMessage.REQUEST_URL.concat(_page));

		boolean redirect = false;

		int status = conn.getResponseCode();
		if (status != HttpURLConnection.HTTP_OK) 
		{
			if (status == HttpURLConnection.HTTP_MOVED_TEMP || status == HttpURLConnection.HTTP_MOVED_PERM || status == HttpURLConnection.HTTP_SEE_OTHER)
				redirect = true;
		}

		System.out.println(ConstantMessage.RESPONSE_CODE.concat(String.valueOf(status)));

		if (redirect) 
		{
			String newUrl = conn.getHeaderField(Constant.LOCATION);

			// Only set cookie if you need Login
			//String cookies = conn.getHeaderField("Set-Cookie");

			conn = (HttpURLConnection) new URL(newUrl).openConnection();
			//conn.setRequestProperty("Cookie", cookies);
			conn.addRequestProperty(Constant.ACCEPT_LANGUAGE, Constant.ACCEPT_LANGUAGE_VALUE);
			conn.addRequestProperty(Constant.USER_AGENT, Constant.USER_AGENT_VALUE);
			conn.addRequestProperty(Constant.REFERER, Constant.REFERER_VALUE);
									
			System.out.println(ConstantMessage.REDIRECT_URL.concat(newUrl));

		}

		BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String inputLine;
		StringBuilder html = new StringBuilder();

		while ((inputLine = in.readLine()) != null) 
		{
			html.append(inputLine);
		}
		
		in.close();
		
		System.out.println(ConstantMessage.DONE);

		return Optional.of(html.toString());
	}

}
