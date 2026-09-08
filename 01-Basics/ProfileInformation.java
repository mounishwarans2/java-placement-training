import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ProfileInformation {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = br.readLine();

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(br.readLine());

        System.out.print("Enter your gender: ");
        String gender = br.readLine();

        System.out.print("Enter your course: ");
        String course = br.readLine();

        System.out.print("Enter your college: ");
        String college = br.readLine();

        System.out.print("Enter your city: ");
        String city = br.readLine();

        System.out.println("\n===== PROFILE INFORMATION =====");
        System.out.println("Name     : " + name);
        System.out.println("Age      : " + age);
        System.out.println("Gender   : " + gender);
        System.out.println("Course   : " + course);
        System.out.println("College  : " + college);
        System.out.println("City     : " + city);
    }
}
