package factory;

public class Main {
    public static void main(String[] args) {
        Operation operation;
        operation = OperationFactory.chooseOperation("/");
        Integer result =  operation.getResult(98,9);
        System.out.println(result);
    }
}
