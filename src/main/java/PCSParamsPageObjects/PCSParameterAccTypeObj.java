package PCSParamsPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PCSParameterAccTypeObj {
	WebDriver driver;
	
	public PCSParameterAccTypeObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);	
	}
		
		@FindBy(xpath = "//*[@id=\'accountsTypeZeroPftBrkDepChkBox_P004MT\']")
		private WebElement zeroprofitBODflag;
		public  WebElement zeroprofitBODflag() {
			return zeroprofitBODflag;
	
		}
		
}

