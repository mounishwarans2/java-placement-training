import java.util.Scanner;
class BusSeatAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] seats = new int[5][4];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                seats[i][j] = 0;
            }
        }
        System.out.println("Bus Seat Assignment");
        System.out.println("Initial Seat Arrangement:");
        System.out.println("Available seats:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + (j + 1) + "] ");
            }
            System.out.println();
        }
        System.out.println("Enter number:");
        int row = sc.nextInt();
        System.out.println("Enter seat:");
        int seat = sc.nextInt();
        if (row < 1 || row > 5 || seat < 1 || seat > 4) {
            System.out.println("invalid");
        }
        else if (seats[row - 1][seat - 1] == 1) {
            System.out.println("already booked.");
        }
        else {
            seats[row - 1][seat - 1] = 1;
            System.out.println("Final Seat Arrangement:");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 4; j++) {
                    if (seats[i][j] == 0) {
                        System.out.print("available");
                    }
                    else {
                        System.out.print("booked");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
