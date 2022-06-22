package MyTomcat;

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
            MyRequest request = new MyRequest(inputStream);
            MyResponse response = new MyResponse(outputStream);
            String clazz = new MyMapping().getMapping().get(request.getRequestUrl());
            if(clazz != null){
                Class<MyServlet> myServletClass = (Class<MyServlet>) Class.forName(clazz);
                MyServlet myServlet = myServletClass.newInstance();
                myServlet.service(request,response);
            }

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
