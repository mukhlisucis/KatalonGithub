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

'memastikan textbox input nama muncul pada layar registrasi'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Register/textbox_InputNama'))

'melakukan input pada field input nama'
WebUI.setText(findTestObject('Web Mobile Object/Page_Register/textbox_InputNama'), username)

'memastikan textbox input nomor hp muncul pada layar registrasi'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Register/textbox_InputPhone'))

'melakukan input nomor hp pada field textbox nomor hp dengan jumlah lebih dari 12 digit'
WebUI.setText(findTestObject('Web Mobile Object/Page_Register/textbox_InputPhone'), phoneNumber)

'memastikan textbox input password muncul pada layar registrasi'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Register/textbox_InputPassword'))

'melakukan input password pada field password'
WebUI.setText(findTestObject('Web Mobile Object/Page_Register/textbox_InputPassword'), password)

'menutup keyboard pada halaman'
Mobile.hideKeyboard()

'melakukan click pada checkbox setuju dengan syarat '
WebUI.click(findTestObject('Web Mobile Object/Page_Register/checkbox_SetujuSyarat'))

'scroll pada button setuju'
WebUI.scrollToElement(findTestObject('Web Mobile Object/Page_Register/button_Setuju'), 0)

'mengambil screenshot pada layar syarat'
WebUI.takeScreenshotAsCheckpoint('Setuju persyaratan')

'melakukan click pada tombol setuju'
WebUI.click(findTestObject('Web Mobile Object/Page_Register/button_Setuju'))

'memastikan button register dapat di click'
WebUI.verifyElementClickable(findTestObject('Web Mobile Object/Page_Register/button_Register'))

'melakukan click pada tombol register'
WebUI.click(findTestObject('Web Mobile Object/Page_Register/button_Register'))

'menunggu alert muncul pada layar registrasi'
WebUI.waitForAlert(0)

'memastikan alert muncul pada layar registrasi'
WebUI.verifyAlertPresent(0)

'menyimpan value pada alert'
alert = WebUI.getAlertText()

'membandingkan antara alert dan expected harus sama'
WebUI.verifyMatch(alert, 'Something went wrong - Check Registered fail', true)

//println(alert)
//'membandingkan antara alert dan expected harus sama'
//assertEquals(alert, 'Something went wrong - Check Registered fail')

'accept pada alert '
WebUI.acceptAlert()

'mengambil screenshot pada layar registrasi'
WebUI.takeScreenshotAsCheckpoint('register nomor hp lebih dari 12')

