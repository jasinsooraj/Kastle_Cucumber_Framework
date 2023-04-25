package iisParamsPageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YieldRosterObj {

	WebDriver driver;
	public YieldRosterObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);

	}
	@FindBy(xpath="//td[normalize-space()='Yield']")
	private WebElement YieldMainOPT;
	public  WebElement YieldMainOPT() {
		return YieldMainOPT;
	}
	@FindBy(xpath = "//td[normalize-space()='Yield Roster']")
	private WebElement YieldRosterSubOpt;
	public  WebElement YieldRosterSubOpt() {
		return YieldRosterSubOpt;
	}

	@FindBy(xpath = "//span[normalize-space()='Maintenance']")
	private WebElement YieldRosterMaintenace;
	public  WebElement YieldRosterMaintenace() {
		return YieldRosterMaintenace;
	}

	@FindBy(xpath = "//a[@id='addNewGridRec_M025MT']")
	private WebElement AddNewbtn;
	public  WebElement AddNewbtn() {
		return AddNewbtn;
	}
	@FindBy(xpath = "//input[@id='trsYieldRoster_Code_M025MT']")
	private WebElement YeildRosterCode;
	public  WebElement YeildRosterCode() {
		return YeildRosterCode;
	}

	@FindBy(xpath = "//span[normalize-space()='Main Details']")
	private WebElement MainDetailsTab;
	public  WebElement MainDetailsTab() {
		return MainDetailsTab;
	}
	@FindBy(xpath = "//input[@id='trsYieldRosterBriefDescEng_M025MT']")
	private WebElement RosterBriefDesc;
	public  WebElement RosterBriefDesc() {
		return RosterBriefDesc;
	}
	@FindBy(xpath = "//input[@id='trsYieldRosterDescEng_M025MT']")
	private WebElement RosterLongDesc;
	public  WebElement RosterLongDesc() {
		return RosterLongDesc;
	}
	@FindBy(xpath = "//select[@id='yield_outside_M025MT']")
	private WebElement DealOutSideDropDown;
	public  WebElement DealOutSideDropDown() {
		return DealOutSideDropDown;
	}
	@FindBy(xpath = "//select[@id='default_yield_M025MT']")
	private WebElement defaultYieldDropDown;
	public  WebElement defaultYieldDropDown() {
		return defaultYieldDropDown;
	}
	@FindBy(xpath = "//label[@id='trsYieldRosterMaintFormId_M025MT_Save_key']")
	private WebElement YieldRosterSaveBtn;
	public  WebElement YieldRosterSaveBtn() {
		return YieldRosterSaveBtn;
	}
	@FindBy(xpath = "//span[normalize-space()='Status Details']")
	private WebElement StatusDetailsBtn;
	public  WebElement StatusDetailsBtn() {
		return  StatusDetailsBtn;
	}
	@FindBy(xpath = "//span[normalize-space()='Roster_Details_key']")
	private WebElement RosterDetailsTab;
	public  WebElement RosterDetailsTab() {
		return  RosterDetailsTab;
	}


	@FindBy(xpath = "//*[@id='new_1678253828980']//td[@id='td_RosterDetailsGrid_Id_M025MT_1_trsyieldrosterdetVO.FROM_AMT']")
	private WebElement R1FromAmount;
	public  WebElement R1FromAmount() {
		return  R1FromAmount;
	}

	@FindBy(xpath = "//*[@added='1']//td[@id='td_RosterDetailsGrid_Id_M025MT_1_trsyieldrosterdetVO.TO_AMT']")
	private WebElement R1ToAmount;
	public  WebElement R1ToAmount() {
		return  R1ToAmount;

	}

	@FindBy(xpath = "//*[@added='1']//td[@id='td_RosterDetailsGrid_Id_M025MT_1_trsyieldrosterdetVO.YIELD']")
	private WebElement R1NonDomYield;
	public  WebElement R1NonDomYield() {
		return  R1NonDomYield;
	}

	@FindBy(xpath = "//*[@added='1']//td[@id='td_RosterDetailsGrid_Id_M025MT_1_trsyieldrosterdetVO.DOMICILE_YIELD']")
	private WebElement R1DomYield;
	public  WebElement R1DomYield() {
		return  R1DomYield;
	}

	@FindBy(xpath = "//*[@added='1']//td[@id='td_RosterDetailsGrid_Id_M025MT_1_trsyieldrosterdetVO.STAFF_YIELD']")
	private WebElement R1StaffYield;
	public  WebElement R1StaffYield() {
		return  R1StaffYield;
	}

	@FindBy(xpath = "//*[@added='1']//td[@id='td_RosterDetailsGrid_Id_M025MT_1_trsyieldrosterdetVO.NON_DOMICILE_YIELD_MIN']")
	private WebElement R1NonDomYiedlMin;
	public  WebElement R1NonDomYiedlMin() {
		return R1NonDomYiedlMin;
	}

	@FindBy(xpath = "//*[@added='1'] //td[@id='td_RosterDetailsGrid_Id_M025MT_1_trsyieldrosterdetVO.NON_DOMICILE_YIELD_MAX']")
	private WebElement R1NonDomYiedlMax;
	public  WebElement R1NonDomYiedlMax() {
		return  R1NonDomYiedlMax;
	}

	@FindBy(xpath = "//*[@added='1'] //td[@id='td_RosterDetailsGrid_Id_M025MT_1_trsyieldrosterdetVO.DOMICILE_YIELD_MIN']")
	private WebElement R1DomYiedldMin;
	public  WebElement R1DomYiedldMin() {
		return  R1DomYiedldMin;
	}

	@FindBy(xpath = "//*[@added='1'] //td[@id='td_RosterDetailsGrid_Id_M025MT_1_trsyieldrosterdetVO.DOMICILE_YIELD_MAX']")
	private WebElement R1DomYiedlMax;
	public  WebElement R1DomYiedlMax() {
		return  R1DomYiedlMax;
	}
	@FindBy(xpath = "//*[@added='1'] //td[@id='td_RosterDetailsGrid_Id_M025MT_1_trsyieldrosterdetVO.STAFF_YIELD_MIN']")
	private WebElement R1StaffYieldMin;
	public  WebElement R1StaffYieldMin() {
		return  R1StaffYieldMin;
	}
	@FindBy(xpath = "//*[@added='1'] //td[@id='td_RosterDetailsGrid_Id_M025MT_1_trsyieldrosterdetVO.STAFF_YIELD_MAX']")
	private WebElement R1StaffYieldMax;
	public  WebElement R1StaffYieldMax() {
		return  R1StaffYieldMax;
	}
	@FindBy(xpath = "//*[@id='del_RosterDetailsGrid_Id_M025MT']/div/span")
	private WebElement GridDeletBtn;
	public  WebElement GridDeletBtn() {
		return  GridDeletBtn;
	}
	@FindBy(xpath = "//*[@id='trsYieldRosterMaintFormId_M025MT_Delete_key']")
	private WebElement YieldRosterDeletBtn;
	public  WebElement YieldRosterDeletBtn() {
		return  YieldRosterDeletBtn;
	}
	@FindBy(xpath = "//a[@id='infoBarSearchButton_M025MT']")
	private WebElement RetrieveSearchBtn;
	public  WebElement RetrieveSearchBtn() {
		return  RetrieveSearchBtn;

	}
	@FindBy(xpath = "//input[@id='trsYieldRosterListGridTbl_Id_M025MT_gs_trsyieldrosterVO.CODE']")
	private WebElement SearchInput;
	public  WebElement SearchInput() {
		return  SearchInput;
	
	}
	}

