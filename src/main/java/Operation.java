import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operation{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public String getOperator() throws IOException {
        System.out.println("А ТЕПЕРЬ ПИШИ ЧТО ДЕЛОТЬ!? ОКДА");
        String op = reader.readLine();
        return op;
    }
}
