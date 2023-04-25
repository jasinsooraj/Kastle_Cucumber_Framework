package iisParamsPageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeasedAssetMaintenanceObj
{
	WebDriver driver;
	public LeasedAssetMaintenanceObj (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//*[@id=\'leasedAssetCode_M07MT']")
	private WebElement leaseAssetcodetext;
	public WebElement leaseAssetcodetext()
	{
		return leaseAssetcodetext;	
	}
	
	// MAINTENANCE TAB//
	
	@FindBy(xpath = "//*[@id='leasedAssetMainInfo1_M07MT']")
	private WebElement leasedAssetmaintenancetab;
	public WebElement leasedAssetmaintenancetab()
	{
		return leasedAssetmaintenancetab;
	}
	
	@FindBy(xpath = "//*[@id='leasedAssetBriefDescription_M07MT']")
	private WebElement leasedassetbriefdesc;
	public WebElement leasedassetbriefdesc()
	{
		return leasedassetbriefdesc;
	}
	
	@FindBy(xpath = "//*[@id='leasedAssetLongNameEng_M07MT']")
	private WebElement leasedassetlongdesc;
	public WebElement leasedassetlongdesc()
	{
		return leasedassetlongdesc;
	}
	
	@FindBy(xpath = "//*[@id='leasedAssetBriefNameArab_M07MT']")
	private WebElement leasedassetbriefarabic;
	public WebElement leasedassetbriefarabic()
	{ 
	    return leasedassetbriefarabic;
	}
	
	@FindBy(xpath = "//*[@id='leasedAssetLongNameArab_M07MT']")
	private WebElement leasedassetlongarabic;
	public WebElement leasedassetlongarabic()
	{
		return leasedassetlongarabic;
	}
	
	//ADDITIONAL DETAILS TAB//
	
	@FindBy(xpath = "//*[@id=\'leasedAssetMainInfo2_M07MT\']/a")
	private WebElement leasedassetadditionalDetailstab;
	public WebElement leasedassetadditionalDetailstab()
	{
		return leasedassetadditionalDetailstab;
		
	}
	
	@FindBy(xpath = "//*[@id='lookuptxt_leasedAssetPurchaseCY_M07MT']")
	private WebElement leasedpurchasecurrency;
	public WebElement leasedpurchasecurrency()
	{
		return leasedpurchasecurrency;
	}
	
	@FindBy(xpath = "//*[@id=\'spanLookup_leasedAssetPurchaseCY_M07MT\']")
	private WebElement leasedpurchasecurrencylookup;
	public WebElement leasedpurchasecurrencylookup()
	{
		return leasedpurchasecurrencylookup;
	}
	
	@FindBy(xpath = "//*[@id=\'leasedAssetPurchaseCYRate_M07MT\']")
	private WebElement leasedassetpurchasecurrencyrate;
	public WebElement leasedassetpurchasecurrencyrate()
	{
		return leasedassetpurchasecurrencyrate;
	}
	
	@FindBy(id = "leasedAssetPurchaseValue_M07MT")
	private WebElement leasedassetpurchasevalue;
	public WebElement leasedassetpurchasevalue()
	{
		return leasedassetpurchasevalue;
	}
	
	@FindBy(xpath = "//*[@id=\'leasedAssetCYRateMultiplyDivide_M07MT\']")
	private WebElement leasedassetCYratemutlplydivide;
	public WebElement leasedassetCYratemutlplydivide()
	{
		return leasedassetCYratemutlplydivide;
	}
	
	@FindBy(id = "lookuptxt_leasedAssetSalesCY_M07MT")
	private WebElement leasedassetsalescy;
	public WebElement leasedassetsalescy()
	{
		return leasedassetsalescy;
	}
	
	@FindBy(xpath = "//*[@id=\'spanLookup_leasedAssetSalesCY_M07MT\']")
	private WebElement leasedassetsalescylookup;
	public WebElement leasedassetsalescylookup()
	{
		return leasedassetsalescylookup;
	}
	
	@FindBy(id = "leasedAssetSalesCYRate_M07MT")
	private WebElement leasedassetsalescyrate;
	public WebElement leasedassetsalescyrate()
	{
		return leasedassetsalescyrate;
	}
	
	@FindBy(id = "leasedAssetSaleValue_M07MT")
	private WebElement leasedassetsalesvalue;
	public WebElement leasedassetsalesvalue()
	{
		return leasedassetsalesvalue;
	}
	
	@FindBy(id = "leasedAssetCYRateSaleMultiplyDivide_M07MT")
	private WebElement leasedassetsalescyratemultiplyDiv;
	public WebElement leasedassetsalescyratemultiplyDiv()
	{
		return leasedassetsalescyratemultiplyDiv;
	}
	
	@FindBy(xpath = "//*[@id=\"leasedAssetMaint_save_M07MT\"]")
	private WebElement leasedassetmaintenancesavebutton;
	public WebElement leasedassetmaintenancesavebutton()
	{
		return leasedassetmaintenancesavebutton;
	}
	
	@FindBy(xpath = "//*[@id=\"_popup_path_sol_confirm_ok\"]")
	private WebElement confirmOKButton;
	public WebElement confirmOKButton() 
	{
		return confirmOKButton;
	}
	
	@FindBy(xpath = "//*[@id='_popup_path_sol_ok']")
	private WebElement oKButton;
	public WebElement oKButton() 
	{
		return oKButton;
	}
	
	
	@FindBy(xpath = "//*[@id=\"leasedAssetMaint_del_M07MT\"]")
	private WebElement leasedassetdeletebutton;
	public WebElement leasedassetdeletebutton()
	{
		return leasedassetdeletebutton;
	}
	
	@FindBy(xpath = "//*[@id=\"addNewGridRec_M07MT\"]")
	private WebElement leasedassetnewbutton;
	public WebElement leasedassetnewbutton()
	{ 
		return leasedassetnewbutton;
	}
	
	@FindBy(xpath = "//*[@id=\"infoBarSearchButton_M07MT\"]")
	private WebElement leasedassetsearchbutton;
	public WebElement leasedassetsearchbutton()
	{
		return leasedassetsearchbutton;
	}
	
	@FindBy(xpath = "//*[@id=\"leasedAssetListGridTbl_Id_M07MT_gs_trsassetVO.CODE\"]" )
	private WebElement filterassetcode;
	public WebElement filterassetcode() 
	{
		return filterassetcode;
	}
	
	@FindBy(xpath ="//span[@class='ui-icon ui-icon-close ui-icon-close-tabs-custom' and contains(text(),'Remove Tab')]" )
	private WebElement removeTab;
	public WebElement removeTab()
	{
		return removeTab;
	}
	
	
}

