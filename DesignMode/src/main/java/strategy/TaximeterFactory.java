package strategy;

public class TaximeterFactory {
    public static Taximeter chooseTaximeter(String type){
        Taximeter taximeter = null;
        switch (type){
            case "Normal":
                taximeter = new Normal();
            case "Discount":
                taximeter = new Discount(0.8);
            case "FullMinus":
                taximeter = new FullMinus(100.0,30.0);
        }
        return taximeter;
    }
}
