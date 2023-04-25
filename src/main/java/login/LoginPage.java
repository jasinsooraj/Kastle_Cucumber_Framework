package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utls.ElementActions;
import utls.WindowManager;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	public WebDriver driver;
	private ElementActions elementActions;
	
	private By userNameTxt = By.id("j_username");
	private By passwordTxt = By.id("passwordInp");
	private By loginBtn = By.linkText("Login");
	private By logoutBtn= By.id("logout");
	
	public void typeUserName(String userNameData) {
		elementActions = new ElementActions(driver);
		elementActions.typeValue(userNameTxt, userNameData);
	}
	public void typePassword(String passwordData) {
		elementActions = new ElementActions(driver);
		elementActions.typeValue(passwordTxt, passwordData);
	}
	public CompanyAndBranchPage clickLoginButton() {
		elementActions = new ElementActions(driver);
		elementActions.clickButton(loginBtn);
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		return new CompanyAndBranchPage(driver);
	}

	
	public void clickLogout() {
		elementActions = new ElementActions(driver);
		elementActions.clickButton(logoutBtn);
	}
	
}
