import java.util.Scanner;

public class Student {

    String studentId;
    String studentName;
    String[] courses;
    int courseCount = 0;

    Student(String studentId, String studentName, int numberOfCourses) {
        this.studentId = studentId;
        this.studentName = studentName;
        courses = new String[numberOfCourses];
    }

    void registerCourse(String course) {
        courses[courseCount] = course;
        courseCount++;
    }

    void displayCourses() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Registered Courses:");

        for (int i = 0; i < courseCount; i++) {
            System.out.println(courses[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your ID:");
        String id = sc.nextLine();

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter number of courses:");
        int numberOfCourses = sc.nextInt();

        sc.nextLine();

        Student student = new Student(id, name, numberOfCourses);

        for (int i = 0; i < numberOfCourses; i++) {
            System.out.println("Enter course name:");
            String course = sc.nextLine();

            student.registerCourse(course);
        }

        System.out.println("\n----- STUDENT DETAILS -----");

        student.displayCourses();

        sc.close();
    }
}
