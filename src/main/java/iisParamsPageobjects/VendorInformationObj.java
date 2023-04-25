package iisParamsPageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorInformationObj {
	WebDriver driver;
	public VendorInformationObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath ="//*[@id='gview_vendorInformationMaintGrid_Id_M037MT']/div[2]/div/table")
	private WebElement DynaGrid;
	public WebElement DynaGrid() {
		return DynaGrid;

	}
	@FindBy(xpath = "//td[@class='ui-pg-button ui-corner-all' and @title='Add new row']")
	private WebElement AddVendorBtn;
	public WebElement AddVendorBtn() {
		return AddVendorBtn;
	}
	@FindBy(xpath ="//tr[@added='1']")
	private WebElement NewlyAddedRow;
	public WebElement NewlyAddedRow() {
		return NewlyAddedRow;
	}

	@FindBy(xpath ="//tr[@added='1']//td[@id='td_vendorInformationMaintGrid_Id_M037MT_1_trs_VENDORVO.CIF']")
	private WebElement GridDataCifClick;
	public WebElement GridDataCifClick() {
		return GridDataCifClick;
	}

	@FindBy(xpath ="//input[@name='lookupTxt_trs_VENDORVO.CIF']")
	private WebElement CifLookUp;
	public WebElement CifLookUp() {
		return CifLookUp;
	}
	@FindBy(xpath="(//span[@role='button']//span)[1]")
	private WebElement CifSearchButn;
	public WebElement CifSearchButn() {
		return CifSearchButn;
	}

	@FindBy(xpath="(//div[@class='ui-numeric']//input)[2]")
	private WebElement GridDataAcBranch;
	public WebElement GridDataAcBranch() {
		return GridDataAcBranch;
	}

	@FindBy(xpath="(//div[@class='ui-numeric']//input)[3]")
	private WebElement GridDataAcCurrency;
	public WebElement GridDataAcCurrency() {
		return GridDataAcCurrency;
	}

	@FindBy(xpath ="(//div[@class='ui-numeric']//input)[4]")
	private WebElement GridDataAccGl;
	public WebElement GridDataAccGl() {
		return GridDataAccGl;
	}

	@FindBy(xpath ="(//div[@class='ui-numeric']//input)[5]")
	private WebElement GridDataAccCif;
	public WebElement GridDataAccCif() {
		return GridDataAccCif;
	}
	@FindBy(xpath ="(//div[@class='ui-numeric']//input)[6]")
	private WebElement GridDataAccSlNo;
	public WebElement GridDataAccSlNo() {
		return GridDataAccSlNo;
	}
	@FindBy(xpath ="(//span[@role='button']//span)[2]")
	private WebElement AccSearchBtn;
	public WebElement AccSearchBtn() {
		return AccSearchBtn;
	}
	@FindBy(xpath ="(//input[@class='editable'])[5]")
	private WebElement StopDisbCheckbox;
	public WebElement StopDisbCheckbox() {
		return StopDisbCheckbox;
	}
	@FindBy(xpath ="//tr[@added='1']//a")
	private WebElement Detailslinktext;
	public WebElement Detailslinktext() {
		return Detailslinktext;
	}
	@FindBy(xpath ="//div[@class='ui-dialog-titlebar ui-widget-header ui-corner-all ui-helper-clearfix']")
	private WebElement AlertMemo;
	public WebElement AlertMemo() {
		return AlertMemo;
	}
	@FindBy(xpath ="//span[normalize-space()='close']")
	private WebElement AlertMemoClose;
	public WebElement AlertMemoClose() {
		return AlertMemoClose;
		
	}
	@FindBy(xpath="//label[@id='vendorInformationDetFormId_M037MT_Save_key']")
	private WebElement VendorInfoSaveBtn;
	public WebElement VendorInfoSaveBtn() {
		return VendorInfoSaveBtn;
		
	}
	@FindBy(xpath ="//*[@id='mainTabs']/ul/li/table/tbody/tr/td[2]/span")
	private WebElement VendorInfoCloseTab;
	public WebElement VendorInfoCloseTab() {
		return VendorInfoCloseTab;
		
	}
	@FindBy(xpath ="//*[@id='_popup_path_sol_confirm_ok']")
	private WebElement VendorSaveConfBtn;
	public WebElement VendorSaveConfBtn() {
		return VendorSaveConfBtn;
	}
	@FindBy(xpath ="//*[@id='_popup_path_sol_ok']")
	private WebElement SaveSuccConfBtn;
	public WebElement SaveSuccConfBtn() {
		return SaveSuccConfBtn;
		//List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-condensed table-hover event-list']/tbody/tr"));
		//System.out.println(rows.size());
	}
	@FindBy(xpath ="")
	private WebElement VendorInfoDeleteBtn;
	public WebElement VendorInfoDeleteBtn() {
		return VendorInfoDeleteBtn;
	}
	@FindBy(xpath ="//*[@id='vendorInformationMaintGrid_Id_M037MT']")
	private List<WebElement> RowCounttabl;
	public WebElement RowCounttabl() {
		return (WebElement) RowCounttabl;
	
		
	}
}

