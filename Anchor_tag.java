package SELENIUM_BASICS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Anchor_tag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> l=driver.findElements(By.tagName("a"));
		
		System.out.println(l.size());
		
		for(WebElement option :l) {
				System.out.println(option.getAttribute("href"));
	}

}
}
