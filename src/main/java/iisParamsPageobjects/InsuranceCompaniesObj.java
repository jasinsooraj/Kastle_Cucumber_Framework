package iisParamsPageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsuranceCompaniesObj {
	WebDriver driver;
	public InsuranceCompaniesObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	

}
	
	@FindBy(xpath = "//*[@id=\"insuranceCompanyParamCode_M0622MT\"]")
	private WebElement insuranceCompanyParamCode;
	public  WebElement insuranceCompanyParamCode() {
		return insuranceCompanyParamCode;
	}
	
	@FindBy(xpath = "//*[@id=\"insuranceCompanyParamBriefNameEng_M0622MT\"]")
	private WebElement insuranceCompanyParamBriefNameEng;
	public  WebElement insuranceCompanyParamBriefNameEng() {
		return insuranceCompanyParamBriefNameEng;
	}
	
	@FindBy(xpath = "//*[@id='trsBoard_MembersVO_SHORT_NAME_ENG_M019MT']")
	private WebElement ShortNameEng;
	public  WebElement ShortNameEng() {
		return ShortNameEng;	
}

	
	@FindBy(xpath = "//*[@id=\"insuranceCompanyParamLongNameEng_M0622MT\"]")
	private WebElement insuranceCompanyParamLongNameEng;
	public  WebElement insuranceCompanyParamLongNameEng() {
		return insuranceCompanyParamLongNameEng;	
	
		
}
	@FindBy(xpath = "//*[@id='trsBoard_MembersVO_SHORT_ARAB_M019MT']")
	private WebElement ShortNameArab;
	public  WebElement ShortNameArab() {
		return ShortNameArab;	
}

	
	@FindBy(xpath = "//*[@id='trsBoard_MembersVO_LONG_NAME_ARAB_M019MT']")
	private WebElement LongNameArab;
	public  WebElement LongNameArab() {
		return LongNameArab;	
	
	}	
	@FindBy(xpath = "//*[@id=\"insuranceCompanyParamMaintFormId_M0622MT_Save_key\"]")
	
	private WebElement  insuranceCompanySaveButton;
	public WebElement insuranceCompanySaveButton()
	{
		return insuranceCompanySaveButton;
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
@FindBy(xpath = "//*[@id=\"infoBarSearchButton_M0622MT\"]")

	private WebElement searchLookupBtn;
	public WebElement searchLookupBtn() {
		return searchLookupBtn;
	}
	
	@FindBy(xpath ="//*[@id=\"insuranceCompanyParamListGridTbl_Id_M0622MT_gs_trsinsurance_companiesVO.INSURANCE_CODE\"]" )
	
	

	private WebElement filterInsuranceCompanyCodeText;
	public WebElement filterInsuranceCompanyCodeText() {
		return filterInsuranceCompanyCodeText;
	}
	@FindBy(xpath = "//*[@id=\"insuranceCompanyParamMaintFormId_M0622MT_Delete_key\"]")
	private WebElement deletebutton;
	public WebElement deletebutton()
	{
		return deletebutton;
	}
	
	@FindBy(xpath ="//*[@id=\"mainTabs\"]/ul/li/table/tbody/tr/td[2]/span" )
	private WebElement removeTab;
	public WebElement removeTab() {
		return removeTab;
	}
	
	
	
	@FindBy(xpath ="//*[@id=\"insuranceCompanyParamTrackerInsurance_M0622MT\"]" )
	private WebElement TrackerInsurance;
	public WebElement TrackerInsurance() {
		return TrackerInsurance;
	}
	
	@FindBy(xpath ="//*[@id=\"insuranceCompanyParamSettlementFasAssetClass_M0622MT\"]" )
	private WebElement SettlementFasAssetClass;
	public WebElement SettlementFasAssetClass() {
		return SettlementFasAssetClass;
	}
	
	
	@FindBy(xpath ="//*[@id=\"insuranceCompanyParamSettlementPriorityNo_M0622MT\"]" )
	private WebElement SettlementPriorityNo;
	public WebElement SettlementPriorityNo() {
		return SettlementPriorityNo;
	}
	
	
	@FindBy(xpath ="//*[@id=\"insuranceCompanyParamInsuranceTypeDetails_M0622MT\"]/a/span" )
	private WebElement InsuranceTypeDetails;
	public WebElement InsuranceTypeDetails() {
		return InsuranceTypeDetails;
	}
	
	@FindBy(xpath ="//*[@id=\"add_insuranceDetailsGrid_Id_M0622MT\"]/div/span" )
	private WebElement insuranceDetailsGrid_Id;
	public WebElement insuranceDetailsGrid_Id() {
		return insuranceDetailsGrid_Id;
	}
	
	@FindBy(xpath ="//*[@id=\"1_trsInsuranceCompaniesDetVO.INSURANCE_TYPE_lookuptxt_insuranceDetailsGrid_Id_M0622MT\"]" )
	private WebElement INSURANCE_TYPE_lookuptxt;
	public WebElement INSURANCE_TYPE_lookuptxt() {
		return INSURANCE_TYPE_lookuptxt;
	}
	
	@FindBy(xpath ="//*[@id=\"td_insuranceDetailsGrid_Id_M0622MT_1_trsInsuranceCompaniesDetVO.INSURANCE_TYPE\"]" )
	private WebElement TinsuranceDetailsGrid_Id;
	public WebElement TinsuranceDetailsGrid_Id() {
		return TinsuranceDetailsGrid_Id;
	}
	
	
	
	@FindBy(xpath ="//*[@id=\"new_1677647918760_trsInsuranceCompaniesDetVO.DR_ACC_GL\"]" )
	private WebElement DRACCGL;
	public WebElement DRACCGL() {
		return DRACCGL;
}
}
