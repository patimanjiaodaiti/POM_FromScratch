package Tests;


import Utilities.MyLibrary;
import Utilities.TestBase;
import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YahooTest extends TestBase {

    @Test(priority = 1)//priority will run the code with in the order we decide from small to large
    public void firstTest() {
        driver.navigate().to("https://www.google.com/");
    }
    @Test(priority = 3)
    public void secondTest() {
        driver.navigate().to("https://www.yahoo.com/");
        myLibrary.TakeScreenshotsplease("yahooScreenShot");
    }
    @Test//if there is no priority it will run first then it execute the priority
    public void thirdTest() {
        driver.get("https://www.youtube.com/");
    }
}
