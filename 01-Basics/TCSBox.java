public class TCSBox {
    int value = 10;

    public static void main(String[] args) {

        TCSBox b1 = new TCSBox();

        TCSBox b2 = b1;

        b2.value = 50;

        System.out.println("b1 value = " + b1.value);
        System.out.println("b2 value = " + b2.value);
    }
}
