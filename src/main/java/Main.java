import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Numbers numbers = new Numbers();
        Main main = new Main();
        Operation operation = new Operation();
        int numberOne = numbers.getInt();
        int numberTwo = numbers.getInt();
        String operator = operation.getOperator();
        int result = main.getResult(numberOne, numberTwo, operator);
        System.out.println("Шурик лох " + result + " раз");
    }

    public int getResult(int numberOne, int numberTwo, String operator) throws IOException {
        Operation operation = new Operation();
        int res;
        switch (operator) {
            case "+":
                res = numberOne + numberTwo;
                break;
            case "-":
                res = numberOne - numberTwo;
                break;
            case "/":
                res = numberOne/numberTwo;
                break;
            case "*":
                res = numberOne*numberTwo;
                break;
            default:
                System.out.println("Говно коня, идите нахуй");
                res = getResult(numberOne, numberTwo, operation.getOperator());
        }
        return res;

    }
}
