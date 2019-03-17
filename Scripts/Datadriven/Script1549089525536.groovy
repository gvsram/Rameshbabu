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

WebUI.openBrowser('')

   
WebUI.maximizeWindow()
for (rowNum=1; rowNum<=5; rowNum++){
	
WebUI.navigateToUrl('https://accounts.google.com/signup')

//WebUI.setText(findTestObject('Datadriven_OR/FIrst name'), findTestData("Datadriven").getValue(1,1))
WebUI.setText(findTestObject('Datadriven_OR/FIrst name'), Firtsname)

WebUI.setText(findTestObject('Datadriven_OR/Last name'), Lastname)
//WebUI.setText(findTestObject('Datadriven_OR/Last name'), findTestData("Datadriven").getValue(1,2 ))

WebUI.setText(findTestObject('Datadriven_OR/Username'), Username)
//WebUI.setText(findTestObject('Datadriven_OR/Username'), findTestData("Datadriven").getValue(1,3))

WebUI.setText(findTestObject('Datadriven_OR/Password'), Password)
//WebUI.setText(findTestObject('Datadriven_OR/Password'), findTestData("Datadriven").getValue(1,4))

WebUI.setText(findTestObject('Datadriven_OR/Confirm'), Confirm)
//WebUI.setText(findTestObject('Datadriven_OR/Confirm'), findTestData("Datadriven").getValue(1,5))

WebUI.click(findTestObject('Datadriven_OR/Next'))
}
