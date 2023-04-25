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
import iisParamsPageobjects.LeasedAssetMaintenanceObj;
import iisParamsTestDataType.ChargesMaintenanceTestDataType;
import iisParamsTestDataType.LeasedAssetMaintenanceTestDataType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import login.*;
import resources.BaseClass;
import resources.ExcelReader;
import resources.JsonDataReaderWriter;
import utls.ElementActions;

public class Leasedassetmaintenance extends BaseClass {
	WebDriver driver = BaseClass.driver;
	//WebDriver driver;
	
	ConfigFileReader configFileReader = new ConfigFileReader();
	ConfigFileReader config = new ConfigFileReader();
	DropDownHelper dropDownHelper;
	WaitHelper waithelper = new WaitHelper(driver);
	IMAL_Login imalLogin = new IMAL_Login(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper();
	LeasedAssetMaintenanceObj leasedAssetMaintenanceObj = new LeasedAssetMaintenanceObj(driver);
	LeasedAssetMaintenanceTestDataType leasedAssetMaintenanceDataType = new LeasedAssetMaintenanceTestDataType();
	JsonDataReaderWriter jsonWriter = new JsonDataReaderWriter();
	JsonDataReaderWriter reader = new JsonDataReaderWriter();
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browserHelper;
	CompanyAndBranchPage comapanyandBranchSelectionObj= new CompanyAndBranchPage(driver);
	HomePageObj iisParamHomePageObj=new HomePageObj(driver);
	ElementActions elementActions =new ElementActions(driver);
	String excelPath = System.getProperty("user.dir") + "\\Test-data\\IISPTestData.xlsx";
	 
	

	@Then("Navigate to Leased Asset maintenance screen")
	public void Navigate_to_Leased_Asset_maintenance_screen() throws InterruptedException {
		//Thread.sleep(2000);
		waithelper.waitForElementVisible(iisParamHomePageObj.LeasedAssetLink(), 10000, 100);
		Thread.sleep(2000);
		elementActions.clickonElement(iisParamHomePageObj.LeasedAssetLink());
		
		waithelper.waitForElementVisible(iisParamHomePageObj.MaintenanceLink(), 10000, 100);
		elementActions.clickonElement(iisParamHomePageObj.MaintenanceLink());

	}


	@And("user input Asset code and description")
	public void user_input_Asset_code_and_description() {
		ExcelReader objExcelReader=new ExcelReader(excelPath);
		leasedAssetMaintenanceDataType.LeasedAssetCode=objExcelReader.getCellData("LeasedAssetCode", 0, 2);
		leasedAssetMaintenanceDataType.BriefDescription=objExcelReader.getCellData("LeasedAssetCode", 1, 2);
		leasedAssetMaintenanceDataType.LongDescription=objExcelReader.getCellData("LeasedAssetCode", 2, 2);
		leasedAssetMaintenanceDataType.arabicbriefDescription=objExcelReader.getCellData("LeasedAssetCode", 3, 2);
		leasedAssetMaintenanceDataType.arabiclongDescription=objExcelReader.getCellData("LeasedAssetCode", 4, 2);
		waithelper.waitForElementVisible(leasedAssetMaintenanceObj.leaseAssetcodetext(), 10000, 100);
		elementActions.typeValue(leasedAssetMaintenanceObj.leaseAssetcodetext(), leasedAssetMaintenanceDataType.LeasedAssetCode);
		elementActions.typeValue(leasedAssetMaintenanceObj.leasedassetbriefdesc(), leasedAssetMaintenanceDataType.BriefDescription);
		elementActions.typeValue(leasedAssetMaintenanceObj.leasedassetlongdesc(), leasedAssetMaintenanceDataType.LongDescription);
		elementActions.typeValue(leasedAssetMaintenanceObj.leasedassetbriefarabic(), leasedAssetMaintenanceDataType.arabicbriefDescription);
		elementActions.typeValue(leasedAssetMaintenanceObj.leasedassetlongarabic(), leasedAssetMaintenanceDataType.arabiclongDescription);
		waithelper.waitForElementVisible(leasedAssetMaintenanceObj.leasedassetadditionalDetailstab(), 10000, 100);
		elementActions.clickonElement(leasedAssetMaintenanceObj.leasedassetadditionalDetailstab());
		leasedAssetMaintenanceDataType.Purchasecurrency=objExcelReader.getCellData("LeasedAssetCode", 5, 2);
		leasedAssetMaintenanceDataType.Purchasevalue=objExcelReader.getCellData("LeasedAssetCode", 6, 2);
		//leasedAssetMaintenanceDataType.Purchasecurrencyrate=objExcelReader.getCellData("LeasedAssetCode", 7, 2);
		//leasedAssetMaintenanceDataType.Purchasecurrencyratemutliplydiv=objExcelReader.getCellData("LeasedAssetCode", 8, 2);
		leasedAssetMaintenanceDataType.salescurrency=objExcelReader.getCellData("LeasedAssetCode", 9, 2);
		//leasedAssetMaintenanceDataType.salescurrencyrate=objExcelReader.getCellData("LeasedAssetCode", 10, 2);
		leasedAssetMaintenanceDataType.salesvalue=objExcelReader.getCellData("LeasedAssetCode", 11, 2);
		//leasedAssetMaintenanceDataType.salescurrencyratemultiplydiv=objExcelReader.getCellData("LeasedAssetCode", 12, 2);
		elementActions.typeValue(leasedAssetMaintenanceObj.leasedpurchasecurrency(), leasedAssetMaintenanceDataType.Purchasecurrency);
		elementActions.typeTAB(leasedAssetMaintenanceObj.leasedpurchasecurrency());
		elementActions.typeValue(leasedAssetMaintenanceObj.leasedassetpurchasevalue(), leasedAssetMaintenanceDataType.Purchasevalue);
		//elementActions.typeValue(leasedAssetMaintenanceObj.leasedassetpurchasecurrencyrate(), leasedAssetMaintenanceDataType.Purchasecurrencyrate);
		//elementActions.typeValue(leasedAssetMaintenanceObj.leasedassetCYratemutlplydivide(), leasedAssetMaintenanceDataType.Purchasecurrencyratemutliplydiv);
		elementActions.typeValue(leasedAssetMaintenanceObj.leasedassetsalescy(), leasedAssetMaintenanceDataType.salescurrency);
		elementActions.typeTAB(leasedAssetMaintenanceObj.leasedassetsalescy());
		//elementActions.typeValue(leasedAssetMaintenanceObj.leasedassetsalescyrate(), leasedAssetMaintenanceDataType.salescurrencyrate);
		waithelper.waitForElementVisible(leasedAssetMaintenanceObj.leasedassetsalesvalue(), 20000, 100);
		elementActions.typeValue(leasedAssetMaintenanceObj.leasedassetsalesvalue(), leasedAssetMaintenanceDataType.salesvalue);
		//elementActions.typeValue(leasedAssetMaintenanceObj.leasedassetsalescyratemultiplyDiv(), leasedAssetMaintenanceDataType.salescurrencyratemultiplydiv);
		
	
	}
	
	@Then("Save Asset Details")
	public void save_Asset_details() throws InterruptedException {
		waithelper.waitForElementVisible(leasedAssetMaintenanceObj.leasedassetmaintenancesavebutton(), 20000, 100);
		Thread.sleep(2000);
		elementActions.clickonElement(leasedAssetMaintenanceObj.leasedassetmaintenancesavebutton());
		waithelper.waitForElementVisible(leasedAssetMaintenanceObj.confirmOKButton(), 20000, 100);
		elementActions.clickonElement(leasedAssetMaintenanceObj.confirmOKButton());
		waithelper.waitForElementVisible(leasedAssetMaintenanceObj.oKButton(), 20000, 100);
		elementActions.clickonElement(leasedAssetMaintenanceObj.oKButton());
		
	}
	
	@And("Retrieve Asset details")
	public void Retrieve_Asset_details() {
		elementActions.clickonElement(leasedAssetMaintenanceObj.leasedassetsearchbutton());
		waithelper.waitForElementVisible(leasedAssetMaintenanceObj.filterassetcode(), 20000, 100);
		elementActions.typeValue(leasedAssetMaintenanceObj.filterassetcode(),leasedAssetMaintenanceDataType.LeasedAssetCode);
		elementActions.typeEnter(leasedAssetMaintenanceObj.filterassetcode());

		By gridRowtoDoubleClick=By.xpath("//td[@role='gridcell' and contains(text(),'"+leasedAssetMaintenanceDataType.LeasedAssetCode+"')]");
		elementActions.doubleClickButton(gridRowtoDoubleClick);
	}
	
		@Then("Delete Asset Code Created")
	public void delete_Asset_Code_Created() throws InterruptedException {
		Thread.sleep(1000);
		elementActions.clickonElement(leasedAssetMaintenanceObj.leasedassetdeletebutton());
		waithelper.waitForElementVisible(leasedAssetMaintenanceObj.confirmOKButton(), 20000, 100);
		elementActions.clickonElement(leasedAssetMaintenanceObj.confirmOKButton());
		waithelper.waitForElementVisible(leasedAssetMaintenanceObj.oKButton(), 20000, 100);
		elementActions.clickonElement(leasedAssetMaintenanceObj.oKButton());
	}
		

	@And("Close Asset maintenance Screen")
	public void close_Asset_maintenance_Screen() {
		leasedAssetMaintenanceObj.removeTab().click();
		elementActions.clickonElement(iisParamHomePageObj.LeasedAssetLink());
	}

}
	
	
