package testcases;

import java.util.concurrent.TimeUnit;

import library.Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.HomePage;

public class AddCartPageTest extends Browser {	
	@Test
	//Scroll down and mouse hover,increment,decrement validation
	public void addMore() throws InterruptedException{
		HomePage addmoreproduct=PageFactory.initElements(driver, HomePage.class);
		Actions actions = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");		   
		actions.moveToElement(HomePage.addmore).click().build().perform();;
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	String item=HomePage.productquantity.getAttribute("value");
	int count=Integer.parseInt(item);
	int previouscount=count;
//Increment Quantity validation	
		addmoreproduct.productIncrement();		
		boolean increment= false;
		if(count>0){
		count++;
		}
		if(previouscount+1==count){
		increment = true;
		}
		System.out.println("product count incremented");
//Decrement Quantity validaton		
		addmoreproduct.productDecrement();
        boolean decrement= false;
        if(count>0){
        count--;
        }
        if(previouscount-1==count){
        decrement = true;
       }
        System.out.println("product count decremented");
	}
}
