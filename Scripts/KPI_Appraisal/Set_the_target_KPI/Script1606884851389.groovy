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

WebUI.navigateToUrl('http://review-me.ahtaroo.com:7070/gbs-test/review/addkpiappraisal')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'zayyarnaingL1')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    '1qaz2wsx')

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/Page_ReviewMe/a_My tasks'))

WebUI.click(findTestObject('KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/Page_ReviewMe/button_26 Feb 202126 Feb 2022'))

WebUI.click(findTestObject('KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/Page_ReviewMe/Page_ReviewMe/a_Start'))

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/input_Actions_questions0questionname'), 
    'What were your starting and final levels of compensation?')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/input_Actions_questions0target'), 
    '20')

WebUI.setText(findTestObject('KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/Page_ReviewMe/input_Actions_questions0unit'), 
    'marks')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/input_Actions_questions1questionname'), 
    'When you come across any bad news then how will you put it in front of your team?')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/input_Actions_questions1target'), 
    '20')

WebUI.setText(findTestObject('KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/Page_ReviewMe/input_Actions_questions1unit'), 
    'marks')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/input_Actions_questions2questionname'), 
    'How would you go about getting cohesion among a team who disagree?')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/input_Actions_questions2target'), 
    '20')

WebUI.setText(findTestObject('KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/Page_ReviewMe/input_Actions_questions2unit'), 
    'marks')

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/input_Actions_questions3questionname'))

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/input_Actions_questions3questionname'), 
    'How do you set an example to those for your team members?')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/input_Actions_questions3target'), 
    '20')

WebUI.setText(findTestObject('KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/Page_ReviewMe/input_Actions_questions3unit'), 
    'marks')

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/input_Add KPI_btnConfirm'))

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/button_Yes go ahead'))

WebUI.delay(2)

WebUI.click(findTestObject('KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/button_OK'))

