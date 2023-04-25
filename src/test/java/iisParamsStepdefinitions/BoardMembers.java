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
import iisParamsTestDataType.BoardMembersTestDataType;
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

public class BoardMembers extends BaseClass {
	WebDriver driver = BaseClass.driver;
	//WebDriver driver;
	
	ConfigFileReader configFileReader = new ConfigFileReader();
	ConfigFileReader config = new ConfigFileReader();
	DropDownHelper dropDownHelper;
	WaitHelper waithelper = new WaitHelper(driver);
	IMAL_Login imalLogin = new IMAL_Login(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper();

	BoardMembersObj BoardMaintenanceobj = new BoardMembersObj(driver);
	
	BoardMembersTestDataType BoardMembertype = new BoardMembersTestDataType();
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

	@Then("Navigate to BoardMembers maintenance screen")
	public void  Navigate_to_BoardMembers_maintenance_screen() throws InterruptedException {
		//Thread.sleep(2000);
		waithelper.waitForElementVisible(iisParamHomePageObj.BoardmenbersLink(), 20000, 100);
		elementActions.clickonElement(iisParamHomePageObj.BoardmenbersLink());
		//Thread.sleep(2000);
		waithelper.waitForElementVisible(iisParamHomePageObj.MaintenanceLink(), 20000, 100);
		elementActions.clickonElement(iisParamHomePageObj.MaintenanceLink());

	}
	

		
	@Given("user input MemberId and Cifno")
	public void user_input_MemberId_and_Cifno() {
		ExcelReader objExcelReader=new ExcelReader(excelPath);
		BoardMembertype.MemberID=objExcelReader.getCellData("BoardMember", 0, 2);
		BoardMembertype.Cifno=objExcelReader.getCellData("BoardMember", 1, 2);
		
	
	
		waithelper.waitForElementVisible(BoardMaintenanceobj.trsBoard_Members(), 20000, 100);
		elementActions.typeValue(BoardMaintenanceobj.trsBoard_Members(), BoardMembertype.MemberID);
		elementActions.typeValue(BoardMaintenanceobj.CifNo(), BoardMembertype.Cifno);
	elementActions.typeTAB(BoardMaintenanceobj.CifNo());
		//elementActions.typeValue(Deviationmaintenanceobj.DeviationLongDescEng(), Deviationdtatype.LongDescription);
		//elementActions.typeValue(Deviationmaintenanceobj.DeviationBriefDescArab(), Deviationdtatype.BriefArabDescription);
		//elementActions.typeValue(Deviationmaintenanceobj.DeviationLongDescArab(), Deviationdtatype.LongArabDescription);
		//chargeMaintenanceObj.saveBtn().click();
		
	}
	

	@Then("Save BoardMembers Details")
	public void Save_BoardMembers_Details() {
		elementActions.clickonElement(BoardMaintenanceobj.BoardmemberSaveButton());
		elementActions.clickonElement(BoardMaintenanceobj.confirmOKButton());
		waithelper.waitForElementVisible(BoardMaintenanceobj.oKButton(), 20000, 100);
		elementActions.clickonElement(BoardMaintenanceobj.oKButton());

	}
	
	@And("Retrieve Saved BoardMembers details")
	public void Retrieve_Saved_BoardMembers_details () {
		elementActions.clickonElement(BoardMaintenanceobj.searchLookupBtn());
	
		waithelper.waitForElementVisible(BoardMaintenanceobj.filterChargeCodeText(), 20000, 100);
		
		elementActions.typeValue(BoardMaintenanceobj.filterChargeCodeText(),BoardMembertype.MemberID);
		elementActions.typeEnter(BoardMaintenanceobj.filterChargeCodeText());
	By gridRowtoDoubleClick=By.xpath("//td[@role='gridcell' and contains(text(),'"+BoardMembertype.MemberID+"')]");
	elementActions.doubleClickButton(gridRowtoDoubleClick);
	}
	
	@Then("Delete BoardMembers Code Created")
	public void Delete_BoardMembers_Code_Created() throws InterruptedException {
	//	waithelper.waitForTextPresentElement(chargeMaintenanceObj.briefDescriptionText(), chargeMaintenanceDataType.BriefDescription, 20000, 100);
		Thread.sleep(1000);
		elementActions.clickonElement(BoardMaintenanceobj.deletebutton());
		waithelper.waitForElementVisible(BoardMaintenanceobj.confirmOKButton(), 20000, 100);
		elementActions.clickonElement(BoardMaintenanceobj.confirmOKButton());
		waithelper.waitForElementVisible(BoardMaintenanceobj.oKButton(), 20000, 100);
		elementActions.clickonElement(BoardMaintenanceobj.oKButton());
	}
	
	@And("Close BoardMembers maintenance Screen")
	public void Close_BoardMembers_maintenance_Screen() {
		BoardMaintenanceobj.removeTab().click();
		elementActions.clickonElement(iisParamHomePageObj.BoardmenbersLink());
	
	}

}
