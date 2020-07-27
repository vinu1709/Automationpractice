package testcases;

import library.Browser;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;


public class ProductPageTest extends Browser {	
	@Test
	//Scroll down and add cart product validation
	public void addproductcart() throws InterruptedException{		
		HomePage addcartproduct=PageFactory.initElements(driver, HomePage.class);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		   addcartproduct.addcart();
		   Thread.sleep(1000);
		   addcartproduct.addcartpage();
		   JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", HomePage.addcartsuccess);
			String quantity=HomePage.addcartquantity.getText();
			System.out.println(quantity);
			int n=Integer.parseInt(quantity);
			if(n>0){
				System.out.println("product has been added to cart");
			}		
		
}
}