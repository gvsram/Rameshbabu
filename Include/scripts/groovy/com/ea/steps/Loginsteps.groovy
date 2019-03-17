package com.ea.steps
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class Loginsteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I navigate to the login page")
	def I_navigate_to_the_login_page() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
	    WebUI.navigateToUrl('https://www.nopcommerce.com/login.aspx')
	}

	@When('I enter the username as "(.*) and password as "(.*)"')
	def I_check_for_the_value_in_step(String userName,String password) {
		
		/*WebUI.setText(findTestObject('Cucumber_OR/Username'), 'Rameshbabugvs')
		
		WebUI.setText(findTestObject('Cucumber_OR/Password'), 'Ramesh123$')*/
		@FindBy(name="username")WebUI.setText(findTestObject('Cucumber_OR/Username'), 'Username')
		@FindBy(name="username")WebUI.setText(findTestObject('Cucumber_OR/Password'), 'Password')
	}

	@Then("I click the login button")
	def I_click_the_login_button()  {
		//WebUI.click(findTestObject('Cucumber_OR/Login1'))
		@FindBy(WebUI.click(findTestObject('Cucumber_OR/Login1')))
		}
	@Then("I Should see the home page")
	def I_Should_see_the_home_page(){
		
	}
	
}