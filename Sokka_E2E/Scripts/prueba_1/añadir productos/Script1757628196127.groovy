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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.demoblaze.com/')

WebUI.maximizeWindow()

// Espera y clic en categoría
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_STORE/a_CATEGORIES_hrefch'), 10)

WebUI.click(findTestObject('Object Repository/Page_STORE/a_CATEGORIES_hrefch'))

// Espera y clic en primer producto
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_STORE/a_Product description_btn btn-success btn-lg'), 
    10)

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Product description_btn btn-success btn-lg'))

// Espera y acepta alerta
WebUI.waitForAlert(10)

WebUI.acceptAlert()

// Espera y cierra modal
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_STORE/a_Close_nava'), 10)

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Close_nava'))

// Espera y clic en segundo producto
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_STORE/a_360_hrefch'), 10)

WebUI.click(findTestObject('Object Repository/Page_STORE/a_360_hrefch'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_STORE/a_Product description_btn btn-success btn-lg_1'), 
    10)

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Product description_btn btn-success btn-lg_1'))

WebUI.waitForAlert(10)

WebUI.acceptAlert()

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_STORE/a_Close_nava'), 10)

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Close_nava'))

// Ir al carrito
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_STORE/a_(current)_cartur'), 10)

WebUI.click(findTestObject('Object Repository/Page_STORE/a_(current)_cartur'))

// Comprar
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_STORE/button_Total_btn btn-success'), 10)

WebUI.click(findTestObject('Object Repository/Page_STORE/button_Total_btn btn-success'))

// Llenar formulario
WebUI.waitForElementVisible(findTestObject('Object Repository/Page_STORE/input_Name_name'), 10)

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Name_name'), 'Luis Torres')

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_STORE/input_Country_country'), 10)

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Country_country'), 'Ecuador')

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_STORE/input_City_city'), 10)

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_City_city'), 'Quito')

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_STORE/input_Credit card_card'), 10)

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Credit card_card'), '1234567890')

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_STORE/input_Month_month'), 10)

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Month_month'), 'septiembre')

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_STORE/input_Year_year'), 10)

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Year_year'), '2025')

// Confirmar compra
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_STORE/button_Close_btn btn-primary'), 10)

WebUI.click(findTestObject('Object Repository/Page_STORE/button_Close_btn btn-primary'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_STORE/button_Cancel_confirm btn btn-lg btn-primary'), 
    10)

WebUI.click(findTestObject('Object Repository/Page_STORE/button_Cancel_confirm btn btn-lg btn-primary'))

WebUI.closeBrowser()

