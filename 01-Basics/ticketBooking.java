class ticketBooking {
    int availabletickets = 10;

    void booktickets(String customername, int tickets) {
        System.out.println(customername + " wants to book " + tickets + " tickets");
        if (tickets <= availabletickets) {
            System.out.println(customername + " is booking tickets");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            availabletickets = availabletickets - tickets;
            System.out.println(customername + " successfully booked " + tickets + " tickets");
            System.out.println("tickets remaining " + availabletickets);
        } else {
            System.out.println(customername + " not - enough tickets available ");
            System.out.println("tickets remaining " + availabletickets);
        }
        System.out.println("----------------");
    }
}

class customer implements Runnable {
    ticketBooking booking;
    String customerName;
    int tickets;

    customer(ticketBooking booking, String customerName, int tickets) {
        this.booking = booking;
        this.customerName = customerName;
        this.tickets = tickets;
    }

    public void run() {
        booking.booktickets(customerName, tickets);
    }
}

public class multithreadExample {
    public static void main(String[] args) {
        ticketBooking booking = new ticketBooking();
        customer c1 = new customer(booking, "customer1", 4);
        customer c2 = new customer(booking, "customer2", 5);
        customer c3 = new customer(booking, "customer3", 3);
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        t1.start();
        t2.start();
        t3.start();
    }
}
