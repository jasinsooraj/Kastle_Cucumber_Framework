package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import iisParamsPageobjects.*;
import utls.ElementActions;

public class ForcelogoutPage {

	public WebDriver driver;
	private ElementActions elementActions;

	public ForcelogoutPage(WebDriver driver) {
		this.driver = driver;
	}

	private By forceLogoutMessage = By.className("ui-widget-content floatRightLeft");
	private By forceLogoutYesBtn = By.id("continueBtn");
	private By cancelLogoutBtn = By.id("cancelBtn");
	private By continueWelcomeBtn = By.xpath("//a[@id='continueWelcBtn']");
	private By logoutBtn = By.id("logout");

	public HomePageObj takeDecision() {
		String getPageTitle = driver.getTitle();
		System.out.println("page title is "+getPageTitle);
		if ( getPageTitle.contains("iMAL Welcome Message")){			
			clickOnContinue();
		}else if ( getPageTitle !="iMAL Welcome Message") 
		{
			
			clickOnYesButton();
			clickOnContinue();
		}
		
		return new HomePageObj(driver);
	}
	
	public HomePageObj takeDecisionForPortal() {
		String getPageTitle = driver.getTitle();
		System.out.println("page title is "+getPageTitle);
		if ( getPageTitle.contains("iMAL Welcome Message")){			
			clickOnContinue();
		}else if ( getPageTitle !="iMAL Welcome Message") 
		{
			clickOnYesButton();
			clickOnContinue();
		}
		
		return  new HomePageObj(driver);
	}
	
	public Object takeDecision(String application) {
		
		String getPageTitle = driver.getTitle();
		System.out.println("page title is "+getPageTitle);
		if ( getPageTitle.contains("iMAL Welcome Message")){			
			clickOnContinue();
		}else if ( getPageTitle !="iMAL Welcome Message") 
		{
			clickOnYesButton();
			clickOnContinue();
		}
		switch(application)
		{
		case "IISP":
		return new HomePageObj(driver);
		default:
		return new HomePageObj(driver);
		}
	}


	private void clickOnContinue() {
		elementActions = new ElementActions(driver);
		elementActions.clickButton(continueWelcomeBtn);
	}

	private void clickOnYesButton() {
		elementActions = new ElementActions(driver);
		elementActions.clickButton(forceLogoutYesBtn);
	}

	public String getForceLogoutLegend() {
		return driver.findElement(forceLogoutMessage).getText();
	}

}
