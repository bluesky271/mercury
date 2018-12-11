package executionEngine

import java.util.concurrent.TimeUnit

import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver

object DriverScript {

//  private val driver: WebDriver = null

  def main(args: Array[String]): Unit = {
    System.setProperty("webdriver.chrome.driver", "/Users/ngoulongkam/Documents/workspace/chromedriver")
    implicit val driver: WebDriver = new ChromeDriver()
    driver.manage.timeouts.implicitlyWait(10, TimeUnit.SECONDS)
    driver.get("http://newtours.demoaut.com/")
    driver.findElement(By.name("userName")).sendKeys("testing")
  }
}
