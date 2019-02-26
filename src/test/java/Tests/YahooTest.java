package Tests;


import Pages.Elements;
import Utilities.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YahooTest extends TestBase {
    @BeforeMethod
    public void setUp2() {
        Elements e = new Elements();
        e.login();

    }

    @Test(priority = 1)
    public void firstTest() {

    }
}





















//    @Test(priority = 3)//priority will run the code with in the order we decide from small to large
//    public void secondTest() {
//    driver.navigate().to("https://www.google.com/");
//        myLibrary.TakeScreenshotsplease("yahooScreenShot");
//    }
//    @Test//if there is no priority it will run first then it execute the priority
//    public void thirdTest() {
//        driver.get("https://www.youtube.com/");
//    }

