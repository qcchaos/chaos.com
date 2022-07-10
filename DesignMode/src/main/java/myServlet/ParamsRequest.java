package myServlet;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ParamsRequest extends MyRequest{
    private String requestMethod;
    private String requestUrl;
    private String requestType;
    private HashMap<String,String> requestParams = new HashMap<>();

    public ParamsRequest(InputStream inputStream) throws Exception {
        super(inputStream);
        this.requestMethod = super.getRequestMethod();
        this.requestUrl = super.getRequestUrl();
        if (requestUrl.contains("?")){
            this.requestType = requestUrl.substring(0,requestUrl.indexOf("?"));
            if (requestUrl.contains("&")){
                String[] paramsString = requestUrl.substring(requestUrl.indexOf("?")+1).split("&");
                for (String param : paramsString) {
                    String paramKey = param.split("=")[0];
                    String paramValue = param.split("=")[1];
                    requestParams.put(paramKey,paramValue);
                }
            }else {
                String paramKey = requestUrl.substring(requestUrl.indexOf("?")+1).split("=")[0];
                String paramValue = requestUrl.substring(requestUrl.indexOf("?")+1).split("=")[1];
                requestParams.put(paramKey,paramValue);
            }
        }else {
            this.requestType = requestUrl;
        }


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

    public HashMap<String,String> getRequestParams() {
        return this.requestParams;
    }

    public void setRequestParams(HashMap<String,String> requestParams) {
        this.requestParams = requestParams;
    }


    public String getRequestType() {
        return this.requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }


}
