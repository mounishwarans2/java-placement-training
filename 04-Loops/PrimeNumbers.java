import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PrimeNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter starting number: ");
        int start = Integer.parseInt(br.readLine());

        System.out.print("Enter ending number: ");
        int end = Integer.parseInt(br.readLine());

        System.out.println("Prime numbers between " + start + " and " + end + ":");

        for (int num = start; num <= end; num++) {

            if (num < 2) {
                continue;
            }

            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {

                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}
