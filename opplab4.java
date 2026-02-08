class Billings {

    double result;

    void invoice(double price) {
        result = price;
        System.out.println("The price " + result);
    }

    void invoice(double price, int quantity) {
        result = price * quantity;
        System.out.println("The price with quantity " + result);
    }

    void invoice(double price, int quantity, double discount) {
        result = (price * quantity) - ((price * quantity) * ((discount) / 100));
        System.out.println("The price with quantity with discount " + result);

        if (result >= 1000) {
            result = (price * quantity) - ((price * quantity) * ((discount + 2.0) / 100));
            System.out.println("Congrats! The price with quantity with extra 2% discount " + result);
        }
    }
}

public class opplab4 {
    public static void main(String[] args) {
        Billings ob = new Billings();

        double price = 100.0;
        int quantity = 20;
        double discount = 8.0;

        ob.invoice(price);
        ob.invoice(price, quantity);
        ob.invoice(price, quantity, discount);
    }
}
