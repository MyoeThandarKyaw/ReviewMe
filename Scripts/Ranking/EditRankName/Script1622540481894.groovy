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

WebUI.setText(findTestObject('Object Repository/Ranking/EditRankName/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'waiwaihlaing')

WebUI.setEncryptedText(findTestObject('Object Repository/Ranking/EditRankName/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'a43CdjUP15hkxLgrareRvw==')

WebUI.click(findTestObject('Object Repository/Ranking/EditRankName/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Ranking/EditRankName/Page_ReviewMe/a_Rank sets'))

WebUI.click(findTestObject('Object Repository/Ranking/EditRankName/Page_ReviewMe/button_Edit'))

WebUI.click(findTestObject('Object Repository/Ranking/EditRankName/Page_ReviewMe/input__ranks0name'))

WebUI.setText(findTestObject('Object Repository/Ranking/EditRankName/Page_ReviewMe/input__ranks0name'), 'A')

WebUI.click(findTestObject('Object Repository/Ranking/EditRankName/Page_ReviewMe/td_115'))

WebUI.setText(findTestObject('Object Repository/Ranking/EditRankName/Page_ReviewMe/input_Remove_ranks1name'), 'B')

WebUI.click(findTestObject('Object Repository/Ranking/EditRankName/Page_ReviewMe/input_Remove_ranks2name'))

WebUI.click(findTestObject('Object Repository/Ranking/EditRankName/Page_ReviewMe/td_115'))

WebUI.setText(findTestObject('Object Repository/Ranking/EditRankName/Page_ReviewMe/input_Remove_ranks3name'), 'D')

WebUI.click(findTestObject('Object Repository/Ranking/EditRankName/Page_ReviewMe/td_115'))

WebUI.setText(findTestObject('Object Repository/Ranking/EditRankName/Page_ReviewMe/input_Remove_ranks4name'), 'E')

WebUI.click(findTestObject('Object Repository/Ranking/RankEdit/SaveButtonObj/button_Save'))

