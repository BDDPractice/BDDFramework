package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import constants.ConfigFileReader;

public class WishList extends ConfigFileReader{
	public WishList(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy (how = How.XPATH , using = "//input[@name='email']")
		private WebElement emailAddress;
	@FindBy (how = How.XPATH , using = "//input[@id='input-password']")
		private WebElement password;
	@FindBy (how = How.XPATH , using = "//input[@type='submit']")
		private WebElement login;
}
