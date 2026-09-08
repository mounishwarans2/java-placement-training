import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class VotingEligibility {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(br.readLine());

        if (age >= 18) {
            System.out.println("The person is eligible to vote.");
        } else {
            System.out.println("The person is not eligible to vote.");
        }
    }
}
