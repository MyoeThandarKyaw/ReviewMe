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

WebUI.navigateToUrl('http://18.139.70.17:7070/reviewme-gbs-test/home')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Set_the_New_Target_KPI/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'nannmithanthan')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Set_the_New_Target_KPI/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    '1qaz2wsx')

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Set_the_New_Target_KPI/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Set_the_New_Target_KPI/Page_ReviewMe/a_Home'))

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Set_the_New_Target_KPI/Page_ReviewMe/a_Update KPIs'))

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Set_the_New_Target_KPI/Page_ReviewMe/input_Actions_questions0questionname'))

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Set_the_New_Target_KPI/Page_ReviewMe/td'))

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Set_the_New_Target_KPI/Page_ReviewMe/input_Actions_questions0questionname'), 
    'How do you lead through change?')

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Set_the_New_Target_KPI/Page_ReviewMe/td_1'))

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Set_the_New_Target_KPI/Page_ReviewMe/input_Actions_questions0target'), 
    '15')

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Set_the_New_Target_KPI/Page_ReviewMe/input_Actions_questions1questionname'), 
    'What motivates you to be a leader?')

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Set_the_New_Target_KPI/Page_ReviewMe/tr_1                                       _061d4b'))

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Set_the_New_Target_KPI/Page_ReviewMe/input_Actions_questions1target'), 
    '15')

WebUI.doubleClick(findTestObject('Object Repository/KPI_Appraisal/Set_the_New_Target_KPI/Page_ReviewMe/input_Actions_questions2questionname'))

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Set_the_New_Target_KPI/Page_ReviewMe/input_Actions_questions2questionname'), 
    'What do you do when you are unsure about how to achieve the goals of the team?')

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Set_the_New_Target_KPI/Page_ReviewMe/td_1_2'))

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Set_the_New_Target_KPI/Page_ReviewMe/input_Actions_questions2target'), 
    '15')

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Set_the_New_Target_KPI/Page_ReviewMe/tr_1                                       _061d4b'))

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Set_the_New_Target_KPI/Page_ReviewMe/input_Actions_questions3questionname'), 
    'Explain your strengths and weakness as a leader?')

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Set_the_New_Target_KPI/Page_ReviewMe/tr_1                                       _061d4b'))

WebUI.setText(findTestObject('Object Repository/KPI_Appraisal/Set_the_New_Target_KPI/Page_ReviewMe/input_Actions_questions3target'), 
    '15')

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Set_the_New_Target_KPI/Page_ReviewMe/input_Add KPI_btnConfirm'))

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Set_the_New_Target_KPI/Page_ReviewMe/button_Yes go ahead'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/KPI_Appraisal/Set_the_New_Target_KPI/Page_ReviewMe/button_OK'))

