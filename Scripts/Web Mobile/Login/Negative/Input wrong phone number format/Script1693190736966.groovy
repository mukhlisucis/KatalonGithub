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

'memastikan textbox input email / no hp terlihat pada layar login'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/textbox_InputEmailPhone'))

'input wrong phoneNumber format pada field input email/nomor hp'
WebUI.setText(findTestObject('Web Mobile Object/Page_Login/textbox_InputEmailPhone'), phoneNumber)

'delay 2 detik'
WebUI.delay(2)

'memastikan textbox password terlihat pada layar login'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/textboxt_InputPassword'))

'input password pada field input password'
WebUI.setText(findTestObject('Web Mobile Object/Page_Login/textboxt_InputPassword'), password)

'menutup keyboard pada layar login'
Mobile.hideKeyboard()

'memastikan alert invalid phone number muncul pada layar login'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/label_InvalidPhone'))

'memastikan button login tidak bisa di click'
WebUI.verifyElementNotClickable(findTestObject('Web Mobile Object/Page_Login/button_Login'))

'mengambil screenshot pada layar login'
WebUI.takeScreenshotAsCheckpoint('login wrong phone number 1')

'refresh layar'
WebUI.refresh()

'memastikan textbox input email / no hp terlihat pada layar login'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/textbox_InputEmailPhone'))

'input wrong phoneNumber format pada field input email/nomor hp'
WebUI.setText(findTestObject('Web Mobile Object/Page_Login/textbox_InputEmailPhone'), phoneNumber2)

'delay 2 detik'
WebUI.delay(2)

'memastikan textbox password terlihat pada layar login'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/textboxt_InputPassword'))

'input password pada field input password'
WebUI.setText(findTestObject('Web Mobile Object/Page_Login/textboxt_InputPassword'), password)

'menutup keyboard pada layar login'
Mobile.hideKeyboard()

'memastikan alert invalid phone number muncul pada layar login'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/label_InvalidPhone'))

'memastikan button login tidak bisa di click'
WebUI.verifyElementNotClickable(findTestObject('Web Mobile Object/Page_Login/button_Login'))

'mengambil screenshot pada layar login'
WebUI.takeScreenshotAsCheckpoint('login wrong phone number 2')

'refresh layar'
WebUI.refresh()

'input wrong phoneNumber format pada field input email/nomor hp'
WebUI.setText(findTestObject('Web Mobile Object/Page_Login/textbox_InputEmailPhone'), phoneNumber3)

'delay 2 detik'
WebUI.delay(2)

'memastikan textbox password terlihat pada layar login'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/textboxt_InputPassword'))

'input password pada field input password'
WebUI.setText(findTestObject('Web Mobile Object/Page_Login/textboxt_InputPassword'), password)

'menutup keyboard pada layar login'
Mobile.hideKeyboard()

'memastikan alert invalid phone number muncul pada layar login'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/label_InvalidPhone'))

'memastikan button login tidak bisa di click'
WebUI.verifyElementNotClickable(findTestObject('Web Mobile Object/Page_Login/button_Login'))

'mengambil screenshot pada layar login'
WebUI.takeScreenshotAsCheckpoint('login wrong phone number 3')

