package iisParamsStepdefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import iisParamsPageobjects.ChargesMaintenanceObj;
import iisParamsPageobjects.HomePageObj;
import iisParamsTestDataType.ChargesMaintenanceTestDataType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import login.*;
import resources.BaseClass;
import resources.ExcelReader;
import resources.JsonDataReaderWriter;
import utls.ElementActions;

public class ChargesMaintenance extends BaseClass {
	WebDriver driver = BaseClass.driver;
	//WebDriver driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	ConfigFileReader config = new ConfigFileReader();
	DropDownHelper dropDownHelper;
	WaitHelper waithelper = new WaitHelper(driver);
	IMAL_Login imalLogin = new IMAL_Login(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper();
	ChargesMaintenanceObj chargeMaintenanceObj = new ChargesMaintenanceObj(driver);
	ChargesMaintenanceTestDataType chargeMaintenanceDataType = new ChargesMaintenanceTestDataType();
	JsonDataReaderWriter jsonWriter = new JsonDataReaderWriter();
	JsonDataReaderWriter reader = new JsonDataReaderWriter();
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browserHelper;
	CompanyAndBranchPage comapanyandBranchSelectionObj= new CompanyAndBranchPage(driver);
	//HomePageObj iisParamHomePageObj;
	private ElementActions elementActions =new ElementActions(driver);
	String excelPath = System.getProperty("user.dir") + "\\Test-data\\IISPTestData.xlsx";
	IISParamsCommonOperations common=new IISParamsCommonOperations();
	 
	

	

	//@Then("Navigate to charges maintenance screen")
	@Given("Navigate to charges maintenance screen")
	public void navigate_to_charges_maintenance_screen() throws InterruptedException {
		//Thread.sleep(2000);
		waithelper.waitForElementVisible(iisParamHomePageObj.chargesLink(), 20000, 100);
		elementActions.clickonElement(iisParamHomePageObj.chargesLink());
		//Thread.sleep(2000);
		waithelper.waitForElementVisible(iisParamHomePageObj.MaintenanceLink(), 20000, 100);
		elementActions.clickonElement(iisParamHomePageObj.MaintenanceLink());

	}

	@Given("user input Charge code and charge description")
	public void user_input_charge_code_and_charge_description() {
		ExcelReader objExcelReader=new ExcelReader(excelPath);
		chargeMaintenanceDataType.ChargeCode=objExcelReader.getCellData("ChargesMaintenance", 0, 2);
		chargeMaintenanceDataType.BriefDescription=objExcelReader.getCellData("ChargesMaintenance", 1, 2);
		chargeMaintenanceDataType.LongDescription=objExcelReader.getCellData("ChargesMaintenance", 2, 2);
		waithelper.waitForElementVisible(chargeMaintenanceObj.chargesCodeText(), 20000, 100);
		elementActions.typeValue(chargeMaintenanceObj.chargesCodeText(), chargeMaintenanceDataType.ChargeCode);
		elementActions.typeValue(chargeMaintenanceObj.briefDescriptionText(), chargeMaintenanceDataType.BriefDescription);
		elementActions.typeValue(chargeMaintenanceObj.longDescriptionText(), chargeMaintenanceDataType.LongDescription);
		
		//chargeMaintenanceObj.saveBtn().click();
		
	}

	@Then("Save Charge Details")
	public void save_charge_details() {
		elementActions.clickonElement(chargeMaintenanceObj.saveBtn());
		elementActions.clickonElement(chargeMaintenanceObj.confirmOKButton());
		waithelper.waitForElementVisible(chargeMaintenanceObj.oKButton(), 20000, 100);
		elementActions.clickonElement(chargeMaintenanceObj.oKButton());
		

	}
	
	@And("Retrieve Saved Charge details")
	public void Retrieve_Saved_Charge_details() {
		elementActions.clickonElement(chargeMaintenanceObj.searchLookupBtn());
		waithelper.waitForElementVisible(chargeMaintenanceObj.filterChargeCodeText(), 20000, 100);
		elementActions.typeValue(chargeMaintenanceObj.filterChargeCodeText(),chargeMaintenanceDataType.ChargeCode);
		elementActions.typeEnter(chargeMaintenanceObj.filterChargeCodeText());
		By gridRowtoDoubleClick=By.xpath("//td[@role='gridcell' and contains(text(),'"+chargeMaintenanceDataType.ChargeCode+"')]");
		elementActions.doubleClickButton(gridRowtoDoubleClick);
	}
	@Then("Delete Charge Code Created")
	public void delete_Charge_Code_Created() throws InterruptedException {
	//	waithelper.waitForTextPresentElement(chargeMaintenanceObj.briefDescriptionText(), chargeMaintenanceDataType.BriefDescription, 20000, 100);
		Thread.sleep(1000);
		elementActions.clickonElement(chargeMaintenanceObj.deleteBtn());
		waithelper.waitForElementVisible(chargeMaintenanceObj.confirmOKButton(), 20000, 100);
		elementActions.clickonElement(chargeMaintenanceObj.confirmOKButton());
		waithelper.waitForElementVisible(chargeMaintenanceObj.oKButton(), 20000, 100);
		elementActions.clickonElement(chargeMaintenanceObj.oKButton());
	}
	
	@And("Close Charge maintenance Screen")
	public void close_Charge_maintenance_Screen() {
		chargeMaintenanceObj.removeTab().click();
		elementActions.clickonElement(iisParamHomePageObj.chargesLink());
	}

}
