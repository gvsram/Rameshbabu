import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable


WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Nopcommerce/Registerlink'))

WebUI.setText(findTestObject('Datadriven_OR/Datadriven1/FirstName'), "Rameshbabu")

WebUI.setText(findTestObject('Datadriven_OR/Datadriven1/Lastname'), "Gvs")

WebUI.setText(findTestObject('Datadriven_OR/Datadriven1/E-Mail'), "ramgvs4@gmail.com")

/*WebUI.setText(findTestObject('Datadriven_OR/Datadriven1/Username'), Username)

WebUI.selectOptionByLabel(findTestObject('Datadriven_OR/Datadriven1/Countrydropdown'), Country, false)

WebUI.selectOptionByLabel(findTestObject('Datadriven_OR/Datadriven1/RoleDropdown'), Role, false)

WebUI.setText(findTestObject('Datadriven_OR/Datadriven1/Password'), Password)

WebUI.setText(findTestObject('Datadriven_OR/Datadriven1/Confirmpassword'), Confirmpassword)

WebUI.click(findTestObject('Datadriven_OR/Register'))

WebUI.closeBrowser()
*/