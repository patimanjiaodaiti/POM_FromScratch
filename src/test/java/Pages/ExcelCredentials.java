package Pages;

import Utilities.ExcelReader;

public class ExcelCredentials {
    public static String UserName= ExcelReader.getData(1,1),
                        PassWord=ExcelReader.getData(2,1),
                        Website=ExcelReader.getData(0,1),
                        Browser=ExcelReader.getData(3,0);

    //this is un-necessary code just to test the above statement
//    public static void main(String[] args) {
//        System.out.println(UserName);
//        System.out.println(PassWord);
//        System.out.println(Website);
//        System.out.println(Browser);
//    }
}
