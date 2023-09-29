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

'memastikan textbox username terlihat pada layar lupa password'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Lupa Password/textbox_Username'))

'melakukan input nomor hp ke textbox lupa password'
WebUI.setText(findTestObject('Web Mobile Object/Page_Lupa Password/textbox_Username'), phoneNumber)

//CustomKeywords.'aksesApp.LibJosh.addGlobalVariable'('nomorHp', phoneNumber)
'menyimpan value nomor hp kedalam global variable floating nomorHp'
CustomKeywords.'general.addGlobalVariable.addGlobalVariableFloating'('nomorHp', phoneNumber)

'menutup keyboard'
Mobile.hideKeyboard()

'memastikan button lanjut bisa di click'
WebUI.verifyElementClickable(findTestObject('Web Mobile Object/Page_Lupa Password/button_Lanjut'))

'melakukan klik pada button lanjut'
WebUI.click(findTestObject('Web Mobile Object/Page_Lupa Password/button_Lanjut'))

'memastikan label verifikasi akun terlihat pada layar'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_VerifikasiAkun/label_VerifikasiAkun'))

'memastikan button kirim otp melalui sms terlihat pada layar'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_VerifikasiAkun/button_SMSotp'))

'memastikan button kirim otp melalui whatsapp terlihat pada layar'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_VerifikasiAkun/button_WhatssappOTP'))

'mengambil screenshot'
WebUI.takeScreenshotAsCheckpoint('direct kirim otp lupa password')

'melakukan klik pada button kirim otp melalui sms'
WebUI.click(findTestObject('Web Mobile Object/Page_VerifikasiAkun/button_SMSotp'))

