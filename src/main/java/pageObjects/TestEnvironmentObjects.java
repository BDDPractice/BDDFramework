package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TestEnvironmentObjects {

/*
 * • Create a new class in pageObjects package
•    Name the class testEnvironmentObjects
•    Get My account webelment
•    Get Login webelemnt
•    Get Register webelement
•    Create three methods to click on Myaccount, Login, and Register
•    Then get webelment for email field, password field, and and loging buton
   		
   		What is object reposotery? is the collection object of all webelement.
 */

	
	public TestEnvironmentObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy (how = How.XPATH , using ="//a[@title='My Account']")
    private WebElement myAccount;
	@FindBy (how = How.XPATH , using ="(//a[text()='Register'])[1]")
    private WebElement register;
	@FindBy (how = How.XPATH , using ="(//a[text()='Login'])[1]")
    private WebElement loginMenu;
	@FindBy (how = How.XPATH , using ="//a[@id='input-email']")
    private WebElement email;
	@FindBy (how = How.XPATH , using ="//a[@id='input-password']")
    private WebElement password;
	@FindBy (how = How.XPATH , using ="//a[@value='Login']")
    private WebElement loginButton;
	
	  public void clickOnMyAccount() {
		  myAccount.click();
	    }
	  public void clickOnRegister() {
		  register.click();
	    }
	  
	  public void clickOnLogin() {
		  loginMenu.click();
	
}
}
