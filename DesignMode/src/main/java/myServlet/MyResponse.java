package myServlet;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class MyResponse {
    private OutputStream outputStream;

    public MyResponse(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public OutputStream getOutputStream() {
        return outputStream;
    }

    public void setOutputStream(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void write(String str) throws IOException, InterruptedException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HTTP/1.1 200 OK\n")
                .append("Content-Type:text/html\n")
                .append("\r\n")
                .append("<html>")
                .append("<head>")
                .append("<meta charset=\"UTF-8\">")
                .append("</head>")
                .append("<body>")
                .append("<h1>"+str+"</h1>")
                .append("</body>")
                .append("</html>");
        for(int i=0 ; i<5 ; i++){
            Thread.sleep(300);
            this.outputStream.write(stringBuilder.toString().getBytes(StandardCharsets.UTF_8));
            this.outputStream.flush();
        }
        this.outputStream.close();
    }
}
