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
import static org.junit.Assert.assertEquals

'memastikan textbox input email dan password terlihat pada layar login'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/textbox_InputEmailPhone'))

'melakukan input phone number pada textbox input email/phone number'
WebUI.setText(findTestObject('Web Mobile Object/Page_Login/textbox_InputEmailPhone'), phoneNumber)

'memastikan textbox untuk input password terlihat pada layar login'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/textboxt_InputPassword'))

'melakukan input password'
WebUI.setText(findTestObject('Web Mobile Object/Page_Login/textboxt_InputPassword'), password)

'menyimpan tribute sebelum di click pada input password dan disimpan pada variable typeBeforeClick'
typeBeforeClick = WebUI.getAttribute(findTestObject('Web Mobile Object/Page_Login/textboxt_InputPassword'), 'type')

'memastikan value typeBeforeClick harus sama dengan password'
WebUI.verifyMatch(typeBeforeClick, 'password', true)

//'memastikan value typeBeforeClick harus sama dengan password'
//assertEquals(typeBeforeClick, 'password')

'menutup keyboard pada layar login'
Mobile.hideKeyboard()

'mengambil screenshot pada layar login'
WebUI.takeScreenshotAsCheckpoint('login not tap eye')

'memastikan button login dapat di click'
WebUI.verifyElementClickable(findTestObject('Web Mobile Object/Page_Login/button_Login'))

'melakukan click pada button login'
WebUI.click(findTestObject('Web Mobile Object/Page_Login/button_Login'))

'memastikan label Cari service muncul pada layar dashboard user'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Dashboard/label_CariService'), FailureHandling.STOP_ON_FAILURE)

'memastikan label header moservice muncul pada layar dashboard user'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Dashboard/label_HeaderMoservice'), FailureHandling.STOP_ON_FAILURE)

'memastikan button beranda muncul pada layar dashboard user'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Dashboard/button_Beranda'), FailureHandling.STOP_ON_FAILURE)

'memastikan button masuk akun muncul pada layar dashboard user'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Akun/button_Akun'), FailureHandling.STOP_ON_FAILURE)

'memastikan label akun pada button akun muncul pada layar dashboard user'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/label_Akun'), FailureHandling.STOP_ON_FAILURE)

'mengambil screenshot pada layar dashboard user'
WebUI.takeScreenshotAsCheckpoint('not tap redirect to dashboard')

