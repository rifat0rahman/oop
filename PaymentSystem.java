import java.util.Scanner;

class Payment {
    public void processPayment(double amount) {
        System.out.println("Check payment of $" + amount);
    }
}

class CashPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processed cash payment of $" + amount);
    }
}

class CardPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processed Card payment of $" + amount);
    }
}

class MobilePayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processed Mobile payment of $" + amount);
    }
}

public class PaymentSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the payment amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the payment method (cash==1, card==2, mobile==3): ");
        int paymentMethod = scanner.nextInt();

        Payment payment;

        if (paymentMethod == 1) {
            payment = new CashPayment();
        } else if (paymentMethod == 2) {
            payment = new CardPayment();
        } else if (paymentMethod == 3) {
            payment = new MobilePayment();
        } else {
            System.out.println("Invalid payment method");
            return;
        }

        payment.processPayment(amount);

    }
}