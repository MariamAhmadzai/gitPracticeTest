package pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LoginPageObject extends Base {
	
	public LoginPageObject () {
	
	PageFactory.initElements(driver, this);
}
	//@findBy this annotation is part of PageFactory class which helps us to initialize the element
	@FindBy(how= How.XPATH, using ="//a[text()='Test Environment']")
	private WebElement testEnvironmentLink;
	
	@FindBy (how =How.XPATH, using = " //a[text()='Login to Class']")
	private WebElement LogintoClassLink;
	
	@FindBy (how= How.ID, using = "mc4wp_email")
	private WebElement subsEmailField;
	
	
	/**
	 * This method  will click on test environment link on Tek School Page
	 */
	
	public void clickOnTestEnvironmentLink() {
		testEnvironmentLink.click();
	}
	/**
	 * This method  will click on Login to class link on Tek School Page
	 */
	
	
	public void clickOnLogintoClassLink () {
		LogintoClassLink.click();
	}
	
	/**
	 * This method  will  enter email value in Subscribe email field in Tek School Page
	 */
	
	
	public void sendValueToSubsEmailField(String emailValue) {
		
		subsEmailField.sendKeys(emailValue);
	}
	
	public String pageTitle() {
		String TekSchoolPageTitle = driver.getTitle();
		return TekSchoolPageTitle;
	}
	
}
