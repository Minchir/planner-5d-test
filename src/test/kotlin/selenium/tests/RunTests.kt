package selenium.tests

import selenium.helpers.DriverFactory
import selenium.pageObj.Planner5DHomePage

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.openqa.selenium.WebDriver


class RunTests {

    private var driver: WebDriver? = null
    private lateinit var planner5DHomePage: Planner5DHomePage

    @Before
    fun setUp() {
        driver = DriverFactory.browser
        planner5DHomePage = Planner5DHomePage(driver!!)
    }

    @Test
    fun testPlanner() {
        //Write your test here
        planner5DHomePage.openUrl()
        planner5DHomePage.clickCheckPrices()
        planner5DHomePage.countButtons()
    }

    @After
    fun tearDown() {
        driver!!.quit()
    }
}
