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


public class nimbleweb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nimblework.com/");
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		Actions mouseover=new Actions(driver);
	    WebElement bot=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='ka-button']")));
	    mouseover.moveToElement(bot).perform();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ka-button']/descendant::img[@class='imageSrcIcon']"))).click();
	//	driver.findElement(By.xpath("//div[@class='ka-button']/descendant::img[@class='imageSrcIcon']")).click();
		
	}

}
