package stepDefinitions;

import org.testng.Assert;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPageObject;

public class CanvasLoginPageStepDefinitions extends Base{
	
	
	LoginPageObject loginpage;
	@When("^User click on Login button on top of the  page$")
	public void User_click_on_Login_button_on_top_of_the_page() throws Throwable {
		System.out.println("This is Canvas Login Page Test");
		loginpage = new LoginPageObject();
		loginpage.clickOnLogintoClassLink();
	
	}
	
	

	@Then("^User should see Canvas Login Page$")
	public void User_should_see_Canvas_Login_Page() throws Throwable {
		System.out.println("This is Canvas Login Page Test");
		loginpage = new LoginPageObject();
		Assert.assertEquals(driver.getTitle(), "Log in to Canvas");
	}

}
