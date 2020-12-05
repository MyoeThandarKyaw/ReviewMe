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

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Evaluate_By_Sub_Ordinate/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'Zwe Ko Phyo')

WebUI.setEncryptedText(findTestObject('Object Repository/KPI_Appraisal/Evaluate_By_Sub_Ordinate/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'rXz5fG76N1x/0XfTppooEQ==')

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Evaluate_By_Sub_Ordinate/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Evaluate_By_Sub_Ordinate/Page_ReviewMe/a_Home'))

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Evaluate_By_Sub_Ordinate/Page_ReviewMe/a_Evaluate'))

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Evaluate_By_Sub_Ordinate/Page_ReviewMe/input_Achievement_q_776'), 
    '18')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Evaluate_By_Sub_Ordinate/Page_ReviewMe/textarea_466'), ' I try to do my job to the best of my ability. Try the best to get target.')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Evaluate_By_Sub_Ordinate/Page_ReviewMe/input_Achievement_q_761'), 
    '18')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Evaluate_By_Sub_Ordinate/Page_ReviewMe/textarea_466_1'), ' I try to do my job to the best of my ability.Try the best to get target.')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Evaluate_By_Sub_Ordinate/Page_ReviewMe/input_Achievement_q_762'), 
    '18')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Evaluate_By_Sub_Ordinate/Page_ReviewMe/textarea_466_1_2'), 
    ' I try to do my job to the best of my ability.Try the best to get target.')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Evaluate_By_Sub_Ordinate/Page_ReviewMe/input_Achievement_q_763'), 
    '18')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Evaluate_By_Sub_Ordinate/Page_ReviewMe/textarea_466_1_2_3'), 
    ' I try to do my job to the best of my ability. Try the best to get target.')

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Evaluate_By_Sub_Ordinate/Page_ReviewMe/input_Grate go ahead_btnConfirm'))

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Evaluate_By_Sub_Ordinate/Page_ReviewMe/button_Yes go ahead'))

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Evaluate_By_Sub_Ordinate/Page_ReviewMe/button_OK'))

