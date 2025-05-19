package PageObjectModule;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinition.MFTextStepDefinition;
import Utilities.CommonMethod;

public class MFPlaceHolderPOM extends CommonMethod {
	
	WebDriver driver;
	
@FindBy(xpath= "//*[contains(text(), 'First Name')]")
WebElement FN_PlaceHolder_Locator;

@FindBy(xpath= "//*[contains(text(), 'Last Name')]")
WebElement LN_PlaceHolder_Locator;

@FindBy(xpath= "//*[contains(text(), 'Email Address')]")
WebElement Email_PlaceHolder_Locator;

@FindBy(xpath= "(//a[@class='blue'])[1]")
WebElement New_Register_Locator;

	public MFPlaceHolderPOM(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
	public void ClickOnHereToREgister() {
		New_Register_Locator.click();
	}

	public void First_Name_PlaceHolder() {
		String FirstName = FN_PlaceHolder_Locator.getText();
		
		Assert.assertEquals(FirstName, FirstNameText);
	}
	public void Last_Name_PlaceHolder() {
		String lastName = LN_PlaceHolder_Locator.getText();
		String ExpectedLastName = "Last Name";
		Assert.assertEquals(lastName, ExpectedLastName);
	}
	public void Email_Address_PlaceHolder() {
		String EmailAddress = Email_PlaceHolder_Locator.getText();
		String ExpectedEmail = "Last Name";
		Assert.assertEquals(EmailAddress, ExpectedEmail);
	}

}
