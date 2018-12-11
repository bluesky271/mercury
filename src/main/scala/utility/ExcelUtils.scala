package utility

import java.io.FileInputStream

import org.apache.poi.xssf.usermodel.{XSSFCell, XSSFSheet, XSSFWorkbook}

class ExcelUtils {

  val dataEnginePath = "/Users/ngoulongkam/Documents/workspace/mercury/src/main/scala/dataEngine/DataEngine.xlsx"

  val excelFile: FileInputStream = new FileInputStream(dataEnginePath)
  val excelWBook: XSSFWorkbook = new XSSFWorkbook(excelFile)
  val excelWSheet: XSSFSheet = excelWBook.getSheet("Test Steps")

  def getCellData(rowNum: Int, colNum: Int): String = {
    val cell: XSSFCell = excelWSheet.getRow(rowNum).getCell(colNum)
    val cellData: String = cell.getStringCellValue
    cellData
  }
}