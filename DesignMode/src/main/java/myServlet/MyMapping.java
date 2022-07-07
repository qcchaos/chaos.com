package myServlet;

import java.util.HashMap;

public class MyMapping {
    public static HashMap<String,String> mapping = new HashMap<String,String>();

    static {
        mapping.put("Discount","myServlet.MyServlet");
    }

    static {
        mapping.put("FullMinus","myServlet.MyServlet");
    }

    static {
        mapping.put("Normal","myServlet.MyServlet");
    }



    public HashMap<String,String> getMapping(){
        return mapping;
    }
}
