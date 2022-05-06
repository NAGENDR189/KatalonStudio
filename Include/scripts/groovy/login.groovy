import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


public class login {

	@Given("user is on login page")
	public void user_is_on_login_page() {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')
		WebUI.maximizeWindow()
	}

	@When("user enters (.*) and (.*)")
	public void user_enters_username_and_password(String username, String password) {

		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), username)

		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_txtPassword'), password)
	}

	@When("Clicks on Login button")
	public void clicks_on_Login_button() {

		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Password_Submit'))
	}

	@Then("user is navigating to the Homepage")
	public void user_is_navigating_to_the_Homepage() {

		WebUI.verifyTextPresent('Welcom', false)

		WebUI.closeBrowser()
	}
}
