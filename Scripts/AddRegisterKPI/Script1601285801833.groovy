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

WebUI.navigateToUrl('http://18.139.70.17:7070/reviewme/users/login')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/AddRegisterKPI/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'yelwinaung')

WebUI.setEncryptedText(findTestObject('Object Repository/CreateKPIEvent/AddRegisterKPI/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'a43CdjUP15hkxLgrareRvw==')

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/AddRegisterKPI/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.scrollToPosition(100, 100)

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/AddRegisterKPI/Page_ReviewMe/a_Set KPIs'))

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/AddRegisterKPI/Page_ReviewMe/input_Actions_questions0questionname'), 
    'How do you set an example to those for your team members?')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/AddRegisterKPI/Page_ReviewMe/input_Actions_questions1questionname'), 
    'How do you lead through change?')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/AddRegisterKPI/Page_ReviewMe/input_Actions_questions2questionname'), 
    'How would you go about getting cohesion among a team who disagree?')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/AddRegisterKPI/Page_ReviewMe/input_Actions_questions3questionname'), 
    'What sort of leader would your team say that you are?')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/AddRegisterKPI/Page_ReviewMe/input_Actions_questions0target'), 
    '25')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/AddRegisterKPI/Page_ReviewMe/input_Actions_questions1target'), 
    '25')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/AddRegisterKPI/Page_ReviewMe/input_Actions_questions2target'), 
    '25')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/AddRegisterKPI/Page_ReviewMe/input_Actions_questions3target'), 
    '25')

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/AddRegisterKPI/Page_ReviewMe/input_Add KPI_btnSave'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/AddRegisterKPI/Page_ReviewMe/button_OK'))

