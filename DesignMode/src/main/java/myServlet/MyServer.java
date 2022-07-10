package myServlet;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void startServer(int port)throws Exception{
        //创建一个Socket服务
        ServerSocket serverSocket = new ServerSocket(port);
        Socket socket = null;
        while (true){
            socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            ParamsRequest request = new ParamsRequest(inputStream);
            MyResponse response = new MyResponse(outputStream);
            ServletFactory ServletFactory = new ServletFactory(request.getRequestType());
            MyHttpServlet myHttpServlet = ServletFactory.getMyHttpServlet();
            myHttpServlet.service(request,response);
            socket.close();
        }
    }

    public static void main(String[] args) {
        try{
            startServer(10080);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
