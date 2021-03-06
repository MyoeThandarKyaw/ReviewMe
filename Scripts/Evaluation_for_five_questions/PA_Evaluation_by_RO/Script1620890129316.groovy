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

WebUI.setText(findTestObject('Evaluation_for_five_questions/PA_Evaluation_by_RO/input_Sign in to ReviewMe_username'), 'memewin')

WebUI.setEncryptedText(findTestObject('Evaluation_for_five_questions/PA_Evaluation_by_RO/input_Sign in to ReviewMe_password'), 
    'a43CdjUP15hkxLgrareRvw==')

WebUI.click(findTestObject('Evaluation_for_five_questions/PA_Evaluation_by_RO/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('PA/Evaluate_Performance_Appraisal/Page_ReviewMe/button_10 Mar 202110 Mar 2022'))

WebUI.click(findTestObject('Evaluation_for_five_questions/PA_Evaluation_by_RO/a_Start'))

WebUI.click(findTestObject('Evaluation_for_five_questions/PA_Evaluation_by_RO/input_See definitions_q_222'))

WebUI.setText(findTestObject('Evaluation_for_five_questions/PA_Evaluation_by_RO/textarea_Please provide a reason for pickin_274b4e'), 
    'Try the best!')

WebUI.click(findTestObject('Evaluation_for_five_questions/PA_Evaluation_by_RO/input_See definitions_q_223'))

WebUI.setText(findTestObject('Evaluation_for_five_questions/PA_Evaluation_by_RO/textarea_Please provide a reason for pickin_42c44a'), 
    'Try the best!')

WebUI.click(findTestObject('Evaluation_for_five_questions/PA_Evaluation_by_RO/input_See definitions_q_224'))

WebUI.setText(findTestObject('Evaluation_for_five_questions/PA_Evaluation_by_RO/textarea_Please provide a reason for pickin_73b738'), 
    'Try the best!')

WebUI.click(findTestObject('Evaluation_for_five_questions/PA_Evaluation_by_RO/input_See definitions_q_225'))

WebUI.setText(findTestObject('Evaluation_for_five_questions/PA_Evaluation_by_RO/textarea_Please provide a reason for pickin_9d1927'), 
    'Try the best!')

WebUI.click(findTestObject('Evaluation_for_five_questions/PA_Evaluation_by_RO/input_See definitions_q_226'))

WebUI.setText(findTestObject('Evaluation_for_five_questions/PA_Evaluation_by_RO/textarea_Please provide a reason for pickin_f82110'), 
    'Try the best!')

WebUI.click(findTestObject('Performance_Appraisal/Evaluate_PA_template_question(5)/RO_Comment_Obj/iframe_Press ALT 0 for help_cke_wysiwyg_frame cke_reset'))

WebUI.setText(findTestObject('Performance_Appraisal/Evaluate_PA_template_question(5)/RO_Comment_Obj/html_Rich Text Editor'), 
    'Prepare weekly and monthly plan')

WebUI.click(findTestObject('Evaluation_for_five_questions/PA_Evaluation_by_employee/Confirm_Button_Obj/input_Clear_btnConfirm'))

WebUI.click(findTestObject('Evaluation_for_five_questions/PA_Evaluation_by_employee/Confirm_Button_Obj/button_Yes, go ahead'))

WebUI.delay(1)

WebUI.click(findTestObject('Evaluation_for_five_questions/PA_Evaluation_by_employee/Confirm_Button_Obj/button_OK'))

