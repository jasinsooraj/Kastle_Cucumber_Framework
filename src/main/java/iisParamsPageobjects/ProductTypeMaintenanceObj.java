package iisParamsPageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductTypeMaintenanceObj {
	WebDriver driver;
	
	public ProductTypeMaintenanceObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//*[@id='type_code_M030MT']")
	private WebElement productTypeCode;
	public WebElement productTypeCode()
	{
		return productTypeCode;
	}
	
	@FindBy(xpath = "//*[@id=\"brief_desc_eng_M030MT\"]")
	private WebElement productTypebriefDesc;
	public  WebElement productTypebriefDesc()
	{
		return productTypebriefDesc;
	}

	@FindBy(xpath = "//*[@id=\"long_desc_eng_M030MT\"]")
	private WebElement productTypeLongDesc;
	public  WebElement productTypeLongDesc()
	{
		return productTypeLongDesc;
	}
	
	@FindBy(linkText = "Maintenance")
	private WebElement productTypeMaintenancelink;
	public WebElement productTypeMaintenancelink() {
		return productTypeMaintenancelink;
	}
	
	@FindBy(xpath = "//button[@type='button' and @value='Submit' and contains(@id,'save')]")
	private WebElement saveBtn;
	public  WebElement saveBtn() {
		return saveBtn;
	}
	@FindBy(xpath = "//*[@id=\"_popup_path_sol_confirm_ok\"]")
	private WebElement confirmOKButton;
	public WebElement confirmOKButton() {
		return confirmOKButton;
	}
	
	@FindBy(xpath = "//*[@id='_popup_path_sol_ok']")
	private WebElement oKButton;
	public WebElement oKButton() {
		return oKButton;
	}
	@FindBy(xpath = "//*[contains(@id,'infoBarSearchButton')]")
	private WebElement searchLookupBtn;
	public WebElement searchLookupBtn() {
		return searchLookupBtn;
	}
	
	@FindBy(xpath = "//*[@id='trsProductTypeListGridTbl_Id_M030MT_gs_trsProductTypeVO.TYPE_CODE']")
	private WebElement filterProductTypetxt;
	public WebElement filterProductTypetxt() {
		return filterProductTypetxt;
	}
	
	@FindBy(xpath ="//*[@id='trsProductTypeMaint_delete_M030MT']" )
	private WebElement deleteBtn;
	public WebElement deleteBtn() {
		return deleteBtn;
	}
	
	@FindBy(xpath ="//span[@class='ui-icon ui-icon-close ui-icon-close-tabs-custom' and contains(text(),'Remove Tab')]" )
	private WebElement removeTab;
	public WebElement removeTab() {
		return removeTab;
	}
}
