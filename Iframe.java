package SELENIUM_BASICS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("name")).sendKeys("sameer");
		
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		
		Thread.sleep(3000);
		
		Select s=new Select(driver.findElement(By.id("course")));
		
		s.selectByValue("java");
		
		System.out.println(s.getFirstSelectedOption().getText());
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		WebElement t=driver.findElement(By.id("name"));
		
		t.clear();
		
		t.sendKeys("hello");
		
		
	
	}

}
