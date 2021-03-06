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

WebUI.click(findTestObject('Object Repository/360_Appraisal/Evaluate_To_Other_Emp/Page_ReviewMe/Page_ReviewMe/input_Sign in to ReviewMe_username'))

WebUI.setText(findTestObject('Object Repository/360_Appraisal/Evaluate_To_Other_Emp/Page_ReviewMe/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'hwyan')

WebUI.setEncryptedText(findTestObject('Object Repository/360_Appraisal/Evaluate_To_Other_Emp/Page_ReviewMe/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'rXz5fG76N1x/0XfTppooEQ==')

WebUI.click(findTestObject('Object Repository/360_Appraisal/Evaluate_To_Other_Emp/Page_ReviewMe/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/360_Appraisal/Evaluate_To_Other_Emp/Page_ReviewMe/Page_ReviewMe/div_360 Review for QCST (2020)'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/Evaluate_To_Other_Emp/Page_ReviewMe/Page_ReviewMe/a_Evaluate'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/Evaluate_To_Other_Emp/Page_ReviewMe/Page_ReviewMe/input_Can communicate clearly in both verba_3f17c2'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/Evaluate_To_Other_Emp/Page_ReviewMe/Page_ReviewMe/input_Understand the importance of quality _3a5e0b'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/Evaluate_To_Other_Emp/Page_ReviewMe/Page_ReviewMe/input_Take accountability seriously and put_8ade17'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/Evaluate_To_Other_Emp/Page_ReviewMe/Page_ReviewMe/input_Once promise can complete and deliver_8e31bc'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/Evaluate_To_Other_Emp/Page_ReviewMe/Page_ReviewMe/input_Good in time management and can sched_bdac60'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/Evaluate_To_Other_Emp/Page_ReviewMe/Page_ReviewMe/input_Good in time management and can sched_fd8762'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/Evaluate_To_Other_Emp/Page_ReviewMe/Page_ReviewMe/button_Yes save Answers'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/Evaluate_To_Other_Emp/Page_ReviewMe/Page_ReviewMe/button_OK'))

