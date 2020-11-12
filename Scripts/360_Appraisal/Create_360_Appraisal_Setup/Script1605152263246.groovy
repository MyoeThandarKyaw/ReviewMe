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

WebUI.setText(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'hmkwin')

WebUI.setEncryptedText(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'rXz5fG76N1x/0XfTppooEQ==')

WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/a_Events (Legacy)'))

WebUI.click(findTestObject('360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/a_New'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/input__title'))

WebUI.setText(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/input_78'), '360 Appraisal for Software_CPSS_IDS')

WebUI.setText(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/textarea_Description_description'), 
    '360 Appraisal for Software_CPSS_IDS')

WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/svg__svg-inline--fa fa-user fa-w-14'))

//WebUI.setText(findTestObject('360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/input_Search_yui_3_6_0_1_1605153602148_2144'), 
//    'hay')
WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/td_HR Admin Executive'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/input_Appraisal Owner_btnSelectOwner'))

WebUI.setText(findTestObject('360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/input__stratdate'), '12/11/2020')

WebUI.setText(findTestObject('360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/input__enddate'), '12/11/2021')

WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/button_Next'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/span_Software Department'))

//WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/span_Kyaw Kyaw Zin'))
//
//WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/span_Lae Wah Wint Maung Maung'))
//
//WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/span_Phyo Kyaw'))
//
//WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/span_Htoo Htoo Tint'))
//
//WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/span_Saw Mya Aye'))
//
//WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/span_Htun Lu Khant'))
//
//WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/span_Myoe Thandar Kyaw'))
//
//WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/span_Saw San Lin'))
//
//WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/span_Thawdar Lwin'))
//
//WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/span_San Thu Aung'))
//
//WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/span_Win Thein'))
//
//WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/span_Zwe Ko Phyo'))
//
//WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/span_Yan Aung Phyo'))
//
//WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/span_Su Hnin Htet'))
//
//WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/span_Htoo Eaindra Lin'))
WebUI.setText(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/input_Min Review To_minreview'), 
    '3')

WebUI.setText(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/input_Max Review To_maxreview'), 
    '3')

WebUI.setText(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/input_Max Reviewed From_maxreviewed'), 
    '3')

WebUI.click(findTestObject('360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/input_Self Appraisal_is_self'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/button_Next_1'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/span_'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/span__1'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/button_Next_1_2'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_Setup/Page_ReviewMe/button_Save'))

