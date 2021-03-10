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

WebUI.navigateToUrl('http://review-me.ahtaroo.com:7070/gbs-test/home/myTasks/tab_pending/2021-02-26/2022-02-26')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Confirmed_KPI_By_Supervisor/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'sumyathtet')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Confirmed_KPI_By_Supervisor/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    '1qaz2wsx')

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Confirmed_KPI_By_Supervisor/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('KPI_Appraisal/Confirmed_KPI_By_Supervisor/Page_ReviewMe - Copy/a_My tasks'))

WebUI.click(findTestObject('KPI_Appraisal/Confirmed_KPI_By_Supervisor/Page_ReviewMe - Copy/button_26 Feb 202126 Feb 2022'))

WebUI.delay(2)

WebUI.click(findTestObject('KPI_Appraisal/Confirmed_KPI_By_Supervisor/Page_ReviewMe - Copy/a_Start - Copy'))

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Confirmed_KPI_By_Supervisor/Page_ReviewMe/input_Add KPI_btnConfirm'))

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Confirmed_KPI_By_Supervisor/Page_ReviewMe/button_Yes go ahead'))

WebUI.delay(3)

WebUI.click(findTestObject('KPI_Appraisal/Confirmed_KPI_By_Supervisor/Page_ReviewMe - Copy/Page_ReviewMe/button_OK'))

