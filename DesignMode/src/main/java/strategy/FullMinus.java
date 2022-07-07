package strategy;

public class FullMinus extends Taximeter{
    private Double moneyCondition;
    private Double moneyReturn;
    FullMinus(Double moneyCondition, Double moneyReturn){
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }
    @Override
    public Double charge(Double money) {
        Double result = money;
        if(money >= moneyCondition){
            result = money - moneyReturn;
        }
        return result;
    }
}
