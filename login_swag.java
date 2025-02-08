package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class login_swag {
	
	WebDriver driver=new ChromeDriver();
	@Given("search saucedemo.com on any browser")
	public void search_saucedemo_com_on_any_browser() throws InterruptedException {
		System.out.println("step-1 search saucedemo.com on any browser");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("saucedemo.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).submit();
	}

	@And("click on the first shown result swag labs title")
	public void click_on_the_first_shown_result_swag_results() throws InterruptedException {
		System.out.println("step-2 click on the first shown result swag las title");
		driver.get("https://www.saucedemo.com/v1/");
	//	driver.navigate().to("https://www.saucedemo.com/v1/");
		
	}

	@Then("user is on login page")
	public void user_is_on_login_page() {
	   System.out.println("step-3 user is on login page");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) throws InterruptedException {
	    System.out.println("user should able to enter username and password");
	    driver.findElement(By.id("user-name")).sendKeys(username);
	   System.out.println(username);
	   
	   driver.findElement(By.name("password")).sendKeys(password);
	   System.out.println(password);
	   Thread.sleep(2000);
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	  System.out.println("clicks on login button");
	  driver.findElement(By.id("login-button")).click();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	  System.out.println("user should navigate to home page");
	  System.out.println(driver.findElement(By.xpath("//button[text()='ADD TO CART']")).getText());
	  driver.getPageSource();
	}	
}
