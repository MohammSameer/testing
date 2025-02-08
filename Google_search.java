/* package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class Google_search {
	
	WebDriver driver=new ChromeDriver();
	@Given("browser is open")
	public void browser_is_open() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("inside step-1 opened BROWSER");
		driver.manage().window().maximize();
		
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("inside step-2 USER is on google search page");
		driver.navigate().to("https://www.google.com/");
		
	}

	@When("user enters text on search field box")
	public void user_enters_text_on_search_field_box() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("inside step-3 USER enters text on search field box");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("best places to visit in india");
	}

	@And("hits enter")
	public void hits_enter() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("inside step-4 hits enter");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).submit();
	}

	@Then("user is navigated to result page of searched")
	public void user_is_navigated_to_result_page_of_searched() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("inside step-5 USER should navigate to result page");
		driver.getPageSource();
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
*/
