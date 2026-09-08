import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Display10Numbers {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");

        // Getting values into array
        for (int i = 0; i < 10; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        // Displaying values
        System.out.println("The 10 numbers are:");

        for (int i = 0; i < 10; i++) {
            System.out.println(numbers[i]);
        }
    }
}
