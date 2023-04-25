package iisParamsStepdefinitions;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.WaitHelper;
import iisParamsPageobjects.CommonPageObj;
import iisParamsPageobjects.HomePageObj;
import iisParamsPageobjects.YieldRegisterObj;
import iisParamsTestDataType.YieldRegisterTestDataType;
import io.cucumber.java.en.*;
import login.CompanyAndBranchPage;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import utls.ElementActions;

public class YieldRegister extends BaseClass{
		WebDriver driver = BaseClass.driver;
		ConfigFileReader configFileReader = new ConfigFileReader();
		ConfigFileReader config = new ConfigFileReader();
		DropDownHelper dropDownHelper;
		WaitHelper waithelper = new WaitHelper(driver);
		IMAL_Login imalLogin = new IMAL_Login(driver);
		JsonDataReaderWriter jsonWriter = new JsonDataReaderWriter();
		ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
		BrowserHelper browserHelper;
		HomePageObj iishomepageobj= new HomePageObj(driver);
		CompanyAndBranchPage comapanyandBranchSelectionObj= new CompanyAndBranchPage(driver);
		ElementActions elementActions =new ElementActions(driver);
		CommonPageObj Commonobj =new CommonPageObj(driver);
		YieldRegisterObj yieldregisterobj = new YieldRegisterObj(driver);
		YieldRegisterTestDataType yieldregistertestdata = new YieldRegisterTestDataType();
		String excelPath = System.getProperty("user.dir") + "\\Test-data\\IISPTestData.xlsx";

		@Then("User Click on Yeild Register Maintenance OPT")
		public void user_click_on_yeild_register_maintenance_opt() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("User Input  Yeild Register Details")
		public void user_input_yeild_register_details() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("User Save Register Details")
		public void user_save_register_details() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("User Retrieve Saved  Yeild Register Data")
		public void user_retrieve_saved_yeild_register_data() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("User Delete Yeild Register")
		public void user_delete_yeild_register() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}


}
