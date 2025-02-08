package SELENIUM_BASICS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendars_handling {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
//selecting current date and current month in calendar
	//selecting current-month dates in the calendar, without having previous or next month dates
		
		driver.findElement(By.xpath("//td[text()='First Date']/following-sibling::td/child::input[@type='text']")).click();
		
		Thread.sleep(1000);
		
		int date=2;
		
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/descendant::a[text()="+date+"]")).click();
	
	//selecting current-month dates in the calendar,having previous or next month dates-- it can be done by eliminating previous and next month dates
		
		driver.findElement(By.id("second_date_picker")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/descendant::td[not(contains(@class,'ui-datepicker-other-month'))]/child::a[text()="+date+"]")).click();
	}

}
