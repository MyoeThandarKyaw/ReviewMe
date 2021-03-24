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

WebUI.navigateToUrl('http://review-me.ahtaroo.com:7070/gbs-test/users/login')

WebUI.setText(findTestObject('Object Repository/Performance_Appraisal/Create_PA_choose_question/Create_PA_choose_question/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Performance_Appraisal/Create_PA_choose_question/Create_PA_choose_question/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'a43CdjUP15hkxLgrareRvw==')

WebUI.click(findTestObject('Object Repository/Performance_Appraisal/Create_PA_choose_question/Create_PA_choose_question/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://review-me.ahtaroo.com:7070/gbs-test/review/addperformanceappraisal')

WebUI.setText(findTestObject('Performance_Appraisal/Create_PA_choose_question/Create_PA_choose_question/Page_ReviewMe/Page_ReviewMe/input_100'), 
    ' PA for HR team (Moe Goke Branch)')

WebUI.setText(findTestObject('Performance_Appraisal/Create_Performance_Appraisal_with_two_iteration/Page_ReviewMe/textarea_Optional_description'), 
    ' PA for HR team (Moe Goke Branch)')

WebUI.sendKeys(findTestObject('Object Repository/Performance_Appraisal/Create_Performance_Appraisal_with_two_iteration/Page_ReviewMe/input_No. of iterations_frequency'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Performance_Appraisal/Create_Performance_Appraisal_with_two_iteration/Page_ReviewMe/input_No. of iterations_frequency'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Performance_Appraisal/Create_PA_choose_question/Create_PA_choose_question/Page_ReviewMe/input_No. of iterations_frequency'), 
    '2')

//WebUI.setText(findTestObject('Object Repository/Performance_Appraisal/Create_PA_choose_question/Create_PA_choose_question/Page_ReviewMe/input_Iteration 1 label_iterationNames'), 
//    'Year-End')
WebUI.click(findTestObject('Object Repository/Performance_Appraisal/Create_PA_choose_question/Create_PA_choose_question/Page_ReviewMe/button_Next'))

WebUI.setText(findTestObject('Object Repository/Performance_Appraisal/Create_PA_choose_question/Create_PA_choose_question/Page_ReviewMe/input_Name_form-control'), 
    'Thwe Nandi Aung')

WebUI.click(findTestObject('Object Repository/Performance_Appraisal/Create_PA_choose_question/Create_PA_choose_question/Page_ReviewMe/td_Name_select-checkbox dtr-control'))

WebUI.click(findTestObject('Object Repository/Performance_Appraisal/Create_PA_choose_question/Create_PA_choose_question/Page_ReviewMe/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Performance_Appraisal/Create_PA_choose_question/Create_PA_choose_question/Page_ReviewMe/td_Question_select-checkbox dtr-control'))

WebUI.click(findTestObject('Object Repository/Performance_Appraisal/Create_PA_choose_question/Create_PA_choose_question/Page_ReviewMe/td_LEADERSHIP COMPETENCY_select-checkbox dt_8444ba'))

WebUI.click(findTestObject('Performance_Appraisal/Create_PA_choose_question/Create_PA_choose_question/Page_ReviewMe/Page_ReviewMe/Page_ReviewMe/Page_ReviewMe/td_Is a role model Sets a'))

WebUI.click(findTestObject('Performance_Appraisal/Create_PA_choose_question/Create_PA_choose_question/Page_ReviewMe/Page_ReviewMe/Page_ReviewMe/Page_ReviewMe/td_Communicates positively'))

WebUI.click(findTestObject('Object Repository/Performance_Appraisal/Create_PA_choose_question/Create_PA_choose_question/Page_ReviewMe/button_Next_1_2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Performance_Appraisal/Create_PA_choose_question/Create_PA_choose_question/Page_ReviewMe/select_0                                   _79a752'), 
    '25', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Performance_Appraisal/Create_PA_choose_question/Create_PA_choose_question/Page_ReviewMe/select_0                                   _79a752_1'), 
    '25', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Performance_Appraisal/Create_PA_choose_question/Create_PA_choose_question/Page_ReviewMe/select_0                                   _79a752_1_2'), 
    '25', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Performance_Appraisal/Create_PA_choose_question/Create_PA_choose_question/Page_ReviewMe/select_0                                   _79a752_1_2_3'), 
    '25', true)

WebUI.click(findTestObject('Object Repository/Performance_Appraisal/Create_PA_choose_question/Create_PA_choose_question/Page_ReviewMe/button_Next_1_2_3'))

WebUI.click(findTestObject('Object Repository/Performance_Appraisal/Create_PA_choose_question/Create_PA_choose_question/Page_ReviewMe/svg_Save_svg-inline--fa fa-save fa-w-14'))

