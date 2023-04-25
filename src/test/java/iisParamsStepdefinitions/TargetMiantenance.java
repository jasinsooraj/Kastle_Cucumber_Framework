package iisParamsStepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import helper.ClicksAndActionsHelper;
import helper.WaitHelper;
import iisParamsPageobjects.HomePageObj;
import iisParamsPageobjects.TargetMiantenanceObj;
import iisParamsTestDataType.TargetMiantenanceTestDataType;
import io.cucumber.java.en.*;
import resources.BaseClass;
import resources.ExcelReader;
import utls.ElementActions;


public class TargetMiantenance extends BaseClass {
	WebDriver driver = BaseClass.driver;
	WaitHelper waithelper=new WaitHelper(driver);
	HomePageObj iisParamHomePageObj=new HomePageObj(driver) ;
	ElementActions elementActions =new ElementActions(driver);
	TargetMiantenanceObj targetmaintenanceobj = new TargetMiantenanceObj(driver);
	TargetMiantenanceTestDataType TargetMiantenanceTestData = new TargetMiantenanceTestDataType();
	String excelPath = System.getProperty("user.dir") + "\\Test-data\\IISPTestData.xlsx";
	ClicksAndActionsHelper clicknmove  = new ClicksAndActionsHelper(driver);


	@Then("Navigate to Target Maintenance Screen")
	public void navigate_to_target_maintenance_screen()  {
		// Open Target Maintenance Screen Screen 
		waithelper.waitForElementVisible(iisParamHomePageObj.TargetMaintenanceLink(), 2000, 100);
		elementActions.clickonElement(iisParamHomePageObj.TargetMaintenanceLink());
		waithelper.waitForElementVisible(iisParamHomePageObj.MaintenanceLink(), 2000, 100);
		elementActions.clickonElement(iisParamHomePageObj.MaintenanceLink());		
	}


	@Given("User Select Input Product class,country,year,Target Amount")
	public void user_select_input_product_class_country_year_target_amount() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		ExcelReader objExcelReader=new ExcelReader(excelPath);
		TargetMiantenanceTestData.productclassCode=objExcelReader.getCellData("TargetMaintenance", 0, 2);
		TargetMiantenanceTestData.countryCode=objExcelReader.getCellData("TargetMaintenance", 1, 2);
		TargetMiantenanceTestData.TargetYear=objExcelReader.getCellData("TargetMaintenance", 2, 2);
		TargetMiantenanceTestData.TargetAmountjan=objExcelReader.getCellData("TargetMaintenance", 3, 2);
		TargetMiantenanceTestData.TargetAmountfeb=objExcelReader.getCellData("TargetMaintenance", 4, 2);
		waithelper.waitForElementVisible(targetmaintenanceobj.productclassCode(),2000,100);
		elementActions.typeValue(targetmaintenanceobj.productclassCode(),TargetMiantenanceTestData.productclassCode);
		elementActions.typeTAB(targetmaintenanceobj.productclassCode());elementActions.typeTAB(targetmaintenanceobj.productclassCode());
		elementActions.typeValue(targetmaintenanceobj.CountryCode(),TargetMiantenanceTestData.countryCode);
		elementActions.typeTAB(targetmaintenanceobj.CountryCode());
		elementActions.typeValue(targetmaintenanceobj.TargetYear(),TargetMiantenanceTestData.TargetYear);
		elementActions.typeTAB(targetmaintenanceobj.TargetYear());//elementActions.typeTAB(targetmaintenanceobj.CountryCode());
		elementActions.clickonElement(targetmaintenanceobj.TargetAmountjanBeforclick());
		elementActions.typeValue(targetmaintenanceobj.TargetAmountjan(), TargetMiantenanceTestData.TargetAmountjan);
		//elementActions.typeValue(targetmaintenanceobj.TargetAmountfeb(),TargetMiantenanceTestData.TargetAmountfeb);
	}

	@Then("Save Target Maintenace")
	public void save_target_maintenace() {
		waithelper.waitForElementVisible(targetmaintenanceobj.TargetmtSavebtn(), 40000, 100);
		elementActions.clickonElement(targetmaintenanceobj.TargetmtSavebtn());
		waithelper.waitForElementVisible(targetmaintenanceobj.confirmoKButton(), 40000, 100);
		elementActions.clickonElement(targetmaintenanceobj.confirmoKButton());
		waithelper.waitForElementVisible(targetmaintenanceobj.Okbtn(), 40000, 100);
		elementActions.clickonElement(targetmaintenanceobj.Okbtn());
	}

	@Then("Retrieve Saved Target Maintenace")
	public void retrieve_saved_target_maintenace() {
		elementActions.clickonElement(targetmaintenanceobj.searchlookupbtn());
		waithelper.waitForElementVisible(targetmaintenanceobj.FilterSerachclasscode(), 2000, 100);
		elementActions.typeValue(targetmaintenanceobj.FilterSerachclasscode(),TargetMiantenanceTestData.productclassCode);
		elementActions.typeEnter(targetmaintenanceobj.FilterSerachclasscode());
		By gridRowtoDoubleClick=By.xpath("//td[@role='gridcell' and contains(text(),'"+TargetMiantenanceTestData.productclassCode+"')]");
		elementActions.doubleClickButton(gridRowtoDoubleClick);	
	}

	@Then("Delete Target Maintenace Created")
	public void delete_target_maintenace_created() throws InterruptedException {
		Thread.sleep(1000);
		elementActions.clickonElement(targetmaintenanceobj.TargetmaintdeleteBtn());
		waithelper.waitForElementVisible(targetmaintenanceobj.confirmoKButton(), 20000, 100);
		elementActions.clickonElement(targetmaintenanceobj.confirmoKButton());
		waithelper.waitForElementVisible(targetmaintenanceobj.Okbtn(), 20000, 100);
		elementActions.clickonElement(targetmaintenanceobj.Okbtn());
	}

	@And("Close Target Maintenace Screen")
	public void close_Charge_maintenance_Screen() {
		elementActions.clickonElement(targetmaintenanceobj.CloseTab());
		elementActions.clickonElement(iisParamHomePageObj.TargetMaintenanceLink());
	}

}
