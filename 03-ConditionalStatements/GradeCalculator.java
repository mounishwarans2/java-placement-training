import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class GradeCalculator {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] marks = new int[5];
        String[] subjects = {"English", "Tamil", "Maths", "Science", "Social"};

        int total = 0;
        boolean failed = false;

        // Get marks
        for (int i = 0; i < 5; i++) {

            System.out.print("Enter marks for " + subjects[i] + ": ");
            marks[i] = Integer.parseInt(br.readLine());

            total = total + marks[i];

            if (marks[i] < 40) {
                failed = true;
            }
        }

        System.out.println("\n----- GRADE DETAILS -----");

        // Display grades
        for (int i = 0; i < 5; i++) {

            System.out.print(subjects[i] + " : " + marks[i] + " - ");

            if (marks[i] >= 90) {
                System.out.println("A+");
            }
            else if (marks[i] >= 80) {
                System.out.println("A");
            }
            else if (marks[i] >= 70) {
                System.out.println("B");
            }
            else if (marks[i] >= 60) {
                System.out.println("C");
            }
            else if (marks[i] >= 50) {
                System.out.println("D");
            }
            else if (marks[i] >= 40) {
                System.out.println("E");
            }
            else {
                System.out.println("F");
            }
        }

        System.out.println("\nTotal Marks = " + total);
        System.out.println("Average = " + (total / 5.0));

        if (failed) {
            System.out.println("Result = FAIL");
        }
        else {
            System.out.println("Result = PASS");
        }

        br.close();
    }
}
