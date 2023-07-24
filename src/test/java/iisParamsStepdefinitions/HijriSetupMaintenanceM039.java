package iisParamsStepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dataProvider.ConfigFileReader;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import iisParamsPageobjects.ChargesMaintenanceObj;
import iisParamsPageobjects.HomePageObj;
import iisParamsPageobjects.ReasonCodesMaintenanceObj;
import iisParamsPageobjects.SubPurposeCodesMaintenanceObj;
import iisParamsTestDataType.ChargesMaintenanceTestDataType;
import iisParamsTestDataType.ReasonCodesMaintenanceTestDataType;
import iisParamsTestDataType.SubPurposeCodesMaintenanceDataType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import login.*;
import resources.BaseClass;
import resources.ExcelReader;
import resources.JsonDataReaderWriter;
import utls.ElementActions;

public class HijriSetupMaintenanceM039 extends BaseClass {
	WebDriver driver = BaseClass.driver;
	//WebDriver driver;
	
	ConfigFileReader configFileReader = new ConfigFileReader();
	ConfigFileReader config = new ConfigFileReader();
	DropDownHelper dropDownHelper;
	WaitHelper waithelper = new WaitHelper(driver);
	IMAL_Login imalLogin = new IMAL_Login(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper();
	SubPurposeCodesMaintenanceObj SubPurposeCodeObj = new SubPurposeCodesMaintenanceObj(driver);
	SubPurposeCodesMaintenanceDataType SubPurposeCodeDataType = new SubPurposeCodesMaintenanceDataType();
	JsonDataReaderWriter jsonWriter = new JsonDataReaderWriter();
	JsonDataReaderWriter reader = new JsonDataReaderWriter();
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browserHelper;
	CompanyAndBranchPage comapanyandBranchSelectionObj= new CompanyAndBranchPage(driver);
	HomePageObj iisParamHomePageObj;
	private ElementActions elementActions =new ElementActions(driver);
	String excelPath = System.getProperty("user.dir") + "\\Test-data\\IISPTestData.xlsx";
	 
	@Given("^User Navigate to IISP URL login$")
	public void user_navigate_to_iisp_url_login() throws Exception {
	
		driver.get(configFileReader.getApplicationUrl("IISP"));

	}

	@Then("log into IISP with valid credentials")
	public void input_login_credentials_to_log_into_iisp() throws Exception {
		imalLogin.loginToIISPAppByUser();
		comapanyandBranchSelectionObj.typeCompanyData("1");
		comapanyandBranchSelectionObj.typeBranchData("1");
		comapanyandBranchSelectionObj.clickcontinueButtonForCompanyAndBranch();
		iisParamHomePageObj= (HomePageObj) comapanyandBranchSelectionObj.takeDecision("IISP");
		
		

	}
	@And("Click on Parameters Root OPT")
	public void click_on_parameters_root_opt() throws InterruptedException {
		//Thread.sleep(5000);
		waithelper.waitForElementVisible(iisParamHomePageObj.parametersRootOptLink(), 20000, 100);
		WebElement rootLink=iisParamHomePageObj.parametersRootOptLink();

		elementActions.clickonElement(rootLink);

	   
	}


	

	@Then("Navigate to SubPurposeCode Maintenance screen")
	public void Navigate_to_SubPurposeCode_Maintenance_screen() throws InterruptedException {
		//Thread.sleep(2000);
		waithelper.waitForElementVisible(iisParamHomePageObj.SubPurposeCodeLink(), 20000, 100);
		elementActions.clickonElement(iisParamHomePageObj.SubPurposeCodeLink());
		//Thread.sleep(2000);
		waithelper.waitForElementVisible(iisParamHomePageObj.MaintenanceLink(), 20000, 100);
		elementActions.clickonElement(iisParamHomePageObj.MaintenanceLink());

	}

	@Given("User input SubPurposeCode and description")
	public void User_input_SubPurposeCode_and_description() {
		ExcelReader objExcelReader=new ExcelReader(excelPath);
		SubPurposeCodeDataType.SubPurposeCode=objExcelReader.getCellData("SubPurposeCodesMaintenance", 0, 2);
		SubPurposeCodeDataType.MainPurposeLkp=objExcelReader.getCellData("SubPurposeCodesMaintenance", 1, 2);
		SubPurposeCodeDataType.BriefDescription=objExcelReader.getCellData("SubPurposeCodesMaintenance", 2, 2);
		SubPurposeCodeDataType.LongDescription=objExcelReader.getCellData("SubPurposeCodesMaintenance", 3, 2);
		SubPurposeCodeDataType.ArabicBrief=objExcelReader.getCellData("SubPurposeCodesMaintenance", 4, 2);
		SubPurposeCodeDataType.ArabicLong=objExcelReader.getCellData("SubPurposeCodesMaintenance", 5, 2);
		waithelper.waitForElementVisible(SubPurposeCodeObj.SubPurposeCodetxt(), 20000, 100);
		elementActions.typeValue(SubPurposeCodeObj.SubPurposeCodetxt(), SubPurposeCodeDataType.SubPurposeCode);
		elementActions.typeValue(SubPurposeCodeObj.MainPurposeLkp(), SubPurposeCodeDataType.MainPurposeLkp);
		elementActions.typeValue(SubPurposeCodeObj.BriefDescriptiontxt(), SubPurposeCodeDataType.BriefDescription);
		elementActions.typeValue(SubPurposeCodeObj.LongDescriptiontxt(), SubPurposeCodeDataType.LongDescription);
		elementActions.typeValue(SubPurposeCodeObj.ArabicBrieftxt(), SubPurposeCodeDataType.ArabicBrief);
		elementActions.typeValue(SubPurposeCodeObj.ArabicLongtxt(), SubPurposeCodeDataType.ArabicLong);
		
		
		//chargeMaintenanceObj.saveBtn().click();
		
	}

	@Then("Save SubPurposeCode Details")
	public void Save_SubPurposeCode_Details() {
		elementActions.clickonElement(SubPurposeCodeObj.SaveBtn());
		elementActions.clickonElement(SubPurposeCodeObj.confirmOKButton());
		waithelper.waitForElementVisible(SubPurposeCodeObj.oKButton(), 20000, 100);
		elementActions.clickonElement(SubPurposeCodeObj.oKButton());

	}
	@And("Retrieve Saved SubPurposeCode details")
	public void Retrieve_Saved_SubPurposeCode_details() {
		//elementActions.clickonElement(SubPurposeCodeObj.SearchBtn());
		waithelper.waitForElementVisible(SubPurposeCodeObj.filterSubPurposeCodetxt(), 20000, 100);
		elementActions.typeValue(SubPurposeCodeObj.filterSubPurposeCodetxt(),SubPurposeCodeDataType.SubPurposeCode);
		elementActions.typeEnter(SubPurposeCodeObj.filterSubPurposeCodetxt());
		By gridRowtoDoubleClick=By.xpath("//td[@role='gridcell' and contains(text(),'"+SubPurposeCodeDataType.SubPurposeCode+"')]");
		elementActions.doubleClickButton(gridRowtoDoubleClick);
	}
	@Then("Delete SubPurposeCode Created")
	public void Delete_SubPurposeCode_Created() throws InterruptedException {
	//	waithelper.waitForTextPresentElement(chargeMaintenanceObj.briefDescriptionText(), chargeMaintenanceDataType.BriefDescription, 20000, 100);
		Thread.sleep(1000);
		elementActions.clickonElement(SubPurposeCodeObj.deleteBtn());
		waithelper.waitForElementVisible(SubPurposeCodeObj.confirmOKButton(), 20000, 100);
		elementActions.clickonElement(SubPurposeCodeObj.confirmOKButton());
		waithelper.waitForElementVisible(SubPurposeCodeObj.oKButton(), 20000, 100);
		elementActions.clickonElement(SubPurposeCodeObj.oKButton());
	}
	
	@And("Close SubPurposeCode Maintenance Screen")
	public void Close_SubPurposeCode_Maintenance_Screen() {
		SubPurposeCodeObj.removeTab().click();
		elementActions.clickonElement(iisParamHomePageObj.SubPurposeCodeLink());
	}

}
