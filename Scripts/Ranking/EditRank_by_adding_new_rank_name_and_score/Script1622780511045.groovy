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

WebUI.setText(findTestObject('Object Repository/Ranking/EditRank_by_adding_new_rank_name_and_score/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'waiwaihlaing')

WebUI.setEncryptedText(findTestObject('Object Repository/Ranking/EditRank_by_adding_new_rank_name_and_score/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'a43CdjUP15hkxLgrareRvw==')

WebUI.click(findTestObject('Object Repository/Ranking/EditRank_by_adding_new_rank_name_and_score/Page_ReviewMe/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Ranking/EditRank_by_adding_new_rank_name_and_score/Page_ReviewMe/a_Rank sets'))

WebUI.click(findTestObject('Object Repository/Ranking/EditRank_by_adding_new_rank_name_and_score/Page_ReviewMe/button_Edit'))

WebUI.click(findTestObject('Object Repository/Ranking/EditRank_by_adding_new_rank_name_and_score/Page_ReviewMe/button_Add rank'))

WebUI.setText(findTestObject('Object Repository/Ranking/EditRank_by_adding_new_rank_name_and_score/Page_ReviewMe/input_Remove_ranks2name'), 
    'Grade C')

WebUI.setText(findTestObject('Object Repository/Ranking/EditRank_by_adding_new_rank_name_and_score/Page_ReviewMe/input_Top_ranks0percent'), 
    '30')

WebUI.setText(findTestObject('Object Repository/Ranking/EditRank_by_adding_new_rank_name_and_score/Page_ReviewMe/input_Next_ranks1percent'), 
    '25')

WebUI.setText(findTestObject('Object Repository/Ranking/EditRank_by_adding_new_rank_name_and_score/Page_ReviewMe/input_Bottom_ranks2percent'), 
    '20')

WebUI.click(findTestObject('Object Repository/Ranking/EditRank_by_adding_new_rank_name_and_score/Page_ReviewMe/button_Add rank'))

WebUI.setText(findTestObject('Object Repository/Ranking/EditRank_by_adding_new_rank_name_and_score/Page_ReviewMe/input_Remove_ranks3name'), 
    'Grade D')

WebUI.setText(findTestObject('Object Repository/Ranking/EditRank_by_adding_new_rank_name_and_score/Page_ReviewMe/input_Bottom_ranks3percent'), 
    '15')

WebUI.click(findTestObject('Object Repository/Ranking/EditRank_by_adding_new_rank_name_and_score/Page_ReviewMe/button_Add rank'))

WebUI.setText(findTestObject('Object Repository/Ranking/EditRank_by_adding_new_rank_name_and_score/Page_ReviewMe/input_Remove_ranks4name'), 
    'Grade E')

WebUI.setText(findTestObject('Object Repository/Ranking/EditRank_by_adding_new_rank_name_and_score/Page_ReviewMe/input_Bottom_ranks4percent'), 
   '10')

WebUI.click(findTestObject('Object Repository/Ranking/EditRank_by_adding_new_rank_name_and_score/Page_ReviewMe/button_Save'))

