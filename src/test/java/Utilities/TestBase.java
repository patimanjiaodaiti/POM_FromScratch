package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver driver;//static will always take the latest initialized variable so we should not use static
    public MyLibrary myLibrary;

    @BeforeMethod
    public void beforeMethod(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();//we need to create instance variable(variable that does not belongs to
        // any class) in order to use driver in other methods
        driver = new ChromeDriver();
        myLibrary=new MyLibrary(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @AfterMethod
    public void afterMethod(){
        myLibrary.sleep(3);
        driver.quit();
    }
}
