package SELENIUM_BASICS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamic_tpc {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
	   WebDriverManager.chromedriver().setup();
	   
	   WebDriver driver = new ChromeDriver();
	   
	   driver.manage().window().maximize();
	   
	   driver.get("https://www.amazon.in/");
	   
	   //explicitly wait
	   
	   WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	   
	   //checking whether the element is present or not for mouse overing
	   
	   WebElement m= wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nav-link-accountList")));
	   
	   //to mouse over we need to define the (actions)-command
	   
	   Actions b = new Actions(driver);
	   
	   b.moveToElement(m).perform();
	   
	   // OR
	   //b.moveToElement(wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nav-link-accountList")))).perform();
	
	   WebElement s=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Sign in')]")));
	   
	   s.click();
	}

}
