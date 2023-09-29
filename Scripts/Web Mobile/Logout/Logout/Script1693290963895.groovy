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

'memastikan nama user muncul pada layar menu user'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Akun/label_NamaUser'))

'memastikan label akun muncul pada layar menu akun'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Login/label_Akun'))

'memastikan button kotak masuk terlihat pada laya menu user'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Akun/button_KotakMasuk'))

'memastikan button data kendaraan terlihat pada laya menu user'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Akun/button_DataKendaraan'))

'memastikan button booking service terlihat pada laya menu user'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Akun/button_BookingService'))

'memastikan button ulasan rating terlihat pada laya menu user'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Akun/button_UlasanRating'))

'memastikan button kupon saya terlihat pada laya menu user'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Akun/button_KuponSaya'))

'scroll ke object button ganti password'
WebUI.scrollToElement(findTestObject('Web Mobile Object/Page_Akun/button_GantiPassword'), 0)

'memastikan button ganti password terlihat pada laya menu user'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Akun/button_GantiPassword'))

'scroll ke object button logout'
WebUI.scrollToElement(findTestObject('Web Mobile Object/Page_Akun/button_Logout'), 0)

'melakukan klik pada button logout'
WebUI.click(findTestObject('Web Mobile Object/Page_Akun/button_Logout'))

'memastikan notifikasi berhasil logout'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Logout/label_BerhasilLogout'))

'mengambil screenshot pada layar berhasil logout'
WebUI.takeScreenshotAsCheckpoint('logout success')

