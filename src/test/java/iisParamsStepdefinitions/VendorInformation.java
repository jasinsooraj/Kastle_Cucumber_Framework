package iisParamsStepdefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import dataProvider.ConfigFileReader;
import helper.AlertHelper;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.VerificationHelper;
import helper.WaitHelper;
import iisParamsPageobjects.HomePageObj;
import iisParamsPageobjects.VendorInformationObj;
import iisParamsTestDataType.VendorInformationTestDataType;
import io.cucumber.java.en.Then;
import login.CompanyAndBranchPage;
import resources.BaseClass;
import resources.ExcelReader;
import resources.JsonDataReaderWriter;
import utls.ElementActions;

public class VendorInformation extends BaseClass{
	WebDriver driver= BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	ConfigFileReader config = new ConfigFileReader();
	DropDownHelper dropDownHelper;
	WaitHelper waithelper = new WaitHelper(driver);
	AlertHelper alerthelper = new AlertHelper(driver);
	IMAL_Login imalLogin = new IMAL_Login(driver);
	ChargesMaintenance chargemaintenance = new ChargesMaintenance();
	JavascriptHelper javascripthelper = new JavascriptHelper();
	VerificationHelper verificationhelper = new VerificationHelper();
	VendorInformationObj VendorInformationObj = new VendorInformationObj(driver);
	VendorInformationTestDataType VendorInformationTestData = new VendorInformationTestDataType();
	JsonDataReaderWriter jsonWriter = new JsonDataReaderWriter();
	JsonDataReaderWriter reader = new JsonDataReaderWriter();
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browserHelper;
	CompanyAndBranchPage comapanyandBranchSelectionObj= new CompanyAndBranchPage(driver);
	HomePageObj iisParamHomePageObj = new HomePageObj(driver);
	ElementActions elementActions =new ElementActions(driver);
	String excelPath = System.getProperty("user.dir") + "\\Test-data\\IISPTestData.xlsx";


	@Then("User Click on Vendor Information Maitenance Link")
	public void user_click_on_vendor_information_maitenance_link() {
		waithelper.waitForElementVisible(iisParamHomePageObj.VendorInfoMaintenanceLink(), 20000, 100);
		elementActions.clickonElement(iisParamHomePageObj.VendorInfoMaintenanceLink());
		waithelper.waitForElementVisible(iisParamHomePageObj.MaintenanceLink(), 20000, 100);
		elementActions.clickonElement(iisParamHomePageObj.MaintenanceLink());
		System.out.println("User Navigated to Vendor Information Maintenace OPT");
	}

	@Then("User Click on Add Option")
	public void user_click_on_add_option() {

		//Get number of rows In table.
		int Row_count = driver.findElements(By.xpath("//div[@id='gbox_vendorInformationMaintGrid_Id_M037MT']")).size();
		System.out.println("Number Of Rows = "+Row_count);

		//Get number of columns In table.
		int Col_count = driver.findElements(By.xpath("//div[@id='gbox_vendorInformationMaintGrid_Id_M037MT']")).size();
		System.out.println("Number Of Columns = "+Col_count);

		waithelper.waitForElementVisible(VendorInformationObj.AddVendorBtn(), 20000, 100); 
		elementActions.clickonElement(VendorInformationObj.AddVendorBtn());
		System.out.println("New row for vendor information Added");

	}

	@Then("User Inputs data")
	public void user_inputs_data() {
		elementActions.clickonElement(VendorInformationObj.NewlyAddedRow());
		ExcelReader objExcelReader=new ExcelReader(excelPath);
		VendorInformationTestData.VendorCifCode=objExcelReader.getCellData("VendorInformation", 0, 2);
		VendorInformationTestData.AccBranch=objExcelReader.getCellData("VendorInformation", 1, 2);
		VendorInformationTestData.AccCurrency=objExcelReader.getCellData("VendorInformation", 2, 2);
		VendorInformationTestData.AccGlCode=objExcelReader.getCellData("VendorInformation", 3, 2);
		VendorInformationTestData.AccCifCode=objExcelReader.getCellData("VendorInformation", 4, 2);
		VendorInformationTestData.AccSl=objExcelReader.getCellData("VendorInformation", 5, 2);

		waithelper.waitForElementVisible(VendorInformationObj.GridDataCifClick(), 2000, 100);
		elementActions.clickonElement(VendorInformationObj.GridDataCifClick());
		waithelper.waitForElementVisible(VendorInformationObj.CifLookUp(), 2000, 100);
		//input CIF No and TAB
		elementActions.typeValue(VendorInformationObj.CifLookUp(), VendorInformationTestData.VendorCifCode);
		elementActions.typeTAB(VendorInformationObj.CifLookUp());
		//elementActions.typeTAB(VendorInformationObj.CifSearchButn());
		//input Branch
		waithelper.waitForElementVisible(VendorInformationObj.GridDataAcBranch(), 2000, 100);
		elementActions.clickonElement(VendorInformationObj.GridDataAcBranch());
		elementActions.typeValue(VendorInformationObj.GridDataAcBranch(), VendorInformationTestData.AccBranch);
		elementActions.typeTAB(VendorInformationObj.GridDataAcBranch());
		//input currency
		elementActions.clickonElement(VendorInformationObj.GridDataAcCurrency());
		elementActions.typeValue(VendorInformationObj.GridDataAcCurrency(), VendorInformationTestData.AccCurrency);
		elementActions.typeTAB(VendorInformationObj.GridDataAcCurrency());
		//input GL
		elementActions.clickonElement(VendorInformationObj.GridDataAccGl());
		elementActions.typeValue(VendorInformationObj.GridDataAccGl(), VendorInformationTestData.AccGlCode);
		elementActions.typeTAB(VendorInformationObj.GridDataAccGl());
		//input CIFSUB
		elementActions.clickonElement(VendorInformationObj.GridDataAccCif());
		elementActions.typeValue(VendorInformationObj.GridDataAccCif(), VendorInformationTestData.AccCifCode);
		elementActions.typeTAB(VendorInformationObj.GridDataAccCif());
		waithelper.waitForElementVisible(VendorInformationObj.AlertMemoClose(), 2000, 100);
		elementActions.clickonElement(VendorInformationObj.AlertMemoClose());
		//elementActions.typeValue(VendorInformationObj.GridDataAccCif(), VendorInformationTestData.AccCifCode);
		elementActions.typeTAB(VendorInformationObj.GridDataAccCif());


		elementActions.clickonElement(VendorInformationObj.GridDataAccSlNo());
		elementActions.typeValue(VendorInformationObj.GridDataAccSlNo(), VendorInformationTestData.AccSl);
		elementActions.typeTAB(VendorInformationObj.GridDataAccSlNo());
		waithelper.waitForElementVisible(VendorInformationObj.AlertMemoClose(), 2000, 100);
		elementActions.clickonElement(VendorInformationObj.AlertMemoClose());
		//elementActions.typeValue(VendorInformationObj.GridDataAccSlNo(), VendorInformationTestData.AccSl);
		//Check Box Checking 
		waithelper.waitForElementVisible(VendorInformationObj.StopDisbCheckbox(), 2000, 100);
		elementActions.clickonElement(VendorInformationObj.StopDisbCheckbox());
		elementActions.clickonElement(VendorInformationObj.Detailslinktext());
		waithelper.waitForElementVisible(VendorInformationObj.AlertMemoClose(), 2000, 100);
		elementActions.clickonElement(VendorInformationObj.AlertMemoClose());
		System.out.println("User Input vendor information added ");

	}

	@Then("User Save Vendor Information")
	public void user_save_vendor_information() {

		waithelper.waitForElementVisible(VendorInformationObj.VendorInfoSaveBtn(), 2000, 100);
		elementActions.clickonElement(VendorInformationObj.VendorInfoSaveBtn());
		waithelper.waitForElementVisible(VendorInformationObj.VendorSaveConfBtn(), 20000, 100);
		elementActions.clickonElement(VendorInformationObj.VendorSaveConfBtn());
		waithelper.waitForElementVisible(VendorInformationObj.SaveSuccConfBtn(), 20000, 100);
		elementActions.clickonElement(VendorInformationObj.SaveSuccConfBtn());
		System.out.println("User Save Vendor Information");
	}

	//	@Then("User retrieve saved Vendor Information Record")
	//	public void user_retrieve_saved_vendor_information_record() {
	//		System.out.println("Total Number of Data ="+VendorInformationObj.RowCounttabl().getSize());
	//		throw new io.cucumber.java.PendingException();
	//	}

	//	@Then("User Delete Vendor Information Record")
	//	public void user_delete_vendor_information_record() {
	//   System.out.println("Delete Operation Skipped");
	//		throw new io.cucumber.java.PendingException();
	//	}

	@Then("User Close Vendor Information Tab")
	public void user_close_vendor_information_tab() {
		waithelper.waitForElementVisible(VendorInformationObj.VendorInfoCloseTab(), 20000, 100);
		elementActions.clickonElement(VendorInformationObj.VendorInfoCloseTab());
		System.out.println("Vendor Information Maintenance Tab Closed");
	}
}
