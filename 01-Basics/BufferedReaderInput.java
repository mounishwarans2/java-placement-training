import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderInput {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = br.readLine();

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(br.readLine());

        System.out.print("Enter your marks: ");
        double marks = Double.parseDouble(br.readLine());

        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}
