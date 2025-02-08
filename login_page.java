package SELENIUM_BASICS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login_page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		try {
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("username")).sendKeys("munthazsameer@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("sameer");
		
		driver.findElement(By.xpath("//button[@class=' _acan _acap _acas _aj1- _ap30']")).click();
		}
		catch (Exception e) {
			// TODO: handle exception
			Thread.sleep(3000);
		}
		
	}

}
