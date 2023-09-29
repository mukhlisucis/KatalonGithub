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

'memastikan textbox input otp muncul pada layar input otp'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_VerifikasiOTP/textbox_InputOTP'))

//println(GlobalVariable.nomorHp)
'melakukan input otp yang di dapatkan dari GlobalVariable code pada database'
WebUI.setText(findTestObject('Web Mobile Object/Page_VerifikasiOTP/textbox_InputOTP'), GlobalVariable.code)

'menutup keyboar pada layar input otp'
Mobile.hideKeyboard()

'mengambil screenshot pada layar input otp'
WebUI.takeScreenshot()

'melakukan klik pada button verifikasi di layar input otp'
WebUI.click(findTestObject('Web Mobile Object/Page_VerifikasiOTP/button_Verifikasi'))

'melakukan delay 4 detik'
WebUI.delay(4)

