package PCSParamsPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PCSPloginpageObj {
	WebDriver driver;
	
public PCSPloginpageObj(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver,this);
}

@FindBy(xpath = "//*[@id='j_username']")
private WebElement Usernamefield;
public  WebElement Usernamefield() {
return Usernamefield;
}

@FindBy(xpath = "//*[@id='passwordInp']")
private WebElement Passwordfield;
public  WebElement Passwordfield() {
return Passwordfield;
}

@FindBy(xpath = "//*[@id='login']")
private WebElement Loginbutton;
public  WebElement Loginbutton() {
return Loginbutton;
}	
}
								
								