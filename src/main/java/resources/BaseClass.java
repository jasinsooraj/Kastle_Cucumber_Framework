package resources;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

import dataProvider.ConfigFileReader;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	public Actions Action;
	Logger log = LogManager.getLogger(BaseClass.class.getName());
	public static WebDriver driver;
	
	public WebDriver initializeDriver( )throws IOException {
	
	ConfigFileReader configFileReader=new ConfigFileReader();
	String browserName =configFileReader.getBrowser();
//	String phntomDriverPath=System.getProperty("user.dir")+"\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe";
	if(browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
//		ChromeOptions options = new ChromeOptions(); 
//		options. addArguments("--headless");
		WebDriverManager.chromedriver().setup();
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--incognito");
		//options.addArguments("--headless");
		driver = new ChromeDriver();
		
	}else if(browserName.equalsIgnoreCase("firefox")) {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	
	
		
	}else if(browserName.equalsIgnoreCase("ie")) {
		
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
		
	}

	
	driver.manage().window().maximize();
	

	
	
	return driver;
}
	protected void clickButton(WebElement button)
	{
		button.click();
	}
	
	protected void setElementText (WebElement textbox , String text)
	{
		textbox.click();
		textbox.sendKeys(text);
	}
	
	protected void setTextElementText (WebElement textbox , String text)
	{
		textbox.click();
		textbox.clear();
		textbox.sendKeys(text);
	}
	protected void setTextElementText2 (WebElement textbox , String text)
	{
		//textbox.clear();
		textbox.sendKeys(text);
	}
	protected static void DropListSelect (WebElement dropList, String Value)
	{
		Select dropMenuSelect = new Select(dropList);
		dropMenuSelect.selectByValue(Value);
	}
	protected void Checkingcheckbox (WebElement Checkbox)
	{
		Checkbox.click();
	}

	protected void ConfirmAlert()
	{
		driver.switchTo().alert().accept();
	}

	protected void deleteValueFromControl(WebElement element)
	{
		element.clear();
	}
	protected void switchFrame (String frameID)
	{
		//WebDriverWait wait = new WebDriverWait(driver1,3000);
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameID));
		driver.switchTo().frame(frameID);
	}

	protected void DoubleClickonElement(WebElement button)
	{
		Action = new Actions(driver);
		Action.doubleClick(button).perform();

	}

	protected void EnterElement(WebElement SearchBoxEnter)
	{

		SearchBoxEnter.sendKeys(Keys.ENTER);
	}

	protected void TABElement(WebElement SearchBoxTAB)
	{

		SearchBoxTAB.sendKeys(Keys.TAB);

	}



}

