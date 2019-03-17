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

int a = 2

for (int i = 0; i = 2; i++) {
    if (a == 5) {
        //the condition is not matched
        WebUI.navigateToUrl('https://www.nopcommerce.com/login.aspx')

        WebUI.setText(findTestObject('Controlstaments/Username'), 'Rameshbabugvs')

        WebUI.setText(findTestObject('Controlstaments/Password'), 'Ramesh123$')
    } else {
        System.out.println('if cindition is false')
    }
}

WebUI.acceptAlert()

WebUI.callTestCase(findTestCase('Datadriven'), [('Firtsname') : '', ('Lastname') : '', ('Username') : '', ('Password') : ''
        , ('Confirm') : ''], FailureHandling.STOP_ON_FAILURE)

