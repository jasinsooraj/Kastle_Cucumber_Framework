package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import iisParamsPageobjects.HomePageObj;
import utls.ElementActions;
import utls.WindowManager;

public class CompanyAndBranchPage {

	public WebDriver driver;
	private ElementActions elementActions;
	private WindowManager windowManager;
	
	public CompanyAndBranchPage(WebDriver driver) {	this.driver = driver;}
	
	private By companyCodeLookupTxt = By.id("lookuptxt_COMP_CODE");
	private By branchCodeLookupTxt = By.id("lookuptxt_BRANCH_CODE");
	private By continueBtnForCompanyAndBranch = By.xpath("//*[@id='ajaxlink']/span");
	private By companyAndBranchLbl=By.id("legend");
	//private By forceLogoutMessage = By.className("ui-widget-content floatRightLeft");
	private By forceLogoutYesBtn = By.id("continueBtn");
	//private By cancelLogoutBtn = By.id("cancelBtn");
	private By continueWelcomeBtn = By.xpath("//a[@id='continueWelcBtn']");
	
	
	public void typeCompanyData(String companyData) {
		windowManager = new WindowManager(driver);
		windowManager.refreshPage();windowManager.refreshPage();
		elementActions = new ElementActions(driver);
		elementActions.typeValue(companyCodeLookupTxt, companyData);
		elementActions.typeTAB(companyCodeLookupTxt);
		elementActions.typeTAB(companyCodeLookupTxt);
	}
	
	public void typeBranchData(String branchData) {
		elementActions = new ElementActions(driver);
		elementActions.clickButton(branchCodeLookupTxt);
		elementActions.clickButton(branchCodeLookupTxt);
		elementActions.typeValue(branchCodeLookupTxt, branchData);	
		elementActions.typeTAB(branchCodeLookupTxt);elementActions.typeTAB(branchCodeLookupTxt);
	}
	public void clickcontinueButtonForCompanyAndBranch() {
		elementActions = new ElementActions(driver);
		elementActions.clickButton(continueBtnForCompanyAndBranch);
	
	}
	
	public String getCompanyAndBranchlabel () {
		elementActions = new ElementActions(driver);
		return elementActions.getElementText(companyAndBranchLbl);
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
	
}
