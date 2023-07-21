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
import iisParamsPageobjects.BoardMembersObj;
import iisParamsPageobjects.ChargesMaintenanceObj;
import iisParamsPageobjects.DeviationObj;
import iisParamsPageobjects.HomePageObj;
import iisParamsPageobjects.InsuranceTypeObj;
import iisParamsTestDataType.BoardMembersTestDataType;
import iisParamsTestDataType.ChargesMaintenanceTestDataType;
import iisParamsTestDataType.DeviationTestDataType;
import iisParamsTestDataType.InsuranceTypeTestDataType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import login.*;
import resources.BaseClass;
import resources.ExcelReader;
import resources.JsonDataReaderWriter;
import utls.ElementActions;

public class InsuranceType extends BaseClass {
	WebDriver driver = BaseClass.driver;
	//WebDriver driver;
	
	ConfigFileReader configFileReader = new ConfigFileReader();
	ConfigFileReader config = new ConfigFileReader();
	DropDownHelper dropDownHelper;
	WaitHelper waithelper = new WaitHelper(driver);
	IMAL_Login imalLogin = new IMAL_Login(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper();

	InsuranceTypeObj InsuranceTypeMaintenanceobj = new InsuranceTypeObj(driver);
	
	InsuranceTypeTestDataType Insurancetype = new InsuranceTypeTestDataType();
	JsonDataReaderWriter jsonWriter = new JsonDataReaderWriter();
	JsonDataReaderWriter reader = new JsonDataReaderWriter();
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browserHelper;
	CompanyAndBranchPage comapanyandBranchSelectionObj= new CompanyAndBranchPage(driver);
	HomePageObj iisParamHomePageObj = new HomePageObj(driver);
	private ElementActions elementActions =new ElementActions(driver);
	String excelPath = System.getProperty("user.dir") + "\\Test-data\\IISPTestData.xlsx";
	 /*
	@Given("^User Navigate to IISP URL login$")
	public void user_navigate_to_iisp_url_login() throws Exception {
	
		driver.get(configFileReader.getApplicationUrl("IISP"));

	}

	@Then("log into IISP with valid credentials")
	public void input_login_credentials_to_log_into_iisp() throws Exception {
		imalLogin.loginToIISPAppByUser();
		comapanyandBranchSelectionObj.typeCompanyData("1");
		comapanyandBranchSelectionObj.typeBranchData("102");
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

	@Then("Navigate to InsuranceType maintenance screen")
	public void  Navigate_to_InsuranceType_maintenance_screen() throws InterruptedException {
		//Thread.sleep(2000);
		waithelper.waitForElementVisible(iisParamHomePageObj.InsurancetypeLink(), 20000, 100);
		elementActions.clickonElement(iisParamHomePageObj.InsurancetypeLink());
		//Thread.sleep(2000);
		waithelper.waitForElementVisible(iisParamHomePageObj.MaintenanceLink(), 20000, 100);
		elementActions.clickonElement(iisParamHomePageObj.MaintenanceLink());

	}
	

		
	@Given("user input code and InsuranceType description")
	public void user_input_code_and_InsuranceType_description() {
		ExcelReader objExcelReader=new ExcelReader(excelPath);
		Insurancetype.InsuranceTypeCode=objExcelReader.getCellData("InsuranceType", 0, 2);
		Insurancetype.ITbriefeng=objExcelReader.getCellData("InsuranceType", 1, 2);
		Insurancetype.ITlongeng=objExcelReader.getCellData("InsuranceType", 2, 2);
		
	
	
		waithelper.waitForElementVisible(InsuranceTypeMaintenanceobj.InsuranceTypecode(), 20000, 100);
		elementActions.typeValue(InsuranceTypeMaintenanceobj.InsuranceTypecode(), Insurancetype.InsuranceTypeCode);
		elementActions.typeValue(InsuranceTypeMaintenanceobj.InsuranceTypeBriefEng(), Insurancetype.ITbriefeng);
		elementActions.typeValue(InsuranceTypeMaintenanceobj.InsuranceTypeLongEng(), Insurancetype.ITlongeng);
	//elementActions.typeTAB(BoardMaintenanceobj.CifNo());
		//elementActions.typeValue(Deviationmaintenanceobj.DeviationLongDescEng(), Deviationdtatype.LongDescription);
		//elementActions.typeValue(Deviationmaintenanceobj.DeviationBriefDescArab(), Deviationdtatype.BriefArabDescription);
		//elementActions.typeValue(Deviationmaintenanceobj.DeviationLongDescArab(), Deviationdtatype.LongArabDescription);
		//chargeMaintenanceObj.saveBtn().click();
		
	}
	

	@Then("Save InsuranceType Details")
	public void Save_InsuranceType_Details() throws InterruptedException {
		elementActions.clickonElement(InsuranceTypeMaintenanceobj.insuranceTypeSaveButton());
		elementActions.clickonElement(InsuranceTypeMaintenanceobj.confirmOKButton());
		waithelper.waitForElementVisible(InsuranceTypeMaintenanceobj.oKButton(), 20000, 100);
		elementActions.clickonElement(InsuranceTypeMaintenanceobj.oKButton());
		elementActions.clickonElement(InsuranceTypeMaintenanceobj.searchLookupBtn());
Thread.sleep(4000);
	}
	
	@And("Retrieve Saved InsuranceType details")
	public void Retrieve_Saved_InsuranceType_details () throws InterruptedException {
		elementActions.clickonElement(InsuranceTypeMaintenanceobj.searchLookupBtn());
	
		waithelper.waitForElementVisible(InsuranceTypeMaintenanceobj.filterInsurancetypeText(), 20000, 100);
		
		elementActions.typeValue(InsuranceTypeMaintenanceobj.filterInsurancetypeText(),Insurancetype.InsuranceTypeCode);
		elementActions.typeEnter(InsuranceTypeMaintenanceobj.filterInsurancetypeText());
	By gridRowtoDoubleClick=By.xpath("//td[@role='gridcell' and contains(text(),'"+Insurancetype.InsuranceTypeCode+"')]");
	Thread.sleep(1000);
	elementActions.doubleClickButton(gridRowtoDoubleClick);
	}

	@Then("Delete InsuranceType Code Created")
	public void Delete_InsuranceType_Code_Created() throws InterruptedException {
	//	waithelper.waitForTextPresentElement(chargeMaintenanceObj.briefDescriptionText(), chargeMaintenanceDataType.BriefDescription, 20000, 100);
		Thread.sleep(1000);
		elementActions.clickonElement(InsuranceTypeMaintenanceobj.deletebutton());
		waithelper.waitForElementVisible(InsuranceTypeMaintenanceobj.confirmOKButton(), 20000, 100);
		elementActions.clickonElement(InsuranceTypeMaintenanceobj.confirmOKButton());
		waithelper.waitForElementVisible(InsuranceTypeMaintenanceobj.oKButton(), 20000, 100);
		elementActions.clickonElement(InsuranceTypeMaintenanceobj.oKButton());
	}
	
	@And("Close InsuranceType maintenance Screen")
	public void Close_InsuranceType_maintenance_Screen() {
		InsuranceTypeMaintenanceobj.removeTab().click();
		elementActions.clickonElement(iisParamHomePageObj.InsurancetypeLink());
	
	}

}
