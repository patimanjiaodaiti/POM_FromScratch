package Utilities;
//Incapsulation is more sucre than configuration reader
public class credentials {
    final static private String UserName="",//final is absolute can't change
    //static only accepts static
     PassWord="",
     WebsiteLink = "https://www.yahoo.com/";
    //we now use get method to read the created credentials
    public static String getUserName(){//this has to be staticnin order to use it in other
                                      // class we only type classname.creathedMethod name
        return UserName;
    }
    public static String getPassWord(){
        return PassWord;
    }
    public static String getWebsiteLink(){
        return WebsiteLink;
    }
}
