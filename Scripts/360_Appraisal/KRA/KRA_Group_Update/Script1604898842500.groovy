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

WebUI.navigateToUrl('http://18.139.70.17:7070/reviewme-gbs-test/kragroup')

WebUI.setText(findTestObject('Object Repository/KRA_Group_Update/Page_ReviewMe/input_Sign in to ReviewMe_username'), 'admin')

WebUI.setText(findTestObject('Object Repository/KRA_Group_Update/Page_ReviewMe/input_Sign in to ReviewMe_password'), 'Root@123')

WebUI.click(findTestObject('Object Repository/KRA_Group_Update/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/KRA_Group_Update/Page_ReviewMe/a_KRA groups'))

WebUI.click(findTestObject('Object Repository/KRA_Group_Update/Page_ReviewMe/a_Edit'))

WebUI.setText(findTestObject('Object Repository/KRA_Group_Update/Page_ReviewMe/textarea_Description_questioncategorydescription'), 
    'To understand the important of brand management')

WebUI.click(findTestObject('Object Repository/KRA_Group_Update/Page_ReviewMe/button_Save'))

