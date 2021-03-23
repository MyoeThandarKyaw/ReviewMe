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

WebUI.setText(findTestObject('Object Repository/FourQuestions/Evaluate_by_RO/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'sumyathtet')

WebUI.setEncryptedText(findTestObject('Object Repository/FourQuestions/Evaluate_by_RO/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'a43CdjUP15hkxLgrareRvw==')

WebUI.click(findTestObject('Object Repository/FourQuestions/Evaluate_by_RO/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/FourQuestions/Evaluate_by_RO/Page_ReviewMe/button_23 Mar 202123 Mar 2022'))

WebUI.click(findTestObject('Object Repository/FourQuestions/Evaluate_by_RO/Page_ReviewMe/a_Start'))

WebUI.click(findTestObject('Object Repository/FourQuestions/Evaluate_by_RO/Page_ReviewMe/input_See definitions_q_169'))

WebUI.setText(findTestObject('Object Repository/FourQuestions/Evaluate_by_RO/Page_ReviewMe/textarea_Try the best to get target_reviewe_805b0a'), 
    'Try the best to get result')

WebUI.click(findTestObject('Object Repository/FourQuestions/Evaluate_by_RO/Page_ReviewMe/input_See definitions_q_142'))

WebUI.setText(findTestObject('Object Repository/FourQuestions/Evaluate_by_RO/Page_ReviewMe/textarea_Try the best to get target_reviewe_c9dacc'), 
    'Try the best to get result')

WebUI.click(findTestObject('Object Repository/FourQuestions/Evaluate_by_RO/Page_ReviewMe/input_See definitions_q_141'))

WebUI.setText(findTestObject('Object Repository/FourQuestions/Evaluate_by_RO/Page_ReviewMe/textarea_Try the best to get target_reviewe_9b3d22'), 
    'Try the best to get result')

WebUI.click(findTestObject('Object Repository/FourQuestions/Evaluate_by_RO/Page_ReviewMe/input_See definitions_q_140'))

WebUI.setText(findTestObject('Object Repository/FourQuestions/Evaluate_by_RO/Page_ReviewMe/textarea_Try the best to get target_reviewe_2c7733'), 
    'Try the best to get result')

WebUI.click(findTestObject('Object Repository/FourQuestions/Evaluate_by_RO/Page_ReviewMe/input_Clear_btnSave'))

WebUI.click(findTestObject('Object Repository/FourQuestions/Evaluate_by_RO/Page_ReviewMe/button_OK'))

