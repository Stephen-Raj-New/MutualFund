package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import PageObjectModule.MFPlaceHolderPOM;
import PageObjectModule.MFTextPageObjectModule;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MFPlaceHoplderStepDef {
	
	WebDriver driver;
	
   MFPlaceHolderPOM Place;
  
	
@Given("Launch the browser and open SBIMF Login Page")
public void launch_the_browser_and_open_sbimf_login_page()throws InterruptedException {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Stephen\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://online.sbimf.com/login");
	
    Place = new MFPlaceHolderPOM(driver);
   
    Thread.sleep(10000);
    //Call.i_click_on_here_to_register();
}
@When("I click on here to Register")
public void I_click_on_here_to_Register() {
    Place.ClickOnHereToREgister();
	}

@Then("Verify the First Name PlaceHolder is visible")
public void verify_the_first_name_place_holder_is_visible() {
	Place.First_Name_PlaceHolder();
}
@And("Verify the Last Name PlaceHolder is Visible")
public void verify_the_last_name_place_holder_is_visible() {
    Place.Last_Name_PlaceHolder();
}
@Then("Verify the Email address PlaceHolder")
public void verify_the_email_address_place_holder() throws InterruptedException {
    Place.Email_Address_PlaceHolder();
    
   
    
  
}


}
