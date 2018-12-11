package utility

import java.io.FileInputStream

import org.apache.poi.xssf.usermodel.{XSSFCell, XSSFSheet, XSSFWorkbook}

class ExcelUtils {

  var excelWSheet: XSSFSheet = _
  var excelWBook: XSSFWorkbook = _
  var cell: XSSFCell = _

  def setExcelFile(path: String, sheetName: String): Unit = {
    val excelFile: FileInputStream = new FileInputStream(path)
    val excelWBook: XSSFWorkbook = new XSSFWorkbook(excelFile)
    excelWBook.getSheet(sheetName)
  }

  def getCellData(rowNum: Int, colNum: Int): String = {
    val cell: XSSFCell = excelWSheet.getRow(rowNum).getCell(colNum)
    val cellData: String = cell.getStringCellValue
    cellData
  }
}