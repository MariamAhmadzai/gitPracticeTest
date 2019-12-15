package stepDefinitions;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.SDETObject;
import utilities.DBUtilities;
import utilities.Utility;

public class TekSchoolScenarioStepDef extends Base {

	SDETObject sdetObject= new SDETObject ();
	
	@When("^User click on my Account menu on top of the page$")
	public void user_click_on_my_Account_menu_on_top_of_the_page() throws IOException {
		Utility.screenshot(driver);
		sdetObject.clickOnMyAccount();
		//sdetObject.clickOnLogin();
	}
	@And ("^User click on login on my Account menu$")
	public void user_click_on_login_on_my_Account_menu() {
	sdetObject.clickOnLogin();
	}

	@And("^User enter username '(.+)' and password '(.+)' in returning menu$")
	public void user_enter_username_username_and_password_password_in_returning_menu(String userName, String password)  {
		sdetObject.enterEmailAddress (userName.trim());
		sdetObject.enterPassword (password.trim());
	}

	@And("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {
		sdetObject.clickOnLoginButton();
	}

	@And("^User should be logined in$")
	public void user_should_be_logined_in() throws Throwable {
	Assert.assertEquals(true, sdetObject.verifyLoginToMyAccount());
	Utility.screenshot(driver);
	}
	
	@And ("^User click on Logout option on top of the page$")
	public void User_click_on_Logout_option_on_top_of_the_page() {
		
	}
	
	@Then ("^User click on Continue button$")
	public void User_click_on_Continue_button  () {
		
	}
	@When("^User click on register my Account menu$")
	public void user_click_on_register_my_Account_menu() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		sdetObject.clickOnRegisterWebElement(); 
	}

	@And("^User fill register form with below information$")
	public void user_fill_register_form_with_below_information (DataTable personalInfo) throws Throwable {
	  List<List<String>> datavalues = personalInfo.raw();
	  sdetObject.firstNameVlue(datavalues.get(0).get(0));
	  sdetObject.lastNameValue(datavalues.get(0).get(1));
	  sdetObject.emailValue(datavalues.get(0).get(2));
	  sdetObject.phoneValue(datavalues.get(0).get(3));
	  sdetObject.passwordValue(datavalues.get(0).get(4));
	  sdetObject.confrimpassword(datavalues.get(0).get(4));
	  
	}
	

	@And("^User click on '(.+)' radio button for subscribe$")
	public void user_click_on_yes_radio_button_for_subscribe(String radioButtonValue) throws Throwable {
		 sdetObject.subscriberadioButton(radioButtonValue);
		 Utility.screenshot(driver);
	}

	@And("^User click on continue button$")
	public void user_click_on_continue_button() throws Throwable {
		sdetObject.clickOnCont();
	}

	@And("^User should see your 'Your Account Has Been Created!'$")
	public void user_should_see_your_Your_Account_Has_Been_Created() throws Throwable {
		Assert.assertEquals(sdetObject.confirmationMessage(), true);
	}
	
	@And("^User should click on Phone&PDA from product menu$")
	public void user_should_click_on_Phone_PDA_from_product_menu() throws Throwable {
		sdetObject.clickOnPDAsAndPhones();
	}

	@And("^User should  click on Iphone image link$")
	public void user_should_click_on_Iphone_image_link() throws Throwable {
		sdetObject.clickOnImageLink();
	}

	@And("^User should click on Add to Cart button$")
	public void user_should_click_on_Add_to_Cart_button() throws Throwable {
		sdetObject.clickOnAddToCart();
	}

	@And("^User should click on Shopping Cart item button on the top of the menu$")
	public void user_should_click_on_Shopping_Cart_item_button_on_the_top_of_the_menu() throws Throwable {
		sdetObject.clickOnShoppingCart();
	}
	@Then("^User should click on x button next to item$")
	public void user_should_click_on_x_button_next_to_item() throws Throwable {
		sdetObject.clickOnXbutton();
	}
	@When("^User click on myAccount menu on top of the page$")
	public void user_click_on_myAccount_menu_on_top_of_the_page() throws Throwable {
	   
	}

	@When("^User click on register on myAccount menu$")
	public void user_click_on_register_on_myAccount_menu() throws Throwable {
	   
	}

	@Then("^User should see 'Your Account Has Been Created!'$")
	public void user_should_see_Your_Account_Has_Been_Created() throws Throwable {
	  
	}

	@And("^User conncects to DataBase$")
	public void user_conncects_to_DataBase() throws Throwable {
	   DBUtilities.setupConnection();
	}

	@And("^User sends Query '(.+)'$")
	public void user_sends_Query(String query) throws Throwable {
	  DBUtilities.runQuery(query);
	  
	}

	@Then("^User verify account is created with email '(.+)'$")
	public void user_verify_account_is_created_with_email(String emailValidation) throws Throwable {
	  
	}





}
