package myServlet;

import strategy.TaximeterFactory;

public class MyServlet extends MyHttpServlet{
    @Override
    public void doGet(MyRequest request, MyResponse response) throws Exception {

        response.write("芳姐再见！");
    }

    @Override
    public void doPost(MyRequest request, MyResponse response) throws Exception {
        response.write("芳姐再见！");
    }
}
