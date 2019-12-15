package pageObjects;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class SDETObject extends Base{

	public SDETObject () {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(how= How.XPATH, using ="//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
	private WebElement myAccount;
	
	@FindBy(how= How.XPATH, using ="//a[text()='Register']")
	private WebElement registerWebElement;
	
	@FindBy(how= How.XPATH, using ="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	private WebElement loginOption;
	
	@FindBy (how= How.ID, using = "input-email")
	private WebElement emailField;
	
	@FindBy (how= How.ID, using = "input-password")
	private WebElement passwordField;
	
	@FindBy (how= How.XPATH, using = "//input[@type='submit']")
	private WebElement loginButton;
	
	@FindBy (how= How.XPATH, using = "//h2[text()='My Account']")
	private  WebElement myAccountText;
	
	@FindBy (how=How.XPATH,using= "//a[text() ='Logout'] ")
	private WebElement logoutOption;
	
	@FindBy (how=How.XPATH,using= "//a[text() ='Continue'] ")
	private WebElement continueOption;
	
	@FindBy (how =How.XPATH, using = "//input[@id='input-firstname']")
	private WebElement firstName;
	
	@FindBy (how =How.XPATH, using = "//input[@id='input-lastname']")
	private WebElement lastName;
	
	@FindBy (how =How.XPATH, using = "//input[@id='input-email']")
	private WebElement email;
	
	@FindBy (how =How.ID, using = "input-telephone")
	private WebElement teleNum;
	
	@FindBy (how=How.XPATH,using= "//*[@id='input-password']")
	private WebElement password;
	
	@FindBy (how=How.XPATH,using= "//*[@id='input-confirm']")
	private WebElement confrmPass;
	
	
	@FindBy(how = How.XPATH, using = "//input[@type='radio' and @value='1' and @name='newsletter']")
	private WebElement yesButton;
	
	@FindBy(how = How.XPATH, using = "//input[@type='radio' and @value='0' and @name='newsletter']")
	private WebElement noButton;
	
	@FindBy(how = How.XPATH, using = "//input[@type='submit' and @value='Continue']")
	private WebElement continueButton;
	
	@FindBy(how = How.XPATH, using = "//h1[text()='Your Account Has Been Created!']")
	private WebElement accountCreatedConfirmationText;
	
	@FindBy (how=How.XPATH, using ="//a[contains(.,'Phones & PDAs')]")
	private  WebElement phonesPDAsButton;
	
	@FindBy (how = How.XPATH, using =  "//a[contains(.,'iPhone')]")
	private WebElement  imageLink;
	
	@FindBy (how= How.ID,  using ="button-cart")
	private WebElement addtoCart;
	
	@FindBy (how = How.XPATH, using ="//*[@id=\"top-links\"]/ul/li[4]/a/span")
	private  WebElement shoppingCart;
	
	@FindBy (how = How.XPATH, using = "//*[@id=\"content\"]/form/div/table/tbody/tr[1]/td[4]/div/span/button[2]/i")
	private  WebElement xButton;
	
	
//Writing action method for WebElements we stored in this object repository class

	public void clickOnMyAccount() {
		try {
			myAccount.click();
			
		}catch (Exception e) {
		myAccount.sendKeys(Keys.ENTER);

	}
	}
		public void clickOnRegisterWebElement() {
			try {
				registerWebElement.click();
				
			}catch (ElementNotInteractableException e) {
				registerWebElement.sendKeys(Keys.ENTER);
	}
}
		public void clickOnLogin () {
			try {
			loginOption.click();
			}catch (ElementNotInteractableException e) {
				loginOption.sendKeys(Keys.ENTER);
	}
}	
	
		public void enterEmailAddress (String emailValue) {
			emailField.sendKeys(emailValue.trim());
		}
		
		public void enterPassword (String passwordValue) {
			passwordField.sendKeys(passwordValue.trim());
		}
		
		public void clickOnLoginButton() {
			loginButton.click();
		}
		
		public  boolean verifyLoginToMyAccount() {
			
			boolean verificationPoint = myAccountText.isDisplayed();
			return verificationPoint;
			
		}
		
		
	public void ClickOnLogout () {
		logoutOption.click();
	}
	public void clickOnContinue () {
		continueOption.click();
		}
		public  void firstNameVlue  (String fName) {
			firstName.sendKeys(fName);
			
		}
		public void lastNameValue (String lName) {
			lastName.sendKeys(lName);
		}
		
		public void emailValue (String emailValue) {
			email.sendKeys(emailValue);
		}
		
		public void phoneValue (String phoneValue) {
			teleNum.sendKeys(phoneValue);
		}
		
		public void passwordValue (String passValue) {
			password.sendKeys(passValue);
		}
		
		public void confrimpassword (String confirmPassValue) {
			confrmPass.sendKeys(confirmPassValue);
		}
		
		public void subscriberadioButton (String yesOrNo) {
			if (yesOrNo.equalsIgnoreCase("yes")) {
				yesButton.click();
			}else {  noButton.click();
		}
			
		}
		public void clickOnCont () {
			continueButton.click();
			}
		public boolean confirmationMessage() {
			boolean confirmationtext = accountCreatedConfirmationText.isDisplayed();
			return confirmationtext;
		}
		
		public void clickOnPDAsAndPhones () {
			phonesPDAsButton.click();
		}
		
		public void clickOnImageLink () {
			imageLink.click();
		}
		
		public void clickOnAddToCart () {
			addtoCart.click();
		}
		
		public void clickOnShoppingCart () {
			shoppingCart.click();
	
		}
		public void clickOnXbutton() {
			xButton.click();
		}
		
}
