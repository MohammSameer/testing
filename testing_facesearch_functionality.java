package Andorid_FacesearchAi;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class testing_facesearch_functionality {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("appium:platformName","Android");
		capabilities.setCapability("appium:platformVersion","11.0");
		capabilities.setCapability("appium:deviceName","vivo vivo 1901");
		capabilities.setCapability("appium:automationName","UiAutomator2");
	//	capabilities.setCapability("appium:app", "C:\\Users\\Sameer\\apks\\uptodown-com.king.candycrushsodasaga.apk");
		capabilities.setCapability("appium:appPackage","com.facesearch.app");
		capabilities.setCapability("appium:appActivity","com.facesearch.app.MainActivity");
		
		URL url=URI.create("http://192.168.137.1:4723/").toURL();
		
		AndroidDriver driver= new AndroidDriver(url, capabilities);
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		Thread.sleep(3000);
		System.out.println("application started");
		
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Next\"]")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"Next\"]"))).click();
	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"Get Started\"]"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"))).click();

		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"Upload\"]"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//android.widget.ImageView[@resource-id=\"com.google.android.documentsui:id/icon_thumb\"])[1]"))).click();
		
		Thread.sleep(5000);
		
		WebElement result= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Your Results\"]")));
		
		System.out.println(result.getText());
		System.out.println("successfully searched images");
		
		
	}

}
