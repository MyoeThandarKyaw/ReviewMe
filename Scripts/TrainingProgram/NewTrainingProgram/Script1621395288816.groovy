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

WebUI.setText(findTestObject('Object Repository/TrainingProgram/TrainingProgram/Page_ReviewMe/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'waiwaihlaing')

WebUI.setEncryptedText(findTestObject('Object Repository/TrainingProgram/TrainingProgram/Page_ReviewMe/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'a43CdjUP15hkxLgrareRvw==')

WebUI.click(findTestObject('Object Repository/TrainingProgram/TrainingProgram/Page_ReviewMe/Page_ReviewMe/button_Sign in'))

WebUI.click(findTestObject('Object Repository/TrainingProgram/TrainingProgram/Page_ReviewMe/Page_ReviewMe/a_Training programs'))

WebUI.click(findTestObject('Object Repository/TrainingProgram/TrainingProgram/Page_ReviewMe/Page_ReviewMe/a_New program'))

WebUI.click(findTestObject('Object Repository/TrainingProgram/TrainingProgram/Page_ReviewMe/Page_ReviewMe/span_Select'))

WebUI.rightClick(findTestObject('Object Repository/TrainingProgram/TrainingProgram/Page_ReviewMe/Page_ReviewMe/li_Accounting'))

WebUI.setText(findTestObject('Object Repository/TrainingProgram/TrainingProgram/Page_ReviewMe/Page_ReviewMe/input_Program name_name'), 
    'Negotiation Mastery')

WebUI.setText(findTestObject('Object Repository/TrainingProgram/TrainingProgram/Page_ReviewMe/Page_ReviewMe/input_Estimated hours_estimated_hours'), 
    '9')

WebUI.click(findTestObject('TrainingProgram/TrainingProgram/Training_Area_Description/iframe_Press ALT 0 for help_cke_wysiwyg_frame cke_reset'))

WebUI.setText(findTestObject('TrainingProgram/TrainingProgram/Training_Area_Description/html_Rich Text Editor'), 'Negotiation Mastery equips you with the skills to close deals that might otherwise be deadlocked, maximize value in the agreements you reach, and resolve differences before they escalate into costly conflicts.')

WebUI.click(findTestObject('TrainingProgram/TrainingProgram/Objective_Iframe/iframe_Press ALT 0 for help_cke_wysiwyg_frame cke_reset'))

WebUI.setText(findTestObject('TrainingProgram/TrainingProgram/Objective_Iframe/html_Rich Text Editor'), 'Negotiation Mastery equips you with the skills to close deals that might otherwise be deadlocked, maximize value in the agreements you reach, and resolve differences before they escalate into costly conflicts.')

WebUI.click(findTestObject('TrainingProgram/TrainingProgram/Learning_outComes/iframe_Press ALT 0 for help_cke_wysiwyg_frame cke_reset'))

WebUI.setText(findTestObject('TrainingProgram/TrainingProgram/Learning_outComes/Learning_outcomes'), 'Negotiation Mastery equips you with the skills to close deals that might otherwise be deadlocked, maximize value in the agreements you reach, and resolve differences before they escalate into costly conflicts.')

WebUI.setText(findTestObject('Object Repository/TrainingProgram/TrainingProgram/Page_ReviewMe/Page_ReviewMe/textarea_Optional_equivalent_programs'), 
    'Negotiation Mastery equips you with the skills to close deals that might otherwise be deadlocked, maximize value in the agreements you reach, and resolve differences before they escalate into costly conflicts.')

WebUI.click(findTestObject('Object Repository/TrainingProgram/TrainingProgram/Page_ReviewMe/Page_ReviewMe/button_Save'))

