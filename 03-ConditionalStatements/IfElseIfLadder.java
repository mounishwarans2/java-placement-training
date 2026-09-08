import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class IfElseIfLadder {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your marks: ");
        int marks = Integer.parseInt(br.readLine());

        if (marks >= 90) {
            System.out.println("Grade: A+");
        }
        else if (marks >= 80) {
            System.out.println("Grade: A");
        }
        else if (marks >= 70) {
            System.out.println("Grade: B");
        }
        else if (marks >= 60) {
            System.out.println("Grade: C");
        }
        else if (marks >= 50) {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: F");
        }
    }
}
