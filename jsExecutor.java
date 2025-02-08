package SELENIUM_BASICS;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jsExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//creating reference to jsexecutor and type casting driver
		
		JavascriptExecutor jsExecutor= (JavascriptExecutor) driver;
		
	//	WebElement element =(WebElement) jsExecutor.executeScript("return document.getElementById('email')");
		
	//		element.sendKeys("sam@gmail.com");
		
		jsExecutor.executeScript("return document.getElementById('email').value='id'");
		
		jsExecutor.executeScript("document.getElementByName('email')[0].value='name'");
		
		jsExecutor.executeScript("document.getElementByClassName('input text')[0].value='className'");
		
		jsExecutor.executeScript("document.getelementsbyTagName(‘input’)[2].value='tagname'");
		
		jsExecutor.executeScript("document.querySelector(‘#email’).value='css'");
		
		jsExecutor.executeScript("document.evaluate(\"//input[@id='email']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.value='xpath'");
		
		jsExecutor.executeScript("document.getelementbyid(‘email’).setAttribute(‘style’,’border:2px black solid; background:yellow ’)");
		
		jsExecutor.executeScript("document.getElementsByName('login')[0].click()");
		
	}
	

}
