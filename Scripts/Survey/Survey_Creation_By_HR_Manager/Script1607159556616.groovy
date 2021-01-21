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

WebUI.setText(findTestObject('Object Repository/Survey/Survey_Creation_by_HR_Manager/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'hmkwin')

WebUI.setEncryptedText(findTestObject('Object Repository/Survey/Survey_Creation_by_HR_Manager/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'rXz5fG76N1x/0XfTppooEQ==')

WebUI.click(findTestObject('Object Repository/Survey/Survey_Creation_by_HR_Manager/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Survey/Survey_Creation_by_HR_Manager/Page_ReviewMe/a_Surveys'))

WebUI.click(findTestObject('Survey/Survey_Creation_by_HR_Manager/Page_ReviewMe/Page_ReviewMe/a_New'))

WebUI.click(findTestObject('Object Repository/Survey/Survey_Creation_by_HR_Manager/Page_ReviewMe/input__title'))

WebUI.setText(findTestObject('Object Repository/Survey/Survey_Creation_by_HR_Manager/Page_ReviewMe/input_71'), 'Survey for training feed back')

WebUI.setText(findTestObject('Object Repository/Survey/Survey_Creation_by_HR_Manager/Page_ReviewMe/textarea_Description_description'), 
    'Survey for training feed back')

WebUI.selectOptionByValue(findTestObject('Object Repository/Survey/Survey_Creation_by_HR_Manager/Page_ReviewMe/select_Select Appraisal TypeProduct Apprais_d1d0e9'), 
    '6', true)

WebUI.click(findTestObject('Object Repository/Survey/Survey_Creation_by_HR_Manager/Page_ReviewMe/a__yui_3_6_0_1_1607325696028_2147'))

WebUI.setText(findTestObject('Object Repository/Survey/Survey_Creation_by_HR_Manager/Page_ReviewMe/input_Search_yui_3_6_0_1_1607325696028_2166'), 
    'hay')

WebUI.click(findTestObject('Object Repository/Survey/Survey_Creation_by_HR_Manager/Page_ReviewMe/td_Hay Mar Kyaw Win'))

WebUI.click(findTestObject('Object Repository/Survey/Survey_Creation_by_HR_Manager/Page_ReviewMe/input_Owner_btnSelectOwner'))

WebUI.setText(findTestObject('Survey/Survey_Creation_by_HR_Manager/Page_ReviewMe/Page_ReviewMe/Page_ReviewMe/input__stratdate'), 
    '12/01/2020')

WebUI.setText(findTestObject('Survey/Survey_Creation_by_HR_Manager/Page_ReviewMe/Page_ReviewMe/Page_ReviewMe/input__enddate'), 
    '12/31/2020')

WebUI.click(findTestObject('Object Repository/Survey/Survey_Creation_by_HR_Manager/Page_ReviewMe/button_Next'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Survey/Survey_Creation_by_HR_Manager/Page_ReviewMe/select_Select ItemProject AE-Commerce Platf_a65b90'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Survey/Survey_Creation_by_HR_Manager/Page_ReviewMe/span_Hardware Department'))

WebUI.click(findTestObject('Object Repository/Survey/Survey_Creation_by_HR_Manager/Page_ReviewMe/span_Software Department'))

WebUI.click(findTestObject('Object Repository/Survey/Survey_Creation_by_HR_Manager/Page_ReviewMe/span_Admin HR Department'))

WebUI.click(findTestObject('Object Repository/Survey/Survey_Creation_by_HR_Manager/Page_ReviewMe/span_Management Department'))

WebUI.click(findTestObject('Object Repository/Survey/Survey_Creation_by_HR_Manager/Page_ReviewMe/span_Sales  Marketing'))

WebUI.click(findTestObject('Object Repository/Survey/Survey_Creation_by_HR_Manager/Page_ReviewMe/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Survey/Survey_Creation_by_HR_Manager/Page_ReviewMe/span_'))

WebUI.click(findTestObject('Object Repository/Survey/Survey_Creation_by_HR_Manager/Page_ReviewMe/span__1'))

WebUI.click(findTestObject('Object Repository/Survey/Survey_Creation_by_HR_Manager/Page_ReviewMe/span_ (1)'))

WebUI.click(findTestObject('Object Repository/Survey/Survey_Creation_by_HR_Manager/Page_ReviewMe/button_Next_1_2'))

WebUI.click(findTestObject('Object Repository/Survey/Survey_Creation_by_HR_Manager/Page_ReviewMe/button_Save'))

