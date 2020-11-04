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

WebUI.click(findTestObject('CreateKPIEvent/CreateKPIEvent/Page_ReviewMe/input_Sign in to ReviewMe_username'))

WebUI.setText(findTestObject('CreateKPIEvent/CreateKPIEvent/Page_ReviewMe/input_Sign in to ReviewMe_username'), 'waiwaihlaing')

WebUI.setEncryptedText(findTestObject('CreateKPIEvent/CreateKPIEvent/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'a43CdjUP15hkxLgrareRvw==')

WebUI.click(findTestObject('CreateKPIEvent/CreateKPIEvent/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEvent/Page_ReviewMe/a_Events'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEvent/Page_ReviewMe/Page_ReviewMe/a_Add event'))

//WebUI.click(findTestObject('CreateKPIEvent/CreateKPIEvent/Page_ReviewMe/input_Title_title'))
WebUI.setText(findTestObject('CreateKPIEvent/CreateKPIEvent/Page_ReviewMe/input_Title_title'), 'KPI Event for DEV (Nov-2020 to Sep-2021)')

WebUI.setText(findTestObject('CreateKPIEvent/CreateKPIEvent/Page_ReviewMe/textarea_Optional_description'), 'KPI Event for DEV (Nov-2020 to Sep-2021)')

WebUI.click(findTestObject('CreateKPIEvent/CreateKPIEvent/Page_ReviewMe/button_Next'))

WebUI.click(findTestObject('CreateKPIEvent/CreateKPIEvent/Page_ReviewMe/button_Next_1'))

WebUI.click(findTestObject('CreateKPIEvent/CreateKPIEvent/Page_ReviewMe/button_Save'))

