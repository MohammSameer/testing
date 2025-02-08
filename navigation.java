package SELENIUM_BASICS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.google.com/");
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("APjFqb")).sendKeys("india");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("APjFqb")).submit();
		 
		 Thread.sleep(2000);
		 
		 driver.navigate().to("https://www.instagram.com/");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys("sammer@gmail.com");
		 
		 Thread.sleep(2000);
		 
		 driver.navigate().refresh();
		 
		 Thread.sleep(2000);
		 
		 driver.navigate().back();
		 
		 Thread.sleep(2000);
		 
		 driver.navigate().forward();
		 
		 Thread.sleep(2000);
		 
		 driver.quit();
		 
		 
	}

}
