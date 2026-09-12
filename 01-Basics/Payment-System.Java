interface Payment {
    void pay();
}
class googlepay implements Payment {
    public void pay() {
        System.out.println("payment by gpay");
    }
}
class creditcard implements Payment {
    public void pay() {
        System.out.println("payment by credit card");
    }
}
public class Main {
    public static void main(String[] args) {
        googlepay g = new googlepay();
        g.pay(); 
        creditcard c = new creditcard();
        c.pay();
    }
}
