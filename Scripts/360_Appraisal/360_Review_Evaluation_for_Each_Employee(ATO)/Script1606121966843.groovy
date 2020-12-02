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

WebUI.setText(findTestObject('Object Repository/360_Appraisal/360_Review_Evaluation_for_Each_Employee/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'hmkwin')

WebUI.setEncryptedText(findTestObject('Object Repository/360_Appraisal/360_Review_Evaluation_for_Each_Employee/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'rXz5fG76N1x/0XfTppooEQ==')

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Review_Evaluation_for_Each_Employee/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Review_Evaluation_for_Each_Employee/Page_ReviewMe/div_360 Review for all employees'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Review_Evaluation_for_Each_Employee/Page_ReviewMe/a_Evaluate'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Review_Evaluation_for_Each_Employee/Page_ReviewMe/input_concat(Appreciate and value one  s te_d12604'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Review_Evaluation_for_Each_Employee/Page_ReviewMe/input_concat(Appreciate and value one  s te_2ed043'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Review_Evaluation_for_Each_Employee/Page_ReviewMe/input_Sharing information and knowledge to _d11462'))

WebUI.setText(findTestObject('Object Repository/360_Appraisal/360_Review_Evaluation_for_Each_Employee/Page_ReviewMe/textarea_What is your hobby_q_169'), 
    '\nMy hobby is reading.')

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Review_Evaluation_for_Each_Employee/Page_ReviewMe/input_PoorBadFairGoodExcellent_q_177'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Review_Evaluation_for_Each_Employee/Page_ReviewMe/input_PoorBadFairGoodExcellent_btnSave'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Review_Evaluation_for_Each_Employee/Page_ReviewMe/button_Yes save Answers'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Review_Evaluation_for_Each_Employee/Page_ReviewMe/button_OK'))

