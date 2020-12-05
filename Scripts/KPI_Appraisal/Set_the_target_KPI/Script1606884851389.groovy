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

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'Zwe Ko Phyo')

WebUI.setEncryptedText(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'rXz5fG76N1x/0XfTppooEQ==')

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/a_Home'))

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/a_Set KPIs'))

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/input_Actions_questions0questionname'), 
    'What were your starting and final levels of compensation?')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/input_Actions_questions0target'), 
    '20')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/input_Actions_questions1questionname'), 
    'When you come across any bad news then how will you put it in front of your team?')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/input_Actions_questions1target'), 
    '20')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/input_Actions_questions2questionname'), 
    'How would you go about getting cohesion among a team who disagree?')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/input_Actions_questions2target'), 
    '20')

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/input_Actions_questions3questionname'))

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/input_Actions_questions3questionname'), 
    'How do you set an example to those for your team members?')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/input_Actions_questions3target'), 
    '20')

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/input_Add KPI_btnConfirm'))

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/button_Yes go ahead'))

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Set_the_target_KPI/Page_ReviewMe/button_OK'))

