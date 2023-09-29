import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
import java.lang.ref.ReferenceQueue.Null as Null
import java.sql.Connection as Connection
import java.sql.ResultSet as ResultSet
import java.sql.DriverManager as DriverManager
import java.sql.Statement as Statement
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys
import java.io.FileInputStream as FileInputStream
import java.io.FileNotFoundException as FileNotFoundException
import java.io.IOException as IOException
import java.util.Date as Date
import org.apache.poi.xssf.usermodel.XSSFCell as XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow as XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import java.lang.String as String

Connection conn = null

ResultSet actorData

ResultSet actorData2

//Target DB dengan penambahan timezone beserta query-nya
conn = DriverManager.getConnection(GlobalVariable.dbHostAddress, GlobalVariable.dbUsername, GlobalVariable.dbPassword)

conn.setAutoCommit(false)

actorData = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery'(conn, "SELECT code FROM db_users.mst_otp where phonenumber = $GlobalVariable.nomorHp order by created desc limit 1")

println(actorData)

if (actorData.next()) {
    String hslQuery1 = actorData.getString('code')

    println(hslQuery1)

//    CustomKeywords.'aksesApp.LibJosh.addGlobalVariable'('code', hslQuery1)

    CustomKeywords.'general.addGlobalVariable.addGlobalVariableFloating'('code', hslQuery1)
}

println(GlobalVariable.code)

