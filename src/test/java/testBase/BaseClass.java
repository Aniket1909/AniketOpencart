package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	public  WebDriver driver;
	public Logger logger;
	public Properties p;
	
	
	@BeforeClass(groups= {"Sanity","Regression","Master","Dataprovider"})
	@Parameters("browser")
	public void setup( String br) throws IOException
	{
		
		FileReader file = new FileReader(".///src/test/resources/config.properties");
		p = new Properties();
		p.load(file);
		
		
		//ChromeOptions options = new ChromeOptions();
	    //driver = new ChromeDriver(options);
		logger=LogManager.getLogger(this.getClass());
		if(br.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			driver= new EdgeDriver();
		}
		//driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(p.getProperty("appurl"));
	}
	
	@AfterClass(groups= {"Sanity","Regression","Master","Dataprovider"})
	public void teardown()
	{
		driver.quit();
	}
	
	public String generatedstring()
	{
		String randomstring= RandomStringUtils.randomAlphabetic(7);
		return randomstring;
	}
	
	public String generatednumber()
	{
		String randomnumber= RandomStringUtils.randomNumeric(7);
		return randomnumber;
	}
	
	public String genratedalphanumeric()
	{
		String letter= RandomStringUtils.randomAlphabetic(4);
		String num= RandomStringUtils.randomNumeric(4);
		return (letter+"@"+num);
	}
}
