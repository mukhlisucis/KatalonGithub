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

'memastikan label password baru terlihat pada layar ganti password'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Lupa Password/label_PasswordBaru'))

'memastikan textbox password baru terlihat pada layar lupa password'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Lupa Password/textbox_PasswordBaru'))

'input password baru'
WebUI.setText(findTestObject('Web Mobile Object/Page_Lupa Password/textbox_PasswordBaru'), newPassword)

'memastikan label konfirmasi password baru terlihat pada layar lupa password'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Lupa Password/label_ConfirmPasswordBaru'))

'input konfirmasi password baru'
WebUI.setText(findTestObject('Web Mobile Object/Page_Lupa Password/textbox_ConfirmPasswordBaru'), newPassword)

'menutup keyboard'
Mobile.hideKeyboard()

'melakukan klik pada button mata / open password pada password baru'
WebUI.click(findTestObject('Web Mobile Object/Page_Lupa Password/button_EyeNewPassword'))

'melakukan klik pada button mata / open password pada konfirmasi password baru'
WebUI.click(findTestObject('Web Mobile Object/Page_Lupa Password/button_EyeConfirmPassword'))

'melakukan screenshot'
WebUI.takeScreenshotAsCheckpoint('input pass baru')

'memastikan button lanjut bisa di klik'
WebUI.verifyElementClickable(findTestObject('Web Mobile Object/Page_Lupa Password/button_Lanjut'))

'melakukan klik pada button lanjut'
WebUI.click(findTestObject('Web Mobile Object/Page_Lupa Password/button_Lanjut'))

'memastikan alert password berhasil di ganti muncul pada layar'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Lupa Password/label_PasswodBerhasilGanti'))

'melakukan screenshot'
WebUI.takeScreenshotAsCheckpoint('berhasil ganti password')

