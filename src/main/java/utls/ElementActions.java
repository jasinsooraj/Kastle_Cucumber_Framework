package utls;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementActions {

	private WebDriver driver;
	private WaitElements waitElements;
	private Actions actions;

	public ElementActions(WebDriver driver) {
		this.driver = driver;
	}

	public void clickButton(By element) {
		waitElements = new WaitElements(driver);
		waitElements.waitVisibilityOfElement(element);
		waitElements.waitPresenceOfAllElementsLocatedBy(element);
		waitElements.waitClickabilityOfElement(element);
		try {
			driver.findElement(element).click();
		} catch (org.openqa.selenium.StaleElementReferenceException
				| org.openqa.selenium.InvalidElementStateException ex) {
		}
	}
	
	public void clickonElement(WebElement element) {
		waitElements = new WaitElements(driver);
		waitElements.waitVisibilityOfElement(element);
		waitElements.waitClickabilityOfElement(element);
		try {
			element.click();
		} catch (org.openqa.selenium.StaleElementReferenceException
				| org.openqa.selenium.InvalidElementStateException ex) {
		}
	}

	public void doubleClickButton(By element) {
		waitElements = new WaitElements(driver);
		actions = new Actions(driver);
		waitElements.waitVisibilityOfElement(element);
		waitElements.waitPresenceOfAllElementsLocatedBy(element);
		waitElements.waitClickabilityOfElement(element);
		try {
			actions.doubleClick(driver.findElement(element)).perform();
			waitElements.waitInvisibilityOfElement(element);
		} catch (org.openqa.selenium.StaleElementReferenceException
				| org.openqa.selenium.InvalidElementStateException ex) {
		}
	}

	public void typeValue(By element, String elementValue) {
		waitElements = new WaitElements(driver);
		waitElements.waitVisibilityOfElement(element);
		waitElements.waitClickabilityOfElement(element);
		try {
			driver.findElement(element).clear();
			driver.findElement(element).sendKeys(elementValue);
		} catch (org.openqa.selenium.StaleElementReferenceException
				| org.openqa.selenium.InvalidElementStateException ex) {
		}
		System.out.println(elementValue);
	}
	
	public void typeValue(WebElement element, String elementValue) {
		waitElements = new WaitElements(driver);
		waitElements.waitVisibilityOfElement(element);
		waitElements.waitClickabilityOfElement(element);
		try {
			element.clear();
			element.sendKeys(elementValue);
		} catch (org.openqa.selenium.StaleElementReferenceException
				| org.openqa.selenium.InvalidElementStateException ex) {
		}
		System.out.println(elementValue);
	}

	public void typeEnter(By element) {
		waitElements = new WaitElements(driver);
		waitElements.waitVisibilityOfElement(element);
		try {
			driver.findElement(element).sendKeys(Keys.ENTER);
			System.err.println("Click Enter Done");
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
		}
	}
	
	public void typeEnter(WebElement element) {
		waitElements = new WaitElements(driver);
		waitElements.waitVisibilityOfElement(element);
		try {
			element.sendKeys(Keys.ENTER);
			System.err.println("Click Enter Done");
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
		}
	}

	public void typeArrowUp(By element) {
		waitElements = new WaitElements(driver);
		waitElements.waitVisibilityOfElement(element);
		try {
			driver.findElement(element).sendKeys(Keys.ARROW_UP);
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
		}
	}

	public void typeArrowDown(By element) {
		waitElements = new WaitElements(driver);
		waitElements.waitVisibilityOfElement(element);
		try {
			driver.findElement(element).sendKeys(Keys.ARROW_DOWN);
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
		}
	}

	public void typeTAB(By element) {
		waitElements = new WaitElements(driver);
		waitElements.waitVisibilityOfElement(element);
		try {
			driver.findElement(element).sendKeys(Keys.TAB);
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
		}
	}

	private Select findDropDownElement(By element) {
		waitElements = new WaitElements(driver);
		waitElements.waitVisibilityOfElement(element);
		return new Select(driver.findElement(element));
	}

	public void selectFromDropDown(String option, By element) {
		findDropDownElement(element).selectByVisibleText(option);
	}


	public void getGridData(By element) {
		waitElements = new WaitElements(driver);
		waitElements.waitVisibilityOfElement(element);
	}

	public String getElementText(By element) {
		waitElements = new WaitElements(driver);
		waitElements.waitVisibilityOfElement(element);
		return driver.findElement(element).getText();
	}

	public void waitInvisabilityOfElement(By element) {
		waitElements = new WaitElements(driver);
		waitElements.waitInvisibilityOfElement(element);
	}

	public void typeValueWithioutClear(By element, String elementValue) {
		waitElements = new WaitElements(driver);
		waitElements.waitVisibilityOfElement(element);
		waitElements.waitClickabilityOfElement(element);
		try {
			driver.findElement(element).sendKeys(Keys.chord(Keys.CONTROL, "A"));
			driver.findElement(element).sendKeys(elementValue);
		} catch (org.openqa.selenium.StaleElementReferenceException
				| org.openqa.selenium.InvalidElementStateException ex) {
		}
		System.out.println(elementValue);
	}
	public void typeValueWithioutClear(WebElement element, String elementValue) {
		waitElements = new WaitElements(driver);
		waitElements.waitVisibilityOfElement(element);
		waitElements.waitClickabilityOfElement(element);
		try {
			element.sendKeys(Keys.chord(Keys.CONTROL, "A"));
			element.sendKeys(elementValue);
		} catch (org.openqa.selenium.StaleElementReferenceException
				| org.openqa.selenium.InvalidElementStateException ex) {
		}
		System.out.println(elementValue);
	}
	
	public void typeTAB(WebElement element) {
		waitElements = new WaitElements(driver);
		waitElements.waitVisibilityOfElement(element);
		try {
			element.sendKeys(Keys.TAB);
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
		}
	}

}
