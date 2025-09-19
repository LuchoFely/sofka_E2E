package utils

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

public class WebActions {

	@Keyword
	def safeClick(TestObject obj, int timeout = 10) {
		try {
			if (WebUI.verifyElementPresent(obj, timeout, FailureHandling.OPTIONAL)) {
				WebUI.waitForElementClickable(obj, timeout)
				WebUI.click(obj)
				WebUI.comment("Click exitoso en: " + obj.getObjectId())
			} else {
				WebUI.comment("Elemento no encontrado: " + obj.getObjectId())
			}
		} catch (Exception e) {
			WebUI.comment("Error al hacer clic en: " + obj.getObjectId() + " - " + e.getMessage())
		}
	}

	@Keyword
	def safeSetText(TestObject obj, String text, int timeout = 10) {
		try {
			if (WebUI.verifyElementPresent(obj, timeout, FailureHandling.OPTIONAL)) {
				WebUI.waitForElementVisible(obj, timeout)
				WebUI.setText(obj, text)
				WebUI.comment("Texto ingresado en: " + obj.getObjectId())
			} else {
				WebUI.comment("Campo no encontrado: " + obj.getObjectId())
			}
		} catch (Exception e) {
			WebUI.comment("Error al escribir en: " + obj.getObjectId() + " - " + e.getMessage())
		}
	}

	@Keyword
	def handleAlert(int timeout = 5) {
		try {
			if (WebUI.waitForAlert(timeout, FailureHandling.OPTIONAL)) {
				WebUI.acceptAlert()
				WebUI.comment("Alerta aceptada")
			} else {
				WebUI.comment("No apareció alerta")
			}
		} catch (Exception e) {
			WebUI.comment("Error al manejar alerta - " + e.getMessage())
		}
	}
}

