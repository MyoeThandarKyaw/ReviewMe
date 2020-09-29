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

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/AddRegisterKPI/Page_ReviewMe/input_Reviewme Login_username'), 
    'tnhtun')

WebUI.setEncryptedText(findTestObject('Object Repository/CreateKPIEvent/AddRegisterKPI/Page_ReviewMe/input_Reviewme Login_password'), 
    'a43CdjUP15hkxLgrareRvw==')

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/AddRegisterKPI/Page_ReviewMe/button_Login'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/AddRegisterKPI/Page_ReviewMe/a_4'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/AddRegisterKPI/Page_ReviewMe/a_3'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/AddRegisterKPI/Page_ReviewMe/a_-Review Employees Performance without score'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/AddRegisterKPI/Page_ReviewMe/a_Update KPIs'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/AddRegisterKPI/Page_ReviewMe/a_Add registered KPIs'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/AddRegisterKPI/Page_ReviewMe/td_Performance score of new employees withi_40f4af'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/AddRegisterKPI/Page_ReviewMe/td_Training hours per employee per year (ho_603e5f'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/AddRegisterKPI/Page_ReviewMe/input_Registered KPIs_btn_select_kpi'))

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/AddRegisterKPI/Page_ReviewMe/input_Training hours per employee per year _c98706'), 
    '23')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/AddRegisterKPI/Page_ReviewMe/input_ increase in the rate of productivity_54bb51'), 
    '23')

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/AddRegisterKPI/Page_ReviewMe/input_Total question weight ()_btnSave'))

