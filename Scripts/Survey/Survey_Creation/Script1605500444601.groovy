import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.InternalData as InternalData

InternalData data = findTestData('Survey_Data')
for (def index : (0..data.getRowNumbers() - 1)) {
WebUI.openBrowser('')

WebUI.navigateToUrl('http://18.139.70.17:7070/reviewme-test-ato/users/login')

WebUI.setText(findTestObject('Object Repository/Survey/Survey_Creation/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    data.internallyGetValue('user_name', index))

WebUI.setText(findTestObject('Object Repository/Survey/Survey_Creation/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    data.internallyGetValue('password', index))

WebUI.click(findTestObject('Object Repository/Survey/Survey_Creation/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Survey/Survey_Creation/Page_ReviewMe/div_Leadership  management survey'))

WebUI.click(findTestObject('Object Repository/Survey/Survey_Creation/Page_ReviewMe/a_Evaluate'))

WebUI.click(findTestObject('Object Repository/Survey/Survey_Creation/Page_ReviewMe/input_Has good listening skill_q_154'))

WebUI.click(findTestObject('Object Repository/Survey/Survey_Creation/Page_ReviewMe/input_Understand work vs personal matters a_1caf04'))

WebUI.click(findTestObject('Object Repository/Survey/Survey_Creation/Page_ReviewMe/input_Has good teamwork skill and can work _7f87e0'))

WebUI.click(findTestObject('Object Repository/Survey/Survey_Creation/Page_ReviewMe/input_Know how to do productive discussion_q_157'))

WebUI.click(findTestObject('Object Repository/Survey/Survey_Creation/Page_ReviewMe/input_In arguments and conflicts about work_65de4b'))

WebUI.click(findTestObject('Object Repository/Survey/Survey_Creation/Page_ReviewMe/input_Has the ability to understand what ac_5adfd3'))

WebUI.click(findTestObject('Object Repository/Survey/Survey_Creation/Page_ReviewMe/input_Has the ability to understand what ac_8b0f84'))

WebUI.delay(3)
}



