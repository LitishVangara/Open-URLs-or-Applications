package com.jsp.openApplications;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class OpenAppliactions 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, URISyntaxException
	{
		Runtime runtime = Runtime.getRuntime();
		//to open Calculator
		runtime.exec("calc");
		//to open the NotePad
		runtime.exec("notepad");
		//start the Default Browser
		//runtime.exec("start https://www.google.com");
		URI url = new URI("https://www.google.com");
		runtime.exec("rundll32 url.dll,FileProtocolHandler"+url);
		String url1 = "https://www.google.com";
		runtime.exec("rundll32 url.dll,FileProtocolHandler"+url1);
		//We can Print the Comment Line like this : 
		//\u000d System.out.println("Please Open Application");
	}
}
