package PageObjectModule;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MFTextPageObjectModule {
	
	WebDriver driver;
	
@FindBy(xpath= "(//a[@class='blue'])[1]")
WebElement New_Register_Locator;
@FindBy(xpath= "//input[@formcontrolname='FIRST_NAME']")
WebElement First_Name_Locator;
@FindBy(xpath= "//*[contains(text(), 'Please enter first name.')]")
WebElement Verify_First_Name_Locator;
@FindBy(xpath= "//*[contains(text(), 'Please enter last name.')]")
WebElement Verify_Last_Name_Locator;
@FindBy(xpath= "//*[contains(text(), 'Please enter email address.')]") 
WebElement Verify_email_address_Locator;

public MFTextPageObjectModule(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void Click_here_to_Register() {
	New_Register_Locator.click();
}
public void Click_on_First_Name()throws InterruptedException {
	First_Name_Locator.click();
	First_Name_Locator.sendKeys(Keys.TAB);
	Thread.sleep(3000);
	First_Name_Locator.sendKeys(Keys.TAB);
	
	First_Name_Locator.sendKeys(Keys.TAB);
}
public void Verify_the_First_Name() {
	String FirstName = Verify_First_Name_Locator.getText();
	String ExpectedFirstName = "Please enter first name.";
	Assert.assertEquals(FirstName, ExpectedFirstName);
}
public void Verify_Last_Name() {
	String LastName = Verify_Last_Name_Locator.getText();
	String ExpectedLastName = "Please enter last name.";
	Assert.assertEquals(LastName, ExpectedLastName);
}
public void Verify_email_address() {
	String emailaddress = Verify_email_address_Locator.getText();
	String Expectedemailaddress = "Please enter email address.";  
	Assert.assertEquals(emailaddress, Expectedemailaddress);
}
public void Close_the_Browser() throws InterruptedException{
	Thread.sleep(3000);
	driver.quit();
}

}