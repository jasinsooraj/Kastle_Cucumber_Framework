package iisParamsPageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoardMembersObj {
	WebDriver driver;
	public BoardMembersObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	

}
	
	@FindBy(xpath = "//*[@id='trsBoard_MembersVO_MEMBER_ID_M019MT']")
	private WebElement trsBoard_Members;
	public  WebElement trsBoard_Members() {
		return trsBoard_Members;
	}
	
	@FindBy(xpath = "//*[@id='lookuptxt_trsBoard_MembersVO_CIF_NO_M019MT']")
	private WebElement CifNo;
	public  WebElement CifNo() {
		return CifNo;
	}
	
	@FindBy(xpath = "//*[@id='trsBoard_MembersVO_SHORT_NAME_ENG_M019MT']")
	private WebElement ShortNameEng;
	public  WebElement ShortNameEng() {
		return ShortNameEng;	
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
	@FindBy(xpath = "//*[@id=\"trsboardmembersFormId_M019MT_Save_key\"]")
	
	private WebElement  BoardmemberSaveButton;
	public WebElement BoardmemberSaveButton()
	{
		return BoardmemberSaveButton;
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
@FindBy(xpath = "//*[@id=\"infoBarSearchButton_M019MT\"]")

	private WebElement searchLookupBtn;
	public WebElement searchLookupBtn() {
		return searchLookupBtn;
	}
	
	@FindBy(xpath ="//*[@id=\"tRSBoardMembersListGridTbl_Id_M019MT_gs_trsBoard_MembersVO.MEMBER_ID\"]" )
	
	

	private WebElement filterChargeCodeText;
	public WebElement filterChargeCodeText() {
		return filterChargeCodeText;
	}
	@FindBy(xpath = "//*[@id=\"trsboardmembersFormId_M019MT_Delete_key\"]")
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

