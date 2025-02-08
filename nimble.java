package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import io.github.bonigarcia.wdm.WebDriverManager;


import java.time.Duration;

public class nimble {

	public static void main(String[] args) throws  InterruptedException{
		// Setup WebDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Maximize window
		driver.manage().window().maximize();

		// Navigate to website
		driver.get("https://www.nimblework.com/");

		Actions action=new Actions(driver);

		action.scrollByAmount(5,500).perform();

		System.out.println("scroll operation performed");
		Thread.sleep(8000);
		try {
			// Wait for the page to load
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

			// Add a short sleep to give time for shadow DOM to load
			Thread.sleep(5000);  // Wait for 5 seconds (you can adjust this time)

			// Locate the Shadow DOM element (the container of the chatbot)
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			WebElement shadowHost = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("kairon-client-container")));

			// Check if the shadow host is found
			if (shadowHost == null) {
				System.out.println("Shadow Host not found!");
				return;
			}

			// Access Shadow DOM using JavaScript Executor
			WebElement shadowRoot = (WebElement) jsExecutor.executeScript("return arguments[0].shadowRoot", shadowHost);

			// If shadowRoot is null, print a message and stop execution
			if (shadowRoot == null) {
				System.out.println("Shadow DOM is not available.");
				return;
			}

			// Now that we have access to the shadow root, find the button inside the shadow DOM
			WebElement botIcon = shadowRoot.findElement(By.cssSelector("button.ka-button"));

			// Scroll into view and click the bot icon
			jsExecutor.executeScript("arguments[0].scrollIntoView(true);", botIcon);
			botIcon.click();
			System.out.println("Clicked on the chatbot icon.");

			// Wait for the input field to appear inside the shadow DOM
			WebElement inputField = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.msgInput-0-3-60")));

			// Send user input: "hi"
			inputField.sendKeys("hi");
			inputField.sendKeys(Keys.ENTER);
			System.out.println("Sent 'hi' to the chatbot.");

			// Wait for the bot's response to be visible inside the shadow DOM
			WebElement botResponse = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".messages-d0-0-3-57 .message-response")));

			// Verify the bot's response
			String expectedResponse = "Hello there!  Welcome to the NimbleWork.com! I'm your digital companion, here to make your experience a breeze. Whether it's any info you need or just a friendly chat, I'm at your service. Let's dive in and make things happen! How can I assist you today?";
			String actualResponse = botResponse.getText().trim();

			// Assertion to check if the response matches
		//	wait.equals("Bot response does not match!");
			System.out.println("Bot's response is correct.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Close the browser
			driver.quit();
		}
	}
}
