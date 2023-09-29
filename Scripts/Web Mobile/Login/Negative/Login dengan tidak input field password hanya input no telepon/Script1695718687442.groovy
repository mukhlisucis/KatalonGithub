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

'memastikan buton masuk atau daftar terlihat pada layar dashboard'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Dashboard/button_masukAtauDaftar'))

'melakukan click pada button masuk atau daftar'
WebUI.click(findTestObject('Web Mobile Object/Page_Dashboard/button_masukAtauDaftar'))

'memastikan label masuk terlihat pada layar login'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/New Login/label_Masuk'))

'melakukan screenshot pada layar'
WebUI.takeScreenshotAsCheckpoint('Login Page Revamp')

'memastikan textbox nomor hp terlihat pada layar login'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/New Login/textbox_phoneNumber'))

'memastikan textbox password terlihat pada layar login'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/New Login/textbox_Password'))

'memastikan button eye buka password terlihat pada layar login'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/New Login/button_eyeOpenPassword'))

'memastikan button lupa password terlihat pada layar login'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/New Login/button_lupaPassword'))

'memastikan button masuk terlihat pada layar login'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/New Login/button_Masuk'))

'memastikan button google terlihat pada layar login'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/New Login/button_Google'))

'memastikan button daftar telihat pada layar login'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/New Login/button_Daftar'))

'melakukan click pada textbox password untuk triggered alert'
WebUI.click(findTestObject('Web Mobile Object/Page_Login/New Login/textbox_Password'), FailureHandling.STOP_ON_FAILURE)

'input nomor hp'
WebUI.setText(findTestObject('Web Mobile Object/Page_Login/New Login/textbox_phoneNumber'), phoneNumber)

'menutup keyboard'
Mobile.hideKeyboard()

'melakukan click pada button masuk'
WebUI.click(findTestObject('Web Mobile Object/Page_Login/New Login/button_Masuk'))

'memastikan label alert invalid password terlihat pada layar'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/New Login/label_alertInvalidPassword'))

'memastikan button masuk tidak bisa di click'
WebUI.verifyElementNotClickable(findTestObject('Web Mobile Object/Page_Login/New Login/button_Masuk'))

WebUI.takeScreenshotAsCheckpoint('Login null password')

