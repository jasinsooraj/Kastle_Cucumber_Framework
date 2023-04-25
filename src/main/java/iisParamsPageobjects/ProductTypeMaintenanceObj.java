package iisParamsPageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductTypeMaintenanceObj {
	WebDriver driver;
	
	public ProductTypeMaintenanceObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//*[@id='type_code_M030MT']")
	private WebElement productTypeCode;
	public WebElement productTypeCode()
	{
		return productTypeCode;
	}
	
	@FindBy(xpath = "//*[@id=\"brief_desc_eng_M030MT\"]")
	private WebElement productTypebriefDesc;
	public  WebElement productTypebriefDesc()
	{
		return productTypebriefDesc;
	}

	@FindBy(xpath = "//*[@id=\"long_desc_eng_M030MT\"]")
	private WebElement productTypeLongDesc;
	public  WebElement productTypeLongDesc()
	{
		return productTypeLongDesc;
	}
	
	@FindBy(linkText = "Maintenance")
	private WebElement productTypeMaintenancelink;
	public WebElement productTypeMaintenancelink() {
		return productTypeMaintenancelink;
	}
	
}
