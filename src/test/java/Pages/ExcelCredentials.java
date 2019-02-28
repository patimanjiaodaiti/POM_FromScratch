package Pages;

import Utilities.ExcelReader;

public class ExcelCredentials {
    public static String UserName= ExcelReader.getData(1,1),
                        PassWord=ExcelReader.getData(2,1),
                        Website=ExcelReader.getData(0,1);

    public static void main(String[] args) {
        System.out.println(UserName);
        System.out.println(PassWord);
        System.out.println(Website);
    }
}
