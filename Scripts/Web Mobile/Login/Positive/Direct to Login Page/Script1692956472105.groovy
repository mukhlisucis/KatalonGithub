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

'memastikan button untuk masuk akun muncul pada layar dashboard'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Dashboard/button_MasukAkun'))

'click button masuk akun'
WebUI.click(findTestObject('Web Mobile Object/Page_Dashboard/button_MasukAkun'))

'memastikan label masuk terlihat'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/label_Masuk'))

'memastikan label email/phone number terlihat'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/label_EmailPhone'))

'memastikan textbox input email / phone number terlihat pada layar login'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/textbox_InputEmailPhone'))

'memastikan label password muncul pada layar login'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/label_Password'))

'memastikan textbox password muncul pada layar login'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/textboxt_InputPassword'))

'memastikan button login muncul pada layar login'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/button_Login'))

'memastikan button lupa password terlihat pada layar login'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/button_LupaPassword'))

'mengambil screenshot pada layar login'
WebUI.takeScreenshotAsCheckpoint('direct to login page')

