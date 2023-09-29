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

'memastikan textbox username terlihat pada layar lupa password '
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Lupa Password/textbox_Username'))

'input dengan invalid format email'
WebUI.setText(findTestObject('Web Mobile Object/Page_Lupa Password/textbox_Username'), email)

'melakukan click pada label untuk triger notif muncul'
WebUI.click(findTestObject('Web Mobile Object/Page_Lupa Password/label_Informasi'))

'memastikan label format salah muncul pada layar lupa password'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Lupa Password/label_InvalidFormat'))

'memastikan button lanjut tidak bisa di click'
WebUI.verifyElementNotClickable(findTestObject('Web Mobile Object/Page_Lupa Password/button_Lanjut'))

'mengambil screenshot'
WebUI.takeScreenshotAsCheckpoint('lupa password invalid no hp or email')

