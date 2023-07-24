package iisParamsStepdefinitions;

import org.openqa.selenium.By;
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
import iisParamsTestDataType.ChargesMaintenanceTestDataType;
import iisParamsTestDataType.ReasonCodesMaintenanceTestDataType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import login.*;
import resources.BaseClass;
import resources.ExcelReader;
import resources.JsonDataReaderWriter;
import utls.ElementActions;

public class ReasonCodesMaintenanceM0038 extends BaseClass {
	WebDriver driver = BaseClass.driver;
	//WebDriver driver;
	
	ConfigFileReader configFileReader = new ConfigFileReader();
	ConfigFileReader config = new ConfigFileReader();
	DropDownHelper dropDownHelper;
	WaitHelper waithelper = new WaitHelper(driver);
	IMAL_Login imalLogin = new IMAL_Login(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper();
	ReasonCodesMaintenanceObj ReasoncodeObj = new ReasonCodesMaintenanceObj(driver);
	ReasonCodesMaintenanceTestDataType ReasonCodesMaintenanceDataType = new ReasonCodesMaintenanceTestDataType();
	JsonDataReaderWriter jsonWriter = new JsonDataReaderWriter();
	JsonDataReaderWriter reader = new JsonDataReaderWriter();
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browserHelper;
	CompanyAndBranchPage comapanyandBranchSelectionObj= new CompanyAndBranchPage(driver);
	HomePageObj iisParamHomePageObj;
	private ElementActions elementActions =new ElementActions(driver);
	String excelPath = System.getProperty("user.dir") + "\\Test-data\\IISPTestData.xlsx";
	 
	

	@Then("Navigate to ReasonCode Maintenance screen")
	public void Navigate_to_ReasonCode_Maintenance_screen() throws InterruptedException {
		//Thread.sleep(2000);
		waithelper.waitForElementVisible(iisParamHomePageObj.ReasonCodeLink(), 20000, 100);
		elementActions.clickonElement(iisParamHomePageObj.ReasonCodeLink());
		//Thread.sleep(2000);
		waithelper.waitForElementVisible(iisParamHomePageObj.MaintenanceLink(), 20000, 100);
		elementActions.clickonElement(iisParamHomePageObj.MaintenanceLink());

	}

	@Given("User input ReasonCode and description")
	public void User_input_ReasonCode_and_description() {
		ExcelReader objExcelReader=new ExcelReader(excelPath);
		ReasonCodesMaintenanceDataType.ReasonCode=objExcelReader.getCellData("ReasonCodesMaintenance", 0, 2);
		ReasonCodesMaintenanceDataType.BriefDescription=objExcelReader.getCellData("ReasonCodesMaintenance", 1, 2);
		ReasonCodesMaintenanceDataType.LongDescription=objExcelReader.getCellData("ReasonCodesMaintenance", 2, 2);
		ReasonCodesMaintenanceDataType.ArabicBrief=objExcelReader.getCellData("ReasonCodesMaintenance", 3, 2);
		ReasonCodesMaintenanceDataType.ArabicLong=objExcelReader.getCellData("ReasonCodesMaintenance", 4, 2);
		waithelper.waitForElementVisible(ReasoncodeObj.ReasonCodetxt(), 20000, 100);
		elementActions.typeValue(ReasoncodeObj.ReasonCodetxt(), ReasonCodesMaintenanceDataType.ReasonCode);
		elementActions.typeValue(ReasoncodeObj.BriefDescriptiontxt(), ReasonCodesMaintenanceDataType.BriefDescription);
		elementActions.typeValue(ReasoncodeObj.LongDescriptiontxt(), ReasonCodesMaintenanceDataType.LongDescription);
		elementActions.typeValue(ReasoncodeObj.ArabicBrieftxt(), ReasonCodesMaintenanceDataType.ArabicBrief);
		elementActions.typeValue(ReasoncodeObj.ArabicLongtxt(), ReasonCodesMaintenanceDataType.ArabicLong);
		
		//chargeMaintenanceObj.saveBtn().click();
		
	}

	@Then("Save ReasonCode Details")
	public void Save_ReasonCode_Details() {
		elementActions.clickonElement(ReasoncodeObj.SaveBtn());
		elementActions.clickonElement(ReasoncodeObj.confirmOKButton());
		waithelper.waitForElementVisible(ReasoncodeObj.oKButton(), 20000, 100);
		elementActions.clickonElement(ReasoncodeObj.oKButton());

	}
	@And("Retrieve Saved ReasonCode details")
	public void Retrieve_Saved_ReasonCode_details() {
		elementActions.clickonElement(ReasoncodeObj.SearchBtn());
		waithelper.waitForElementVisible(ReasoncodeObj.filterReasonCodetxt(), 20000, 100);
		elementActions.typeValue(ReasoncodeObj.filterReasonCodetxt(),ReasonCodesMaintenanceDataType.ReasonCode);
		elementActions.typeEnter(ReasoncodeObj.filterReasonCodetxt());
		By gridRowtoDoubleClick=By.xpath("//td[@role='gridcell' and contains(text(),'"+ReasonCodesMaintenanceDataType.ReasonCode+"')]");
		elementActions.doubleClickButton(gridRowtoDoubleClick);
	}
	@Then("Delete ReasonCode Created")
	public void Delete_ReasonCode_Created() throws InterruptedException {
	//	waithelper.waitForTextPresentElement(chargeMaintenanceObj.briefDescriptionText(), chargeMaintenanceDataType.BriefDescription, 20000, 100);
		Thread.sleep(1000);
		elementActions.clickonElement(ReasoncodeObj.deleteBtn());
		waithelper.waitForElementVisible(ReasoncodeObj.confirmOKButton(), 20000, 100);
		elementActions.clickonElement(ReasoncodeObj.confirmOKButton());
		waithelper.waitForElementVisible(ReasoncodeObj.oKButton(), 20000, 100);
		elementActions.clickonElement(ReasoncodeObj.oKButton());
	}
	
	@And("Close ReasonCode Maintenance Screen")
	public void Close_ReasonCode_Maintenance_Screen() {
		ReasoncodeObj.removeTab().click();
		elementActions.clickonElement(iisParamHomePageObj.ReasonCodeLink());
	}

}
