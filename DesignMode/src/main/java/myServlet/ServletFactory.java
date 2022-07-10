package myServlet;

public class ServletFactory {
    private MyHttpServlet myServlet;
    public ServletFactory(String requestType) throws Exception{
        String clazz = new MyMapping().getMapping().get(requestType);
        if(clazz == null){
            clazz = new MyMapping().getMapping().get("default");
        }
        Class myServletClass = Class.forName(clazz);

        myServlet = (MyHttpServlet)myServletClass.getConstructor().newInstance();

//        myServlet = (MyHttpServlet)myServletClass.newInstance();
    }
    public MyHttpServlet getMyHttpServlet(){
        return myServlet;
    }
}
