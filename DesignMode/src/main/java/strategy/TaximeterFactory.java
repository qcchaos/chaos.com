package strategy;

import java.util.HashMap;

public class TaximeterFactory {
    public static Taximeter chooseTaximeter(String type, HashMap<String,String> params){
        switch (type){
            case "Normal":
                return  new Normal();
            case "Discount":
                return new Discount(Double.valueOf(params.get("Discount")));
            case "FullMinus":
                return new FullMinus(Double.valueOf(params.get("moneyCondition")),Double.valueOf(params.get("moneyReturn")));
            default: return new Normal();
        }
    }
}
