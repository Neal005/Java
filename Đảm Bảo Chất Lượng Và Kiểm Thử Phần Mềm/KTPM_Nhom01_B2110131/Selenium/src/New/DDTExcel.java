package New;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTExcel {

    // TODO Auto-generated method stub

    WebDriver driver;
    protected static String result;

    @Test(dataProvider="testdata")
    public void DemoProject(String username, String password) {
        try {
            System.setProperty("webdriver.chrome.driver", "F:\\Source code\\Java\\Install Selenium\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://demo.guru99.com/test/newtours/");

            driver.findElement(By.name("userName")).sendKeys(username);
            driver.findElement(By.name("password")).sendKeys(password);

            driver.findElement(By.name("submit")).click();

            Thread.sleep(5000);

            Assert.assertTrue(driver.getTitle().matches("Login: Mercury Tours"), "Invalid credentials");
            System.out.println("Login successful");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

	@AfterMethod
	void ProgramTermination() {
	    driver.quit();
	}
	
	@DataProvider(name = "testdata")
	public Object[][] TestDataFeed() {
	    New.ReadExcelFile config = new New.ReadExcelFile("F:\\Document\\TestProjects\\newtours\\LoginCredentials.xlsx");
	
	    int rows = config.getRowCount(0);
	    Object[][] credentials = new Object[rows][2];
	
	    for (int i = 0; i < rows; i++) {
	        credentials[i][0] = config.getData(0, i, 0);
	        credentials[i][1] = config.getData(0, i, 1);
	    }
	
	    return credentials;
	}
}
