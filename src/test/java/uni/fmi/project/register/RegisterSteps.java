package uni.fmi.project.register;


import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.project.register.model.RegisterScreenModel;


public class RegisterSteps {
	private RegisterScreenModel registerScreenModel;

	@Given("^User opens register creation tab$")
	public void openRegisterCreationTab() throws Throwable {
		registerScreenModel = new RegisterScreenModel();
	}

	@When("^User enters name \"([^\"]*)\"$")
	public void enterName(String name) throws Throwable {
		registerScreenModel.setName(name);
	}

	@When("^User enters owner \"([^\"]*)\"$")
	public void enterOwner(String owner) throws Throwable {
		registerScreenModel.setOwner(owner);
	}

	@When("^Clicks on create registration$")
	public void clickRegistrationButton() throws Throwable {
		registerScreenModel.clickRegistrationButton();
	}

	@Then("^Message to user \"([^\"]*)\"$")
	public void checkMessage(String message) throws Throwable {
		assertEquals(message ,registerScreenModel.getMessage());
	}


}
