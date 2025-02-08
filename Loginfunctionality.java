package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class Loginfunctionality {

	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("inside step- user is on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("inside step- user enters username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("inside step- clicks on login button");
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("inside step- user is navigated to home page");
	}
}
