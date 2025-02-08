package Assignments;



import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NimbleWorkBotTest {

        WebDriver driver;
        WebDriverWait wait;

        @BeforeEach
        public void setUp() {
            // Set up the Chrome driver (ensure that chromedriver is in the PATH)
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            wait = new WebDriverWait(driver, Duration.ofSeconds(30));

            // Maximize the window
            driver.manage().window().maximize();
        }

        @Test
        public void testBotResponse() throws InterruptedException {
            // Open the website
            driver.get("https://www.nimblework.com/");

            Actions action=new Actions(driver);

            action.scrollByAmount(5,500).perform();

            System.out.println("scroll operation performed");
            Thread.sleep(8000);

       //     wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("kairon-nudge-container")));

            JavascriptExecutor jsexecutor= (JavascriptExecutor)driver;

            List<WebElement>botIcon=(List<WebElement>)jsexecutor.executeScript("document.querySelector(\"#kairon-client-container > div\").shadowRoot.querySelector(\"div.buttonCnt-0-3-90.buttonCnt-d0-0-3-91 > div > button > div > img\")");
            
            Thread.sleep(4000);
            
            wait.until(ExpectedConditions.visibilityOfAllElements(botIcon));
            
        //    jsexecutor.executeScript("arguments[0].click();", botIcon);
            
             jsexecutor.executeScript("arguments[0].scrollIntoView(true);", botIcon);
                    
            action.moveToElement((WebElement) botIcon).click().perform();
      
            // Wait for the chat window to appear

            // Find the input field and send the message "hi"
            WebElement inputField = driver.findElement(By.cssSelector("input.msgInput-0-3-60"));
            inputField.sendKeys("hi");

            // Find and click the send button
            WebElement sendButton = driver.findElement(By.cssSelector("button.msgSend-0-3-61"));
            sendButton.click();

            // Wait for the bot response message to be visible
            WebElement botResponse = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.messages-0-3-52")));

            // Get the bot's response text
            String actualResponse = botResponse.getText();

            // Define the expected bot response
            String expectedResponse = "Hello there!Welcome to the NimbleWork.com! I'm your digital companion, here to make\n" +
                    "your experience a breeze. Whether it's any info you need or just a friendly chat, I'm at your\n" +
                    "service. Let's dive in and make things happen! How can I assist you today?";

            // Assert that the actual response matches the expected response
            assertEquals(expectedResponse, actualResponse, "Bot response did not match the expected text.");
        }

        @AfterEach
        public void tearDown() {
            // Close the browser after the test
            if (driver != null) {
                driver.quit();
            }
        }
    }


