package SELENIUM_BASICS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_msg {
	
	public static void main(String[] args) throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.tutorialrepublic.com/snippets/preview.php?topic=bootstrap&file=simple-success-confirmation-popup");
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Click to Open Confirm Modal")).click();
		
		Alert b =driver.switchTo().alert();
		
		b.accept();
		
		Thread.sleep(2000);
		}
}
