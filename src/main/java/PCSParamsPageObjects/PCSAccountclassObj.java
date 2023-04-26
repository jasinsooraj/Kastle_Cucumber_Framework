package PCSParamsPageObjects;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class PCSAccountclassObj {
    WebDriver driver;
    
public PCSAccountclassObj(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver,this);
}
 
        
@FindBy(xpath = "//*[@id='addNewGridRec_P0021MT']")
private WebElement Newbutton;
public  WebElement Newbutton() {
return Newbutton;
}
 
            
@FindBy(id = "infoBarSearchButton_P0021MT")
private WebElement Searchbutton;
public WebElement Searchbutton() {
return Searchbutton;

}
                
@FindBy(xpath = "//*[@id='accountClasscode_P0021MT']")
private WebElement codetextbox;
public  WebElement codetextbox() {
return codetextbox;
}
                    
@FindBy(xpath = "//*[@id='addref_P0021MT']")
private WebElement additionalreferencetextbox;
public  WebElement additionalreferencetextbox() {
return additionalreferencetextbox;
}
                        
@FindBy(xpath = "//*[@id='briefdesc_P0021MT']")
private WebElement BriefDescriptionEnglishtextbox;
public  WebElement BriefDescriptionEnglishtextbox() {
return BriefDescriptionEnglishtextbox;
}
                            
@FindBy(xpath = "//*[@id='longdesc_P0021MT']")
private WebElement LongDescriptionEnglishtextbox;
public  WebElement LongDescriptionEnglishtextbox() {
return LongDescriptionEnglishtextbox;
}
 
@FindBy(xpath = "//*[@id='briefdescarab_P0021MT']")
private WebElement BriefDescriptionArabictextbox;
public  WebElement BriefDescriptionArabictextbox() {
return BriefDescriptionArabictextbox;
}
 
@FindBy(xpath = "//*[@id='longdescarab_P0021MT']")
private WebElement LongDescriptionArabictextbox;
public  WebElement LongDescriptionArabictextbox() {
return LongDescriptionArabictextbox;
}
 
@FindBy(xpath = "//*[@id='lbl_update_P0021MT']")
private WebElement Updatebutton;
public  WebElement Updatebutton() {
return Updatebutton;
}
 
@FindBy(xpath = "//*[@id=\"_popup_path_sol_ok\"]")
private WebElement oKButton;
public WebElement oKButton() {
    return oKButton;
}
 
@FindBy(xpath = "//*[@id=\"_popup_path_sol_confirm_ok\"]")
private WebElement confirmOKButton;
public WebElement confirmOKButton() {
    return confirmOKButton;
}
 
@FindBy(xpath ="//*[@id=\"accountClassGridTbl_Id_P0021MT_gs_rifaclvo.CLASS_CODE\"]" )
private WebElement filterAccountclassCodeText;
public WebElement filterAccountclassCodeText() {
return filterAccountclassCodeText;
}
 

@FindBy(xpath ="//*[@id='lbl_delete_P0021MT\']" )
private WebElement deleteBtn;
public WebElement deleteBtn() {
    return deleteBtn;
}
 
@FindBy(xpath ="//span[@class='ui-icon ui-icon-close ui-icon-close-tabs-custom' and contains(text(),'Remove Tab')]" )
private WebElement removeTab;
public WebElement removeTab() {
    return removeTab;
}
 

}

								
								