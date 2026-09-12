import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Student {
    String name;
    int rollno;
    void getStudentDetails(BufferedReader br) throws IOException {
        System.out.print("Enter name: ");
        name = br.readLine();
        System.out.print("Enter roll number: ");
        rollno = Integer.parseInt(br.readLine());
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        Result r = new Result();
        r.getStudentDetails(br);
        r.getMarks(br);
        r.displayResult();
        br.close();
    }
}
class Marks extends Student {
    int marks1;
    int marks2;
    int marks3;
    void getMarks(BufferedReader br) throws IOException {
        System.out.print("Enter mark 1: ");
        marks1 = Integer.parseInt(br.readLine());
        System.out.print("Enter mark 2: ");
        marks2 = Integer.parseInt(br.readLine());
        System.out.print("Enter mark 3: ");
        marks3 = Integer.parseInt(br.readLine());
    }
}
class Result extends Marks {
    void displayResult() {
        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;
        System.out.println("Name: " + name);
        System.out.println("Rollno: " + rollno);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}
