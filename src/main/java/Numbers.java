import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public int getInt1() throws IOException {
        System.out.println("Вводи число мудень");
        int num = Integer.parseInt(reader.readLine());
        return num;
    }
    public int getInt2() throws IOException {
        System.out.println("Вводи второе число сука ты глупая!!!!");
        int num = Integer.parseInt(reader.readLine());
        return num;
    }
}
