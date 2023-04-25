package iisParamsStepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;

import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.WaitHelper;
import iisParamsPageobjects.IMAL_LoginObj;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import login.CompanyAndBranchPage;
import resources.ExcelData;
import resources.ExcelReader;


public class IMAL_Login {

	WebDriver driver;
	WaitHelper waithelper;
	DropDownHelper dropdownhelper;
	ClicksAndActionsHelper clicksAndActionsHelper;
	IMAL_LoginObj login;
	String excelPath = System.getProperty("user.dir") + "\\Test-data\\IISPTestData.xlsx";
	Map<String, String> ulsLoginTestData = new HashMap<>();
	ExcelData excelReader = new ExcelData(excelPath, "IISP_LoginCredentials", "Stage");
	ConfigFileReader configFileReader = new ConfigFileReader();


	public IMAL_Login(WebDriver driver) {
		this.driver = driver;
	}

	public void loginToIISPAppByUser() throws InterruptedException {
		waithelper = new WaitHelper(driver);
		dropdownhelper = new DropDownHelper(driver);
		ulsLoginTestData = excelReader.getTestdata("Maker1");
		clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
		
		login = new IMAL_LoginObj(driver);
		ExcelReader objExcelReader=new ExcelReader(excelPath);
		String userName=objExcelReader.getCellData("IISP_LoginCredentials", 1, 3);
		String password=objExcelReader.getCellData("IISP_LoginCredentials", 2, 2);
		System.out.println("User Name"+userName);
		System.out.println("Password "+password);
		login.LoginUserNameTxt().sendKeys(userName);
		login.LoginPasswordTxt().sendKeys(password);
		login.LoginBtn().click();
		
	}
	
	

	 

	 @Then("click on continue for branch selection to log into IISP")
	 public void click_on_continue_for_branch_selection_to_log_into_iisp() {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }


	

}
