package iisParamsStepdefinitions;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import iisParamsPageobjects.HomePageObj;
import iisParamsPageobjects.ThirdPartyDetailsObj;
import iisParamsTestDataType.ThirdPartyDetailsDataType;
import io.cucumber.java.en.*;
import login.CompanyAndBranchPage;
import resources.BaseClass;
import resources.ExcelReader;
import resources.JsonDataReaderWriter;
import utls.ElementActions;

public class ThirdPartyDetailsMaintenace extends BaseClass {
	WebDriver driver = BaseClass.driver;
	//WebDriver driver;

	ConfigFileReader configFileReader = new ConfigFileReader();
	ConfigFileReader config = new ConfigFileReader();
	DropDownHelper dropDownHelper;
	WaitHelper waithelper = new WaitHelper(driver);
	IMAL_Login imalLogin = new IMAL_Login(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper();
	ThirdPartyDetailsObj thirdpartydetailsobj = new ThirdPartyDetailsObj(driver);
	ThirdPartyDetailsDataType thirdpartydetailsaatatype = new ThirdPartyDetailsDataType();
	JsonDataReaderWriter jsonWriter = new JsonDataReaderWriter();
	JsonDataReaderWriter reader = new JsonDataReaderWriter();
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browserHelper;
	CompanyAndBranchPage comapanyandBranchSelectionObj= new CompanyAndBranchPage(driver);
	ElementActions elementActions =new ElementActions(driver);
	String excelPath = System.getProperty("user.dir") + "\\Test-data\\IISPTestData.xlsx";
	HomePageObj iisParamHomePageObj = new HomePageObj(driver);

	@Then("User Opened Third Party Maintenace M067MT OPT")
	public void user_opened_third_party_maintenace_m067mt_opt() {
		waithelper.waitForElementVisible(iisParamHomePageObj.ThirdPartyDetailsLink(), 20000, 100);
		elementActions.clickonElement(iisParamHomePageObj.ThirdPartyDetailsLink());
		waithelper.waitForElementVisible(iisParamHomePageObj.MaintenanceLink(), 20000, 100);
		elementActions.clickonElement(iisParamHomePageObj.MaintenanceLink());
		throw new io.cucumber.java.PendingException();
	}

	@When("User Input Data")
	public void user_input_data() {

		ExcelReader objExcelReader=new ExcelReader(excelPath);
		thirdpartydetailsaatatype.shortname=objExcelReader.getCellData("ThirdPartyDetails", 0, 2);
		thirdpartydetailsaatatype.longname=objExcelReader.getCellData("ThirdPartyDetails", 1, 2);
		thirdpartydetailsaatatype.address1=objExcelReader.getCellData("ThirdPartyDetails", 2, 2);
		thirdpartydetailsaatatype.address2=objExcelReader.getCellData("ThirdPartyDetails", 3, 2);
		thirdpartydetailsaatatype.address3=objExcelReader.getCellData("ThirdPartyDetails", 4, 2);
		thirdpartydetailsaatatype.address4=objExcelReader.getCellData("ThirdPartyDetails", 5, 2);
		thirdpartydetailsaatatype.telno=objExcelReader.getCellData("ThirdPartyDetails", 6, 2);
		thirdpartydetailsaatatype.fax=objExcelReader.getCellData("ThirdPartyDetails", 7, 2);
		thirdpartydetailsaatatype.email=objExcelReader.getCellData("ThirdPartyDetails", 8, 2);
//		Click on "New"
		waithelper.waitForElementVisible(thirdpartydetailsobj.ThirdPartyDetailsAddBtn(), 2000, 100);
		elementActions.clickonElement(thirdpartydetailsobj.ThirdPartyDetailsAddBtn());
//		Enter"Short Name"
		waithelper.waitForElementVisible(thirdpartydetailsobj.ShortName(), 2000, 100);
		elementActions.typeValue(thirdpartydetailsobj.ShortName(), thirdpartydetailsaatatype.shortname);
		elementActions.typeTAB(thirdpartydetailsobj.ShortName());
//		Enter "Long Name"
		waithelper.waitForElementVisible(thirdpartydetailsobj.LongName(), 2000, 100);
		elementActions.typeValue(thirdpartydetailsobj.LongName(), thirdpartydetailsaatatype.shortname);
		elementActions.typeTAB(thirdpartydetailsobj.LongName());
//		Enter "Addr-1"
//		Enter "addr-2" 
//		Enter "addr-3"
//		Enter "addr-4"
//		Enter "Tel No"
//		Enter "Fax"
//		Enter "Email"	
		throw new io.cucumber.java.PendingException();
	}

	@When("User Save Third Party Maintenace M067MT")
	public void user_third_party_maintenace_m067mt() {
//		Click on "Save"
//		Click on "Ok"
//		Click on "Ok"
		throw new io.cucumber.java.PendingException();
	}

	@When("User Retrieve and Delate Third Party Maintenace Saved Data")
	public void user_retrieve_and_delate_third_party_maintenace_saved_data() {
//		Click on "search icon"
//		Enter "short name" into "SHORT_NAME"
//		Press Enter
//		Click on "Short Name"
//		Click on "Short Name"
//		Double click on "Short Name"
//		Click on "Delete"
//		Click on "Ok"
//		Click on "Ok"
		throw new io.cucumber.java.PendingException();
	}

	@Then("User validate the outcomes and Close Browse")
	public void user_validate_the_outcomes_and_close_browse() {

		throw new io.cucumber.java.PendingException();
	}


}


//Open website
//Click on "New"
//Enter "Short Name" into "Short Name"
//Enter "Long Name" into "Long name"
//Enter "Addr-1" into "Address1"
//Enter "addr-2" into "Address2"
//Enter "addr-3" into "Address3"
//Enter "addr-4" into "Address 4"
//Enter "9995219152" into "Tel No"
//Enter "8541240" into "Fax"
//Enter "akil@gmail.com" into "Email"
//Click on "Save"
//Click on "Ok"
//Click on "Ok"
//Click on "search icon"
//Enter "short name" into "SHORT_NAME"
//Press Enter
//Click on "Short Name"
//Click on "Short Name"
//Double click on "Short Name"
//Click on "Delete"
//Click on "Ok"
//Click on "Ok"

