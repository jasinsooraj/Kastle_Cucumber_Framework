package iisParamsPageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsuranceTypeObj {
	WebDriver driver;
	public InsuranceTypeObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	

}
	
	@FindBy(xpath = "//*[@id=\"insuranceTypeParamCode_M0621MT\"]")
	private WebElement InsuranceTypecode;
	public  WebElement InsuranceTypecode() {
		return InsuranceTypecode;
	}
	
	@FindBy(xpath = "//*[@id=\"insuranceTypeParamBriefNameEnglish_M0621MT\"]")
	private WebElement InsuranceTypeBriefEng;
	public  WebElement InsuranceTypeBriefEng() {
		return InsuranceTypeBriefEng;
	}
	
	@FindBy(xpath = "//*[@id=\"insuranceTypeParamLongNameEnglish_M0621MT\"]")
	private WebElement InsuranceTypeLongEng;
	public  WebElement InsuranceTypeLongEng() {
		return InsuranceTypeLongEng;	
}

	
	@FindBy(xpath = "//*[@id='trsBoard_MembersVO_LONG_NAME_ENG_M019MT']")
	private WebElement LongNameEng;
	public  WebElement LongNameEng() {
		return LongNameEng;	
	
		
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
	@FindBy(xpath = "//*[@id=\"insuranceTypeParamMaintFormId_M0621MT_Save_key\"]")
	
	private WebElement  insuranceTypeSaveButton;
	public WebElement insuranceTypeSaveButton()
	{
		return insuranceTypeSaveButton;
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
@FindBy(xpath = "//*[@id=\"infoBarSearchButton_M0621MT\"]")

	private WebElement searchLookupBtn;
	public WebElement searchLookupBtn() {
		return searchLookupBtn;
	}
	
	@FindBy(xpath ="//*[@id=\"insuranceTypeParamListGridTbl_Id_M0621MT_gs_trsinsurance_typesVO.INSURANCE_TYPE\"]" )
	
	

	private WebElement filterInsurancetypeText;
	public WebElement filterInsurancetypeText() {
		return filterInsurancetypeText;
	}
	@FindBy(xpath = "//*[@id=\"insuranceTypeParamMaintFormId_M0621MT_Delete_key\"]")
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
	
}

