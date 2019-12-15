package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.LoginPageObject;

public class LoginStepDefinitions extends Base {
	//Declare LoginPageObject object
	LoginPageObject loginpage;
	@Given("^User is on TekSchool page$")
	public void user_is_on_TekSchool_page() throws Throwable {
		Base.initializeDriver();
	//verify the title
	loginpage = new LoginPageObject();
	String expectedTitle = "TEK School – Knowledge is power";
	//This is hard Assertion and if expected does not meet actual result it will fail the execution
	Assert.assertEquals(loginpage.pageTitle(),expectedTitle);
	}

	@And("^User Click on Test Environment link$")
	public void user_Click_on_Test_Environment_link() throws Throwable {
		loginpage= new LoginPageObject();
		loginpage.clickOnTestEnvironmentLink();
	}

	@Then("^User should see Test Environment page$")
	public void user_should_see_Test_Environment_page() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "TEK SCHOOL");
		
	}

}
