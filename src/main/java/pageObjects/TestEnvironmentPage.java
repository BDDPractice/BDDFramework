package pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import constants.ConfigFileReader;


public class TestEnvironmentPage extends ConfigFileReader {
	
	public TestEnvironmentPage() {

		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(how = How.XPATH, using = "//span[text() = 'My Account']")

	private WebElement myAccount;
	
	@FindBy(how = How.XPATH, using = "//a[text() = 'Login']")

	private WebElement login;
	
	@FindBy(how = How.XPATH, using = "//a[text() = 'Register']")

	private WebElement register ;
	
	@FindBy(how = How.XPATH, using = "//input[@name = 'email']")

	private WebElement emailField ;
	
	@FindBy(how = How.XPATH, using = "//input[@name = 'password']")

	private WebElement passwordField ;
	
	@FindBy(how = How.XPATH, using = "//input[@type= 'submit']")

	private WebElement loginButton ;
	
	
	public void clickOnMyAccount() {
		myAccount.click();
	}
	public void clickOnLogin() {
		login.click();
	}
	public void clickOnRegister() {
		register.click();
	}
	
	public String getPageURL() {
		
		String actualURL = driver.getCurrentUrl();
		return actualURL;
		
	
		
	}
	
	public String getPageTitle() {
		String actualPageTitle = driver.getTitle();
		return actualPageTitle;
	}
	
	
	public void enterEmail(String emailAddress) {
		
		emailField.sendKeys(emailAddress);
	}
	
	public void enterPassword(String passwordData) {
		
		passwordField.sendKeys(passwordData);
	}
	
	public void clickOnLoginButton() {
		
		loginButton.click();
	}




}