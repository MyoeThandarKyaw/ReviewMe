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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://review-me.ahtaroo.com:7070/gbs-test/users/login')

WebUI.setText(findTestObject('Object Repository/PA/PA_Evaluation_by_RO/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'memekyaw')

WebUI.setEncryptedText(findTestObject('Object Repository/PA/PA_Evaluation_by_RO/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'a43CdjUP15hkxLgrareRvw==')

WebUI.click(findTestObject('Object Repository/PA/PA_Evaluation_by_RO/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/PA/PA_Evaluation_by_RO/Page_ReviewMe/button_10 Mar 202110 Mar 2022'))

WebUI.click(findTestObject('Object Repository/PA/PA_Evaluation_by_RO/Page_ReviewMe/a_Start'))

WebUI.click(findTestObject('PA/PA_Commentsby_CO/Page_ReviewMe/Page_ReviewMe/iframe_Press ALT 0 for help_cke_wysiwyg_frame cke_reset'))

WebUI.setText(findTestObject('PA/PA_Commentsby_CO/Page_ReviewMe/Page_ReviewMe/html_Rich Text Editor'), 'Grate! go ahead')

WebUI.click(findTestObject('PA/PA_Commentsby_CO/Page_ReviewMe/Page_ReviewMe/input_agree_counterSigningOfficerOptions'))

WebUI.click(findTestObject('PA/PA_Commentsby_CO/Page_ReviewMe/Page_ReviewMe/Page_ReviewMe/iframe_Press ALT 0 for help_cke_wysiwyg_frame cke_reset'))

WebUI.setText(findTestObject('PA/PA_Commentsby_CO/Page_ReviewMe/Page_ReviewMe/Page_ReviewMe/html_Rich Text Editor'), 'Recommend to increase salary')

WebUI.click(findTestObject('PA/PA_Commentsby_CO/Page_ReviewMe/Page_ReviewMe/input_Clear_btnConfirm'))

WebUI.delay(1)

WebUI.click(findTestObject('PA/PA_Commentsby_CO/Page_ReviewMe/Page_ReviewMe/Page_ReviewMe/Page_ReviewMe/button_Yes, go ahead'))

WebUI.delay(1)

WebUI.click(findTestObject('PA/PA_Commentsby_CO/Page_ReviewMe/Page_ReviewMe/Page_ReviewMe/Page_ReviewMe/button_OK'))

