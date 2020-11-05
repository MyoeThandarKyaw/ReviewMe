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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://18.139.70.17:7070/reviewme/users/login')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEvent_Change_Supervisor/Page_ReviewMe/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'smaye')

WebUI.setEncryptedText(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEvent_Change_Supervisor/Page_ReviewMe/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'a43CdjUP15hkxLgrareRvw==')

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEvent_Change_Supervisor/Page_ReviewMe/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEvent_Change_Supervisor/Page_ReviewMe/Page_ReviewMe/a_Events'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEvent_Change_Supervisor/Page_ReviewMe/Page_ReviewMe/a_Add event'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEvent_Change_Supervisor/Page_ReviewMe/Page_ReviewMe/input_Title_title'))

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEvent_Change_Supervisor/Page_ReviewMe/Page_ReviewMe/input_37'), 
    'For HR development team')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEvent_Change_Supervisor/Page_ReviewMe/Page_ReviewMe/textarea_Optional_description'), 
    'For HR development team')

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEvent_Change_Supervisor/Page_ReviewMe/Page_ReviewMe/button_Next'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEvent_Change_Supervisor/Page_ReviewMe/Page_ReviewMe/a_Reporting officer_yui_3_6_0_1_1604462263117_346'))

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEvent_Change_Supervisor/Page_ReviewMe/Page_ReviewMe/input_Search_yui_3_6_0_1_1604399389274_370'), 
    'Lin')

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEvent_Change_Supervisor/Page_ReviewMe/Page_ReviewMe/td_Assistant Head'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEvent_Change_Supervisor/Page_ReviewMe/Page_ReviewMe/button_Select'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEvent_Change_Supervisor/Page_ReviewMe/Page_ReviewMe/button_Next_1'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEvent_Change_Supervisor/Page_ReviewMe/Page_ReviewMe/button_Save'))

