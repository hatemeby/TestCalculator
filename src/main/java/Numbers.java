import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Numbers {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public int getInt() throws IOException {
        System.out.println("Вводи число мудень");
        int num = Integer.parseInt(reader.readLine());
        return num;
    }
}
