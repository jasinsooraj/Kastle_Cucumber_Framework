package iisParamsPageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TargetMiantenanceObj {
	WebDriver driver;

	public TargetMiantenanceObj(WebDriver driver) {
		this.driver  = driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//*[@id='lookuptxt_trs_TargetVO_CLASS_M04MT']")
	private WebElement productclassCode;
	public   WebElement productclassCode() {
		return productclassCode;
	}
	@FindBy(xpath ="//*[@id='lookuptxt_trs_TargetVO_COUNTRY_M04MT']")
	private WebElement CountryCode;
	public  WebElement CountryCode() {
		return CountryCode;
	}

	@FindBy(id ="trs_TargetVO_YEAR_M04MT")
	private WebElement TargetYear;
	public  WebElement TargetYear() {
		return TargetYear;
	}
	////*[@id="td_trsTargetmaintenanceMaintGridTbl_Id_M04MT_1_trs_TargetVO.TARGET_AMOUNT"]

	@FindBy(xpath = "//*[@id='td_trsTargetmaintenanceMaintGridTbl_Id_M04MT_1_trs_TargetVO.TARGET_AMOUNT']")
	private WebElement TargetAmountjanBeforclick;
	public  WebElement TargetAmountjanBeforclick() {
	 return TargetAmountjanBeforclick;
	}
////*[@id="1_trs_TargetVO.TARGET_AMOUNT_trsTargetmaintenanceMaintGridTbl_Id_M04MT"]
	//*[@id="td_trsTargetmaintenanceMaintGridTbl_Id_M04MT_1_trs_TargetVO.TARGET_AMOUNT"]
	@FindBy(xpath = "//*[@id=\"1_trs_TargetVO.TARGET_AMOUNT_trsTargetmaintenanceMaintGridTbl_Id_M04MT\"]")
	private WebElement TargetAmountjan;
	public  WebElement TargetAmountjan() {
	 return TargetAmountjan;
	}

	@FindBy(xpath = "//*[@id='td_trsTargetmaintenanceMaintGridTbl_Id_M04MT_2_trs_TargetVO.TARGET_AMOUNT']")
	private WebElement TargetAmountfeb;
	public WebElement TargetAmountfeb() {
		return TargetAmountfeb;
	}

	@FindBy(id = "td_trsTargetmaintenanceMaintGridTbl_Id_M04MT_3_trs_TargetVO.TARGET_AMOUNT")
	private WebElement TargetAmountmar;
	public WebElement TargetAmountmar() {
		return TargetAmountmar;
	}

	@FindBy(id = "4_trs_TargetVO.TARGET_AMOUNT_trsTargetmaintenanceMaintGridTbl_Id_M04MT")
	private WebElement TargetAmountapr;
	public WebElement TargetAmountapr() {
		return TargetAmountapr;
	}

	@FindBy(id = "td_trsTargetmaintenanceMaintGridTbl_Id_M04MT_5_trs_TargetVO.TARGET_AMOUNT")
	private WebElement TargetAmountmay;
	public WebElement TargetAmountmay() {
		return TargetAmountmay;
	}

	@FindBy(id ="td_trsTargetmaintenanceMaintGridTbl_Id_M04MT_6_trs_TargetVO.TARGET_AMOUNT" )
	private WebElement TargetAmountjun;
	public WebElement TargetAmountjun() {
		return TargetAmountjun;
	}

	@FindBy(id ="td_trsTargetmaintenanceMaintGridTbl_Id_M04MT_7_trs_TargetVO.TARGET_AMOUNT" )
	private WebElement TargetAmountjul;
	public WebElement TargetAmountjul() {
		return TargetAmountjul;
	}

	@FindBy(id ="td_trsTargetmaintenanceMaintGridTbl_Id_M04MT_8_trs_TargetVO.TARGET_AMOUNT" )
	private WebElement TargetAmountaug;
	public WebElement TargetAmountaug() {
		return TargetAmountaug;

	}

	@FindBy(id ="td_trsTargetmaintenanceMaintGridTbl_Id_M04MT_9_trs_TargetVO.TARGET_AMOUNT" )
	private WebElement TargetAmountsep;
	public WebElement TargetAmountsep() {
		return TargetAmountsep;
	}

	@FindBy(id ="td_trsTargetmaintenanceMaintGridTbl_Id_M04MT_10_trs_TargetVO.TARGET_AMOUNT" )
	private WebElement TargetAmountoct;
	public WebElement TargetAmountoct() {
		return TargetAmountoct;
	}
	@FindBy(id ="td_trsTargetmaintenanceMaintGridTbl_Id_M04MT_11_trs_TargetVO.TARGET_AMOUNT" )
	private WebElement TargetAmountnov;
	public WebElement TargetAmountnov() {
		return TargetAmountnov;
	}
	@FindBy(id ="td_trsTargetmaintenanceMaintGridTbl_Id_M04MT_12_trs_TargetVO.TARGET_AMOUNT" )
	private WebElement TargetAmountdec;
	public WebElement TargetAmountdec() {
		return TargetAmountdec;
	}
	@FindBy(id ="trsTargetMaintenanceFormId_M04MT_Save_key" )
	private WebElement TargetmtSavebtn;
	public WebElement TargetmtSavebtn() {
		return TargetmtSavebtn;

	}
	@FindBy(xpath = "//*[@id='_popup_path_sol_confirm_ok']")
	private WebElement confirmoKButton;
	public WebElement confirmoKButton() {
		return confirmoKButton;
	}
	@FindBy(xpath = "//*[@id='_popup_path_sol_confirm']")
	private WebElement cancelButton;
	public WebElement cancelButton() {
		return cancelButton;
	}
	@FindBy(xpath = "//*[@id='_popup_path_sol_ok']")
	private WebElement Okbtn;
	public WebElement Okbtn() {
		return Okbtn;
	}
	@FindBy(id = "infoBarSearchButton_M04MT")
	private WebElement searchlookupbtn;
	public WebElement searchlookupbtn() {
		return searchlookupbtn;
	}
	@FindBy(xpath ="//*['tRSTargetMaintenanceListGridTbl_Id_M04MT_gs_trs_TargetVO.CLASS']")
	private WebElement FilterSerachclasscode;
	public WebElement FilterSerachclasscode() {
		return FilterSerachclasscode;
		
	}
	@FindBy(xpath ="//*[@id='trsTargetMaintenanceFormId_M04MT_Delete_key']" )
	private WebElement TargetmaintdeleteBtn;
	public WebElement TargetmaintdeleteBtn() {
		return TargetmaintdeleteBtn;
	}
	@FindBy(xpath ="(//span[contains(@class,'ui-icon ui-icon-close')])[1]" )
	private WebElement CloseTab;
	public WebElement CloseTab() {
		return CloseTab;
	
	}
}