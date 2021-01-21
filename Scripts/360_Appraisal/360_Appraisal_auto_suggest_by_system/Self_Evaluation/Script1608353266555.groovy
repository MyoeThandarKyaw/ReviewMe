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

WebUI.navigateToUrl('http://18.139.70.17:7070/reviewme-test-ato/users/login')

WebUI.setText(findTestObject('Object Repository/360_Appraisal/360_Appraisal_auto_suggest_by_system/Self_Evaluation/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'smaye')

WebUI.setEncryptedText(findTestObject('Object Repository/360_Appraisal/360_Appraisal_auto_suggest_by_system/Self_Evaluation/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'rXz5fG76N1x/0XfTppooEQ==')

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Appraisal_auto_suggest_by_system/Self_Evaluation/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Appraisal_auto_suggest_by_system/Self_Evaluation/Page_ReviewMe/div_-360 Appraisal for 2021'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Appraisal_auto_suggest_by_system/Self_Evaluation/Page_ReviewMe/a_Evaluate'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Appraisal_auto_suggest_by_system/Self_Evaluation/Page_ReviewMe/input_Fast learner and can learn new techno_542e71'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Appraisal_auto_suggest_by_system/Self_Evaluation/Page_ReviewMe/input_Has ability to motivate others to wor_d6c4af'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Appraisal_auto_suggest_by_system/Self_Evaluation/Page_ReviewMe/input_Seek knowledge and understanding all _72443d'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Appraisal_auto_suggest_by_system/Self_Evaluation/Page_ReviewMe/input_Give productive ideas for work and pr_859b5a'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Appraisal_auto_suggest_by_system/Self_Evaluation/Page_ReviewMe/input_Proactively gives constructive feedba_988e6c'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Appraisal_auto_suggest_by_system/Self_Evaluation/Page_ReviewMe/input_Proactively gives constructive feedba_a48872'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Appraisal_auto_suggest_by_system/Self_Evaluation/Page_ReviewMe/button_Yes, save Answers'))

WebUI.click(findTestObject('360_Appraisal/360_Appraisal_auto_suggest_by_system/Evaluation_for_other/Page_ReviewMe/Page_ReviewMe/Page_ReviewMe/button_OK'))

