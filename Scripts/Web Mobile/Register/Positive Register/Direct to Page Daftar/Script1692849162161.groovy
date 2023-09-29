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

'memastikan button masuk akun terlihat pada layar dashboard'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Dashboard/button_MasukAkun'))

'melakukan click pada button masuk akun'
WebUI.click(findTestObject('Web Mobile Object/Page_Dashboard/button_MasukAkun'))

'memastikan label header masuk terlihat pada layar login'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/label_Masuk'))

'memastikan button daftar terlihat pada layar login'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/button_Daftar'))

'melakukan screenshot pada layar login'
WebUI.takeScreenshotAsCheckpoint('redirect to Login Page')

'melakukan click pada button daftar'
WebUI.click(findTestObject('Web Mobile Object/Page_Login/button_Daftar'))

'memastikan label daftar terlihat pada layar daftar akun'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Register/label_Daftar'))

'memastikan textbox input nama terlihat pada layar registrasi'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Register/textbox_InputNama'))

'memastikan textbox input nomor hp muncul pada layar registrasi'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Register/textbox_InputPhone'))

'memastikan textbox input password muncul pada layar registrasi'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Register/textbox_InputPassword'))

'memastikan button register muncul pada layar registrasi'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Register/button_Register'))

'melakukan screenshot layar register'
WebUI.takeScreenshotAsCheckpoint('redirect to Register Page')

