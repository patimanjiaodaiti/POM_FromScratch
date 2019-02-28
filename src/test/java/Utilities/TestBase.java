package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.hssf.record.chart.DatRecord;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;//static will always take the latest initialized variable so we should not use static
    public MyLibrary myLibrary;
    public static WebDriverWait wait;
    public static Actions act;

    @BeforeMethod
    public void beforeMethod(){
        driver= Driver.getDriver();
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();//we need to create instance variable(variable that does not belongs to
        // any class) in order to use driver in other methods
        myLibrary=new MyLibrary(driver);
        wait=new WebDriverWait(driver,50);
        act=new Actions(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @AfterMethod
    public void afterMethod(){
        myLibrary.sleep(3);
        driver.quit();
    }
}
