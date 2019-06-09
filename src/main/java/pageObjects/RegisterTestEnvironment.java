package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import constants.ConfigFileReader;

public class RegisterTestEnvironment extends ConfigFileReader{

	
	
	public RegisterTestEnvironment(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy (how = How.XPATH , using = "//input[@name='firstname']")
		private WebElement firstName;
	@FindBy (how = How.XPATH , using = "//input[@name='lastname']")
		private WebElement lastName;
	@FindBy (how = How.XPATH, using = "//input[@name='email']")
		private WebElement email;
	@FindBy (how = How.XPATH, using = "//input[@name='telephone']")
		private WebElement telephoneField;
	@FindBy (how = How.XPATH, using = "//input[@name='password']")
		private WebElement passwordField;
	@FindBy (how = How.XPATH, using = "//input[@name='confirm']")
		private WebElement confirmPasswordField;
	@FindBy (how = How.XPATH, using = "(//input[@type='radio' and @value='1'])[2]")
		private WebElement radioButton;
	@FindBy (how = How.XPATH, using = "//input[@type='checkbox']")
		private WebElement privacyPolicy;
	@FindBy (how = How.XPATH, using = "//input[@type='submit']")
		private WebElement continueButton;
	
	
	
	}
	
	

