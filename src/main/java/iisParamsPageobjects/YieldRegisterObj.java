package iisParamsPageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YieldRegisterObj {
	

	WebDriver driver;
	public YieldRegisterObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);

	}
	@FindBy(xpath="//td[text()='Yield Register']")
	private WebElement YieldRegSubOPT;
	public  WebElement YieldRegSubOPT() {
		return YieldRegSubOPT;
	}
	@FindBy(xpath="//input[@id='trsYieldRegister_RegNo_M026MT']")
	private WebElement RegisterNo;
	public  WebElement RegisterNo() {
		return RegisterNo;
	}
	@FindBy(xpath="//select[@id='party_typelist_M026MT']")
	private WebElement partyTypelistDropDown;
	public  WebElement partyTypelistDropDown() {
		return partyTypelistDropDown;
	}
	@FindBy(xpath="//*[@id='party_typelist_M026MT']/option[2]")
	private WebElement PartyTypeCounterParty;
	public  WebElement PartyTypeCounterParty() {
		return PartyTypeCounterParty;
	}
	@FindBy(xpath="//*[@id='party_typelist_M026MT']/option[3]")
	private WebElement PartyTypeContributor;
	public  WebElement PartyTypeContributor() {
		return PartyTypeContributor;
	}
	@FindBy(xpath="//select[@id='product_typelist_M026MT']")
	private WebElement ProductPypelistDropDown;
	public  WebElement ProductPypelistDropDown() {
		return ProductPypelistDropDown;
	}
	@FindBy(xpath="//*[@id='product_typelist_M026MT']/option[2]")
	private WebElement ProductTypeAll;
	public  WebElement ProductTypeAll() {
		return ProductTypeAll;
	}
	@FindBy(xpath="//*[@id='product_typelist_M026MT']/option[2]")
	private WebElement ProductTypeSpec;
	public  WebElement ProductTypeSpec() {
		return ProductTypeSpec;
	}
	@FindBy(xpath="//input[@id='trsYieldRegisterBriefDescEng_M026MT']")
	private WebElement BriefNameTxt;
	public  WebElement BriefNameTxt() {
		return BriefNameTxt;
	}
	@FindBy(xpath="//input[@id='trsYieldRegisterDescEng_M026MT']")
	private WebElement LongName;
	public  WebElement LongName() {
		return LongName;
	}
	@FindBy(xpath="//input[@id='trsYieldRegister_criteria_fms_cal_yn_M026MT']")
	private WebElement FmsCriteriaCheckBox;
	public  WebElement FmsCriteriaCheckBox() {
		return FmsCriteriaCheckBox;
	}
	@FindBy(xpath="//*[@id='trsYieldRegister_StatusBtn_M026MT']/span[2]")
	private WebElement StatusDetailsBtn;
	public  WebElement StatusDetailsBtn() {
		return StatusDetailsBtn;
	}
	@FindBy(xpath="//label[@id='trsYieldRegisterMaintFormId_M026MT_Save_key']")
	private WebElement YieldRegSaveBtn;
	public  WebElement YieldRegSaveBtn() {
		return YieldRegSaveBtn;
	}
	@FindBy(xpath="//a[@id='infoBarSearchButton_M026MT']")
	private WebElement YieldRegSearchBtn;
	public  WebElement YieldRegSearchBtn() {
		return YieldRegSearchBtn;
	}
	@FindBy(xpath="//input[@id='trsYieldRegisterListGridTbl_Id_M026MT_gs_trsRosterRegisterVO.CODE']")
	private WebElement YieldRegSearchInput;
	public  WebElement YieldRegSearchInput() {
		return YieldRegSearchInput;
		
	}
	@FindBy(xpath="//input[@id='lookuptxt_YieldRegister_product_class_M026MT']")
	private WebElement SpecificProClassCode;
	public  WebElement SpecificProClassCode() {
		return SpecificProClassCode;
		
	}
	@FindBy(xpath="//*[@id='spanLookup_YieldRegister_product_class_M026MT']/span")
	private WebElement SearchLookUpBtn;
	public  WebElement SearchLookUpBtn() {
		return SearchLookUpBtn;
		
	}

	@FindBy(xpath="//input[@id='lookuptxt_YieldRegister_product_class_M026MT']")
	private WebElement SearchInput;
	public  WebElement SearchInput() {
		return SearchInput;
		
	}
	@FindBy(xpath="//span[normalize-space()='All Parties']")
	private WebElement AllPartiesTab;
	public  WebElement AllPartiesTab() {
		return AllPartiesTab;
		
	}
	@FindBy(xpath="//td[@id='add_trsYieldRegisterAllPartiesGrid_Id_M026MT']//span[@class='ui-icon ui-icon-plus']")
	private WebElement AllPartiesGridAddbtn;
	public  WebElement AllPartiesGridAddbtn() {
		return AllPartiesGridAddbtn;
		
	}
	@FindBy(xpath="//tr[@added='1' and @tabindex='-1']")
	private WebElement AllPartiesGridAddLastRow;
	public  WebElement AllPartiesGridAddLastRow() {
		return AllPartiesGridAddLastRow;
	}
	@FindBy(xpath="//select[@id='new_1678356301500_trsrosterRegisterDetVO.CURRENCY_TYPE']")
	private WebElement APCurrencytypeDropdownGrid;
	public  WebElement APCurrencytypeDropdownGrid() {
		return APCurrencytypeDropdownGrid;
		
	}
	@FindBy(xpath="//input[@name='lookupTxt_trsrosterRegisterDetVO.CURRENCY_CODE']")
	private WebElement APSpecifCycode;
	public  WebElement APSpecifCycode() {
		return APSpecifCycode;
		
		
	}
 	@FindBy(xpath="")
	private WebElement xvK;
	public  WebElement xv() {
		return xv;
		
		
	}
 	@FindBy(xpath="")
	private WebElement xv;
	public  WebElement xvI() {
		return xv;
	}
}

