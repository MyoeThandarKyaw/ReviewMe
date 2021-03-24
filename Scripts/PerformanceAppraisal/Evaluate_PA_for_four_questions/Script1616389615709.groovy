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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.openBrowser('')

WebUI.navigateToUrl('http://review-me.ahtaroo.com:7070/gbs-test/users/login')

WebUI.setText(findTestObject('Object Repository/Performance_Appraisal/PA_Evaluation_with_four_questions/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'zinzulythin')

//WebUI.setEncryptedText(findTestObject('Object Repository/Performance_Appraisal/PA_Evaluation_with_four_questions/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
//    'a43CdjUP15hkxLgrareRvw==')
WebUI.setText(findTestObject('Object Repository/Performance_Appraisal/PA_Evaluation_with_four_questions/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    '1qaz2wsx')

WebUI.click(findTestObject('Object Repository/Performance_Appraisal/PA_Evaluation_with_four_questions/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Performance_Appraisal/PA_Evaluation_with_four_questions/Page_ReviewMe/button_22 Mar 202122 Mar 2022'))

WebUI.click(findTestObject('Object Repository/Performance_Appraisal/PA_Evaluation_with_four_questions/Page_ReviewMe/a_Start'))

WebUI.click(findTestObject('FourQuestions/Evaluate_by_RO/Staff_Evaluation_Object/input_See definitions_q_202'))

WebUI.setText(findTestObject('FourQuestions/Evaluate_by_RO/Staff_Evaluation_Object/textarea_Justify if you rate yourself._revieweeComment202'), 
    'Try the best to get target for year end (VSK Branch)')

WebUI.click(findTestObject('FourQuestions/Evaluate_by_RO/Staff_Evaluation_Object/input__q_203'))

WebUI.setText(findTestObject('FourQuestions/Evaluate_by_RO/Staff_Evaluation_Object/textarea_. and above_revieweeComment203'), 
    'Try the best to get target for year end (VSK Branch)')

WebUI.click(findTestObject('FourQuestions/Evaluate_by_RO/Staff_Evaluation_Object/input_See definitions_q_204'))

WebUI.setText(findTestObject('FourQuestions/Evaluate_by_RO/Staff_Evaluation_Object/textarea_Justify if you rate yourself._revieweeComment204'), 
    'Try the best to get target for year end (VSK Branch)')

WebUI.click(findTestObject('FourQuestions/Evaluate_by_RO/Staff_Evaluation_Object/input_See definitions_q_206'))

WebUI.setText(findTestObject('FourQuestions/Evaluate_by_RO/Staff_Evaluation_Object/textarea_Justify if you rate yourself._revieweeComment206'), 
    'Try the best to get target for year end (VSK Branch)')

WebUI.click(findTestObject('FourQuestions/Evaluate_by_RO/Evaluation_Obj_VSK/Evaluation_Obj_for_VSK/iframe_Press ALT 0 for help_cke_wysiwyg_frame cke_reset'))

WebUI.setText(findTestObject('FourQuestions/Evaluate_by_RO/Evaluation_Obj_VSK/Evaluation_Obj_for_VSK/html_Rich Text Editor'), 
    'Descibe report exactly')

WebUI.delay(1)

WebUI.click(findTestObject('Performance_Appraisal/Create_PA_choose_question/Create_PA_choose_question/Evaluate_PA_with_Four_Questions/input_Clear_btnConfirm'))

WebUI.click(findTestObject('FourQuestions/Evaluate_by_RO/Page_ReviewMe/Page_ReviewMe/Page_ReviewMe/button_Yes, go ahead'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Performance_Appraisal/PA_Evaluation_with_four_questions/Page_ReviewMe/button_OK'))

