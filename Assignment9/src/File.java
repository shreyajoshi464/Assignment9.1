import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File {
	WebDriver dr;
	String url="configFileReader.getApplicationUrl";
	

	@Before
	public void setUp() throws Exception {
		configFileReader=new ConfigFileReader();
		System.setProperty("webdriver.chrome.driver",configFileReader.getDriverPath());
		dr=new ChromeDriver();
		dr.get(url);
		dr.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		dr.quit();
	}

	@Test
	public void test() {
		
	}

}
