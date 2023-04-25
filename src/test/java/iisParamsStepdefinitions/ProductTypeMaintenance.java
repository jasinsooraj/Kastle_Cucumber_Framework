package iisParamsStepdefinitions;

import org.openqa.selenium.WebDriver;

import helper.WaitHelper;
import iisParamsPageobjects.HomePageObj;
import iisParamsPageobjects.ProductTypeMaintenanceObj;
import iisParamsTestDataType.ProductTypeMaintenanceTestDataType;
import io.cucumber.java.en.And;
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
	
	
	@Then("Open product type maintenance")
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
		ExcelReader objExcelReader=new ExcelReader(excelPath);
		productTypeDataType.productTypeCode=objExcelReader.getCellData("ProductType", 0, 2);
		productTypeDataType.productTypebriefDesc=objExcelReader.getCellData("ProductType", 1, 2);
		productTypeDataType.productTypeLongDesc=objExcelReader.getCellData("ProductType", 2, 2);
		waithelper.waitForElementVisible(productType.productTypeCode(), 20000, 100);
		elementActions.typeValue(productType.productTypeCode(), productTypeDataType.productTypeCode);
		
		
	}

}
