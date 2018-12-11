package executionEngine

import config.ActionKeywords
import utility.ExcelUtils

object DriverScript extends ExcelUtils {

  def main(args: Array[String]): Unit = {
    for (iRow <- 1 to 5 by 1) {
      val sActionKeyword: String = getCellData(iRow, 3)

      sActionKeyword match {
        case "navigate"       => ActionKeywords.navigate()
        case "inputUsername"  => ActionKeywords.inputUsername()
        case "inputPassword"  => ActionKeywords.inputPassword()
        case "closeBrowser"   => ActionKeywords.closeBrowser()
      }
    }
  }
}