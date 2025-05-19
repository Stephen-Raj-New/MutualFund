package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import PageObjectModule.MFTextPageObjectModule;
import StepDefinition.MFTextStepDefinition;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonMethod  {
	
	public void ClickOnButton(WebElement Element) {
		Element.click();
	}
	public void EnterValues(WebElement Send, String Name) {
		Send.sendKeys(Name);
	}
	public static String FirstNameText = "First Name";
		
	
}
