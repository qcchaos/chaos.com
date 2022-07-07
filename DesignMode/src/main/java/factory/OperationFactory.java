package factory;

public class OperationFactory {
    public static Operation chooseOperation(String operator){
        Operation oper = null;
        switch (operator){
            case "+":
                oper = new Add();
                break;
            case "-":
                oper = new Subtraction();
                break;
            case "*":
                oper = new Multiplication();
                break;
            case "/":
                oper = new Division();
                break;

        }
        return oper;
    }
}
