package day_2;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Creating_ExcelSheet {
	public static void main(String [] args) {
		//Generating workbook for the data
		XSSFWorkbook workbook = new XSSFWorkbook(); 
		//Create a blank sheet
		XSSFSheet sheet = workbook.createSheet("Employee_Data");

		//Prepare data to be written as an Object[]
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
		data.put("1", new Object[] {"ID", "NAME", "LASTNAME"});
		data.put("2", new Object[] {1, "Deepika", "Vanka"});
		data.put("3", new Object[] {2, "Surya", "Polisetti"});
		data.put("4", new Object[] {3, "Alekhya", "Akula"});
		data.put("5", new Object[] {4, "jhansi", "Venna"});
		data.put("6", new Object[] {5, "Ramesh", "Potlapuvvu"});
		data.put("7", new Object[] {6, "Bhanuprakash", "Sidham"});

		//Iterate over data and write to sheet
		Set<String> keyset = data.keySet();
		int rownum = 0;
		for (String key : keyset) {

			XSSFRow row = sheet.createRow(rownum++);
			Object [] objArr = data.get(key);
			int cellnum = 0;
			for (Object obj : objArr)
			{
				XSSFCell cell = row.createCell(cellnum++);
				if(obj instanceof String)
					cell.setCellValue((String)obj);
				else if(obj instanceof Integer)
					cell.setCellValue((Integer)obj);
			}
		}

		//Write the workbook in file system
		try {
			FileOutputStream out = new FileOutputStream(new File("C:\\Users\\Deepa\\OneDrive\\Desktop\\Excel_Sheet\\MyWorkSheet.xlsx"));
			workbook.write(out);
			out.close();
			System.out.println("MyWorkSheet.xlsx written successfully on disk.");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

