package iisParamsStepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dataProvider.ConfigFileReader;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import iisParamsPageobjects.ChargesMaintenanceObj;
import iisParamsPageobjects.HomePageObj;
import iisParamsTestDataType.ChargesMaintenanceTestDataType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import login.CompanyAndBranchPage;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import utls.ElementActions;

public class IISParamsCommonOperations extends BaseClass  {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	ConfigFileReader config = new ConfigFileReader();
	DropDownHelper dropDownHelper;
	WaitHelper waithelper = new WaitHelper(driver);
	IMAL_Login imalLogin = new IMAL_Login(driver);
	JavascriptHelper javascripthelper = new JavascriptHelper();
	//ChargesMaintenanceObj chargeMaintenanceObj = new ChargesMaintenanceObj(driver);
	//ChargesMaintenanceTestDataType chargeMaintenanceDataType = new ChargesMaintenanceTestDataType();
	JsonDataReaderWriter jsonWriter = new JsonDataReaderWriter();
	JsonDataReaderWriter reader = new JsonDataReaderWriter();
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browserHelper;
	CompanyAndBranchPage comapanyandBranchSelectionObj= new CompanyAndBranchPage(driver);
	//HomePageObj iisParamHomePageObj;
	private ElementActions elementActions =new ElementActions(driver);
	String excelPath = System.getProperty("user.dir") + "\\Test-data\\IISPTestData.xlsx";
	
	
	/*public IISParamsCommonOperations(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}*/
	 
	@Given("^User Navigate to IISP URL login$")
	public void user_navigate_to_iisp_url_login() throws Exception {
	
		driver.get(configFileReader.getApplicationUrl("IISP"));

	}

	@Then("log into IISP with valid credentials")
	public void input_login_credentials_to_log_into_iisp() throws Exception {
		imalLogin.loginToIISPAppByUser();
		comapanyandBranchSelectionObj.typeCompanyData("1");
		comapanyandBranchSelectionObj.typeBranchData("2");
		comapanyandBranchSelectionObj.clickcontinueButtonForCompanyAndBranch();
		iisParamHomePageObj= (HomePageObj) comapanyandBranchSelectionObj.takeDecision("IISP");
		
		

	}
	@And("Click on Parameters Root OPT")
	public void click_on_parameters_root_opt() throws InterruptedException {
		
		//Thread.sleep(5000);
		waithelper.waitForElementVisible(iisParamHomePageObj.parametersRootOptLink(), 20000, 100);
		WebElement rootLink=iisParamHomePageObj.parametersRootOptLink();

		elementActions.clickonElement(rootLink);

	   
	}
	
	public  void navigate_to_iisp_url_login() throws Exception {
		
		driver.get(configFileReader.getApplicationUrl("IISP"));

	}

	public void input_login_credentials_to_iisp() throws Exception {
		imalLogin.loginToIISPAppByUser();
		comapanyandBranchSelectionObj.typeCompanyData("1");
		comapanyandBranchSelectionObj.typeBranchData("2");
		comapanyandBranchSelectionObj.clickcontinueButtonForCompanyAndBranch();
		iisParamHomePageObj= (HomePageObj) comapanyandBranchSelectionObj.takeDecision("IISP");
		
		

	}

	public void click_on_parameters_root() throws InterruptedException {
		
		//Thread.sleep(5000);
		waithelper.waitForElementVisible(iisParamHomePageObj.parametersRootOptLink(), 20000, 100);
		WebElement rootLink=iisParamHomePageObj.parametersRootOptLink();

		elementActions.clickonElement(rootLink);	   
	}
	

}
