package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    static Properties po;

    static {//in a class first it executes static block, then initialized block , then constructor method,
        // the any other methods will execute
        try {
        FileInputStream file = new FileInputStream("config.properties");
        //FileInputStream object class it self always throws checked exception and we need to handle it emediatly
            po = new Properties();
            po.load(file);
        file.close();//it keeps running until we close it just like a scanner


    }catch(Exception e) {

        }
    }
    public static String getInfo(String key){
        return po.getProperty(key);
    }
}
