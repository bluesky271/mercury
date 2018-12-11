package executionEngine

import config.ActionKeywords
import utility.ExcelUtils

object DriverScript extends ExcelUtils {

  def main(args: Array[String]): Unit = {
    val dataEnginePath = "/Users/ngoulongkam/Documents/workspace/mercury/src/main/scala/dataEngine/DataEngine.xlsx"

    setExcelFile(dataEnginePath, "Test Steps")

    for (iRow <- 1 to 5 by 1) {
      val sActionKeyword: String = getCellData(iRow, 3)

      sActionKeyword match {
        case "openBrowser"    => ActionKeywords.openBrowser()
        case "navigate"       => ActionKeywords.navigate()
        case "inputUsername"  => ActionKeywords.inputUsername()
        case "inputPassword"  => ActionKeywords.inputPassword()
        case "closeBrowser"   => ActionKeywords.closeBrowser()
      }
    }
  }
}