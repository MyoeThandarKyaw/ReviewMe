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

WebUI.setText(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_with_5_questions/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'hmkwin')

WebUI.setEncryptedText(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_with_5_questions/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'rXz5fG76N1x/0XfTppooEQ==')

WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_with_5_questions/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_with_5_questions/Page_ReviewMe/a_Events (Legacy)'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_with_5_questions/Page_ReviewMe/label_New'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_with_5_questions/Page_ReviewMe/input__title'))

WebUI.setText(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_with_5_questions/Page_ReviewMe/input_50'), 
    'Performance Review for QCST (Oct-2020 To Sep-2021)')

WebUI.setText(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_with_5_questions/Page_ReviewMe/textarea_Description_description'), 
    'Performance Review for QCST (Oct-2020 To Sep-2021)')

WebUI.click(findTestObject('360_Appraisal/Create_360_Appraisal_with_5_questions/Page_ReviewMe/a__btn btn-secondary'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_with_5_questions/Page_ReviewMe/td_Hay Mar Kyaw Win'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_with_5_questions/Page_ReviewMe/input_Appraisal Owner_btnSelectOwner'))

WebUI.setText(findTestObject('360_Appraisal/Create_360_Appraisal_with_5_questions/Page_ReviewMe/input__stratdate'), '11/18/2020')

WebUI.setText(findTestObject('360_Appraisal/Create_360_Appraisal_with_5_questions/Page_ReviewMe/input__enddate'), '11/18/2021')

WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_with_5_questions/Page_ReviewMe/button_Next'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_with_5_questions/Page_ReviewMe/input_Self Appraisal_is_self'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_with_5_questions/Page_ReviewMe/span_Software Department'))

WebUI.setText(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_with_5_questions/Page_ReviewMe/input_Min Review To_minreview'), 
    '3')

WebUI.setText(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_with_5_questions/Page_ReviewMe/input_Max Review To_maxreview'), 
    '4')

WebUI.setText(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_with_5_questions/Page_ReviewMe/input_Max Reviewed From_maxreviewed'), 
    '6')

WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_with_5_questions/Page_ReviewMe/button_Next_1'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_with_5_questions/Page_ReviewMe/span_'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_with_5_questions/Page_ReviewMe/span__1'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_with_5_questions/Page_ReviewMe/button_Next_1_2'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/Create_360_Appraisal_with_5_questions/Page_ReviewMe/svg_Save_svg-inline--fa fa-save fa-w-14'))

