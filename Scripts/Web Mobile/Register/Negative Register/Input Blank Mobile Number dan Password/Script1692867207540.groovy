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

'memastikan textbox input nama muncul pada layar registrasi'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Register/textbox_InputNama'))

'melakukan input pada field input nama'
WebUI.setText(findTestObject('Web Mobile Object/Page_Register/textbox_InputNama'), username)

'menutup keyboard pada layar registrasi'
Mobile.hideKeyboard()

'melakukan click pada checkbox setuju dengan syarat '
WebUI.click(findTestObject('Web Mobile Object/Page_Register/checkbox_SetujuSyarat'))

'scroll pada button setuju'
WebUI.scrollToElement(findTestObject('Web Mobile Object/Page_Register/button_Setuju'), 0)

'mengambil screenshot pada layar syarat'
WebUI.takeScreenshotAsCheckpoint('Setuju persyaratan')

'melakukan click pada button setuju'
WebUI.click(findTestObject('Web Mobile Object/Page_Register/button_Setuju'))

'memastikan button register tidak bisa di click'
WebUI.verifyElementNotClickable(findTestObject('Web Mobile Object/Page_Register/button_Register'))

'mengambil screenshot pada layar registrasi'
WebUI.takeScreenshotAsCheckpoint('register blank number dan password')

