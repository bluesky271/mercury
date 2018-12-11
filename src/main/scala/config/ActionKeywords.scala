package config

import java.util.concurrent.TimeUnit

import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver

object ActionKeywords {

  System.setProperty("webdriver.chrome.driver", "/Users/ngoulongkam/Documents/workspace/chromedriver")
  implicit val driver: WebDriver = new ChromeDriver()

  def navigate(): Unit = {
    driver.manage.timeouts.implicitlyWait(10, TimeUnit.SECONDS)
    driver.get("http://newtours.demoaut.com/")
  }

  def inputUsername(): Unit = {
    driver.findElement(By.name("userName")).sendKeys("testing")
  }

  def inputPassword(): Unit = {
    driver.findElement(By.name("password")).sendKeys("testing")
  }

  def closeBrowser(): Unit = {
    driver.quit()
  }
}
