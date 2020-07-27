package pages;

import java.util.List;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;


public class HomePage {
	static WebDriver driver;
	public static String Product="";
    public HomePage(WebDriver driver){ 
            this.driver=driver; 
    }
 //find the element locators
  @FindBy(xpath="//input[@id='search_query_top']")
   WebElement searchbox;	   
   
  @FindBy(xpath="//button[@name='submit_search']")
   WebElement searchbutton;
   
  @FindBy(xpath="//div[@class='right-block']//a[@class='product-name']")
  public static List<WebElement> productlist;		 		  
   
  @FindBy(xpath="//span[contains(text(),'Add to cart')]")
  WebElement addcartbutton;
  
  @FindBy(xpath="//div[@class='layer_cart_product col-xs-12 col-md-6']")
  public static WebElement addcartsuccess;
  
  @FindBy(xpath="//span[@id='layer_cart_product_quantity']")
  public static WebElement addcartquantity;
  
  @FindBy(xpath="//span[contains(text(),'More')]")
  public static WebElement addmore;
  
  @FindBy(xpath="//input[@id='quantity_wanted']")
  public static WebElement productquantity;
  
  @FindBy(xpath="//i[@class='icon-plus']")
  WebElement Increment;
  
  @FindBy(xpath="//i[@class='icon-minus']")
  WebElement Decrement;
  
  @FindBy(xpath="//a[@class='login']")
  WebElement Login;
  
  @FindBy(xpath="//input[@id='email']")
  WebElement Username;
  
  @FindBy(xpath="//input[@id='passwd']")
  WebElement Password;
  
  @FindBy(xpath="//button[@id='SubmitLogin']//span")
  WebElement Submitlogin;
  
  //function to send the product 
  public void productSearch(String Product){
	   searchbox.sendKeys(Product);
	}
//function to click on product search
   public void clickonproductSearch(){
	   searchbutton.click();
	}
 //function to get the product list
   public void productresultsList(){
	   productlist.size();
	}
 // function to click on addcartbutton
   public void addcart(){
	   addcartbutton.click();
	}
 // add cart function
   public void addcartpage(){
	   addcartsuccess.click();
   } 
   
// product quantity function
   public void prodquantity(){
	   productquantity.getText();
   }
   
//Increment function   
   public void productIncrement(){
	   Increment.click();
   }
   
//Decrement function   
   public void productDecrement(){
	   Decrement.click();
   }
//login page function
   public void clickonlogin(){
	   Login.click();
   }
// username function  
   public void sendusername(String username){
	   Username.sendKeys(username);
   }
//password function 
   public void sendpassword(String password){
	   Password.sendKeys(password);
   }
//submit button function   
   public void submitlogin(){
	   Submitlogin.click();
   }
   
}
