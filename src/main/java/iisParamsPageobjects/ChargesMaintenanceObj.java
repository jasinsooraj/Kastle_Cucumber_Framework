package iisParamsPageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChargesMaintenanceObj {
	WebDriver driver;

	
	public ChargesMaintenanceObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	
	}
	
	@FindBy(xpath = "//*[@id='trsChargesCode_M08MT']")
	private WebElement chargesCodeText;
	public  WebElement chargesCodeText() {
		return chargesCodeText;
	}
	
	@FindBy(id ="trsCHARGESVO_brief_name_eng_M08MT")
	private WebElement briefDescriptionText;
	public  WebElement briefDescriptionText() {
		return briefDescriptionText;
	}
	
	@FindBy(id ="trsCHARGESVO_long_name_eng_M08MT")
	private WebElement longDescriptionText;
	public  WebElement longDescriptionText() {
		return longDescriptionText;
	}
	
	@FindBy(id ="trsChargesMaintFormId_M08MT_Save_key")
	private WebElement saveBtn;
	public  WebElement saveBtn() {
		return saveBtn;
	}
	
	@FindBy(linkText = "Maintenance")
	private WebElement chargeMaintenancelink;
	public WebElement chargeMaintenancelink() {
		return chargeMaintenancelink;
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
	
	@FindBy(xpath = "//*[@id=\"infoBarSearchButton_M08MT\"]")
	private WebElement searchLookupBtn;
	public WebElement searchLookupBtn() {
		return searchLookupBtn;
	}
	
	@FindBy(xpath ="//*[@id=\"trsChargesListGridTbl_Id_M08MT_gs_trsCHARGESVO.CODE\"]" )
	private WebElement filterChargeCodeText;
	public WebElement filterChargeCodeText() {
		return filterChargeCodeText;
	}
	
	@FindBy(xpath ="//*[@id='trsChargesMaintFormId_M08MT_Delete_key']" )
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
