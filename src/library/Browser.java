package library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;



public class Browser {
	public static WebDriver driver = null;
	String baseUrl="http://automationpractice.com/index.php";
	
	@BeforeSuite
	//initialize browser
	public void browserinitialize()
     {
      driver=new FirefoxDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      driver.get(baseUrl);
}
	
	@AfterSuite
	 //Test cleanup
	 public void TeardownTest()
	    {
		Browser.driver.quit();
	    }
}
