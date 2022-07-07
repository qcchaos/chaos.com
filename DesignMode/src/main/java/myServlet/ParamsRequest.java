package myServlet;

import java.io.InputStream;
import java.util.ArrayList;

public class ParamsRequest extends MyRequest{
    String requestMethod;
    String requestUrl;
    String[] requestParams;

    public ParamsRequest(InputStream inputStream) throws Exception {
        super(inputStream);
        this.requestMethod = super.requestMethod;
        this.requestUrl = super.requestUrl;
        requestParams=requestUrl.split("\\?");

    }

    @Override
    public String getRequestMethod() {
        return this.requestMethod;
    }

    @Override
    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    @Override
    public String getRequestUrl() {
        return this.requestUrl;
    }

    @Override
    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }


}
