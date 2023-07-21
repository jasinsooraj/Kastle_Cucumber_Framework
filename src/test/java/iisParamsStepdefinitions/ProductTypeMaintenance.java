package iisParamsStepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.WaitHelper;
import iisParamsPageobjects.HomePageObj;
import iisParamsPageobjects.ProductTypeMaintenanceObj;
import iisParamsTestDataType.ProductTypeMaintenanceTestDataType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import resources.BaseClass;
import resources.ExcelReader;
import utls.ElementActions;

public class ProductTypeMaintenance extends BaseClass {
	WebDriver driver = BaseClass.driver;
	WaitHelper waithelper=new WaitHelper(driver);
	HomePageObj iisParamHomePageObj=new HomePageObj(driver) ;
	ElementActions elementActions =new ElementActions(driver);
	ProductTypeMaintenanceObj productType=new ProductTypeMaintenanceObj(driver);
	ProductTypeMaintenanceTestDataType productTypeDataType=new ProductTypeMaintenanceTestDataType();
	String excelPath = System.getProperty("user.dir") + "\\Test-data\\IISPTestData.xlsx";
	IISParamsCommonOperations common=new IISParamsCommonOperations();
	
	
	//@Then("Open product type maintenance")
	@Given("Open product type maintenance")
	public void Open_product_type_maintenance()
	{
		waithelper.waitForElementVisible(iisParamHomePageObj.productTypeLink(), 20000, 100);
		elementActions.clickonElement(iisParamHomePageObj.productTypeLink());
		waithelper.waitForElementVisible(iisParamHomePageObj.MaintenanceLink(), 20000, 100);
		elementActions.clickonElement(iisParamHomePageObj.MaintenanceLink());
	}
	@And("Input product Type Values and save")
	public void Input_product_Type_Values_and_save()
	{
		try {
		ExcelReader objExcelReader=new ExcelReader(excelPath);
		productTypeDataType.productTypeCode=objExcelReader.getCellData("ProductType", 0, 2);
		productTypeDataType.productTypebriefDesc=objExcelReader.getCellData("ProductType", 1, 2);
		productTypeDataType.productTypeLongDesc=objExcelReader.getCellData("ProductType", 2, 2);
		waithelper.waitForElementVisible(productType.productTypeCode(), 20000, 100);
		elementActions.typeValue(productType.productTypeCode(), productTypeDataType.productTypeCode);
		elementActions.typeValue(productType.productTypebriefDesc(), productTypeDataType.productTypebriefDesc);
		elementActions.typeValue(productType.productTypeLongDesc(), productTypeDataType.productTypeLongDesc);
		elementActions.clickonElement(productType.saveBtn());
		waithelper.waitForElementVisible(productType.confirmOKButton(), 20000, 100);
		elementActions.clickonElement(productType.confirmOKButton());
		waithelper.waitForElementVisible(productType.oKButton(), 20000, 100);
		elementActions.clickonElement(productType.oKButton());
		
		}catch(Exception e) {System.out.println(e.getMessage());}
	}
	
	@And("Retrieve Saved Product Type details")
	public void Retrieve_Saved_Charge_details()  throws InterruptedException{
		elementActions.clickonElement(productType.searchLookupBtn());
		waithelper.waitForElementVisible(productType.filterProductTypetxt(), 20000, 100);
		elementActions.typeValue(productType.filterProductTypetxt(),productTypeDataType.productTypeCode);
		elementActions.typeEnter(productType.filterProductTypetxt());
		Thread.sleep(1000);
		By gridRowtoDoubleClick=By.xpath("//td[@role='gridcell' and contains(text(),'"+productTypeDataType.productTypeCode+"')]");
		//waithelper.waitForElementVisible(gridRowtoDoubleClick, 2000, 100);
		elementActions.doubleClickButton(gridRowtoDoubleClick);
	}
	@Then("Delete Product Type Created")
	public void delete_Charge_Code_Created() throws InterruptedException {
	//	waithelper.waitForTextPresentElement(chargeMaintenanceObj.briefDescriptionText(), chargeMaintenanceDataType.BriefDescription, 20000, 100);
		Thread.sleep(500);
		elementActions.clickonElement(productType.deleteBtn());
		waithelper.waitForElementVisible(productType.confirmOKButton(), 20000, 100);
		elementActions.clickonElement(productType.confirmOKButton());
		waithelper.waitForElementVisible(productType.oKButton(), 20000, 100);
		elementActions.clickonElement(productType.oKButton());
	}
	
	@And("Close Product Type maintenance Screen")
	public void close_Charge_maintenance_Screen() {
		productType.removeTab().click();
		elementActions.clickonElement(iisParamHomePageObj.productTypeLink());
	}

}
