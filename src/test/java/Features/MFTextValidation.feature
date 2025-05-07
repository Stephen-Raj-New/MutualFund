@Validation

Feature: Verify the Validation Text Shown on the Register page

@Validation_Message
Scenario: Ensure the Validation Message Shown on each Box

   Given Launch the Browser and Open SBIMF Login Page
   When I click on here to Register
   Then I Click on First Name and use Tabs
   And Verify the text Please Enter the First name
   Then Verify the text Last Name
   #Then Verify the text email address
   And Close the Browser