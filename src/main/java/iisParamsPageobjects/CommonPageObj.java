package iisParamsPageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPageObj {
	WebDriver driver;
	public CommonPageObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Save Confirmation Message Popupu Ok Button 
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement ConfirmPopupOK;
	public  WebElement ConfirmPopupOK() {
		return ConfirmPopupOK;
	}
	//Cancel Save Warning Popupup
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm']")
	private WebElement ConfirmPopupCancel;
	public  WebElement ConfirmPopupCancel() {
		return ConfirmPopupCancel;
	}

	//Confirm Ok Button After Save 
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement SuccessOkBtn;
	public  WebElement SuccessOkBtn() {
		return SuccessOkBtn;
	}

	//Remove Existing first Tab 
	@FindBy(xpath = "//span[@class='ui-icon ui-icon-close ui-icon-close-tabs-custom' and contains(text(), 'Remove Tab')]")
	private WebElement CloseOpenedTab;
	public  WebElement CloseOpenedTab() {
		return CloseOpenedTab;
	}
}
//span[@class='ui-icon ui-icon-close ui-icon-close-tabs-custom' and contains(text(), 'Remove Tab')]