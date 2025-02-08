 package uptodownapplication;

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

public class searchfunctionality {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("appium:platformName","Android");
		capabilities.setCapability("appium:platformVersion","11.0");
		capabilities.setCapability("appium:deviceName","vivo vivo 1901");
		capabilities.setCapability("appium:automationName","UiAutomator2");
	//	capabilities.setCapability("appium:app", "C:\\Users\\Sameer\\apks\\uptodown-com.king.candycrushsodasaga.apk");
		capabilities.setCapability("appium:appPackage","com.uptodown");
		capabilities.setCapability("appium:appActivity","com.uptodown.activities.MainActivity");
		
		URL url=URI.create("http://192.168.137.1:4723/").toURL();
		
		AndroidDriver driver=new AndroidDriver(url, capabilities);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@resource-id=\"com.uptodown:id/tv_main_search_view\"]")));
		element.sendKeys("free fire");
	}

} 
