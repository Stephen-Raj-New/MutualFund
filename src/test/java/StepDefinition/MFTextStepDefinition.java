package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import PageObjectModule.MFTextPageObjectModule;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MFTextStepDefinition {
	
	WebDriver driver;
	MFTextPageObjectModule Validation;
	
	@Given("Launch the Browser and Open SBIMF Login Page")
	public void launch_the_browser_and_open_sbimf_login_page() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Stephen\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.sbimf.com/login");
		Validation = new MFTextPageObjectModule(driver);
	}
	@When("I click on here to Register")
	public void i_click_on_here_to_register() {
		Validation.Click_here_to_Register();
	}
	@Then("I Click on First Name and use Tabs")
	public void i_click_on_first_name_and_use_tabs()throws InterruptedException {
	    Validation.Click_on_First_Name();
	}
	@And("Verify the text Please Enter the First name")
	public void verify_the_text_please_enter_the_first_name() {
	    Validation.Verify_the_First_Name();
	}
	@Then("Verify the text Last Name")
	public void verify_the_text_last_name() {
	    Validation.Verify_Last_Name();
	}
	@And("Verify the text email address")
	public void verify_the_text_email_address() {
		Validation.Verify_email_address();
	}
	@And("Close the Browser")
	public void close_the_browser()throws InterruptedException {
	    Validation.Close_the_Browser();
	}


}
