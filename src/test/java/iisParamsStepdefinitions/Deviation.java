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
import iisParamsPageobjects.DeviationObj;
import iisParamsPageobjects.HomePageObj;
import iisParamsTestDataType.ChargesMaintenanceTestDataType;
import iisParamsTestDataType.DeviationTestDataType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import login.*;
import resources.BaseClass;
import resources.ExcelReader;
import resources.JsonDataReaderWriter;
import utls.ElementActions;

public class Deviation extends BaseClass {
	WebDriver driver = BaseClass.driver;
	//WebDriver driver;
	
	ConfigFileReader configFileReader = new ConfigFileReader();
	ConfigFileReader config = new ConfigFileReader();
	DropDownHelper dropDownHelper;
	WaitHelper waithelper = new WaitHelper(driver);
	IMAL_Login imalLogin = new IMAL_Login(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper();
	DeviationObj Deviationmaintenanceobj = new DeviationObj(driver);
	DeviationTestDataType Deviationdtatype = new DeviationTestDataType();
	JsonDataReaderWriter jsonWriter = new JsonDataReaderWriter();
	JsonDataReaderWriter reader = new JsonDataReaderWriter();
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browserHelper;
	CompanyAndBranchPage comapanyandBranchSelectionObj= new CompanyAndBranchPage(driver);
	HomePageObj iisParamHomePageObj = new HomePageObj(driver);
	private ElementActions elementActions =new ElementActions(driver);
	String excelPath = System.getProperty("user.dir") + "\\Test-data\\IISPTestData.xlsx";
	 
/*	@Given("^User Navigate to IISP URL login$")
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

*/

	@Then("Navigate to deviation maintenance screen")
	public void  Navigate_to_deviation_maintenance_screen() throws InterruptedException {
		//Thread.sleep(2000);
		waithelper.waitForElementVisible(iisParamHomePageObj.DeviationLink(), 20000, 100);
		elementActions.clickonElement(iisParamHomePageObj.DeviationLink());
		//Thread.sleep(2000);
		waithelper.waitForElementVisible(iisParamHomePageObj.MaintenanceLink(), 20000, 100);
		elementActions.clickonElement(iisParamHomePageObj.MaintenanceLink());

	}
	

		
	@Given("user input code and Deviation description")
	public void user_input_code_and_Deviation_description() {
		ExcelReader objExcelReader=new ExcelReader(excelPath);
		Deviationdtatype.Code=objExcelReader.getCellData("Deviation", 0, 2);
		Deviationdtatype.BriefDescription=objExcelReader.getCellData("Deviation", 1, 2);
		Deviationdtatype.LongDescription=objExcelReader.getCellData("Deviation", 2, 2);
		Deviationdtatype.BriefArabDescription=objExcelReader.getCellData("Deviation", 3, 2);
		Deviationdtatype.LongArabDescription=objExcelReader.getCellData("Deviation", 4, 2);
		waithelper.waitForElementVisible(Deviationmaintenanceobj.code(), 20000, 100);
		elementActions.typeValue(Deviationmaintenanceobj.code(), Deviationdtatype.Code);
		elementActions.typeValue(Deviationmaintenanceobj.DeviationBriefDescEng(), Deviationdtatype.BriefDescription);
		elementActions.typeValue(Deviationmaintenanceobj.DeviationLongDescEng(), Deviationdtatype.LongDescription);
		elementActions.typeValue(Deviationmaintenanceobj.DeviationBriefDescArab(), Deviationdtatype.BriefArabDescription);
		elementActions.typeValue(Deviationmaintenanceobj.DeviationLongDescArab(), Deviationdtatype.LongArabDescription);
		//chargeMaintenanceObj.saveBtn().click();
		
	}

	@Then("Save Deviation Details")
	public void Save_Deviation_Details() {
		elementActions.clickonElement(Deviationmaintenanceobj.DeviationSaveButton());
		elementActions.clickonElement(Deviationmaintenanceobj.confirmOKButton());
		waithelper.waitForElementVisible(Deviationmaintenanceobj.oKButton(), 20000, 100);
		elementActions.clickonElement(Deviationmaintenanceobj.oKButton());

	}
	
	@And("Retrieve Saved Deviation details")
	public void Retrieve_Saved_Deviation_details() {
		elementActions.clickonElement(Deviationmaintenanceobj.searchLookupBtn());
		waithelper.waitForElementVisible(Deviationmaintenanceobj.filterChargeCodeText(), 20000, 100);
		elementActions.typeValue(Deviationmaintenanceobj.filterChargeCodeText(),Deviationdtatype.Code);
		elementActions.typeEnter(Deviationmaintenanceobj.filterChargeCodeText());
		By gridRowtoDoubleClick=By.xpath("//td[@role='gridcell' and contains(text(),'"+Deviationdtatype.Code+"')]");
		elementActions.doubleClickButton(gridRowtoDoubleClick);
	}
	
	@Then("Delete Deviation Code Created")
	public void Delete_Deviation_Code_Created() throws InterruptedException {
	//	waithelper.waitForTextPresentElement(chargeMaintenanceObj.briefDescriptionText(), chargeMaintenanceDataType.BriefDescription, 20000, 100);
		Thread.sleep(1000);
		elementActions.clickonElement(Deviationmaintenanceobj.deleteBtn());
		waithelper.waitForElementVisible(Deviationmaintenanceobj.confirmOKButton(), 20000, 100);
		elementActions.clickonElement(Deviationmaintenanceobj.confirmOKButton());
		waithelper.waitForElementVisible(Deviationmaintenanceobj.oKButton(), 20000, 100);
		elementActions.clickonElement(Deviationmaintenanceobj.oKButton());
	}
	
	@And("Close Deviation maintenance Screen")
	public void Close_Deviation_maintenance_Screen() {
		Deviationmaintenanceobj.removeTab().click();
		elementActions.clickonElement(iisParamHomePageObj.DeviationLink());
	
	}

}
