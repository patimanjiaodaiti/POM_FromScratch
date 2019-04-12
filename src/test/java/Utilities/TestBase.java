package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;//static will always take the latest initialized variable so we should not use static
    public static MyLibrary myLibrary;
    public static WebDriverWait wait;
    public static Actions act;

    public static ExtentReports reportDoc;
    public static ExtentHtmlReporter file;
    public static ExtentTest Test;

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
    public void afterMethod(ITestResult result){
        // ITestResult:

        if(result.getStatus() == ITestResult.SUCCESS){
            System.out.println("Your Test is Passed");
            Test.log(Status.PASS,"Successfully passed");

        }  else if(result.getStatus() == ITestResult.FAILURE ){
            System.out.println("Nigga, Your Test is failed, please read the reports");
            Test.log(Status.FAIL,"Your Test is failed");
            Test.log(Status.FAIL,result.getThrowable());
            myLibrary.TakeScreenshotsplease(result.getName());

        } else if(result.getStatus() == ITestResult.SKIP){
            System.out.println("Some Tests Has been skipped");
            Test.log(Status.SKIP,"Your Test is Skipped");

        }
        myLibrary.sleep(2);
        Driver.CloseDriver();
    }
    @BeforeTest
    public void BC(){
        reportDoc=new ExtentReports();
        file=new ExtentHtmlReporter("src/test/java/Utilities/captures/report.html");
        reportDoc.attachReporter(file);
    }

    @AfterTest
    public void AF(){
        file.config().setDocumentTitle("FaceBook Report");
        file.config().setReportName("Tester: Muhtar");
        file.config().setTheme(Theme.DARK);

        reportDoc.setSystemInfo("Website","Faceebook");
        reportDoc.setSystemInfo("UserName","Tester");
        reportDoc.setSystemInfo("PassWord","Admin");
        reportDoc.flush();
    }
}
