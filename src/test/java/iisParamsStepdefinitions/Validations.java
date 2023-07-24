package iisParamsStepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class Validations {
	
	public static Boolean check_message_successfully_saved(WebDriver driver)
	{
		if(driver.findElement(By.xpath("//div[@class='jMsgbox-contentWrap']")).getText()=="Saved Successfully")
			return true;
		else
			return false;
	}


}
