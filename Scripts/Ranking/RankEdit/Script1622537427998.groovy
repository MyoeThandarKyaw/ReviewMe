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

WebUI.setText(findTestObject('Object Repository/Ranking/RankEdit/Page_ReviewMe/input_Sign in to ReviewMe_username'), 'waiwaihlaing')

WebUI.setEncryptedText(findTestObject('Object Repository/Ranking/RankEdit/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'a43CdjUP15hkxLgrareRvw==')

WebUI.click(findTestObject('Object Repository/Ranking/RankEdit/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Ranking/RankEdit/Page_ReviewMe/a_Rank sets'))

WebUI.click(findTestObject('Object Repository/Ranking/RankEdit/Page_ReviewMe/button_Edit'))

WebUI.setText(findTestObject('Object Repository/Ranking/RankEdit/Page_ReviewMe/input_Top_ranks0percent'), '10')

WebUI.setText(findTestObject('Object Repository/Ranking/RankEdit/Page_ReviewMe/input_Next_ranks1percent'), '15')

WebUI.setText(findTestObject('Object Repository/Ranking/RankEdit/Page_ReviewMe/input_Next_ranks2percent'), '20')

WebUI.setText(findTestObject('Object Repository/Ranking/RankEdit/Page_ReviewMe/input_Next_ranks3percent'), '25')

WebUI.setText(findTestObject('Object Repository/Ranking/RankEdit/Page_ReviewMe/input_Bottom_ranks4percent'), '30')

WebUI.click(findTestObject('Object Repository/Ranking/RankEdit/Page_ReviewMe/div_Name                            1475   _eaa0b2'))

WebUI.click(findTestObject('Object Repository/Ranking/RankEdit/Page_ReviewMe/button_Save'))

