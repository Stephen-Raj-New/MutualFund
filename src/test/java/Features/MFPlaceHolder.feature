@PlaceHolder_Validation
Feature: Verify the Validation shown on the page

@Register_Page
Scenario: Ensure the Validation for PlaceHolder on Each Box

	Given Launch the browser and open SBIMF Login Page
	When I click on here to Register
	Then Verify the First Name PlaceHolder is visible 
	And Verify the Last Name PlaceHolder is Visible
	Then Verify the Email address PlaceHolder
	And Close the Browser