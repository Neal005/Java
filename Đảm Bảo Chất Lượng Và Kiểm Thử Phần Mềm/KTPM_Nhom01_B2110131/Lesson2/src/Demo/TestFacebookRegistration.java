package Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestFacebookRegistration
{
	
	public static void trangChu(WebDriver driver)
	{
		//find the "Tạo tài khoản mới" button
		driver.findElement(By.linkText("Tạo tài khoản mới")).click();
	}
	
	public static void dangKy(WebDriver driver)
	{
		driver.findElement(By.name("firstname")).sendKeys("Nguyễn");
		driver.findElement(By.name("lastname")).sendKeys("Lực");
		
		List <WebElement> gioitinh = driver.findElements(By.name("sex"));
		gioitinh.get(1).click();
		
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByIndex(22);
		
		Select month = new Select(driver.findElement(By.id("month")));
		day.selectByIndex(8);
		
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("2003");
		
		//sdt va email
		driver.findElement(By.name("reg_email__")).sendKeys("luc@email.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("1234@5678");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("1234@5678");
		
		//submit
		driver.findElement(By.name("websubmit")).click();
		
		//tim hieu them
		driver.findElement(By.linkText("Tìm hiểu thêm")).click();;
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","F:\\Source code\\Java\\Install Selenium\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		//driver.get("http://www.facebook.com");
		driver.get("https://vi-vn.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		trangChu(driver);
		
		dangKy(driver);
	}
}