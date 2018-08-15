package notsodanishbank;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	private Account account = new Account();
	private ResponseObject response = null;
	
	@Given("^I have an account with a balance of (\\d+)$")
	public void i_have_an_account_with_a_balance_of(int balance) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    account.setBalance(balance);
	}

	@When("^I make a deposit of (\\d+) at an ATM$")
	public void i_make_a_deposit_of_at_an_ATM(int amount) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    AutomatedTellerMachine atm = new AutomatedTellerMachine();
	    response = atm.makeDeposit(account, amount);
	}

	@Then("^the AtM displays a message that deposit was successful$")
	public void the_AtM_displays_a_message_that_deposit_was_successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(response.getResponseMessage(), "Deposit successful");
	}

	@Then("^my account has a new balance of (\\d+)$")
	public void my_account_has_a_new_balance_of(int balance) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(account.getBalance(), balance);
	}
	
	@When("^I make a withdraw of (\\d+) at an ATM$")
	public void i_make_a_withdraw_of_at_an_ATM(int amount) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AutomatedTellerMachine atm = new AutomatedTellerMachine();
	    response = atm.makeWithdraw(account, amount);
	}

	@Then("^the ATM displays a message that withdraw was successful$")
	public void the_ATM_displays_a_message_that_withdraw_was_successful() throws Throwable {
	    assertEquals(response.getResponseMessage(), "Withdraw successful");
	}
}
