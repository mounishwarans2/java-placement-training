public class BreakAndContinue {
    public static void main(String[] args) {

        System.out.println("Using break:");

        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("\nUsing continue:");

        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                continue;
            }
            System.out.println(i);
        }
    }
}
