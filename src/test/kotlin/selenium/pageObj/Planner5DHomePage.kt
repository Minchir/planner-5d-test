package selenium.pageObj

import org.junit.Assert
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory


class Planner5DHomePage(driver: WebDriver) {

    private var driver: WebDriver? = null

    @FindBy(xpath = "//*[contains(text(), 'Check our prices')]")
    internal var checkPrices: WebElement? = null

    @FindBy(tagName = "button")
    val buttons: List<WebElement>? = null

    init {
        this.driver = driver
        PageFactory.initElements(driver, this)
    }

    fun openUrl() {
        driver!!.get("https://planner5d.com/")
    }

    fun clickCheckPrices() {
        checkPrices!!.click()
    }

    fun countButtons() {
        if(buttons?.size != 0) {
            Assert.assertEquals(buttons?.size, 14)
            println("There are exactly " + buttons?.size + " on this page")
        } else {
            println("Ooops, we have " + buttons?.size + " on this page")
        }
    }
}