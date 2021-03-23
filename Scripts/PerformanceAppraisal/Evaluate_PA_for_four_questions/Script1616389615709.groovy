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
    'zayyarnaingL1')

//WebUI.setEncryptedText(findTestObject('Object Repository/Performance_Appraisal/PA_Evaluation_with_four_questions/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
//    'a43CdjUP15hkxLgrareRvw==')
WebUI.setText(findTestObject('Object Repository/Performance_Appraisal/PA_Evaluation_with_four_questions/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    '1qaz2wsx')

WebUI.click(findTestObject('Object Repository/Performance_Appraisal/PA_Evaluation_with_four_questions/Page_ReviewMe/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Performance_Appraisal/PA_Evaluation_with_four_questions/Page_ReviewMe/button_22 Mar 202122 Mar 2022'))

WebUI.click(findTestObject('Object Repository/Performance_Appraisal/PA_Evaluation_with_four_questions/Page_ReviewMe/a_Start'))

WebUI.click(findTestObject('Object Repository/Performance_Appraisal/PA_Evaluation_with_four_questions/Page_ReviewMe/input_See definitions_q_169'))

WebUI.setText(findTestObject('Object Repository/Performance_Appraisal/PA_Evaluation_with_four_questions/Page_ReviewMe/textarea_Justify if you rate yourself._revi_27ff13'), 
    'Try the best to get target')

WebUI.click(findTestObject('Object Repository/Performance_Appraisal/PA_Evaluation_with_four_questions/Page_ReviewMe/input_See definitions_q_142'))

WebUI.setText(findTestObject('Object Repository/Performance_Appraisal/PA_Evaluation_with_four_questions/Page_ReviewMe/textarea_Justify if you rate yourself._revi_02f7a2'), 
    'Try the best to get target')

WebUI.click(findTestObject('Object Repository/Performance_Appraisal/PA_Evaluation_with_four_questions/Page_ReviewMe/label_5'))

WebUI.setText(findTestObject('Object Repository/Performance_Appraisal/PA_Evaluation_with_four_questions/Page_ReviewMe/textarea_Justify if you rate yourself._revi_68fcf1'), 
    'Try the best to get target')

WebUI.click(findTestObject('Performance_Appraisal/Performance_Appraisal_Object/Page_ReviewMe/Page_ReviewMe/input_See definitions_q_140'))

WebUI.setText(findTestObject('Object Repository/Performance_Appraisal/PA_Evaluation_with_four_questions/Page_ReviewMe/textarea_Justify if you rate yourself._revi_4a9074'), 
    'Try the best to get target')

WebUI.click(findTestObject('Performance_Appraisal/Performance_Appraisal_Object/Page_ReviewMe/iframe_Press ALT 0 for help_cke_wysiwyg_frame cke_reset'))

WebUI.setText(findTestObject('Performance_Appraisal/Performance_Appraisal_Object/Page_ReviewMe/html_Rich Text Editor'), 
    'Prepare weekly and monthly plan')

WebUI.delay(1)

WebUI.click(findTestObject('Performance_Appraisal/Performance_Appraisal_Object/Page_ReviewMe/input_Clear_btnConfirm'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Performance_Appraisal/PA_Evaluation_with_four_questions/Page_ReviewMe/button_OK'))

