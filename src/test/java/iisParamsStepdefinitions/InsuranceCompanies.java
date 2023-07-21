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
import iisParamsPageobjects.InsuranceCompaniesObj;
import iisParamsPageobjects.InsuranceTypeObj;
import iisParamsTestDataType.BoardMembersTestDataType;
import iisParamsTestDataType.ChargesMaintenanceTestDataType;
import iisParamsTestDataType.DeviationTestDataType;
import iisParamsTestDataType.InsuranceCompaniesTestDataType;
import iisParamsTestDataType.InsuranceTypeTestDataType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import login.*;
import resources.BaseClass;
import resources.ExcelReader;
import resources.JsonDataReaderWriter;
import utls.ElementActions;

public class InsuranceCompanies extends BaseClass {
	WebDriver driver = BaseClass.driver;
	//WebDriver driver;
	
	ConfigFileReader configFileReader = new ConfigFileReader();
	ConfigFileReader config = new ConfigFileReader();
	DropDownHelper dropDownHelper;
	WaitHelper waithelper = new WaitHelper(driver);
	IMAL_Login imalLogin = new IMAL_Login(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper();

	
	InsuranceCompaniesObj InsuranceCompanyMaintenanceobj = new InsuranceCompaniesObj(driver);
	
	
	InsuranceCompaniesTestDataType InsuranceComapniestype = new InsuranceCompaniesTestDataType();
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

	@Then("Navigate to Insurance Companies maintenance screen")
	public void  Navigate_to_Insurance_Companies_maintenance_screen() throws InterruptedException {
		//Thread.sleep(2000);
		waithelper.waitForElementVisible(iisParamHomePageObj.InsurancecomanyLink(), 20000, 100);
		elementActions.clickonElement(iisParamHomePageObj.InsurancecomanyLink());
		//Thread.sleep(2000);
		waithelper.waitForElementVisible(iisParamHomePageObj.MaintenanceLink(), 20000, 100);
		elementActions.clickonElement(iisParamHomePageObj.MaintenanceLink());

	}
	

		
	@Given("user input Code and Description")
	public void user_input_Code_and_Description () {
		ExcelReader objExcelReader=new ExcelReader(excelPath);
		InsuranceComapniestype.InsuranceCompanyCode=objExcelReader.getCellData("InsuranceCompany", 0, 2);
		InsuranceComapniestype.BreifDescriptionEng=objExcelReader.getCellData("InsuranceCompany", 1, 2);
		InsuranceComapniestype.LongDescriptionEng=objExcelReader.getCellData("InsuranceCompany", 2, 2);
		InsuranceComapniestype.SETTLEMENT_PRIORITY_NO=objExcelReader.getCellData("InsuranceCompany", 5, 2);
		InsuranceComapniestype.INSURANCE_TYPE_lookuptxt=objExcelReader.getCellData("InsuranceCompany", 0, 2);
	
	
		waithelper.waitForElementVisible(InsuranceCompanyMaintenanceobj.insuranceCompanyParamCode(), 20000, 100);
		elementActions.typeValue(InsuranceCompanyMaintenanceobj.insuranceCompanyParamCode(), InsuranceComapniestype.InsuranceCompanyCode);
		elementActions.typeValue(InsuranceCompanyMaintenanceobj.insuranceCompanyParamBriefNameEng(), InsuranceComapniestype.BreifDescriptionEng);
		elementActions.typeValue(InsuranceCompanyMaintenanceobj.insuranceCompanyParamLongNameEng(), InsuranceComapniestype.LongDescriptionEng);
		elementActions.clickonElement(InsuranceCompanyMaintenanceobj.TrackerInsurance());

		elementActions.typeValue(InsuranceCompanyMaintenanceobj.SettlementPriorityNo(), InsuranceComapniestype.SETTLEMENT_PRIORITY_NO);
		elementActions.clickonElement(InsuranceCompanyMaintenanceobj.SettlementFasAssetClass());
		elementActions.clickonElement(InsuranceCompanyMaintenanceobj.InsuranceTypeDetails());
		elementActions.clickonElement(InsuranceCompanyMaintenanceobj.insuranceDetailsGrid_Id());
		elementActions.clickonElement(InsuranceCompanyMaintenanceobj.TinsuranceDetailsGrid_Id());
		
		//waithelper.waitForElementVisible(InsuranceCompanyMaintenanceobj.INSURANCE_TYPE_lookuptxt(), 20000, 100);
		
		//elementActions.clickonElement(InsuranceCompanyMaintenanceobj.searchLookupBtn());
		//waithelper.waitForElementVisible(InsuranceCompanyMaintenanceobj.INSURANCE_TYPE_lookuptxt(), 20000, 100);
		//elementActions.typeValue(InsuranceCompanyMaintenanceobj.DRACCGL(),InsuranceComapniestype.INSURANCE_TYPE_lookuptxt);
	//elementActions.typeTAB(BoardMaintenanceobj.CifNo());
		//elementActions.typeValue(Deviationmaintenanceobj.DeviationLongDescEng(), Deviationdtatype.LongDescription);
		//elementActions.typeValue(Deviationmaintenanceobj.DeviationBriefDescArab(), Deviationdtatype.BriefArabDescription);
		//elementActions.typeValue(Deviationmaintenanceobj.DeviationLongDescArab(), Deviationdtatype.LongArabDescription);
		//chargeMaintenanceObj.saveBtn().click();
		
	}
	

	@Then("Save Insurance Companies Details")
	public void Save_Insurance_Companies_Details() throws InterruptedException {
		elementActions.clickonElement(InsuranceCompanyMaintenanceobj.insuranceCompanySaveButton());
		elementActions.clickonElement(InsuranceCompanyMaintenanceobj.confirmOKButton());
		waithelper.waitForElementVisible(InsuranceCompanyMaintenanceobj.oKButton(), 20000, 100);
		elementActions.clickonElement(InsuranceCompanyMaintenanceobj.oKButton());
		elementActions.clickonElement(InsuranceCompanyMaintenanceobj.searchLookupBtn());
		elementActions.clickonElement(InsuranceCompanyMaintenanceobj.searchLookupBtn());
Thread.sleep(4000);
	}
	
	@And("Retrieve Saved Insurance Companies details")
	public void Retrieve_Saved_Insurance_Companies_details () throws InterruptedException {
		elementActions.clickonElement(InsuranceCompanyMaintenanceobj.searchLookupBtn());
		
		elementActions.clickonElement(InsuranceCompanyMaintenanceobj.searchLookupBtn());
	Thread.sleep(444);
	elementActions.clickonElement(InsuranceCompanyMaintenanceobj.searchLookupBtn());
		waithelper.waitForElementVisible(InsuranceCompanyMaintenanceobj.filterInsuranceCompanyCodeText(), 20000, 100);
		
		elementActions.typeValue(InsuranceCompanyMaintenanceobj.filterInsuranceCompanyCodeText(),InsuranceComapniestype.InsuranceCompanyCode);
		elementActions.typeEnter(InsuranceCompanyMaintenanceobj.filterInsuranceCompanyCodeText());
	By gridRowtoDoubleClick=By.xpath("//td[@role='gridcell' and contains(text(),'"+InsuranceComapniestype.InsuranceCompanyCode+"')]");
	elementActions.doubleClickButton(gridRowtoDoubleClick);
	}

	@Then("Delete Insurance Companies Code Created")
	public void Delete_Insurance_Companies_Code_Created() throws InterruptedException {
	//	waithelper.waitForTextPresentElement(chargeMaintenanceObj.briefDescriptionText(), chargeMaintenanceDataType.BriefDescription, 20000, 100);
		Thread.sleep(1000);
		elementActions.clickonElement(InsuranceCompanyMaintenanceobj.deletebutton());
		waithelper.waitForElementVisible(InsuranceCompanyMaintenanceobj.confirmOKButton(), 20000, 100);
		elementActions.clickonElement(InsuranceCompanyMaintenanceobj.confirmOKButton());
		waithelper.waitForElementVisible(InsuranceCompanyMaintenanceobj.oKButton(), 20000, 100);
		elementActions.clickonElement(InsuranceCompanyMaintenanceobj.oKButton());
	}
	
	@And("Close Insurance Companies maintenance Screen")
	public void Close_Insurance_Companies_maintenance_Screen() {
		InsuranceCompanyMaintenanceobj.removeTab().click();
		elementActions.clickonElement(iisParamHomePageObj.InsurancecomanyLink());
	
	}

}
