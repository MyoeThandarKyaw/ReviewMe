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
import com.kms.katalon.core.testdata.InternalData as InternalData

//InternalData data = findTestData('Software_Dept_Emp_Data')
//for (def index : (0..data.getRowNumbers())) {
WebUI.openBrowser('')

WebUI.navigateToUrl('http://18.139.70.17:7070/reviewme-test-ato/users/login')

WebUI.setText(findTestObject('Object Repository/360_Appraisal/To_Check_MaxRF_from_Formula_Result/Evaluate_By_Soft_Dept_Emp/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'smaye')

WebUI.setEncryptedText(findTestObject('Object Repository/360_Appraisal/To_Check_MaxRF_from_Formula_Result/Evaluate_By_Soft_Dept_Emp/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'rXz5fG76N1x/0XfTppooEQ==')

WebUI.click(findTestObject('Object Repository/360_Appraisal/To_Check_MaxRF_from_Formula_Result/Evaluate_By_Soft_Dept_Emp/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/360_Appraisal/To_Check_MaxRF_from_Formula_Result/Evaluate_By_Soft_Dept_Emp/Page_ReviewMe/div_360 Review for Software Dept'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/To_Check_MaxRF_from_Formula_Result/Evaluate_By_Soft_Dept_Emp/Page_ReviewMe/a_Evaluate'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/To_Check_MaxRF_from_Formula_Result/Evaluate_By_Soft_Dept_Emp/Page_ReviewMe/input_Properly follow principles rules and _ac212e'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/To_Check_MaxRF_from_Formula_Result/Evaluate_By_Soft_Dept_Emp/Page_ReviewMe/div_1 2 3 4 5'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/To_Check_MaxRF_from_Formula_Result/Evaluate_By_Soft_Dept_Emp/Page_ReviewMe/input_Keep personal and work environment cl_a2830c'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/To_Check_MaxRF_from_Formula_Result/Evaluate_By_Soft_Dept_Emp/Page_ReviewMe/input_Dirty_q_170'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/To_Check_MaxRF_from_Formula_Result/Evaluate_By_Soft_Dept_Emp/Page_ReviewMe/input_TrueFalse_q_172'))

WebUI.setText(findTestObject('Object Repository/360_Appraisal/To_Check_MaxRF_from_Formula_Result/Evaluate_By_Soft_Dept_Emp/Page_ReviewMe/input_Lovely_q_173'), 
    '10')

WebUI.click(findTestObject('Object Repository/360_Appraisal/To_Check_MaxRF_from_Formula_Result/Evaluate_By_Soft_Dept_Emp/Page_ReviewMe/input_Can communicate clearly in both verba_3f17c2'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/To_Check_MaxRF_from_Formula_Result/Evaluate_By_Soft_Dept_Emp/Page_ReviewMe/input_Understand the importance of quality _3a5e0b'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/To_Check_MaxRF_from_Formula_Result/Evaluate_By_Soft_Dept_Emp/Page_ReviewMe/input_Understand the importance of quality _f81c61'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/To_Check_MaxRF_from_Formula_Result/Evaluate_By_Soft_Dept_Emp/Page_ReviewMe/button_Yes save Answers'))

WebUI.click(findTestObject('Object Repository/360_Appraisal/To_Check_MaxRF_from_Formula_Result/Evaluate_By_Soft_Dept_Emp/Page_ReviewMe/button_OK'))

