	package SELENIUM_BASICS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drop_down {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/s/jackets-and-shrugs-5427-72361?query=:relevance&classifier=intent");
		
		Thread.sleep(2500);
		// step-1 to create object for drop down list
		 
		 Select s=new Select(driver.findElement(By.id("sortBy")));
		 
		//step-2  to get all options on console
		 System.out.print("here are the all options:");
		 
		   List<WebElement> st=s.getOptions();
		   
		   for(WebElement options: st) {
			   
			   System.out.println(options.getText());
			   
		   }	   
			   
		//step-3 we can select in three ways 1)select by visible text 
		//                                   2)select by value
	    //									 3)select by indexed position
		
			   System.out.println("show the selected options in order");
			   s.selectByVisibleText("What's New");	
			   Thread.sleep(2000);
			   s.selectByVisibleText("Ratings");
			   Thread.sleep(2000);
			   s.selectByVisibleText("Relevance");
			   Thread.sleep(2000);
			   s.selectByVisibleText("Price (highest first)");
			   Thread.sleep(2000);
			   s.selectByVisibleText("Discount");
			   Thread.sleep(2000);
			   s.selectByVisibleText("Price (lowest first)");
			   Thread.sleep(2000);
			   
			  List<WebElement> elements=s.getAllSelectedOptions(); 
			  
			  for (WebElement web : elements) {
				System.out.println(web.getText());
			}
			   
			/*   for(int i=0;i<=5;i++){
				   for(WebElement selectedobject:st){
		   				s.selectByIndex(i);
		   				Thread.sleep(1000);
		   				System.out.println(selectedobject.getText());
		   			}	
				   
				String ss=s.getFirstSelectedOption().getText();
				
				System.out.println(ss);*/
		   			
		   		}		
	
	}

