package myServlet;

import java.util.HashMap;

public class MyMapping {
    public static HashMap<String,String> mapping = new HashMap<String,String>();

    static {
        mapping.put("Discount","myServlet.StrategyServlet");
    }

    static {
        mapping.put("FullMinus","myServlet.StrategyServlet");
    }

    static {
        mapping.put("Normal","myServlet.StrategyServlet");
    }

    static {
        mapping.put("default","myServlet.StrategyServlet");
    }



    public HashMap<String,String> getMapping(){
        return mapping;
    }
}
