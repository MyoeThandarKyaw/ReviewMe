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

WebUI.navigateToUrl('http://review-me.ahtaroo.com:7070/gbs-test/review/addkpiappraisal')

WebUI.setText(findTestObject('Object Repository/RegisterKPI/KPI_Setting_with_multiple_RO/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/RegisterKPI/KPI_Setting_with_multiple_RO/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'rXz5fG76N1x/0XfTppooEQ==')

WebUI.click(findTestObject('Object Repository/RegisterKPI/KPI_Setting_with_multiple_RO/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('RegisterKPI/KPI_Setting_with_multiple_RO/Page_ReviewMe/Page_ReviewMe/a_Events'))

WebUI.click(findTestObject('Object Repository/RegisterKPI/KPI_Setting_with_multiple_RO/Page_ReviewMe/a_Add event'))

WebUI.click(findTestObject('Object Repository/RegisterKPI/KPI_Setting_with_multiple_RO/Page_ReviewMe/input_Title_title'))

WebUI.setText(findTestObject('Object Repository/RegisterKPI/KPI_Setting_with_multiple_RO/Page_ReviewMe/input_51'), 'KPI setup with multiple RO for Kubota Mone Ya  Branch Microfinance')

WebUI.setText(findTestObject('Object Repository/RegisterKPI/KPI_Setting_with_multiple_RO/Page_ReviewMe/textarea_Optional_description'), 
    'KPI setup with multiple RO for Kubota Mone Ya  Branch Microfinance')

//WebUI.setText(findTestObject('Object Repository/RegisterKPI/KPI_Setting_with_multiple_RO/Page_ReviewMe/input_No. of iterations_frequency'), 
//    '2')
//
WebUI.setText(findTestObject('Object Repository/RegisterKPI/KPI_Setting_with_multiple_RO/Page_ReviewMe/input_Iteration 1 label_iterationNames'), 
    'Test-1')

WebUI.click(findTestObject('Object Repository/RegisterKPI/KPI_Setting_with_multiple_RO/Page_ReviewMe/button_Next'))

WebUI.setText(findTestObject('Object Repository/RegisterKPI/KPI_Setting_with_multiple_RO/Page_ReviewMe/input_Name_form-control'), 
    'Micro')

WebUI.click(findTestObject('Object Repository/RegisterKPI/KPI_Setting_with_multiple_RO/Page_ReviewMe/input_All_selectAll'))

WebUI.click(findTestObject('Object Repository/RegisterKPI/KPI_Setting_with_multiple_RO/Page_ReviewMe/button_Next_1'))

WebUI.click(findTestObject('Object Repository/RegisterKPI/KPI_Setting_with_multiple_RO/Page_ReviewMe/button_Save'))

