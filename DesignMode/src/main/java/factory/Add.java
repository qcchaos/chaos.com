package factory;

public class Add extends Operation{
    @Override
    public Integer getResult(Integer a, Integer b) {
        Integer result = a + b;
        return result;
    }

}
