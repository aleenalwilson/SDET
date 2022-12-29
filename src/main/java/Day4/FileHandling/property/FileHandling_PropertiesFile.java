/*
"A Property file with name as Credentials.properties is present with the following information
username=selenium
password=selenium@123

Create a Java Code implementing method to read property file and then print username and password on console

Note: The candidate to create the property file with the above information"
 */
package Day4.FileHandling.property;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class FileHandling_PropertiesFile {

	static Properties prop=new Properties();
	static String projectPath=System.getProperty("user.dir");
	static InputStream input;

	public static void main(String[] args) {

		System.out.println("Username from Property File: "+readUsername());
		System.out.println("Password from Property File: "+readPassword());

	}

	public static String readUsername()
	{
		try 
		{
			
			input=new FileInputStream(projectPath+"/src/main/java/Day4/FileHandling/property/Credentials.properties");
			prop.load(input);
			//System.out.println(prop.getProperty("username"));
			return prop.getProperty("username");
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return null;
	
	}
	
	public static String readPassword()
	{
		try 
		{
			
			input=new FileInputStream(projectPath+"/src/main/java/Day4/FileHandling/property/Credentials.properties");
			prop.load(input);
			//System.out.println(prop.getProperty("password"));
			return prop.getProperty("password");
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return null;
	
	}

}
