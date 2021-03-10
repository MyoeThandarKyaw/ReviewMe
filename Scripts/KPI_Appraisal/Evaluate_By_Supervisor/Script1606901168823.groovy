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

WebUI.navigateToUrl('http://review-me.ahtaroo.com:7070/gbs-test/annualreviewemployeequestion/addkpisetting/18/3282/tab_me')

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Evaluate_By_Supervisor/Page_ReviewMe/input_Sign in to ReviewMe_username'))

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Evaluate_By_Supervisor/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'sumyathtet')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Evaluate_By_Supervisor/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    '1qaz2wsx')

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Evaluate_By_Supervisor/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('KPI_Appraisal/Evaluate_By_Supervisor/Page_ReviewMe/Page_ReviewMe/a_My tasks'))

WebUI.click(findTestObject('KPI_Appraisal/Evaluate_By_Supervisor/Page_ReviewMe/Page_ReviewMe/button_26 Feb 202126 Feb 2022'))

WebUI.click(findTestObject('KPI_Appraisal/Evaluate_By_Supervisor/a_Start'))

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Evaluate_By_Supervisor/Page_ReviewMe/textarea_497'), 'I appreciate your try hard.')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Evaluate_By_Supervisor/Page_ReviewMe/textarea_497_1'), 'I appreciate your try hard.')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Evaluate_By_Supervisor/Page_ReviewMe/textarea_497_1_2'), 'I appreciate your try hard.')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Evaluate_By_Supervisor/Page_ReviewMe/textarea_497_1_2_3'), 
    'I appreciate your try hard.')

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Evaluate_By_Supervisor/Page_ReviewMe/input_Elements path_btnSubmit'))

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Evaluate_By_Supervisor/Page_ReviewMe/button_Yes go ahead'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Evaluate_By_Supervisor/Page_ReviewMe/button_OK'))

