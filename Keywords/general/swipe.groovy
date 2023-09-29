package general

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class swipe {
	/**
	 * Swipe Vertical from bottom to top
	 */
	@Keyword
	def swipeUp() {
		int device_Height = Mobile.getDeviceHeight()

		'Get Width Height and Store in device_Width variable'
		int device_Width = Mobile.getDeviceWidth()

		'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
		int startX = device_Width / 2

		'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
		int endX = startX

		'Storing the startY value'
		int startY = device_Height * 0.30

		'Storing the endY value'
		int endY = device_Height * 0.70

		'Swipe Vertical from bottom to top'
		Mobile.swipe(startX, endY, endX, startY)
	}
	/**
	 * Swipe Vertical from top to bottom
	 */
	@Keyword
	def swipeDown() {
		int device_Height = Mobile.getDeviceHeight()

		'Get Width Height and Store in device_Width variable'
		int device_Width = Mobile.getDeviceWidth()

		'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
		int startX = device_Width / 2

		'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
		int endX = startX

		'Storing the startY value'
		int startY = device_Height * 0.30

		'Storing the endY value'
		int endY = device_Height * 0.70

		'Swipe Vertical from top to bottom'
		Mobile.swipe(startX, startY, endX, endY)
	}
	/**
	 * Swipe Horizontal from left to right
	 */
	@Keyword
	def swipeRight() {
		int device_Height = Mobile.getDeviceHeight()

		'Get Width Height and Store in device_Width variable'
		int device_Width = Mobile.getDeviceWidth()

		'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
		int startX = device_Width*0.70

		'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
		int endX = device_Width*0.30

		'Storing the startY value'
		int startY = device_Height /2

		'Swipe Horizontal from left to right'
		Mobile.swipe(endX,startY, startX, startY )
	}
	/**
	 * Swipe Horizontal from left to right
	 */
	@Keyword
	def swipeLeft() {
		int device_Height = Mobile.getDeviceHeight()

		'Get Width Height and Store in device_Width variable'
		int device_Width = Mobile.getDeviceWidth()

		'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
		int startX = device_Width*0.70

		'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
		int endX = device_Width*0.30

		'Storing the startY value'
		int startY = device_Height/2.5

		'Swipe Horizontal from left to right'
		Mobile.swipe(startY,startX, endX, startY )
	}
	
	@Keyword
	def swipeElement(TestObject testObject, int xOffset, int yOffset) {

		//xOffset = nilai minus swipe element ke kiri contoh ( -200 )
		//yOffset = nilai minus swipe element ke bawah contoh ( -200 )
		String boundsAttribute = Mobile.getAttribute(testObject, 'bounds', 0)

		def coordinates = boundsAttribute.tokenize('][').collect { it.replaceAll('[\\[\\]]', '').tokenize(',')*.toInteger() }

		int startX = coordinates[0][0] + (coordinates[1][0] - coordinates[0][0]) / 2
		int startY = coordinates[0][1] + (coordinates[1][1] - coordinates[0][1]) / 2
		int endX = startX + xOffset
		int endY = startY + yOffset

		Mobile.swipe(startX, startY, endX, endY)
	}
}
