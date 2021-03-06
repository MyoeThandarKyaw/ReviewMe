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

WebUI.setText(findTestObject('Object Repository/360_Appraisal/360_Review_for_all_employees/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'hmkwin')

WebUI.setEncryptedText(findTestObject('Object Repository/360_Appraisal/360_Review_for_all_employees/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'rXz5fG76N1x/0XfTppooEQ==')

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Review_for_all_employees/Page_ReviewMe/button_Sign in'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Review_for_all_employees/Page_ReviewMe/a_Events (Legacy)'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Review_for_all_employees/Page_ReviewMe/label_New'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Review_for_all_employees/Page_ReviewMe/input__title'))

WebUI.setText(findTestObject('Object Repository/360_Appraisal/360_Review_for_all_employees/Page_ReviewMe/input_72'), '360 Review for all employees')

WebUI.setText(findTestObject('Object Repository/360_Appraisal/360_Review_for_all_employees/Page_ReviewMe/textarea_Description_description'), 
    '360 Review for all employees')

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Review_for_all_employees/Page_ReviewMe/path'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Review_for_all_employees/Page_ReviewMe/td_Hay Mar Kyaw Win'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Review_for_all_employees/Page_ReviewMe/input_Appraisal Owner_btnSelectOwner'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Review_for_all_employees/Page_ReviewMe/button_Next'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Review_for_all_employees/Page_ReviewMe/span_Hardware Department'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Review_for_all_employees/Page_ReviewMe/span_Software Department'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Review_for_all_employees/Page_ReviewMe/span_Admin HR Department'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Review_for_all_employees/Page_ReviewMe/span_Management Department'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Review_for_all_employees/Page_ReviewMe/span_Sales  Marketing'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Review_for_all_employees/Page_ReviewMe/input_Self Appraisal_is_self'))

WebUI.setText(findTestObject('Object Repository/360_Appraisal/360_Review_for_all_employees/Page_ReviewMe/input_Min Review To_minreview'), 
    '5')

WebUI.setText(findTestObject('Object Repository/360_Appraisal/360_Review_for_all_employees/Page_ReviewMe/input_Max Review To_maxreview'), 
    '8')

WebUI.setText(findTestObject('Object Repository/360_Appraisal/360_Review_for_all_employees/Page_ReviewMe/input_Max Reviewed From_maxreviewed'), 
    '10')

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Review_for_all_employees/Page_ReviewMe/button_Next_1'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Review_for_all_employees/Page_ReviewMe/span_'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Review_for_all_employees/Page_ReviewMe/button_Next_1_2'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/360_Review_for_all_employees/Page_ReviewMe/button_Save'))

