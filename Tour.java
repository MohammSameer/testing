package Asianet_tours_project_testing.Asianet_tours_project_testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tour {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://asianet-tours.it/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		Select s= new Select(driver.findElement(By.xpath("//select[@class='select-contain-select']")));
		
		System.out.println("no.of languages:");
		
		List<WebElement>sList =s.getOptions();
		
		for(WebElement options: sList) {
			   
			   System.out.println(options.getText());
	   
		   }
		s.selectByVisibleText("English");
		
		Thread.sleep(3000);
	
		driver.findElement(By.name("country")).click();
				
		Select c=new Select(driver.findElement(By.xpath("//select[@id='country']")));
		
		System.out.println("no.of countries:");
		
		List<WebElement> cList=c.getOptions();
		
		for(WebElement coptions:cList) {
			
			System.out.println(coptions.getText());	
		}
		c.selectByValue("India");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("date")).click();
		
		driver.findElement(By.xpath("//input[@name='daterangepicker_start']")).clear();
		
		driver.findElement(By.xpath("//input[@name='daterangepicker_start']")).sendKeys("2024-12-14");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='daterangepicker_end']")).clear();
		
		driver.findElement(By.xpath("//input[@name='daterangepicker_end']")).sendKeys("2024-12-18");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
			
	}
}
