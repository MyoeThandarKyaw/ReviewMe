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

WebUI.setText(findTestObject('Object Repository/FourQuestions/Comment_By_CO/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'waiwaihlaing')

WebUI.setEncryptedText(findTestObject('Object Repository/FourQuestions/Comment_By_CO/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'a43CdjUP15hkxLgrareRvw==')

WebUI.click(findTestObject('Object Repository/FourQuestions/Comment_By_CO/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/FourQuestions/Comment_By_CO/Page_ReviewMe/button_24 Mar 202124 Mar 2022'))

WebUI.click(findTestObject('Object Repository/FourQuestions/Comment_By_CO/Page_ReviewMe/a_Start'))

//WebUI.click(findTestObject('FourQuestions/Comment_By_CO/CO_Comments/iframe_Press ALT 0 for help_cke_wysiwyg_frame cke_reset'))
//
//WebUI.setText(findTestObject('FourQuestions/Comment_By_CO/CO_Comments/html_Rich Text Editor'), 'Glad to hear that!')

WebUI.click(findTestObject('Object Repository/FourQuestions/Comment_By_CO/Page_ReviewMe/input_agree_counterSigningOfficerOptions'))

//WebUI.click(findTestObject('FourQuestions/Comment_By_CO/CO_recomendation/iframe_Press ALT 0 for help_cke_wysiwyg_frame cke_reset'))
//
//WebUI.setText(findTestObject('FourQuestions/Comment_By_CO/CO_recomendation/html_Rich Text Editor'), 'Recommend to increase salary')

WebUI.click(findTestObject('FourQuestions/Comment_By_CO/Button_Object/input_Clear_btnConfirm'))

WebUI.click(findTestObject('KPI_Evaluation_by_RO/Page_ReviewMe/button_Yes go ahead'))

WebUI.click(findTestObject('FourQuestions/Evaluate_And_Save_For_Last_Time/Page_ReviewMe/button_OK'))

