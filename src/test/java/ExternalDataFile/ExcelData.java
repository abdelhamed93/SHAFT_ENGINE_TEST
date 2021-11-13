package ExternalDataFile;

import com.shaft.tools.io.ExcelFileManager;

public class ExcelData {

	// To read from external data file (excel).
	public String fileName = "googleData.xlsx";
	public String filePath = System.getProperty("user.dir") + "/data/" + fileName;
	ExcelFileManager excelReader = new ExcelFileManager(System.getProperty("user.dir") + "/data/" + fileName);

}
