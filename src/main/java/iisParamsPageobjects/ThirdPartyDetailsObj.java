package iisParamsPageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThirdPartyDetailsObj {
	WebDriver driver;
	public ThirdPartyDetailsObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//input[@id='thirdPartyAddressShortName_M067MT']")
	private WebElement ShortName;
	public  WebElement ShortName() {
		return ShortName;
	}
	@FindBy(xpath = "//input[@id='thirdPartyAddressLongName_M067MT']")
	private WebElement LongName;
	public  WebElement LongName() {
		return LongName;

	}
	@FindBy(xpath ="//input[@id='thirdPartyAddressAdress1_M067MT']")
	private WebElement Address1;
	public  WebElement Address1() {
		return Address1;
	}
	@FindBy(xpath ="//input[@id='thirdPartyAddressAdress2_M067MT']")
	private WebElement Address2;
	public  WebElement Address2() {
		return Address2;
	}
	@FindBy(xpath ="//input[@id='thirdPartyAddressAdress3_M067MT']")
	private WebElement Address3;
	public  WebElement Address3() {
		return Address3;
	}

	@FindBy(xpath ="//input[@id='thirdPartyAddressAdress4_M067MT']")
	private WebElement Address4;
	public  WebElement Address4() {
		return Address4;
	}
	@FindBy(xpath ="//input[@id='thirdPartyAddressTelNo_M067MT']")
	private WebElement TelNo;
	public  WebElement TelNo() {
		return TelNo;
	}
	@FindBy(xpath ="//input[@id='thirdPartyAddressFax_M067MT']")
	private WebElement Fax;
	public  WebElement Fax() {
		return Fax;
	}

	@FindBy(xpath ="//input[@id='thirdPartyAddressEmail_M067MT']")
	private WebElement Email;
	public  WebElement Email() {
		return Email;
	}

	@FindBy(xpath ="//label[@id='thirdPartyAddressMaintFormId_M067MT_Save_key']")
	private WebElement ThirdPartyDetailsSaveBtn;
	public  WebElement ThirdPartyDetailsSaveBtn() {
		return ThirdPartyDetailsSaveBtn;
	}
	@FindBy(xpath ="//a[@id='infoBarSearchButton_M067MT']")
	private WebElement ThirdPartyDetailsSearchBtn;
	public  WebElement ThirdPartyDetailsSearchBtn() {
		return ThirdPartyDetailsSearchBtn;
	}
	@FindBy(xpath ="//input[@id='thirdPartyAddressListGridTbl_Id_M067MT_gs_trsTHIRD_PARTY_ADDRESSVO.SHORT_NAME']")
	private WebElement GridSearchShortName;
	public  WebElement GridSearchShortName() {
		return GridSearchShortName;
	}
	@FindBy(xpath ="//input[@id='thirdPartyAddressListGridTbl_Id_M067MT_gs_trsTHIRD_PARTY_ADDRESSVO.SHORT_NAME']")
	private WebElement ThirdpartyDeleteBtn;
	public  WebElement ThirdpartyDeleteBtn() {
		return ThirdpartyDeleteBtn;
	}

	@FindBy(xpath ="//*[@id='addNewGridRec_M067MT']")
	private WebElement ThirdPartyDetailsAddBtn;
	public  WebElement ThirdPartyDetailsAddBtn() {
		return ThirdPartyDetailsAddBtn;
	}

}

///
