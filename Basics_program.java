package SELENIUM_BASICS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basics_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		String string=driver.getTitle();
		System.out.println(string);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String srccode =driver.getPageSource();
		System.out.print(srccode);
		
	    driver.quit();
		

	}

}
