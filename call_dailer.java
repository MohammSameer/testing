package uptodownapplication;


import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class call_dailer {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities DC=new DesiredCapabilities();
		
		DC.setCapability("appium:platformName", "Android");
		DC.setCapability("appium:platformVersion", "11");
		DC.setCapability("appium:deviceName","vivo vivo 1901");
		DC.setCapability("appium:automationName", "UiAutomator2");
		DC.setCapability("appium:appPackage","com.android.dialer");
		DC.setCapability("appium:appActivity","com.android.dialer.TwelveKeyDialer");
		
		URL url =URI.create("http://127.0.0.1:4723/").toURL();
		
		AndroidDriver driver=new AndroidDriver(url, DC);
		
		driver.findElement(By.id("com.android.dialer:id/seven")).click();
		driver.findElement(By.id("com.android.dialer:id/three")).click();
		driver.findElement(By.id("com.android.dialer:id/three")).click();
		driver.findElement(By.id("com.android.dialer:id/zero")).click();
		driver.findElement(By.id("com.android.dialer:id/six")).click();
		driver.findElement(By.id("com.android.dialer:id/one")).click();
		driver.findElement(By.id("com.android.dialer:id/one")).click();
		driver.findElement(By.id("com.android.dialer:id/four")).click();
		driver.findElement(By.id("com.android.dialer:id/six")).click();
		driver.findElement(By.id("com.android.dialer:id/nine")).click();
		
		driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Dial\"]/android.widget.TextView")).click();
	}

}
