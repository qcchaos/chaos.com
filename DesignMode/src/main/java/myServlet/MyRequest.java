package myServlet;

import java.io.InputStream;
import java.util.ArrayList;

public abstract class MyRequest {

    String requestMethod;
    String requestUrl;

    public MyRequest(InputStream inputStream) throws Exception {
        ArrayList<String> requestMessage = null;
        //创建缓冲
        byte[] buffer = new byte[1024];
        int len = 0;
        String str= null;
        //读取缓冲并判断是否有数据，并转换为字符串
        if((len=inputStream.read(buffer))>0){
            str = new String(buffer, 0,len);
        }
        //截取出http数据
        String data = str.split("\n")[0];
        //获得各参数数据
        String[] params = data.split(" ");
        requestMethod = params[0];
        requestUrl = params[1].replace("/","");
    }

    abstract public String getRequestMethod();

    abstract public void setRequestMethod(String requestMethod);

    abstract public String getRequestUrl();

    abstract public void setRequestUrl(String requestUrl);
}
