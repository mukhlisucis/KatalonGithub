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
import com.sun.org.apache.xalan.internal.xslt.Process as Process
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver as RemoteWebDriver
import org.openqa.selenium.*
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import java.net.URL as URL
import org.json.JSONObject as JSONObject
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import java.util.NoSuchElementException as NoSuchElementException
import java.util.concurrent.TimeUnit as TimeUnit
import com.kms.katalon.core.util.internal.PathUtil as PathUtil

'Melakukan proses buka browser'
WebUI.openBrowser('')

//'Ijinkan Web untuk mengetahui lokasi user'
//CustomKeywords.'mobileWeb.mobileWebKeyword.StartSessionAppiumDefault'(GlobalVariable.AppiumPath)
'Menuju ke halaman web moservice'
WebUI.navigateToUrl(GlobalVariable.urlMoservice)

'Ijinkan Web untuk mengetahui lokasi user'
CustomKeywords.'general.HandlePopUpNonWebElement.AcceptGeolocation'(GlobalVariable.AppiumPath)

'memastikan label header moservice muncul pada layar dashboard'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Dashboard/label_HeaderMoservice'))

'memastikan textbox cari service muncul pada layar dashboard'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Dashboard/label_CariService'))

'memastikan label jelajahi layanan muncul pada layar dashboard'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Dashboard/label_JelajahiLayanan'))

'memastikan label nikmati layanan muncul pada layar dashboard'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Dashboard/label_NikmatiLayanan'))

'memastikan button service tab mobil muncul pada layar dashboard'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Dashboard/button_serviceTabMobil'))

'memastikan button service tab motor muncul pada layar dashboard'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Dashboard/button_serviceTabMotor'))

'click service mobil'
WebUI.click(findTestObject('Web Mobile Object/Page_Dashboard/button_serviceTabMobil'))

'memastikan button audio system muncul pada layar dashboard'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Dashboard/Tab Mobil/button_AudioSystem'))

'memastikan button ganti oli muncul pada layar dashboard'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Dashboard/Tab Mobil/button_GantiOli'))

'memastikan button jok kulit interior muncul pada layar dashboard'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Dashboard/Tab Mobil/button_JokKulitInterior'))

'memastikan button service AC muncul pada layar dashboard'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Dashboard/Tab Mobil/button_ServiceAC'))

'memastikan button service kaki kaki muncul pada layar dashboard'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Dashboard/Tab Mobil/button_ServiceKakiKaki'))

'memastikan button spesialis lampu muncul pada layar dashboard'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Dashboard/Tab Mobil/button_SpesialisLampu'))

'memastikan button spooring balancing muncul pada layar dashboard'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Dashboard/Tab Mobil/button_SpooringBalancing'))

'memastikan button lainnya muncul pada layar dashboard'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Dashboard/Tab Mobil/button_Lainnya'))

'memastikan label promo dan program seru muncul pada layar dashboard'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Dashboard/label_PromoDanProgramSeru'))

'memastikan button lainnya pada promo dan program seru muncul pada layar dashboard'
WebUI.verifyElementVisible(findTestObject('Web Mobile Object/Page_Dashboard/button_LihatSemuaPromo'))

'screenshot berada di halaman dashboard'
WebUI.takeScreenshotAsCheckpoint('berada dalam halaman dashboard')

