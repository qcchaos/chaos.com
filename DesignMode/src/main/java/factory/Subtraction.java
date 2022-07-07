package factory;

public class Subtraction extends Operation{
    @Override
    public Integer getResult(Integer a, Integer b) {
        Integer result = a - b;
        return result;
    }
}
