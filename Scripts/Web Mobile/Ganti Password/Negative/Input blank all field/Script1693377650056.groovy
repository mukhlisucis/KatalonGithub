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

'melakukan scroll pada button ganti password'
WebUI.scrollToElement(findTestObject('Web Mobile Object/Page_Akun/button_GantiPassword'), 0)

'memastikan button ganti password terlihat pada layar menu user'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Akun/button_GantiPassword'))

'click pada button ganti password'
WebUI.click(findTestObject('Web Mobile Object/Page_Akun/button_GantiPassword'))

'melakukan screenshot untuk memastikan user berada di layar ubah password'
WebUI.takeScreenshotAsCheckpoint('page ubah password')

'memastikan label password lama terlihat pada layar ubah password'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Ganti Password/label_PasswordLama'))

'memastikan textbox input password lama terlihat pada layar ubah password'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Ganti Password/textbox_InputOldPassword'))

'memastikan label password baru terlihat pada layar ubah password'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Ganti Password/label_NewPassword'))

'memastikan textbox password baru terlihat pada layar ubah password'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Ganti Password/textbox_InputNewPassword'))

'memastikan label konfirmasi password terlihat pada layar ubah password'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Ganti Password/label_KonfirmasiNewPass'))

'memastikan textbox konfirmasi password terlihat pada layar ubah password'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Ganti Password/textbox_ConfirmNewPass'))

'memastikan button ubah password disable dan tidak bisa di click'
WebUI.verifyElementNotClickable(findTestObject('Web Mobile Object/Page_Ganti Password/button_UbahPassword'))

'melakukan screenshot di layar ubah password'
WebUI.takeScreenshotAsCheckpoint('blank all field ubah password')

