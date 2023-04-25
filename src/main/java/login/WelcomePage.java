package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import iisParamsPageobjects.*;
import utls.ElementActions;

public class WelcomePage {

	public WebDriver driver;
	private ElementActions elementActions;
	public WelcomePage(WebDriver driver) {	this.driver = driver;}
	
	private By continueWelcomeBtn = By.id("continueWelcBtn");//continueWelcBtnu	
	
	public HomePageObj clickOnContinueWelcomeBtn() {
		elementActions = new ElementActions(driver);
		elementActions.clickButton(continueWelcomeBtn);
		return new HomePageObj(driver);
	}
	
	
}
