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

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/Evaluation_Confirm_by_RO/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'waiwaihlaing')

WebUI.setEncryptedText(findTestObject('Object Repository/CreateKPIEvent/Evaluation_Confirm_by_RO/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'a43CdjUP15hkxLgrareRvw==')

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/Evaluation_Confirm_by_RO/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/Evaluation_Confirm_by_RO/Page_ReviewMe/a_Direct reports3'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/Evaluation_Confirm_by_RO/Page_ReviewMe/a_Review KPIs'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/Evaluation_Confirm_by_RO/Page_ReviewMe/input_Add KPI_btnConfirm'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/Evaluation_Confirm_by_RO/Page_ReviewMe/button_Yes go ahead'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/Evaluation_Confirm_by_RO/Page_ReviewMe/button_OK'))

