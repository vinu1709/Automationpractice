package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigPropertyFile {
	
		// TODO Auto-generated method stub\
		public static void prop() throws Throwable{
		Properties properties=new Properties();
		FileInputStream ip=new FileInputStream("C:/Users/user/workspace/AutomationTestPractice/config.properties");
		properties.load(ip);
		
		}

	

}
