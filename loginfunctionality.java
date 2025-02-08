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

public class loginfunctionality {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
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
		Thread.sleep(3000);
		System.out.println("application started");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.uptodown:id/tv_accept_wizard_welcome"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.uptodown:id/tv_next_wp\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.uptodown:id/tv_login_email_wl\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.uptodown:id/et_user_login")).sendKeys("munthazsameer@gmail.com");
		driver.findElement(By.id("com.uptodown:id/et_pass_login")).sendKeys("sameer2003");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@resource-id=\"com.uptodown:id/tv_login\"]"))).click();
		System.out.println(driver.getPageSource());
		
	//	WebElement element=driver.findElement(By.id("com.uptodown:id/tv_main_search_view"));
	//	element.sendKeys("free fire");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.uptodown:id/iv_close_turbo_popup"))).click();
		Thread.sleep(3000);
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.uptodown:id/rl_main_search_view")));
		element.click();
	//	element.sendKeys("free fire");
		WebElement element2= driver.findElement(By.id("com.uptodown:id/actv_search_bar"));
		element2.sendKeys("free fire");
		Thread.sleep(2000);
		element2.submit();
		
		
	}

}
