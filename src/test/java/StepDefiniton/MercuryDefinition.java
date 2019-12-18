package StepDefiniton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MercuryDefinition {
	@Given("Mercury website is launched")
	public void mercury_website_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Website is launched");
	}

	@Given("user clicks on sign up button")
	public void user_clicks_on_sign_up_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("user clicks on sign up button");
	}

	@When("user enters proper data")
	public void user_enters_proper_data() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("user enters proper data");
	}

	@Then("clicks on submit button for account creation")
	public void clicks_on_submit_button_for_account_creation() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("clicks on submit button for account creation");
	}

	@Given("reigsitered user clicks on signIn link")
	public void reigsitered_user_clicks_on_signIn_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("reigsitered user clicks on signIn link");
	}

	@Then("he provides valid data for login input fields")
	public void he_provides_valid_data_for_login_input_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("he provides valid data for login input fields");
	}

	@Then("clicks on submit button for the login validation")
	public void clicks_on_submit_button_for_the_login_validation() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("clicks on submit button for the login validation");
	}

	@Given("user verifies the flights available")
	public void user_verifies_the_flights_available() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("user verifies the flights available");
	}

	@Then("selects the desired flight")
	public void selects_the_desired_flight() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("selects the desired flight");
	}

	@When("user makes the payment")
	public void user_makes_the_payment() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("uuser makes the payment");
	}

	@Then("Tickets are generated")
	public void tickets_are_generated() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Tickets are generated");
	}


}
