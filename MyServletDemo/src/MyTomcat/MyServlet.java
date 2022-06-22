package MyTomcat;

import java.io.IOException;

public class MyServlet extends MyHttpServlet{
    @Override
    public void doGet(MyRequest request, MyResponse response) throws Exception {
        response.write("芳姐你好！");
    }

    @Override
    public void doPost(MyRequest request, MyResponse response) throws Exception {
        response.write("芳姐您好！");
    }
}
