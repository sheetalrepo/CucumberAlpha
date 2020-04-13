package parallel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class AlphaOneStepDefAMZN {

	@Given("user open amazon")
	public void user_open_flipkart() {
		System.out.println("AMZN > step1");
		System.out.println("AMZN Thread: " + Thread.currentThread().getName());
	}

	@When("user enter amazon login credentials {string} and {string}")
	public void user_enter_flipkart_login_credentials_and(String user, String pwd) {
		System.out.println("AMZN > step2 > " + user + " > " + pwd);
		System.out.println("AMZN Thread: " + Thread.currentThread().getName());
	}

}
