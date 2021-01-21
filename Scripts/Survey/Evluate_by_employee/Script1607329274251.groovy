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
import com.kms.katalon.core.testdata.InternalData as InternalData

//InternalData data = findTestData('Survey_Data')
//for (def index : (0..data.getRowNumbers())) {
WebUI.openBrowser('')

WebUI.navigateToUrl('http://18.139.70.17:7070/reviewme-test-ato/users/login')

WebUI.setText(findTestObject('Object Repository/Survey/Evluate_by_employee/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'staung')

WebUI.setText(findTestObject('Object Repository/Survey/Evluate_by_employee/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'Root@123')

WebUI.click(findTestObject('Object Repository/Survey/Evluate_by_employee/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Survey/Evluate_by_employee/Page_ReviewMe/div_Survey for training feed back'))

WebUI.click(findTestObject('Object Repository/Survey/Evluate_by_employee/Page_ReviewMe/a_Evaluate'))

WebUI.click(findTestObject('Object Repository/Survey/Evluate_by_employee/Page_ReviewMe/input_concat(Appreciate and value one, , s _f279be'))

WebUI.click(findTestObject('Object Repository/Survey/Evluate_by_employee/Page_ReviewMe/input_concat(Appreciate and value one, , s _94cb3c'))

WebUI.click(findTestObject('Object Repository/Survey/Evluate_by_employee/Page_ReviewMe/input_Sharing information and knowledge to _d11462'))

WebUI.setText(findTestObject('Object Repository/Survey/Evluate_by_employee/Page_ReviewMe/textarea_What is your hobby_q_169'), 
    'My Hobby is reading.')

WebUI.click(findTestObject('Object Repository/Survey/Evluate_by_employee/Page_ReviewMe/input_PoorBadFairGoodExcellent_q_177'))

WebUI.click(findTestObject('Object Repository/Survey/Evluate_by_employee/Page_ReviewMe/input_Properly follow principles, rules and_2c1f6f'))

WebUI.click(findTestObject('Object Repository/Survey/Evluate_by_employee/Page_ReviewMe/input_Keep personal and work environment cl_b4ddc8'))

WebUI.click(findTestObject('Object Repository/Survey/Evluate_by_employee/Page_ReviewMe/input_Dirty_q_170'))

WebUI.setText(findTestObject('Object Repository/Survey/Evluate_by_employee/Page_ReviewMe/input_Sales Volume_q_171'), '1000')

WebUI.click(findTestObject('Object Repository/Survey/Evluate_by_employee/Page_ReviewMe/input_TrueFalse_q_172'))

WebUI.setText(findTestObject('Object Repository/Survey/Evluate_by_employee/Page_ReviewMe/input_Lovely_q_173'), '10')

WebUI.click(findTestObject('Object Repository/Survey/Evluate_by_employee/Page_ReviewMe/input_Give productive ideas for work and pr_859b5a'))

WebUI.click(findTestObject('Object Repository/Survey/Evluate_by_employee/Page_ReviewMe/input_Proactively gives constructive feedba_988e6c'))

WebUI.click(findTestObject('Object Repository/Survey/Evluate_by_employee/Page_ReviewMe/input_Proactively gives constructive feedba_79c355'))
//}
