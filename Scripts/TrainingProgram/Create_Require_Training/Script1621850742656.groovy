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

WebUI.setText(findTestObject('Object Repository/TrainingProgram/Create_Require_Training/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'waiwaihlaing')

WebUI.setEncryptedText(findTestObject('Object Repository/TrainingProgram/Create_Require_Training/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'a43CdjUP15hkxLgrareRvw==')

WebUI.click(findTestObject('Object Repository/TrainingProgram/Create_Require_Training/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/TrainingProgram/Create_Require_Training/Page_ReviewMe/a_My direct reports'))

WebUI.click(findTestObject('TrainingProgram/Create_Require_Training/NextPageObj/a_Training info (1)'))

WebUI.click(findTestObject('Object Repository/TrainingProgram/Create_Require_Training/Page_ReviewMe/a_Training info'))

WebUI.switchToWindowTitle('ReviewMe')

WebUI.navigateToUrl('http://review-me.ahtaroo.com:7070/gbs-test/employee/employeeprofile/3253/tab_training')

WebUI.click(findTestObject('Object Repository/TrainingProgram/Create_Require_Training/Page_ReviewMe/span_Select_select2-selection__arrow'))

WebUI.rightClick(findTestObject('Object Repository/TrainingProgram/Create_Require_Training/Page_ReviewMe/li_Test area (correction)'))

//WebUI.click(findTestObject('Object Repository/TrainingProgram/Create_Require_Training/Page_ReviewMe/td'))
WebUI.click(findTestObject('Object Repository/TrainingProgram/Create_Require_Training/Page_ReviewMe/b'))

WebUI.rightClick(findTestObject('Object Repository/TrainingProgram/Create_Require_Training/Page_ReviewMe/li_30 ways to become a billionaire'))

//WebUI.click(findTestObject('Object Repository/TrainingProgram/Create_Require_Training/Page_ReviewMe/td'))
WebUI.setText(findTestObject('TrainingProgram/Create_Require_Training/Training_Date/input_Details_start_by'), '05/24/2021')

WebUI.setText(findTestObject('TrainingProgram/Create_Require_Training/Training_Date/input_Details_due_date'), '05/29/2021')

WebUI.click(findTestObject('Object Repository/TrainingProgram/Create_Require_Training/Page_ReviewMe/button_Save'))

