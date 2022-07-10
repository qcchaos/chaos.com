package strategy;

public class Discount extends Taximeter{

    private Double Discount;

    public Discount(Double Discount){
        this.Discount = Discount;
    }

    @Override
    public Double charge(Double money) {
        return money * Discount;
    }
}
