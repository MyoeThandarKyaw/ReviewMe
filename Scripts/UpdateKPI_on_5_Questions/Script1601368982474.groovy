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

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/UpdateKPI_on_5_Questions/Page_ReviewMe/input_Reviewme Login_username'), 
    'tnhtun')

WebUI.setEncryptedText(findTestObject('Object Repository/CreateKPIEvent/UpdateKPI_on_5_Questions/Page_ReviewMe/input_Reviewme Login_password'), 
    'a43CdjUP15hkxLgrareRvw==')

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/UpdateKPI_on_5_Questions/Page_ReviewMe/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/UpdateKPI_on_5_Questions/Page_ReviewMe/a_2'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/UpdateKPI_on_5_Questions/Page_ReviewMe/a_KPI event for OCT with 5 Question'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/UpdateKPI_on_5_Questions/Page_ReviewMe/a_Update KPIs'))

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/UpdateKPI_on_5_Questions/Page_ReviewMe/input_To increase sales revenue ()_questionweight'), 
    '20')

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/UpdateKPI_on_5_Questions/Page_ReviewMe/tr_1                                       _784152'))

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/UpdateKPI_on_5_Questions/Page_ReviewMe/input_To increase sales revenue ()_q_245_target'), 
    '18')

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/UpdateKPI_on_5_Questions/Page_ReviewMe/tr_2                                       _9da8e3'))

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/UpdateKPI_on_5_Questions/Page_ReviewMe/input_Why is Brand Awareness Important_ques_fe1e61'), 
    '20')

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/UpdateKPI_on_5_Questions/Page_ReviewMe/tr_2                                       _9da8e3'))

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/UpdateKPI_on_5_Questions/Page_ReviewMe/input_Why is Brand Awareness Important_q_25_90e7c7'), 
    '18')

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/UpdateKPI_on_5_Questions/Page_ReviewMe/td'))

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/UpdateKPI_on_5_Questions/Page_ReviewMe/input_What is Brand Awareness_questionweight'), 
    '20')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/UpdateKPI_on_5_Questions/Page_ReviewMe/input_What is Brand Awareness_q_252_target'), 
    '18')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/UpdateKPI_on_5_Questions/Page_ReviewMe/input_How Does Digital Marketing Increase B_69a824'), 
    '20')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/UpdateKPI_on_5_Questions/Page_ReviewMe/input_How Does Digital Marketing Increase B_57eedf'), 
    '18')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/UpdateKPI_on_5_Questions/Page_ReviewMe/input_What Is Business  Management_questionweight'), 
    '20')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/UpdateKPI_on_5_Questions/Page_ReviewMe/input_What Is Business  Management_q_253_target'), 
    '18')

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/UpdateKPI_on_5_Questions/Page_ReviewMe/input_Total question weight ()_btnSave'))

WebUI.acceptAlert()

