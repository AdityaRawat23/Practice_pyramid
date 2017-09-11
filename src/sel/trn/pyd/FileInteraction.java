package sel.trn.pyd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileInteraction {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file =new File("D:\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		row.getCell(1).setCellType(CellType.STRING);
		System.out.println(row.getCell(0).getStringCellValue()+"||");
	}
}
