package iisParamsStepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import dataProvider.ConfigFileReader;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import iisParamsPageobjects.HomePageObj;
import iisParamsPageobjects.SettlementPolicyObj;
import iisParamsTestDataType.SettlementPolicyTestDataType;
import io.cucumber.java.en.*;
import login.CompanyAndBranchPage;
import resources.BaseClass;
import resources.ExcelReader;
import resources.JsonDataReaderWriter;
import utls.ElementActions;
import helper.Selenium_Actions;	
import login.*;

public class SettlementPolicy extends BaseClass  {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	ConfigFileReader config = new ConfigFileReader();
	DropDownHelper dropDownHelper;
	WaitHelper waithelper = new WaitHelper(driver);
	IMAL_Login imalLogin = new IMAL_Login(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper();
	SettlementPolicyObj settlementPolicyObj = new SettlementPolicyObj(driver);
	SettlementPolicyTestDataType settlementPolicyDataType = new SettlementPolicyTestDataType();
	JsonDataReaderWriter jsonWriter = new JsonDataReaderWriter();
	JsonDataReaderWriter reader = new JsonDataReaderWriter();
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	CompanyAndBranchPage comapanyandBranchSelectionObj= new CompanyAndBranchPage(driver);
	HomePageObj iisParamHomePageObj = new HomePageObj(driver);
	ElementActions elementActions =new ElementActions(driver);
	String excelPath = System.getProperty("user.dir") + "\\Test-data\\IISPTestData.xlsx";
	Selenium_Actions selenium_actions = new Selenium_Actions(driver);
	DropDownHelper dropdownhelper = new DropDownHelper(driver);
	LoginPage loginpage = new LoginPage(driver);	

	@And("User Opened Settlement Policy Miantenance OPT")
	public void user_opened_settlement_policy_miantenance_opt() {
		waithelper.waitForElementVisible(iisParamHomePageObj.SettlementPlicyLink(), 20000, 100);
		elementActions.clickonElement(iisParamHomePageObj.SettlementPlicyLink());
		waithelper.waitForElementVisible(iisParamHomePageObj.MaintenanceLink(), 20000, 100);
		elementActions.clickonElement(iisParamHomePageObj.MaintenanceLink());		
		elementActions.clickonElement(settlementPolicyObj.SettlementPolicyPage());
		String actualTitle = driver.getTitle();
		String expectedTitle = "Parameters / Settlement Policy / Maintenance";
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("PAGE TITLE IS" +actualTitle);
	}

	@When("User Input Mian Informations and CIF Informations")

	public void user_input_mian_informations_and_cif_informations() {
		ExcelReader objExcelReader=new ExcelReader(excelPath);
		settlementPolicyDataType.policyno=objExcelReader.getCellData("SettlementPolicy",0,2 );
		settlementPolicyDataType.policydescription=objExcelReader.getCellData("SettlementPolicy", 1,2 );
		settlementPolicyDataType.specificproclasscode=objExcelReader.getCellData("SettlementPolicy", 2,2 );
		settlementPolicyDataType.maxnbroftrialsinput=objExcelReader.getCellData("SettlementPolicy", 3,2 );
		settlementPolicyDataType.trialfreeinput=objExcelReader.getCellData("SettlementPolicy", 4,2 );
		waithelper.waitForElementVisible(settlementPolicyObj.PolicyNo(), 20000, 100);
		elementActions.clickonElement(settlementPolicyObj.PolicyNo());
		elementActions.typeValue(settlementPolicyObj.PolicyNo(), settlementPolicyDataType.policyno);
//		elementActions.clickonElement(settlementPolicyObj.PolicyNo());
		waithelper.waitForElementVisible(settlementPolicyObj.ConfirmOk(), 20000, 100);
		elementActions.clickonElement(settlementPolicyObj.ConfirmOk());
		elementActions.typeTAB(settlementPolicyObj.PolicyNo());
		waithelper.waitForElementVisible(settlementPolicyObj.PolicyDescription(), 20000, 100);
		elementActions.typeValue(settlementPolicyObj.PolicyDescription(), settlementPolicyDataType.policydescription);
		elementActions.clickonElement(settlementPolicyObj.ProductTypeDropDwn());
		waithelper.waitForElementVisible(settlementPolicyObj.ValueSpecificProduct(), 20000, 100);
		elementActions.clickonElement(settlementPolicyObj.ValueSpecificProduct());
		waithelper.waitForElementVisible(settlementPolicyObj.SpecificProClassCode(), 20000, 100);
		elementActions.clickonElement(settlementPolicyObj.SpecificProClassCode());
		waithelper.waitForElementVisible(settlementPolicyObj.SpecificProClassCode(), 20000, 100);
		elementActions.typeValue(settlementPolicyObj.SpecificProClassCode(), settlementPolicyDataType.specificproclasscode);
		
		waithelper.waitForElementVisible(settlementPolicyObj.MaxNbrOfTrialsInput(), 20000, 100);
		elementActions.typeValue(settlementPolicyObj.MaxNbrOfTrialsInput(), settlementPolicyDataType.maxnbroftrialsinput);
		elementActions.typeTAB(settlementPolicyObj.MaxNbrOfTrialsInput());
		waithelper.waitForElementVisible(settlementPolicyObj.TrialFreeInput(), 20000, 100);
		elementActions.typeValue(settlementPolicyObj.TrialFreeInput(), settlementPolicyDataType.trialfreeinput);	
		System.out.println("User Added-mandatory Input Data");
	}

	@And("User Save Settlement Policy Data")
	public void user_save_settlement_policy_data() {
		waithelper.waitForElementVisible(settlementPolicyObj.SettlementPolicySaveBtn(), 20000, 100);
		elementActions.clickonElement(settlementPolicyObj.SettlementPolicySaveBtn());
		waithelper.waitForElementVisible(settlementPolicyObj.SaveConfOkBtn(), 20000, 100);
		elementActions.clickonElement(settlementPolicyObj.SaveConfOkBtn());
		waithelper.waitForElementVisible(settlementPolicyObj.SavedOkBtn(), 20000, 100);
		elementActions.clickonElement(settlementPolicyObj.SavedOkBtn());
		System.out.println("User Saved Settlement Policy Data saved"+ settlementPolicyDataType.policyno);
	}
	@And("User Retrieve and Delate Data")
	public void user_retrieve_and_delate_data() {

		waithelper.waitForElementVisible(settlementPolicyObj.SettPolicySearchbtn(), 20000, 100);
		elementActions.clickonElement(settlementPolicyObj.SettPolicySearchbtn());
		waithelper.waitForElementVisible(settlementPolicyObj.SearchSettPolicyNbr(), 20000, 100);
		elementActions.clickonElement(settlementPolicyObj.SearchSettPolicyNbr());	
		elementActions.typeValue(settlementPolicyObj.SearchSettPolicyNbr(), settlementPolicyDataType.policyno);
		elementActions.typeEnter(settlementPolicyObj.SearchSettPolicyNbr());
		By gridRowtoDoubleClick=By.xpath("//td[@role='gridcell' and contains(text(),'"+settlementPolicyDataType.policyno+"')]");
		elementActions.doubleClickButton(gridRowtoDoubleClick);	
		waithelper.waitForElementVisible(settlementPolicyObj.SettPolicyCloseTab(), 20000, 100);
		elementActions.clickonElement(settlementPolicyObj.SettPolicyCloseTab());
		System.out.println("User Retrieve and Delate Data");
	}
	@Then("User validate the outcomes and Close Browser")
	public void user_validate_the_outcomes() {

		loginpage.clickLogout();
		System.out.println("User validate the outcomes-Pending");


	}


}

