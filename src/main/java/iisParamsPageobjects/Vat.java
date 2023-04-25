package iisParamsPageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vat {
	WebDriver driver;
	
	public Vat(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	
	}
	
	
	@FindBy(xpath = "//*[@id='trsVAT_Code_M065MT']")
	private WebElement vatCode;
	public  WebElement vatCode() {
		return vatCode;
	}
	
	@FindBy(xpath = "//*[@id='trsVATBriefDescEng_M065MT']")
	private WebElement briefDescEng;
	public  WebElement briefDescEng() {
		return briefDescEng;
		
		
	}
	@FindBy(xpath = "//*[@id='trsVATDescEng_M065MT']")
	private WebElement longDescEng;
	public  WebElement longDescEng() {
		return longDescEng;
	
		
		
	}
	
	@FindBy(xpath = "//*[@id='trsVATBriefDescArab_M065MT']")
	private WebElement briefDescArab;
	public  WebElement briefDescArab() {
		return briefDescArab;
		
		
	}
	@FindBy(xpath = "//*[@id='trsVATDescArab_M065MT']")
	private WebElement longDescArab;
	public  WebElement longDescArab() {
		return longDescArab;
	
		
		
	}
}

//*[@id="trsVATBriefDescArab_M065MT"]