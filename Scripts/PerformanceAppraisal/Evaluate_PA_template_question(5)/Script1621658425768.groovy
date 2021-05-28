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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.openBrowser('')

WebUI.navigateToUrl('http://review-me.ahtaroo.com:7070/demo/home/myTasks')

WebUI.setText(findTestObject('Performance_Appraisal/Evaluate_PA_template_question(5)/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'pwinttheingi')

//WebUI.setEncryptedText(findTestObject('Performance_Appraisal/Evaluate_PA_template_question(5)/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
//    'a43CdjUP15hkxLgrareRvw==')
WebUI.setText(findTestObject('Performance_Appraisal/Evaluate_PA_template_question(5)/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'root@123')

WebUI.click(findTestObject('Performance_Appraisal/Evaluate_PA_template_question(5)/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Performance_Appraisal/PA_with_two_iteration_question_template/Demo_Obj/Demo_Data_Obj/Demo_Data_Obj/button_01 Oct 202030 Sep 2021'))

WebUI.click(findTestObject('Performance_Appraisal/Evaluate_PA_template_question(5)/Page_ReviewMe/a_Start'))

WebUI.click(findTestObject('Performance_Appraisal/PA_with_two_iteration_question_template/Demo_Obj/Demo_Data_Obj/input_Developing_q_222'))

WebUI.setText(findTestObject('Performance_Appraisal/PA_with_two_iteration_question_template/Demo_Obj/Demo_Data_Obj/textarea_x Clear selection_revieweeComment222'), 
    'Try the best to get target for year end (VSK Branch)')

WebUI.click(findTestObject('Performance_Appraisal/PA_with_two_iteration_question_template/Demo_Obj/Demo_Data_Obj/input_Developing_q_223'))

WebUI.setText(findTestObject('Performance_Appraisal/PA_with_two_iteration_question_template/Demo_Obj/Demo_Data_Obj/textarea_x Clear selection_revieweeComment223'), 
    'Try the best to get target for year end (VSK Branch)')

WebUI.click(findTestObject('Performance_Appraisal/PA_with_two_iteration_question_template/Demo_Obj/Demo_Data_Obj/input_Developing_q_224'))

WebUI.setText(findTestObject('Performance_Appraisal/PA_with_two_iteration_question_template/Demo_Obj/Demo_Data_Obj/textarea_x Clear selection_revieweeComment224'), 
    'Try the best to get target for year end (VSK Branch)')

WebUI.click(findTestObject('Performance_Appraisal/PA_with_two_iteration_question_template/Demo_Obj/Demo_Data_Obj/input_Developing_q_225'))

WebUI.setText(findTestObject('Performance_Appraisal/PA_with_two_iteration_question_template/Demo_Obj/Demo_Data_Obj/textarea_x Clear selection_revieweeComment225'), 
    'Try the best to get target for year end (VSK Branch)')

WebUI.click(findTestObject('Performance_Appraisal/PA_with_two_iteration_question_template/Demo_Obj/Demo_Data_Obj/input_Developing_q_226'))

WebUI.setText(findTestObject('Performance_Appraisal/PA_with_two_iteration_question_template/Demo_Obj/Demo_Data_Obj/textarea_x Clear selection_revieweeComment226'), 
    'Try the best to get target for year end (VSK Branch)')

WebUI.click(findTestObject('Performance_Appraisal/PA_with_two_iteration_question_template/Staff_Comment_Obj/Staff_comment_obj/iframe_Press ALT 0 for help_cke_wysiwyg_frame cke_reset'))

WebUI.setText(findTestObject('Performance_Appraisal/PA_with_two_iteration_question_template/Staff_Comment_Obj/Staff_comment_obj/html_Rich Text Editor'), 
    'Describe report exactly')

WebUI.delay(1)

WebUI.click(findTestObject('Performance_Appraisal/Create_PA_choose_question/Create_PA_choose_question/Evaluate_PA_with_Four_Questions/input_Clear_btnConfirm'))

WebUI.click(findTestObject('FourQuestions/Evaluate_by_RO/Page_ReviewMe/Page_ReviewMe/Page_ReviewMe/button_Yes, go ahead'))

WebUI.delay(1)

WebUI.click(findTestObject('Performance_Appraisal/Evaluate_PA_template_question(5)/Page_ReviewMe/button_OK'))

