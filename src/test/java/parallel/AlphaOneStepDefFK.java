package parallel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import java.util.Map;

public class AlphaOneStepDefFK {

	@Given("user open flipkart")
	public void user_open_flipkart() {
		System.out.println("FK > step1");
		System.out.println("FK Thread: " + Thread.currentThread().getName());
	}

	@When("user enter flipkart login credentials {string} and {string}")
	public void user_enter_flipkart_login_credentials_and(String user, String pwd) {
		System.out.println("FK > step2 > " + user + " > " + pwd);
		System.out.println("FK Thread: " + Thread.currentThread().getName());
	}

	@Then("user search for {int} rupee shoes")
	public void user_search_for_rupee_shoes(Integer int1) {
		System.out.println("FK > step3 > " + int1);
		System.out.println("FK Thread: " + Thread.currentThread().getName());
	}

	@Then("user purchased and made the payment")
	public void user_purchased_and_made_the_payment() {
		System.out.println("FK > step 4 > payment page");

		// Saving Data in Global Map
		String orderID = someRandomMethod();
		Map<String, String> globalMap = Data.getGlobalDataMap();
		globalMap.put("FK_ORDER_ID", orderID);
		Data.setGlobalDataMap(globalMap);
	}

	// Method return unique order id
	public static String someRandomMethod() {
		return "FK_OrderId_NewOrderID555";
	}

}
