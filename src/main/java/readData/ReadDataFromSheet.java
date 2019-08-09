package readData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import BaseLib.BaseCls; 
public class ReadDataFromSheet extends BaseCls{
public ReadDataFromSheet() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
public String s="C:\\Users\\akansha\\eclipse-workspace\\newHome\\Data\\Data.xlsx";
public Workbook book;
public Sheet sh;
FileInputStream fis;


public Object[][] readdata(String sheetname) throws EncryptedDocumentException, IOException
{
fis=new FileInputStream(s);
book=WorkbookFactory.create(fis);
sh=book.getSheet(sheetname);
Object[][] obj=new Object[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
for (int i = 0; i < sh.getLastRowNum(); i++) {
	for (int j = 0; j < sh.getRow(0).getLastCellNum(); j++) {
obj[i][j]=sh.getRow(i+1).getCell(j).toString();
	}
}
return obj;
}
}
