package SELENIUM_BASICS;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class window_changing {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.swiggy.com/");
		
		Thread.sleep(3000);
		
		//text condition formula= tagname[contains(text(),’value’)]
		
		driver.findElement(By.xpath("//div[contains(text(),'Careers')]")).click();
		
		//for handling windows: syntax-->getwindowhandles()
		
		Set<String> h=driver.getWindowHandles();
		
		System.out.println(h+driver.getTitle());
		
		Iterator<String>i =h.iterator();
		
		String window1=i.next();
		String window2=i.next();
		
		driver.switchTo().window(window2);
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("developer");
		
		Thread.sleep(4000);
		
		driver.switchTo().window(window1);
		
	}

}
