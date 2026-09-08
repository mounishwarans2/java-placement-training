import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Calculator {

    // Addition function
    static double add(double a, double b) {
        return a + b;
    }

    // Subtraction function
    static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication function
    static double multiply(double a, double b) {
        return a * b;
    }

    // Division function
    static double divide(double a, double b) {
        return a / b;
    }

    // Modulus function
    static double modulus(double a, double b) {
        return a % b;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Enter first number: ");
        double a = Double.parseDouble(br.readLine());

        System.out.print("Enter second number: ");
        double b = Double.parseDouble(br.readLine());

        System.out.println("\n===== CALCULATOR =====");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");

        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(br.readLine());

        switch (choice) {

            case 1:
                System.out.println("Result = " + add(a, b));
                break;

            case 2:
                System.out.println("Result = " + subtract(a, b));
                break;

            case 3:
                System.out.println("Result = " + multiply(a, b));
                break;

            case 4:
                if (b != 0) {
                    System.out.println("Result = " + divide(a, b));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;

            case 5:
                if (b != 0) {
                    System.out.println("Result = " + modulus(a, b));
                } else {
                    System.out.println("Cannot find modulus with zero.");
                }
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
}
