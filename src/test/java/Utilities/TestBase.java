package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    public WebDriver driver;//static will always take the latest initialized variable so we should not use static
    @BeforeMethod
    public void beforeMethod(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();//we need to create instance variable(variable that does not belongs to
        // any class) in order to use driver in other methods

    }
    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }
}
