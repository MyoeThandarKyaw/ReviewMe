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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

WebUI.openBrowser('')

WebUI.navigateToUrl('http://review-me.ahtaroo.com:7070/gbs-test/')

WebUI.setText(findTestObject('TrainingProgram/RecordCompletedTraining/Page_ReviewMe/input_Sign in to ReviewMe_username'), 
    'eipwintphyuL1')

WebUI.setEncryptedText(findTestObject('TrainingProgram/RecordCompletedTraining/Page_ReviewMe/input_Sign in to ReviewMe_password'), 
    'a43CdjUP15hkxLgrareRvw==')

WebUI.click(findTestObject('TrainingProgram/RecordCompletedTraining/Page_ReviewMe/Page_ReviewMe/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('TrainingProgram/RecordCompletedTraining/Page_ReviewMe/a_My profile'))

WebUI.click(findTestObject('TrainingProgram/RecordCompletedTraining/Page_ReviewMe/a_Training info'))

WebUI.click(findTestObject('TrainingProgram/RecordCompletedTraining/Page_ReviewMe/button_Record training'))

WebUI.click(findTestObject('TrainingProgram/RecordCompletedTraining/Training_Completed_Date/input__date_started'), FailureHandling.STOP_ON_FAILURE)

//'Enter Date directly into the field'
//WebUI.sendKeys(findTestObject('Object Repository/TrainingProgram/RecordCompletedTraining/Training_Completed_Date/input__date_started'),
//    '26-05-2021')
//
//WebUI.executeJavaScript('document.getElementById(\'date_started\').value = \'26/05/2021\'', [])
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/TrainingProgram/RecordCompletedTraining/Training_Completed_Date/input__date_started'), 
    30)

WebUI.executeJavaScript('arguments[0].value = \'2021-05-26\'', Arrays.asList(element))

WebElement element1 = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/TrainingProgram/RecordCompletedTraining/Complete_date/date_completed'), 
    30)

WebUI.executeJavaScript('arguments[0].value = \'2021-05-29\'', Arrays.asList(element1))

WebUI.setText(findTestObject('TrainingProgram/RecordCompletedTraining/Page_ReviewMe/input_Hours completed_hours_completed'), 
    '20')

WebUI.setText(findTestObject('TrainingProgram/RecordCompletedTraining/Page_ReviewMe/textarea_Optional_comment'), 'Grate Training')

//WebUI.click(findTestObject('Object Repository/TrainingProgram/RecordCompletedTraining/Attachment_File/input_Optional_attachments'))
WebUI.delay(1)

//CustomKeywords.'upload.uploadphoto.uploadFile2'(findTestObject('Object Repository/TrainingProgram/RecordCompletedTraining/First_training_attachment/input_Optional_attachments'), 
//    'D:\\TESTING\\Testing_Image\\drill-151.png', 'D:\\TESTING\\Testing_Image\\drill-153.png', 'D:\\TESTING\\Testing_Image\\drill-156.png', 'D:\\TESTING\\Testing_Image\\drill-157.png')
WebUI.uploadFile(findTestObject('Object Repository/TrainingProgram/RecordCompletedTraining/First_training_attachment/input_Optional_attachments'), 
    'D:\\TESTING\\Testing_Image\\drill-151.png')

WebUI.click(findTestObject('TrainingProgram/RecordCompletedTraining/Page_ReviewMe/Page_ReviewMe/button_Save'))

