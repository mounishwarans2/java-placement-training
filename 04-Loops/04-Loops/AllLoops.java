public class AllLoops {
    public static void main(String[] args) {

        // 1. FOR LOOP - INCREMENT
        System.out.println("FOR LOOP - INCREMENT");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }


        // 2. FOR LOOP - DECREMENT
        System.out.println("\nFOR LOOP - DECREMENT");

        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }


        // 3. WHILE LOOP - INCREMENT
        System.out.println("\nWHILE LOOP - INCREMENT");

        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }


        // 4. WHILE LOOP - DECREMENT
        System.out.println("\nWHILE LOOP - DECREMENT");

        i = 5;

        while (i >= 1) {
            System.out.println(i);
            i--;
        }


        // 5. DO-WHILE LOOP - INCREMENT
        System.out.println("\nDO-WHILE LOOP - INCREMENT");

        i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 5);


        // 6. DO-WHILE LOOP - DECREMENT
        System.out.println("\nDO-WHILE LOOP - DECREMENT");

        i = 5;

        do {
            System.out.println(i);
            i--;
        } while (i >= 1);
    }
}
