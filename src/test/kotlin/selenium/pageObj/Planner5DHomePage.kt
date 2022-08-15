package selenium.pageObj

import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory


class Planner5DHomePage(driver: WebDriver) {

    private var driver: WebDriver? = null

    @FindBy(name = "q")
    internal var searchBox: WebElement? = null

    init {
        this.driver = driver
        PageFactory.initElements(driver, this)
    }

    fun openUrl() {
        driver!!.get("https://planner5d.com/")
    }

    fun searchFor(_searchTerm: String) {
        searchBox!!.sendKeys(_searchTerm + Keys.RETURN)
    }
}