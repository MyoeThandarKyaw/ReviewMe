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

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEventWith_5_Questions/Page_ReviewMe/input_Reviewme Login_username'), 
    'tnhtun')

WebUI.setEncryptedText(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEventWith_5_Questions/Page_ReviewMe/input_Reviewme Login_password'), 
    'a43CdjUP15hkxLgrareRvw==')

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEventWith_5_Questions/Page_ReviewMe/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEventWith_5_Questions/Page_ReviewMe/a_Review'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEventWith_5_Questions/Page_ReviewMe/a_Employee Review'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEventWith_5_Questions/Page_ReviewMe/a_Add New'))

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEventWith_5_Questions/Page_ReviewMe/input__title'), 
    'KPI event for OCT with 5 Question for HR Department')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEventWith_5_Questions/Page_ReviewMe/textarea_Description_description'), 
    'KPI event for OCT with 5 Question for HR Department')

WebUI.setText(findTestObject('CreateKPIEvent/CreateKPIEventWith_5_Questions/Page_ReviewMe/input__enddate'), '\'11/29/2020\'')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEventWith_5_Questions/Page_ReviewMe/input__frequency'), 
    '3')

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEventWith_5_Questions/Page_ReviewMe/button_Next'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEventWith_5_Questions/Page_ReviewMe/input_Groups_btnAll'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEventWith_5_Questions/Page_ReviewMe/span_Employment Division'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEventWith_5_Questions/Page_ReviewMe/button_Next_1'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEventWith_5_Questions/Page_ReviewMe/input_Enable scoring_isscoringenabled'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEventWith_5_Questions/Page_ReviewMe/span_GBS'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEventWith_5_Questions/Page_ReviewMe/span_Business Management'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEventWith_5_Questions/Page_ReviewMe/span_Brand Management'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEventWith_5_Questions/Page_ReviewMe/button_Next_1_2'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/CreateKPIEventWith_5_Questions/Page_ReviewMe/button_Save'))

