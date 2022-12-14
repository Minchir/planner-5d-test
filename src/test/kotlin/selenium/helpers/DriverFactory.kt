package selenium.helpers

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import java.util.*


object DriverFactory {

    val browser: WebDriver
        get() {
            System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver_win32\\chromedriver.exe")
            val driver: WebDriver
            val browserName = System.getProperty("browser", DriverType.CHROME.toString()).uppercase(Locale.getDefault())

            when (DriverType.valueOf(browserName)) {
                DriverType.CHROME -> {
                    driver = ChromeDriver()
                }
            }

            driver.manage().window().maximize()
            return driver
        }
}