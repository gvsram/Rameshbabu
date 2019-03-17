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

WebUI.navigateToUrl('https://www.nopcommerce.com/login.aspx')

not_run: String title = WebUI.getWindowTitle()

not_run: String title2 = 'HTML5 Tutorial'

not_run: if (title.equals(title2)) {
    //Sysytem.out.println
    WebUI.comment('Title Matched')
} else {
    not_run: WebUI.executeJavaScript('alert(\'Page Title not matched)', null)

    WebUI.click(findTestObject('TestListener/Registerlink'), FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('TestListener/Username'), 'Rameshbabugvs')

    WebUI.setText(findTestObject('TestListener/Password'), 'Ramesh123$')

    WebUI.click(findTestObject('TestListener/Login1'))
}

