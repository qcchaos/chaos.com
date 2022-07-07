package strategy;

public class Discount extends Taximeter{

    private Double moneyDiscount;

    public Discount(Double moneyDiscount){
        this.moneyDiscount = moneyDiscount;
    }

    @Override
    public Double charge(Double money) {
        return money * moneyDiscount;
    }
}
