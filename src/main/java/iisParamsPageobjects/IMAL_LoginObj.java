package iisParamsPageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import freemarker.core.ReturnInstruction.Return;

public class IMAL_LoginObj {
	WebDriver driver;
	
	public IMAL_LoginObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "j_username")
	private WebElement LoginUserNameTxt;
	public WebElement LoginUserNameTxt() {
		return LoginUserNameTxt;
	}
	
	
	@FindBy(id = "passwordInp")
	private WebElement LoginPasswordTxt;
	public WebElement LoginPasswordTxt()
	{
		return LoginPasswordTxt;
	}
	
	@FindBy(xpath = "//*[@id='login']")
	private WebElement LoginBtn;
	public WebElement LoginBtn() {
		return  LoginBtn;
	}
	
	@FindBy(css = "#continueWelcBtn > span")
	private WebElement continueBtn;

	
	
	
}
