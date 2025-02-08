package Asianet_tours_project_testing.Asianet_tours_project_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flight {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://asianet-tours.it/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/a[2]")).click();
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		Select s= new Select(driver.findElement(By.xpath("//select[@class='select-contain-select']")));
		
		s.selectByVisibleText("English");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("flight-tab")).click();
		
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Select source']")).click();
		
		/*Select s1=new Select(driver.findElement(By.xpath("//div[@class='bc-menu list-group']")));
		
		List<WebElement> list=s1.getOptions();
		
		for(WebElement l1:list) {
			
			System.out.println("sources:"+l1.getText());
		}
		
		s1.selectByVisibleText("Fco, Roma (FCO)");*/
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div[3]/div[3]/div[2]/div/div/form/div[1]/div/div/div[1]/div/a[3]")).click();
		
		driver.findElement(By.id("destination_city")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div[3]/div[3]/div[2]/div/div/form/div[2]/div/div/div[1]/div/a")).click();
		
		driver.findElement(By.id("depart_date")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		WebElement w=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[@class='day']")));
		
		Actions a=new Actions(driver);
		
		a.moveToElement(w).perform();
		
		w.click();
		
		driver.findElement(By.xpath("//a[@class='dropdown-toggle dropdown-btn']")).click();
		
		WebElement adult=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//i[@class='la la-plus']")));
		
		a.moveToElement(adult).perform();
		
		adult.click();
		
		WebElement child=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"flight_search_form\"]/div[6]/div/div/div/div/div[2]/div/div/div[2]")));
		
		a.moveToElement(child).perform();
		
		child.click();
		
		WebElement infantadd=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"flight_search_form\"]/div[6]/div/div/div/div/div[3]/div/div/div[2]")));
		
		a.moveToElement(child).perform();
		
		infantadd.click();
		
		WebElement infantsub=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"flight_search_form\"]/div[6]/div/div/div/div/div[3]/div/div/div[1]")));
		
		a.moveToElement(child).perform();
		
		infantsub.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='filter_btn']")).click();
		
		
	}

}
