package strategy;

public class Normal extends Taximeter{

    @Override
    public Double charge(Double money) {
        return money;
    }
}
