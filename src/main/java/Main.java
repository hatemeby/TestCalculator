import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Numbers numbers = new Numbers();
        Main main = new Main();
        Result res = new Result();
        Operation operation = new Operation();
        int numberOne = numbers.getInt1();
        int numberTwo = numbers.getInt2();
        String operator = operation.getOperator();
        int result = res.getResult(numberOne, numberTwo, operator);
        System.out.println("Шурик лох " + result + " раз");
    }


}
