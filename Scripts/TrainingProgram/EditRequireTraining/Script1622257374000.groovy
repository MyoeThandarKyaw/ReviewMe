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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://review-me.ahtaroo.com:7070/gbs-test/users/login')

WebUI.click(findTestObject('Object Repository/TrainingProgram/EditRequireTraining/Page_ReviewMe/input_Sign in to ReviewMe_username'))

WebUI.setText(findTestObject('Object Repository/TrainingProgram/EditRequireTraining/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'tinnilar')

WebUI.setEncryptedText(findTestObject('Object Repository/TrainingProgram/EditRequireTraining/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'a43CdjUP15hkxLgrareRvw==')

WebUI.click(findTestObject('Object Repository/TrainingProgram/EditRequireTraining/Page_ReviewMe/button_Sign in'))

WebUI.click(findTestObject('Object Repository/TrainingProgram/EditRequireTraining/Page_ReviewMe/a_My direct reports'))

WebUI.click(findTestObject('Object Repository/TrainingProgram/EditRequireTraining/Page_ReviewMe/a_Training info'))

WebUI.switchToWindowTitle('ReviewMe')

WebUI.click(findTestObject('Object Repository/TrainingProgram/EditRequireTraining/Page_ReviewMe/a_Edit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TrainingProgram/EditRequireTraining/Page_ReviewMe/select_SelectSales  MarketingAccountingTest_5dd17c'), 
    '11', true)

WebUI.setText(findTestObject('Object Repository/TrainingProgram/EditRequireTraining/Page_ReviewMe/input_Title_title'), 'Business Strategy ')

WebUI.setText(findTestObject('Object Repository/TrainingProgram/EditRequireTraining/Page_ReviewMe/input_Estimated hours_estimated_hours'), 
    '20')

WebUI.click(findTestObject('Object Repository/TrainingProgram/EditRequireTraining/Page_ReviewMe/button_Save'))

