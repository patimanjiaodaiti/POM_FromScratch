package Pages;

import Utilities.ConfigReader;
import Utilities.ExcelReader;
import Utilities.TestBase;
import Utilities.credentials;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class Elements extends TestBase {
    //In this process we are connecting two classes
    public Elements(){
        PageFactory.initElements(driver,this);//(driver=>is TestBase class which has the driver,Elements.class)
    }
    public @FindBy(xpath = "//*[@id='uh-signin']")
    WebElement signin;

    public @FindBy(xpath = "//*[@id='login-username']")
    WebElement username;

    public @FindBy(xpath = "//*[@id='login-passwd']")
    WebElement password;

    public void login(){
        //This is using Excel sheet
        driver.navigate().to(ExcelCredentials.Website);
        signin.click();
        wait.until(ExpectedConditions.visibilityOf(username));
        username.sendKeys(ExcelCredentials.UserName+Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys(ExcelCredentials.PassWord+Keys.ENTER);

        //this is using incapsulation with created class
//        driver.navigate().to(credentials.getWebsiteLink());
//        wait.until(ExpectedConditions.visibilityOf(signin));
//        signin.click();
//        wait.until(ExpectedConditions.visibilityOf(username));
//        username.sendKeys(credentials.getUserName()+ Keys.ENTER);
//        wait.until(ExpectedConditions.visibilityOf(password));
//        password.sendKeys(credentials.getPassWord()+Keys.ENTER);


        //this is using config reader
//        driver.navigate().to(ConfigReader.getInfo("WebSiteAddress"));
//        signin.click();
//        wait.until(ExpectedConditions.visibilityOf(username));
//        username.sendKeys(ConfigReader.getInfo("UserName") + Keys.ENTER);
//        wait.until(ExpectedConditions.visibilityOf(username));
//        password.sendKeys(ConfigReader.getInfo("PassWord") + Keys.ENTER);


    }
}
