package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import library.Browser;
import pages.HomePage;

public class HomePageTest extends Browser{
	static String product="shirts";	
	@Test
	//product search validation
	public void sendproduct(){	
    HomePage searchproductpage=PageFactory.initElements(driver, HomePage.class);
	searchproductpage.productSearch(product);	
	searchproductpage.clickonproductSearch();
	searchproductpage.productresultsList();
		try{
			for(int i = 0; i<HomePage.productlist.size();i++) {
				String temp = HomePage.productlist.get(i).getText();
				System.out.println(temp);
				if (temp.equalsIgnoreCase(product)){			
				Assert.assertTrue(true, product +" is displayed on product title Product Title: " + temp);				 
				}	
			}	
		}
			catch(Exception e) {
				Assert.assertFalse(false,  "Exception thrown. Exception: " + e.toString());;	
			}
			
	}
	
	}
	



