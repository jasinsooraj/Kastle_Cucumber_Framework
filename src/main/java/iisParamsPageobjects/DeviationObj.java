package iisParamsPageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeviationObj {
	WebDriver driver;

	
	public DeviationObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	
	}
	
	@FindBy(xpath = "//*[@id='trsDeviation_Code_M042MT']")
	private WebElement code;
	public  WebElement code() {
		return code;
	}
	
	
	@FindBy(xpath = "//*[@id='trsDeviationBriefDescEng_M042MT']")
	private WebElement DeviationBriefDescEng;
	public  WebElement DeviationBriefDescEng() {
		return DeviationBriefDescEng;
	}
	
	@FindBy(xpath = "//*[@id=\"trsDeviationDescEng_M042MT\"]")
	private WebElement DeviationLongDescEng;
	public WebElement DeviationLongDescEng() {
		return DeviationLongDescEng;
	}
	
	@FindBy(xpath = "//*[@id=\"trsDeviationBriefDescArab_M042MT\"]")
	private WebElement DeviationBriefDescArab;
	public  WebElement DeviationBriefDescArab() {
		return DeviationBriefDescArab;
	}
	
	@FindBy(xpath = "//*[@id=\"trsDeviationDescArab_M042MT\"]")
	private WebElement DeviationLongDescArab;
	public WebElement DeviationLongDescArab() {
		return DeviationLongDescArab;
	}
	
	@FindBy(xpath = "//*[@id='trsDeviationMaintFormId_M042MT_Save_key']")

	private WebElement  DeviationSaveButton;
	public WebElement DeviationSaveButton()
	{
		return DeviationSaveButton;
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
	@FindBy(xpath = "//*[@id=\"infoBarSearchButton_M042MT\"]")
	
	private WebElement searchLookupBtn;
	public WebElement searchLookupBtn() {
		return searchLookupBtn;
	}
	
	@FindBy(xpath ="//*[@id=\"trsDeviationListGridTbl_Id_M042MT_gs_trs_DeviationtypeVO.DEVIATION_CODE\"]" )
	
	
	private WebElement filterChargeCodeText;
	public WebElement filterChargeCodeText() {
		return filterChargeCodeText;
	}
	
	@FindBy(xpath ="//*[@id=\"trsDeviationMaintFormId_M042MT_Delete_key\"]" )
	private WebElement deleteBtn;
	public WebElement deleteBtn() {
		return deleteBtn;
	}
	
	@FindBy(xpath ="//*[@id=\"mainTabs\"]/ul/li/table/tbody/tr/td[2]/span" )
	private WebElement removeTab;
	public WebElement removeTab() {
		return removeTab;
	}
	
}
