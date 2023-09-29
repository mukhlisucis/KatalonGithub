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

'memastikan button masuk atau daftar terlihat pada layar'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Dashboard/button_masukAtauDaftar'))

'melakukan click pada button masuk atau daftar'
WebUI.click(findTestObject('Web Mobile Object/Page_Dashboard/button_masukAtauDaftar'))

'memastikan label daftar terlihat pada layar'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Register/New Register/label_Daftar'))

'melakukan click pada label button daftar'
WebUI.click(findTestObject('Web Mobile Object/Page_Register/New Register/label_Daftar'))

'memastikan textbox nama terlihat pada layar'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Register/New Register/textbox_Nama'))

'melakukan screenshot page daftar'
WebUI.takeScreenshotAsCheckpoint('Daftar Page')

'memastikan textbox nomor hp terlihat pada layar'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Register/New Register/textbox_phoneNumber'))

'memastikan textbox password terlihat pada layar'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Register/New Register/textbox_Password'))

'memastikan textbox konfirmasi password terlihat pada layar'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Register/New Register/textbox_konfirmasiPassword'))

'memastikan checkbox syarat dan ketentuan terlihat pada layar'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Register/New Register/checkbox_syaratKetentuan'))

'memastikan button daftar terlihat pada layar'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Register/New Register/button_Daftar'))

'memastikan logo button google terlihat pada layar'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/New Login/button_Google'))

'memastikan button eye open konfirmasi password terlihat pada layar'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Register/New Register/button_eyeKonfirmasiPassword'))

'memastikan button eye password terlihat pada layar'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Register/New Register/button_eyePassword'))

'input nama user'
WebUI.setText(findTestObject('Web Mobile Object/Page_Register/New Register/textbox_Nama'), username)

'menutup keyboard'
Mobile.hideKeyboard()

'click nomor hp user'
WebUI.click(findTestObject('Web Mobile Object/Page_Register/New Register/textbox_phoneNumber'), FailureHandling.STOP_ON_FAILURE)

'menutup keyboard'
Mobile.hideKeyboard()

'input password'
WebUI.setText(findTestObject('Web Mobile Object/Page_Register/New Register/textbox_Password'), password)

'menutup keyboard'
Mobile.hideKeyboard()

'input konfirmasi password'
WebUI.setText(findTestObject('Web Mobile Object/Page_Register/New Register/textbox_konfirmasiPassword'), password)

'menutup keyboard'
Mobile.hideKeyboard()

'melakukan click pada button eye open password'
WebUI.click(findTestObject('Web Mobile Object/Page_Register/New Register/button_eyePassword'))

'melakukan click pada button eye konfirmasi password'
WebUI.click(findTestObject('Web Mobile Object/Page_Register/New Register/button_eyeKonfirmasiPassword'))

'melakukan click checkbox syarat dan ketentuan'
WebUI.click(findTestObject('Web Mobile Object/Page_Register/New Register/checkbox_syaratKetentuan'))

'mengambil screenshot pada layar syarat dan ketentuan'
WebUI.takeScreenshotAsCheckpoint('Syarat dan Ketentuan')

'scroll to element setuju syarat'
WebUI.scrollToElement(findTestObject('Web Mobile Object/Page_Register/New Register/button_setujuSyarat'), 0)

'melakukan click pada button setuju syarat'
WebUI.click(findTestObject('Web Mobile Object/Page_Register/New Register/button_setujuSyarat'))

'memastikan button daftar tidak dapat di click'
WebUI.verifyElementNotClickable(findTestObject('Web Mobile Object/Page_Register/New Register/button_Daftar'))

'memastikan alert nomor telepon tidak valid terlihat pada layar'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Register/New Register/label_alertNomorTidakValid'))

'screenshot register null phone number'
WebUI.takeScreenshotAsCheckpoint('register null phone number')

