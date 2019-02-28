package Utilities;
//Incapsulation is more sucre than configuration reader
public class Encapsulation_credentials {
    final static private String UserName="Muhtar.Mahmut0519@yahoo.com",//final is absolute can't change //static only accepts static
                                PassWord="Mayire007",
                                WebsiteLink = "https://www.yahoo.com/",
                                Browser="chrome";
    //we now use get method to read the created Encapsulation_credentials
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
    public static String getBrowser(){return Browser;}
}
