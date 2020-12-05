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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://18.139.70.17:7070/reviewme-test-ato/users/login')

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Page_ReviewMe/input_Sign in to ReviewMe_username'))

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Page_ReviewMe/input_Sign in to ReviewMe_username'), 'hmkwin')

WebUI.setEncryptedText(findTestObject('Object Repository/KPI_Appraisal/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'tR+yPLK5N5TO48zpsW01Kw==')

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Page_ReviewMe/div_Sign in to ReviewMe                    _b70b37'))

WebUI.setEncryptedText(findTestObject('Object Repository/KPI_Appraisal/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'rXz5fG76N1x/0XfTppooEQ==')

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Page_ReviewMe/button_Sign in'))

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Page_ReviewMe/a_Events'))

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Page_ReviewMe/a_Add event'))

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Page_ReviewMe/input_Title_title'))

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Page_ReviewMe/input_72'), ' KPI Appraisal for CPSS team')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Page_ReviewMe/textarea_Optional_description'), '\nKPI Appraisal for CPSS team')

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Page_ReviewMe/div_No of iterations'))

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Page_ReviewMe/input_No of iterations_frequency'), '3')

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Page_ReviewMe/button_Next'))

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Page_ReviewMe/a_Reporting officer_btn btn-secondary'))

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Page_ReviewMe/input'), 'Lae')

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Page_ReviewMe/td_Lae Wah Wint Maung Maung'))

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Page_ReviewMe/button_Select'))

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Page_ReviewMe/button_Next_1'))

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Page_ReviewMe/button_Save'))

