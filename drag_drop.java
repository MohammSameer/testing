package SELENIUM_BASICS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drag_drop {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/droppable");
		
		Thread.sleep(3000);
	
		Actions b = new Actions(driver);
		
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement destination= driver.findElement(By.id("droppable"));
		
		b.dragAndDrop(source, destination).perform();
		
		String result=destination.getText();
		
		if(result.equals("Dropped!")) {
			System.out.println("matched exactly working");
		}
		else {
			System.out.println("not working");
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("droppableExample-tab-accept")).click();
		
		Thread.sleep(3000);
		
		WebElement from= driver.findElement(By.xpath("//div[contains(text(),'Acceptable')]"));
		WebElement to= driver.findElement(By.xpath("//div[@class='drop-box ui-droppable']"));
		
		b.dragAndDrop(from, to).perform();
		
		String out=to.getText();
		
		System.out.println(out);

	}
}
