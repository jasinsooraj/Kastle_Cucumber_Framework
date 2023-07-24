package iisParamsPageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubPurposeCodesMaintenanceObj
{
	WebDriver driver;
	public SubPurposeCodesMaintenanceObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//*[@id=\"trsSubPurpose_Code_M0381MT\"]")
	private WebElement SubPurposeCodetxt;
	public WebElement SubPurposeCodetxt()
	{
		return SubPurposeCodetxt;
	}
	
	@FindBy(xpath = "//*[@id=\"lookuptxt_SubPurpose_reason_M0381MT\"]")
	private WebElement MainPurposeLkp;
	public WebElement MainPurposeLkp()
	{
		return MainPurposeLkp;
	}

	@FindBy(xpath = "//*[@id=\"trsSubpurposeBriefDescEng_M0381MT\"]")
	private WebElement BriefDescriptiontxt;
	public WebElement BriefDescriptiontxt()
	{
		return BriefDescriptiontxt;
	}
	
	@FindBy(id = "trsSubpurposeDescEng_M0381MT")
	private WebElement LongDescriptiontxt;
	public WebElement LongDescriptiontxt()
	{
		return LongDescriptiontxt;
	}
	
	@FindBy(id = "trsSubpurposeBriefDescArab_M0381MT")
	private WebElement ArabicBrieftxt;
	public WebElement ArabicBrieftxt()
	{
		return ArabicBrieftxt;
	}
	
	@FindBy(xpath = "//*[@id=\"trsSubpurposeDescArab_M0381MT\"]")
	private WebElement ArabicLongtxt;
	public WebElement ArabicLongtxt()
	{
		return ArabicLongtxt;
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