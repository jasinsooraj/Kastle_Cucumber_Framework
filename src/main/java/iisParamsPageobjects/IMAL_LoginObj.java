package iisParamsPageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
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
	@CacheLookup
	private WebElement LoginUserNameTxt;
	public WebElement LoginUserNameTxt() {
		return LoginUserNameTxt;
	}
	
	
	@FindBy(id = "passwordInp")
	@CacheLookup
	private WebElement LoginPasswordTxt;
	public WebElement LoginPasswordTxt()
	{
		return LoginPasswordTxt;
	}
	
	@FindBy(xpath = "//*[@id='login']")
	@CacheLookup
	private WebElement LoginBtn;
	public WebElement LoginBtn() {
		return  LoginBtn;
	}
	
	@FindBy(css = "#continueWelcBtn > span")
	@CacheLookup
	private WebElement continueBtn;

	
	
	
}
