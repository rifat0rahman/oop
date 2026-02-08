class Calculator {

    double result;

    void add(double a, double b) {
        result = a + b;
        System.out.println(result);
    }

    void add(double a, double b, double c) {
        result = a + b + c;
        System.out.println(result);
    }
    
    void add(int a, int b) {
        result = a + b;
        System.out.println(result);
    }
}


public class lab3p2 {   
    public static void main(String[] args) {
        Calculator ob = new Calculator();
        ob.add(10.2, 122.4);
        ob.add(10.2, 122.4, 78);
        ob.add(10, 20);

    }
}
