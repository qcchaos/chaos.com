package MyTomcat;

import java.util.HashMap;

public class MyMapping {
    public static HashMap<String,String> mapping = new HashMap<String,String>();

    static {
        mapping.put("/mytomcat","MyTomcat.MyServlet");
    }

    public HashMap<String,String> getMapping(){
        return mapping;
    }
}
