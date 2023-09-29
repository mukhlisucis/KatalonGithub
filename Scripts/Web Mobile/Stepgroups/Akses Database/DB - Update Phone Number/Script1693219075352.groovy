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

actorData = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery'(conn,  """select * from db_users.credential where mobile_no = ${GlobalVariable.nomorHp}""")

println(actorData)

if (actorData.next()) {
	String hslQuery1 = actorData.getString('mobile_no')
	println(hslQuery1)
		
		//menyambung koneksi ke database
		
		actorData
		
		actorData2
		
		//menghapus phone number yang sudah didaftarkan
		actorData2 = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.executeUpdate'(conn, """UPDATE db_users.credential SET mobile_no = '085770701234567' where mobile_no = '$GlobalVariable.nomorHp'""")
		
		conn.setAutoCommit(false)
		
		println(actorData2)
		
		if (actorData2 == null) {
		    println('phone number sudah di hapus')
		} else {
		    println('phone number Terhapus')
		}
		
		CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.closeConnection'(conn)
		
		WebUI.delay(3)
		
		
		}

