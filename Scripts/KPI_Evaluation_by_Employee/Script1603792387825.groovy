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

InternalData data = findTestData('Emp_Review_Data')
for (def index : (0..data.getRowNumbers())) {

WebUI.openBrowser('')

WebUI.navigateToUrl('http://18.139.70.17:7070/reviewme/users/login')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/KPI_Evaluation_by_Employee/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    data.internallyGetValue('emp_name', index))

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/KPI_Evaluation_by_Employee/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    data.internallyGetValue('password', index))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/KPI_Evaluation_by_Employee/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/KPI_Evaluation_by_Employee/Page_ReviewMe/a_Evaluate'))

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/KPI_Evaluation_by_Employee/Page_ReviewMe/input_Achievement_q_660'), 
    '24')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/KPI_Evaluation_by_Employee/Page_ReviewMe/textarea_486'), 
    'Try the best to get target')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/KPI_Evaluation_by_Employee/Page_ReviewMe/textarea_486_1'), 
    'Try the best to get target')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/KPI_Evaluation_by_Employee/Page_ReviewMe/input_Achievement_q_661'), 
    '24')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/KPI_Evaluation_by_Employee/Page_ReviewMe/input_Achievement_q_662'), 
    '24')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/KPI_Evaluation_by_Employee/Page_ReviewMe/textarea_486_1_2'), 
    'Try the best to get target')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/KPI_Evaluation_by_Employee/Page_ReviewMe/textarea_486_1_2_3'), 
    'Try the best to get target')

WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/KPI_Evaluation_by_Employee/Page_ReviewMe/input_Achievement_q_663'), 
    '24')

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/KPI_Evaluation_by_Employee/Page_ReviewMe/input_concat(Employee  s comment)_btnConfirm'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/KPI_Evaluation_by_Employee/Page_ReviewMe/button_Yes go ahead'))

WebUI.click(findTestObject('Object Repository/CreateKPIEvent/KPI_Evaluation_by_Employee/Page_ReviewMe/button_OK'))
}
