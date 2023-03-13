package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefintions {
	
	@Given("^User is on NetBanking landing page$")
	public void User_is_on_NetBanking_landing_page() {
		System.out.println("Landed on the NetBanking Page");
		
	}
	@When("^User login into application with username and password$")
	public void User_login_into_application_with_username_and_password() {
		System.out.println("Logged in as Dinesh");
		
	}

	@Then("^Home page is populated$")
	public void Home_page_is_populated() {
		System.out.println("Homepage is Displayed");
		
	}

	@And("^Cards are dispalyed$")
	public void Cards_are_dispalyed() {
		System.out.println("Cards are displayed");
	}
	

}
