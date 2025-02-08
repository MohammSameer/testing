package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chatbot {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.nimblework.com/");
		
		Actions action=new Actions(driver);
		
		action.scrollByAmount(4,100).perform();
		
		System.out.println("scroll operation performed");
		
		Thread.sleep(5000);
		
		
		JavascriptExecutor jsExecutor= (JavascriptExecutor) driver;
		
		WebElement bot_icon =(WebElement) jsExecutor.executeScript("return document.querySelector('#kairon-client-container > div').shadowRoot.querySelector('div.buttonCnt-0-3-90 > div > button > div > img.imageSrcIcon')");
		
		action.moveToElement(bot_icon).build().perform();
		
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", bot_icon);
		
		jsExecutor.executeScript("arguments[0].click();", bot_icon);
		
		System.out.println("clicked on bot icon");
		
		Thread.sleep(2000);
		
		
		
		WebElement user_input= (WebElement) jsExecutor.executeScript("return document.querySelector('#kairon-client-container > div').shadowRoot.querySelector(\"div.container-0-3-2 > div.body-0-3-6 > form.userInputWrapper-0-3-59 > input[type='text']\")");
		
		action.moveToElement(user_input).build().perform();
		
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);",user_input);
		
		user_input.click(); 
		
		user_input.clear();
		
		user_input.sendKeys("hi");
		
		System.out.println("hi text entered");
		
		
		
		Thread.sleep(1000);
		
		user_input.sendKeys(Keys.ENTER); 
				
		System.out.println("clicked on submit using keys.ENTER");
		
		Thread.sleep(3000);
		
		String expectedResponse = "Hello there!Welcome to the NimbleWork.com! I'm your digital companion, here to make your experience a breeze. Whether it's any info you need or just a friendly chat, I'm at your service. Let's dive in and make things happen! How can I assist you today?";
		
		System.out.println(expectedResponse);
		
		driver.quit();
	//	WebElement actualResponse=(WebElement) jsExecutor.executeScript("return document.querySelector(\"#kairon-client-container > div\").shadowRoot.querySelector(\"div.container-0-3-2.container-d0-0-3-17.open-0-3-3.open-d1-0-3-18 > div.body-0-3-6.body-d3-0-3-20 > div > div > div.botReplyCnt-0-3-101.botReplyCnt-d1-0-3-110 > div > div > div > div.messageWrapper > p\")");
	//	jsExecutor.executeScript("arguments[0].scrollIntoView(true);",actualResponse);
		
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//	//	wait.until(ExpectedConditions.textToBePresentInElementValue(actualResponse, expectedResponse));
//		List<WebElement> actualResponse=(List<WebElement>) wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div.messages-0-3-52")));
//		
//		System.out.println(((WebElement) actualResponse).getText());
//		
//		if (expectedResponse.contains((CharSequence) actualResponse)){
//			
//			System.out.println("bot is responding correctly both are matching");
//		}
//		else {
//			System.out.println("not responding");
//		}
	}

}

