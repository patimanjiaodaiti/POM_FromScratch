package Utilities;

import Pages.ExcelCredentials;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        String browserName = ConfigReader.getInfo("Browser");
        String ExcelBroserName = ExcelCredentials.Browser.toLowerCase();
        String EncapBrowserName = Encapsulation_credentials.getBrowser().toLowerCase();

        if (browserName.equalsIgnoreCase("chrome")
                    || ExcelBroserName.equals("chrome")
                    || EncapBrowserName.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        } else if (browserName.equalsIgnoreCase("firefox")
                        || ExcelBroserName.equals("firefox")
                        || EncapBrowserName.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        }else if (browserName.equals("ie")
                ||ExcelBroserName.equals("ie")
                ||EncapBrowserName.equals("ie")){
            WebDriverManager.iedriver().setup();
            driver=new InternetExplorerDriver();

        }else{
            System.err.println("\t\tInvalid browser,\n\t\tPlease check browser name");
            System.exit(0);//it stops the system from executing
        }
        return driver;
    }
}
