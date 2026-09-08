import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EvenOddCount {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the size of the array: ");
        int n = Integer.parseInt(br.readLine());

        int[] numbers = new int[n];

        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(br.readLine());

            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}
