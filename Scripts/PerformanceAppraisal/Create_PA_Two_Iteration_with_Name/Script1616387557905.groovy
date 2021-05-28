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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://review-me.ahtaroo.com:7070/gbs-test/users/login')

WebUI.setText(findTestObject('Object Repository/Performance_Appraisal/PA_with_two_iteration_question_template/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Performance_Appraisal/PA_with_two_iteration_question_template/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'a43CdjUP15hkxLgrareRvw==')

WebUI.click(findTestObject('Object Repository/Performance_Appraisal/PA_with_two_iteration_question_template/Page_ReviewMe/div_Sign in                         version 0.1'))

WebUI.click(findTestObject('Object Repository/Performance_Appraisal/PA_with_two_iteration_question_template/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Performance_Appraisal/PA_with_two_iteration_question_template/Page_ReviewMe/a_Events'))

WebUI.click(findTestObject('Performance_Appraisal/PA_with_two_iteration_question_template/Page_ReviewMe/Page_ReviewMe/a_Add performance appraisal'))

WebUI.click(findTestObject('Object Repository/Performance_Appraisal/PA_with_two_iteration_question_template/Page_ReviewMe/input_Title_title'))

WebUI.setText(findTestObject('Object Repository/Performance_Appraisal/PA_with_two_iteration_question_template/Page_ReviewMe/input_68'), 
    'PA for 22-May-2021 To 22-May-2021-Daw Tin Nilar Htun')

WebUI.setText(findTestObject('Object Repository/Performance_Appraisal/PA_with_two_iteration_question_template/Page_ReviewMe/textarea_Optional_description'), 
    'PA for 22-May-2021 To 22-May-2021-Daw Tin Nilar Htun')

//WebUI.setText(findTestObject('Object Repository/Performance_Appraisal/PA_with_two_iteration_question_template/Page_ReviewMe/input_No. of iterations_frequency'), 
//    '2')
WebUI.sendKeys(findTestObject('Object Repository/Performance_Appraisal/Create_Performance_Appraisal_with_two_iteration/Page_ReviewMe/input_No. of iterations_frequency'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Performance_Appraisal/Create_Performance_Appraisal_with_two_iteration/Page_ReviewMe/input_No. of iterations_frequency'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Performance_Appraisal/Create_Performance_Appraisal_with_two_iteration/Page_ReviewMe/input_No. of iterations_frequency'), 
    '2')

WebUI.setText(findTestObject('Performance_Appraisal/PA_with_two_iteration_question_template/QuestionTemplate/input_Start_startdate'), 
    '05/22/2021')

WebUI.setText(findTestObject('Performance_Appraisal/PA_with_two_iteration_question_template/QuestionTemplate/input_End_enddate'), 
    '05/22/2021')

WebUI.click(findTestObject('Object Repository/Performance_Appraisal/PA_with_two_iteration_question_template/Page_ReviewMe/button_Next'))

WebUI.setText(findTestObject('Object Repository/Performance_Appraisal/PA_with_two_iteration_question_template/Page_ReviewMe/input_Name_form-control'), 
    'Tin Nilar Htun')

WebUI.click(findTestObject('Object Repository/Performance_Appraisal/PA_with_two_iteration_question_template/Page_ReviewMe/td_Name_select-checkbox dtr-control'))

WebUI.click(findTestObject('Object Repository/Performance_Appraisal/PA_with_two_iteration_question_template/Page_ReviewMe/button_Next_1'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Performance_Appraisal/PA_with_two_iteration_question_template/Page_ReviewMe/select_SelectTemplate APerformance Appraisa_d0eeda'), 
//    '3', true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Performance_Appraisal/PA_with_two_iteration_question_template/Page_ReviewMe/select_SelectTemplate APerformance Appraisa_d0eeda'), 
//    '4', true)
WebUI.selectOptionByValue(findTestObject('Performance_Appraisal/PA_with_two_iteration_question_template/QuestionTemplate/select_SelectTemplate'), 
    '3', true)

WebUI.click(findTestObject('Performance_Appraisal/PA_with_two_iteration_question_template/TemplateFilter/input_Templates_btn_template_filter'))

WebUI.click(findTestObject('Object Repository/Performance_Appraisal/PA_with_two_iteration_question_template/Page_ReviewMe/input_All_select-all-questions'))

WebUI.click(findTestObject('Object Repository/Performance_Appraisal/PA_with_two_iteration_question_template/Page_ReviewMe/button_Next_1_2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Performance_Appraisal/PA_with_two_iteration_question_template/Page_ReviewMe/select_0                                   _79a752'), 
    '25', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Performance_Appraisal/PA_with_two_iteration_question_template/Page_ReviewMe/select_0                                   _79a752_1'), 
    '25', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Performance_Appraisal/PA_with_two_iteration_question_template/Page_ReviewMe/select_0                                   _79a752_1_2'), 
    '12.5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Performance_Appraisal/PA_with_two_iteration_question_template/Page_ReviewMe/select_0                                   _79a752_1_2_3'), 
    '12.5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Performance_Appraisal/PA_with_two_iteration_question_template/Page_ReviewMe/select_0                                   _79a752_1_2_3_4'), 
    '25', true)

WebUI.click(findTestObject('Object Repository/Performance_Appraisal/PA_with_two_iteration_question_template/Page_ReviewMe/button_Next_1_2_3'))

WebUI.click(findTestObject('Performance_Appraisal/PA_with_two_iteration_question_template/Save_Button_Object/button_Save'))

