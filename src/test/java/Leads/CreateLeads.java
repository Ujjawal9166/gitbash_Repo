package Leads;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeads {

	public static void main(String[] args) throws IOException {
		String key = "webdriver.chrome.driver";
		String value = "./src/main/resources/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		FileInputStream fis = new FileInputStream("./src/test/resources/propertydata.properties");
		Properties p = new Properties();
		p.load(fis);

		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pw = p.getProperty("password");
		
		driver.get(url);
		driver.findElement(By.id("userName")).sendKeys(un);
		driver.findElement(By.id("passWord")).sendKeys(pw);
		driver.findElement(By.xpath("//input[@alt='Sign In']")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//input[@value='New Lead']")).click();

//1st commit branch
	}

}
