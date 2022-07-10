package myServlet;

import strategy.Taximeter;
import strategy.TaximeterFactory;

public class StrategyServlet extends MyHttpServlet {

    @Override
    public void doGet(MyRequest request, MyResponse response) throws Exception {
        ParamsRequest paramsRequest = (ParamsRequest) request;
        switch (paramsRequest.getRequestType()){
            case "Discount": response.write("芳姐再见"+getResult(paramsRequest));break;
            case "FullMinus": response.write("芳姐再见"+getResult(paramsRequest));break;
            case "Normal": response.write("芳姐再见"+getResult(paramsRequest));break;
            default:response.write("芳姐我会想你的");

        }
    }

    private String getResult(ParamsRequest paramsRequest){
        Taximeter taximeter = TaximeterFactory.chooseTaximeter(paramsRequest.getRequestType(),paramsRequest.getRequestParams());
        Double money = Double.valueOf(paramsRequest.getRequestParams().get("money"));
        return taximeter.charge(money).toString();
    }


    @Override
    public void doPost(MyRequest request, MyResponse response) throws Exception {

    }
}
