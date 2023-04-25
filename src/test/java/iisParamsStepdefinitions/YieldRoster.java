package iisParamsStepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.WaitHelper;
import iisParamsPageobjects.CommonPageObj;
import iisParamsPageobjects.HomePageObj;
import iisParamsPageobjects.YieldRosterObj;
import iisParamsTestDataType.YieldRosterTestDataType;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import login.CompanyAndBranchPage;
import resources.BaseClass;
import resources.ExcelReader;
import resources.JsonDataReaderWriter;
import utls.ElementActions;

public class YieldRoster extends BaseClass{
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	ConfigFileReader config = new ConfigFileReader();
	DropDownHelper dropDownHelper;
	WaitHelper waithelper = new WaitHelper(driver);
	IMAL_Login imalLogin = new IMAL_Login(driver);
	JsonDataReaderWriter jsonWriter = new JsonDataReaderWriter();
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browserHelper;
	YieldRosterObj yieldrosterobj = new YieldRosterObj(driver);
	YieldRosterTestDataType yieldrostertestdata =new YieldRosterTestDataType();
	HomePageObj iishomepageobj= new HomePageObj(driver);
	CompanyAndBranchPage comapanyandBranchSelectionObj= new CompanyAndBranchPage(driver);
	ElementActions elementActions =new ElementActions(driver);
	CommonPageObj Commonobj =new CommonPageObj(driver);

	String excelPath = System.getProperty("user.dir") + "\\Test-data\\IISPTestData.xlsx";


	@And("User Click on Yeild Roster Maintenance OPT")
	public void user_click_on_yeild_roster_maintenance_opt() {
		waithelper.waitForElementVisible(iishomepageobj.YeildLink(), 2000, 100);
		elementActions.clickonElement(iishomepageobj.YeildLink());
		waithelper.waitForElementVisible(yieldrosterobj.YieldRosterSubOpt(), 2000, 100);
		elementActions.clickonElement(yieldrosterobj.YieldRosterSubOpt());
		waithelper.waitForElementVisible(iishomepageobj.MaintenanceLink(), 2000, 100);
		elementActions.clickonElement(iishomepageobj.MaintenanceLink());
		String ActualTitle=driver.getTitle();
		String ExpectedTitle= "Parameters / Yield / Yield Roster / Maintenance";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("Page Title Is" +ActualTitle);

	}

	@When("User Input Main and Roster Details")
	public void user_input_main_and_roster_details() {

		ExcelReader objExcelReader=new ExcelReader(excelPath);
		yieldrostertestdata.yeildrostercode=objExcelReader.getCellData("YieldRoster", 0, 2);
		yieldrostertestdata.rosterbriefdesc=objExcelReader.getCellData("YieldRoster", 1, 2);
		yieldrostertestdata.rosterlongdesc=objExcelReader.getCellData("YieldRoster", 2, 2);
		waithelper.waitForElementVisible(yieldrosterobj.AddNewbtn(), 2000, 100);
		//Input Main Details
		elementActions.clickonElement(yieldrosterobj.AddNewbtn());
		elementActions.typeValue(yieldrosterobj.YeildRosterCode(), yieldrostertestdata.yeildrostercode);
		waithelper.waitForElementVisible(yieldrosterobj.RosterBriefDesc(), 2000, 100);
		elementActions.clickonElement(yieldrosterobj.RosterBriefDesc());
		elementActions.typeValue(yieldrosterobj.RosterBriefDesc(), yieldrostertestdata.rosterbriefdesc);
		waithelper.waitForElementVisible(yieldrosterobj.RosterLongDesc(), 2000, 100);
		elementActions.clickonElement(yieldrosterobj.RosterLongDesc());
		elementActions.typeValue(yieldrosterobj.RosterLongDesc(), yieldrostertestdata.rosterlongdesc);
		System.out.println("User Input Main and Roster Details");
		//Input Roster Details

	}
	@Then("User Save Roster Details")
	public void user_save_roster_details() {

		waithelper.waitForElementVisible(yieldrosterobj.YieldRosterSaveBtn(), 2000, 100);
		elementActions.clickonElement(yieldrosterobj.YieldRosterSaveBtn());
		waithelper.waitForElementVisible(Commonobj.ConfirmPopupOK(),2000,100);
		elementActions.clickonElement(Commonobj.ConfirmPopupOK());
		waithelper.waitForElementVisible(Commonobj.SuccessOkBtn(),2000,100);
		elementActions.clickonElement(Commonobj.SuccessOkBtn());
		System.out.println("User Save Roster Details");


	}

	@And("User Retrieve Saved Data")
	public void user_retrieve_saved_data() {
		waithelper.waitForElementVisible(yieldrosterobj.RetrieveSearchBtn(), 2000, 100);
		elementActions.clickonElement(yieldrosterobj.RetrieveSearchBtn());
		By gridRowtoDoubleClick=By.xpath("//td[@role='gridcell' and contains(text(),'"+yieldrostertestdata.yeildrostercode+"')]");
		elementActions.doubleClickButton(gridRowtoDoubleClick);			
		System.out.println("User Retrieve Saved Data");
	}

	@Then("User Delete Roster Details")
	public void user_delete_roster_details() {

		waithelper.waitForElementVisible(yieldrosterobj.YieldRosterDeletBtn(), 2000, 100);
		elementActions.clickonElement(yieldrosterobj.YieldRosterDeletBtn());
		waithelper.waitForElementVisible(Commonobj.ConfirmPopupOK(), 2000, 100);
		elementActions.clickonElement(Commonobj.ConfirmPopupOK());
		waithelper.waitForElementVisible(Commonobj.SuccessOkBtn(), 2000, 100);
		elementActions.clickonElement(Commonobj.SuccessOkBtn());
		elementActions.clickonElement(Commonobj.CloseOpenedTab());
		String ActualTitle=driver.getTitle();
		String ExpectedTitle= "iMAL*Islamic Investment System";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("Page Title Is" +ActualTitle);

		
	}


}
