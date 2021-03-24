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
    'thwenandiaung')

WebUI.setEncryptedText(findTestObject('Object Repository/FourQuestions/Evaluate_by_RO/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'a43CdjUP15hkxLgrareRvw==')

WebUI.click(findTestObject('Object Repository/FourQuestions/Evaluate_by_RO/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/FourQuestions/Evaluate_by_RO/Page_ReviewMe/button_23 Mar 202123 Mar 2022'))

WebUI.click(findTestObject('Object Repository/FourQuestions/Evaluate_by_RO/Page_ReviewMe/a_Start'))

WebUI.click(findTestObject('FourQuestions/Evaluate_by_RO/RO_Evaluation_by_VSK/Page_ReviewMe/input_See definitions_q_202'))

WebUI.setText(findTestObject('FourQuestions/Evaluate_by_RO/RO_Evaluation_by_VSK/Page_ReviewMe/textarea_Try the best to get target for year end (VSK Branch)_reviewerComment202'), 
    'Very Nice!')

WebUI.click(findTestObject('FourQuestions/Evaluate_by_RO/RO_Evaluation_by_VSK/Page_ReviewMe/input__q_203'))

WebUI.setText(findTestObject('FourQuestions/Evaluate_by_RO/RO_Evaluation_by_VSK/Page_ReviewMe/textarea_Try the best to get target for year end (VSK Branch)_reviewerComment203'), 
    'Very Nice!')

WebUI.click(findTestObject('FourQuestions/Evaluate_by_RO/RO_Evaluation_by_VSK/Page_ReviewMe/input_See definitions_q_204'))

WebUI.setText(findTestObject('FourQuestions/Evaluate_by_RO/RO_Evaluation_by_VSK/Page_ReviewMe/textarea_Try the best to get target for year end (VSK Branch)_reviewerComment204'), 
    'Very Nice!')

WebUI.click(findTestObject('FourQuestions/Evaluate_by_RO/RO_Evaluation_by_VSK/Page_ReviewMe/input_See definitions_q_206'))

WebUI.setText(findTestObject('FourQuestions/Evaluate_by_RO/RO_Evaluation_by_VSK/Page_ReviewMe/textarea_Try the best to get target for year end (VSK Branch)_reviewerComment206'), 
    'Very Nice!')

WebUI.click(findTestObject('FourQuestions/Evaluate_by_RO/RO_Evaluation/input_Clear_btnConfirm'))

WebUI.click(findTestObject('FourQuestions/Evaluate_by_RO/RO_Evaluation_by_VSK/Page_ReviewMe/iframe_Press ALT 0 for help_cke_wysiwyg_frame cke_reset'))

WebUI.setText(findTestObject('FourQuestions/Evaluate_by_RO/RO_Evaluation_by_VSK/Page_ReviewMe/html_Rich Text Editor'), 'Prepare Weekly and Monthly plan')

WebUI.click(findTestObject('FourQuestions/Evaluate_by_RO/RO_Evaluation/RO_Comments_Box/Page_ReviewMe/input_Clear_btnConfirm'))

WebUI.delay(1)

WebUI.click(findTestObject('FourQuestions/Evaluate_by_RO/Page_ReviewMe/Page_ReviewMe/Page_ReviewMe/button_Yes, go ahead'))

WebUI.click(findTestObject('Object Repository/FourQuestions/Evaluate_by_RO/Page_ReviewMe/button_OK'))

