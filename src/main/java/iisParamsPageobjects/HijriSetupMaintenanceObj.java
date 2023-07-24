package iisParamsPageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HijriSetupMaintenanceObj
{
	WebDriver driver;
	public HijriSetupMaintenanceObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//*[@id=\"hijriYear_M039MT\"]")
	private WebElement HijriSetupYeartxt;
	public WebElement HijriSetupYeartxt()
	{
		return HijriSetupYeartxt;
	}
	@FindBy(id="td_hijriSetupGrid_Id_M039MT_1_trshijri_calenderVO.NO_OF_DAYS")
	private WebElement HijriSetupHijriMonthtxt;
	public WebElement HijriSetupHijriMonthtxt()
	{
		return HijriSetupHijriMonthtxt;
	}
	
	@FindBy(xpath = "//*[@id=\"trsSubPurposeCodeMaintFormId_M0381MT_Save_key\"]")
	private WebElement SaveBtn;
	public WebElement SaveBtn()
	{
		return SaveBtn;
		
	}
	
	@FindBy(xpath = "//*[@id=\"addNewGridRec_M0381MT\"]")
	private WebElement NewBtn;
	public WebElement NewBtn()
	{
		return NewBtn;
	}
	
	@FindBy(id = "infoBarSearchButton_M0381MT")

	private WebElement SearchBtn;
	public WebElement SearchBtn()
	{
		return SearchBtn;
	}
	
	@FindBy(linkText = "Maintenance")
	private WebElement SubPurposeCodeMaintenancelink;
	public WebElement SubPurposeCodeMaintenancelink() {
		return SubPurposeCodeMaintenancelink;
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
	
	@FindBy(xpath ="//*[@id=\"trsSubPurposeCodeListGridTbl_Id_M0381MT_gs_trs_SubPurposeVO.SUB_PURPOSE_CODE\"]" )
	private WebElement filterSubPurposeCodetxt;
	public WebElement filterSubPurposeCodetxt() {
		return filterSubPurposeCodetxt;
	}
	
	@FindBy(xpath ="//*[@id=\"trsSubPurposeCodeMaintFormId_M0381MT_Delete_key\"]" )
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