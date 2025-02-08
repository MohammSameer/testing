package Asianet_tours_project_testing.Asianet_tours_project_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hotel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://asianet-tours.it/");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		Select s= new Select(driver.findElement(By.xpath("//select[@class='select-contain-select']")));
		
		s.selectByVisibleText("English");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@id='hotel-tab']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("location")).sendKeys("Hyderabad");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("daterange")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='input-mini form-control active']")).clear();
		
		driver.findElement(By.xpath("//input[@class='input-mini form-control active']")).sendKeys("2024-12-14");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[8]/div[2]/div[1]/input")).clear();
		
		driver.findElement(By.xpath("/html/body/div[8]/div[2]/div[1]/input")).sendKeys("2024-12-18");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/button[1]")).click();
		
		driver.findElement(By.xpath("//a[@class='modal-frame form-control']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@value='search_now']"))).click();
		
		
	}

}
