package iisParamsPageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettlementPolicyObj {
	WebDriver driver;
	public SettlementPolicyObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//
	@FindBy(xpath = "//*[@id='Parameters / Settlement Policy / Maintenance']")
	private WebElement SettlementPolicyPage;
	public  WebElement SettlementPolicyPage() {
		return SettlementPolicyPage;
	}

	@FindBy(xpath = "//a[@id='addNewGridRec_M024MT']//span[@class='ui-icon ui-icon-plus']")
	private WebElement NewBtn;
	public  WebElement NewBtn() {
		return NewBtn;
	}

	@FindBy(xpath = "//input[@id='policy_no_M024MT']")
	private WebElement PolicyNo;
	public  WebElement PolicyNo() {
		return PolicyNo;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement ConfirmOk;
	public  WebElement ConfirmOk() {
		return ConfirmOk;
	}

	@FindBy(xpath = "//input[@id='policy_description_M024MT']")
	private WebElement PolicyDescription;
	public  WebElement PolicyDescription() {
		return PolicyDescription;
	}

	@FindBy(xpath = "//*[@id='product_type_M024MT']")
	private WebElement ProductTypeDropDwn;
	public  WebElement ProductTypeDropDwn() {
		return ProductTypeDropDwn;
	}

	@FindBy(xpath = "//*[@id='product_type_M024MT']/option[2]")
	private WebElement ValueAllProduct;
	public  WebElement ValueAllProduct() {
		return ValueAllProduct;
	}

	@FindBy(xpath = "//*[@id='product_type_M024MT']/option[1]")
	private WebElement ValueSpecificProduct;
	public  WebElement ValueSpecificProduct() {
		return ValueSpecificProduct;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_product_class_M024MT']")
	private WebElement SpecificProClassCode;
	public  WebElement SpecificProClassCode() {
		return SpecificProClassCode;
	}

	@FindBy(xpath = "//*[@id='spanLookup_product_class_M024MT']/span")
	private WebElement ProductClassLokUpBtn;
	public  WebElement ProductClassLokUpBtn() {
		return ProductClassLokUpBtn;
	}
	@FindBy(xpath = "//input[@id='settle_from_deal_cy_only_yn_M024MT']")
	private WebElement SettleOnlyFrmDealAccChkBox;
	public  WebElement SettleOnlyFrmDealAccChkBox() {
		return SettleOnlyFrmDealAccChkBox;
	}

	@FindBy(xpath = "//span[normalize-space()='all customers']")
	private WebElement AllAcustomerTab;
	public  WebElement AllAcustomerTab() {
		return AllAcustomerTab;
	}

	@FindBy(xpath="//span[normalize-space()='CIF Type']")
	private WebElement CIFTypeTab;
	public  WebElement CIFTypeTab() {
		return CIFTypeTab;
	}

	@FindBy(xpath="//span[normalize-space()='Specific CIF']")
	private WebElement SpecificCifTab;
	public  WebElement SpecificCifTab() {
		return SpecificCifTab;
	}
	@FindBy(xpath="//span[normalize-space()='Restore Original Values']")
	private WebElement RestoreOrigValuesBtn;
	public  WebElement RestoreOrigValuesBtn() {
		return RestoreOrigValuesBtn;
	}
	@FindBy(xpath="//input[@id='max_number_of_trials_M024MT']")
	private WebElement MaxNbrOfTrialsInput;
	public  WebElement MaxNbrOfTrialsInput() {
		return MaxNbrOfTrialsInput;
	}
	@FindBy(xpath="//input[@id='sp_trial_free_M024MT']")
	private WebElement TrialFreeInput;
	public  WebElement TrialFreeInput() {
		return TrialFreeInput;
	}
	@FindBy(xpath="//button[@id='settlementPolicyMaint_save_M024MT']//span[@class='ui-button-text']")
	private WebElement SettlementPolicySaveBtn;
	public  WebElement SettlementPolicySaveBtn() {
		return SettlementPolicySaveBtn;
	}
	@FindBy(xpath="//*[@id='_popup_path_sol_confirm_ok']")
	private WebElement SaveConfOkBtn;
	public  WebElement SaveConfOkBtn() {
		return SaveConfOkBtn;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	private WebElement SavedOkBtn;
	public  WebElement SavedOkBtn() {
		return SavedOkBtn;
	}
	
	@FindBy(xpath="//a[@id='infoBarSearchButton_M024MT']")
	private WebElement SettPolicySearchbtn;
	public  WebElement SettPolicySearchbtn() {
		return SettPolicySearchbtn;
	}
	@FindBy(xpath="//input[@id='settlementPolicyListGridTbl_Id_M024MT_gs_trsSETTLPOLICYVO.SP_NO']")
	private WebElement SearchSettPolicyNbr;
	public  WebElement SearchSettPolicyNbr() {
		return SearchSettPolicyNbr;
	}
	@FindBy(xpath="//td[@id='td_settlementPolicyListGridTbl_Id_M024MT_1_trsSETTLPOLICYVO.SP_DESC']")
	private WebElement SettPolicyNbrLoadedData;
	public  WebElement SettPolicyNbrLoadedData() {
		return SettPolicyNbrLoadedData;
	}
	@FindBy(xpath="//span[@class='ui-icon ui-icon-close ui-icon-close-tabs-custom']")
	private WebElement SettPolicyCloseTab;
	public  WebElement SettPolicyCloseTab() {
		return SettPolicyCloseTab;
	}
}
