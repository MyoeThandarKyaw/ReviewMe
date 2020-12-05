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

WebUI.navigateToUrl('http://18.139.70.17:7070/reviewme-test-ato/users/login')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Comment_By_CO/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'llhtun')

WebUI.setEncryptedText(findTestObject('Object Repository/KPI_Appraisal/Comment_By_CO/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'rXz5fG76N1x/0XfTppooEQ==')

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Comment_By_CO/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Comment_By_CO/Page_ReviewMe/a_Home'))

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Comment_By_CO/Page_ReviewMe/a_Indirect reports5'))

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Comment_By_CO/Page_ReviewMe/a_View'))

//WebUI.scrollToElement(findTestObject('Object Repository/KPI_Appraisal/Comment_By_CO/Page_ReviewMe/Page_ReviewMe/iframe_Press ALT 0 for help_cke_wysiwyg_frame cke_reset'), 
//    3)
WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Comment_By_CO/IFrameObject/Page_ReviewMe/iframe_Press ALT 0 for help_cke_wysiwyg_frame cke_reset'))

//WebUI.sendKeys(findTestObject('Object Repository/KPI_Appraisal/Comment_By_CO/Page_ReviewMe/Page_ReviewMe/html_Rich Text Editor'), 'Prepare')
WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Comment_By_CO/IFrameObject/Page_ReviewMe/html_Rich Text Editor'), 
    'Prepare Weekly and Monthly')

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Comment_By_CO/Page_ReviewMe/button_Save'))

WebUI.click(findTestObject('KPI_Appraisal/Comment_By_CO/Page_ReviewMe/a_Back'))

