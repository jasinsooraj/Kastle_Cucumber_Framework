package iisParamsPageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReasonCodesMaintenanceObj
{
	WebDriver driver;
	public ReasonCodesMaintenanceObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//*[@id='reasoncodeCode_M038MT']")
	private WebElement ReasonCodetxt;
	public WebElement ReasonCodetxt()
	{
		return ReasonCodetxt;
	}

	@FindBy(xpath = "//*[@id='reasonCodeBriefNameEnglish_M038MT']")
	private WebElement BriefDescriptiontxt;
	public WebElement BriefDescriptiontxt()
	{
		return BriefDescriptiontxt;
	}
	
	@FindBy(id = "reasonCodeLongNameEnglish_M038MT")
	private WebElement LongDescriptiontxt;
	public WebElement LongDescriptiontxt()
	{
		return LongDescriptiontxt;
	}
	
	@FindBy(id = "reasonCodeBriefDescArab_M038MT")
	private WebElement ArabicBrieftxt;
	public WebElement ArabicBrieftxt()
	{
		return ArabicBrieftxt;
	}
	
	@FindBy(xpath = "//*[@id='reasonCodeLongDescArab_M038MT']")
	private WebElement ArabicLongtxt;
	public WebElement ArabicLongtxt()
	{
		return ArabicLongtxt;
	}
	
	@FindBy(xpath = "//*[@id='EARLY_SETTLEMENT_CLOSURE_YN_M038MT']")
	private WebElement Early_Settlement_Closure_KeyChk;
	public WebElement Early_Settlement_Closure_KeyChk()
	
	{
		return Early_Settlement_Closure_KeyChk;
		
	}
	
	@FindBy(xpath = "//*[@id='type_M038MT']")
	private WebElement TypeDrdn;
	public WebElement TypeDrdn()
	{
		return TypeDrdn;
	}
	
	@FindBy(xpath = "//*[@id='reasonCodeMaintFormId_M038MT_Save_key']")
	private WebElement SaveBtn;
	public WebElement SaveBtn()
	{
		return SaveBtn;
		
	}
	
	@FindBy(xpath = "//*[@id=\"addNewGridRec_M038MT\"]")
	private WebElement NewBtn;
	public WebElement NewBtn()
	{
		return NewBtn;
	}
	
	@FindBy(xpath = "//*[@id=\"infoBarSearchButton_M038MT\"]")
	private WebElement SearchBtn;
	public WebElement SearchBtn()
	{
		return SearchBtn;
	}
	@FindBy(linkText = "Maintenance")
	private WebElement ReasonCodeMaintenancelink;
	public WebElement ReasonCodeMaintenancelink() {
		return ReasonCodeMaintenancelink;
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
	
	@FindBy(xpath ="//*[@id=\"reasonCodeListGridTbl_Id_M038MT_gs_trsreasonVO.REASON_CODE\"]" )
	private WebElement filterReasonCodetxt;
	public WebElement filterReasonCodetxt() {
		return filterReasonCodetxt;
	}
	
	@FindBy(xpath ="//*[@id=\"reasonCodeMaintFormId_M038MT_Delete_key\"]" )
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