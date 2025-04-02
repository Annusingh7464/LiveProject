package ConfigReader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigClass 
{
 
	public static Properties getURLData()
	{
		Properties prop = new Properties();
		
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\java\\configFile\\config.properties");
		
		try {
		 FileInputStream fis = new FileInputStream(file);
		 prop.load(fis);
		}
		catch(Throwable e)
		{
			e.printStackTrace();
		}
		
		
		return prop ;
	}
	
	
}
