package BaseLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseCls {
public static Properties prop;
public static WebDriver driver;
public BaseCls() throws IOException
{
	prop=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\akansha\\eclipse-workspace\\newHome\\src\\main\\java\\newHome\\Utils\\test.properties");
	prop.load(fis);
}


public void initialize()
{
	String str=prop.getProperty("browser");
	if (str.equals("ff"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\akansha\\eclipse-workspace\\newHome\\exeFiles\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(prop.getProperty("url"));
	}
}

}
