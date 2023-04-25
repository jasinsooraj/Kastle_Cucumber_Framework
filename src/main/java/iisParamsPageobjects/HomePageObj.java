package iisParamsPageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utls.ElementActions;

public class HomePageObj {
	public WebDriver driver;
	private ElementActions elementActions;
	public static Object objHomePageObject;
	public static Object objDriver;
	public static String dealNo;

	public HomePageObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	/** Dynamic method to click on any link By adding link text */
	public void openScreenLink(By element) {
		elementActions=new ElementActions(driver);
		elementActions.clickButton(element);
	}
	
	
	//private By investmentDealsLink=By.linkText("Investment Deals");
	//private By investmentDealsLink=By.xpath("//*[@id=\"_selenuimT02\"]/h3/table/tbody/tr/td[2]");	                                          
	//private By investmentDealsLink=By.xpath("//*[contains(text(),'Investment Deals')]");
	@FindBy(xpath ="//td[text()='Parameters']" )
	private WebElement parametersRootOptLink;
	public WebElement parametersRootOptLink() {
		return parametersRootOptLink;
	}
	
	@FindBy(xpath ="//td[text()='Charges']" )
	private WebElement chargesLink;
	public WebElement chargesLink() {
		return chargesLink;
	}
	
	@FindBy(xpath ="//span[text()='Maintenance']" )
	private WebElement MaintenanceLink;
	public WebElement MaintenanceLink() {
		return MaintenanceLink;
	}
	
	@FindBy(xpath ="//td[text()='Product Type']" )
	private WebElement productTypeLink;
	public WebElement productTypeLink() {
		return productTypeLink;
	}
	
	@FindBy(xpath ="//td[text()='Item']" )
	private WebElement itemLink;
	public WebElement itemLink() {
		return itemLink;
	}
	
	@FindBy(linkText ="Leased Asset" )
	private WebElement LeasedAssetLink;
	public WebElement LeasedAssetLink()
	{
		return LeasedAssetLink;
	}
	
	@FindBy(xpath ="//td[text()='Deviation']" )
	private WebElement DeviationLink;
	public WebElement DeviationLink ()
	{
	return DeviationLink;
	}

	@FindBy(xpath ="//td[text()='Board Members']" )
	private WebElement BoardmenbersLink;
	public WebElement BoardmenbersLink ()
    {
	return  BoardmenbersLink;
	}
	
	@FindBy(xpath ="//td[text()='Insurance Types']" )
	private WebElement InsurancetypeLink;
	public WebElement InsurancetypeLink ()
	{
	return InsurancetypeLink;
	}
	
	@FindBy(xpath ="//td[text()='Insurance Companies']" )
	private WebElement InsurancecomanyLink;
	public WebElement InsurancecomanyLink ()
	{
	return InsurancecomanyLink;
	}
	
	
}
