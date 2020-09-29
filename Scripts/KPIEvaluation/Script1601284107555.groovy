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

WebUI.navigateToUrl('http://18.139.119.226:7070/reviewme/users/login')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/KPIEvaluation/Page_ReviewMe/input_Reviewme Login_username'), 
    'tnhtun')

WebUI.setEncryptedText(findTestObject('Object Repository/CreateKPIEvent/KPIEvaluation/Page_ReviewMe/input_Reviewme Login_password'), 
    'a43CdjUP15hkxLgrareRvw==')

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/KPIEvaluation/Page_ReviewMe/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/KPIEvaluation/Page_ReviewMe/a_4'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/KPIEvaluation/Page_ReviewMe/a_-KPI event for OCT'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/KPIEvaluation/Page_ReviewMe/a_Evaluate'))

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/KPIEvaluation/Page_ReviewMe/input_Achievement_q_251'), '23')

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/KPIEvaluation/Page_ReviewMe/b_Why is Brand Awareness Important'))

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/KPIEvaluation/Page_ReviewMe/textarea_Comment_t_251'), 'Awareness Important')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/KPIEvaluation/Page_ReviewMe/input_Achievement_q_252'), '23')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/KPIEvaluation/Page_ReviewMe/textarea_Comment_t_252'), 'Brand Awareness')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/KPIEvaluation/Page_ReviewMe/input_Achievement_q_250'), '23')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/KPIEvaluation/Page_ReviewMe/textarea_Comment_t_250'), 'Digital Marketing')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/KPIEvaluation/Page_ReviewMe/input_Achievement_q_254'), '23')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/KPIEvaluation/Page_ReviewMe/textarea_Comment_t_254'), 'career goal')

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/KPIEvaluation/Page_ReviewMe/input_No data available_btnConfirm'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/KPIEvaluation/Page_ReviewMe/button_Yes submit Achievements'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/KPIEvaluation/Page_ReviewMe/button_OK'))

