package pl.testuj.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    WebDriver driver;

    @BeforeClass
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ela\\Documents\\bootcamp\\driver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }

}