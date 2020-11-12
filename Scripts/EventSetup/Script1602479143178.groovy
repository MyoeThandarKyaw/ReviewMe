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

InternalData data = findTestData('login_data')

for (def index : (0..data.getRowNumbers() - 1)) {
    WebUI.openBrowser('')

    WebUI.navigateToUrl('http://18.139.70.17:7070/reviewme-test-ato/review/addkpiappraisal')

    WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/EventSetup/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
        'llhtun')

    WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/EventSetup/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
        'Root@123')

    WebUI.click(findTestObject('Object Repository/CreateKPIEvent/EventSetup/Page_ReviewMe/button_Sign in'))

    WebUI.maximizeWindow()

    WebUI.click(findTestObject('Object Repository/CreateKPIEvent/EventSetup/Page_ReviewMe/a_Events'))

    WebUI.click(findTestObject('Object Repository/CreateKPIEvent/EventSetup/Page_ReviewMe/a_Add New'))

    WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/EventSetup/Page_ReviewMe/input__title'), 'KPI(12-Nov-2020/12-Nov-2021)for all emp')

    WebUI.setText(findTestObject('Object Repository/CreateKPIEvent/EventSetup/Page_ReviewMe/textarea_Description_description'), 
        'KPI(12-Nov-2020/12-Nov-2021)for all emp')

    WebUI.click(findTestObject('Object Repository/CreateKPIEvent/EventSetup/Page_ReviewMe/button_Next'))

    WebUI.click(findTestObject('Object Repository/CreateKPIEvent/EventSetup/Page_ReviewMe/button_Next_1'))

    WebUI.click(findTestObject('Object Repository/CreateKPIEvent/EventSetup/Page_ReviewMe/button_Save'))
}

