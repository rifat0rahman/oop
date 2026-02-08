import java.util.Scanner;

class calculator {
    double a, b, result;

    void add(double a, double b) {
        this.a = a;
        this.b = b;
        this.result = a + b;
        System.out.println(this.result);
    }
    
    void sub(double a, double b) {
        this.a = a;
        this.b = b;
        result = a - b;
        System.out.println(result);
    }
    
    void mult(double a, double b) {
        this.a = a;
        this.b = b;
        result = a * b;
        System.out.println(result);
    }
    
    void div(double a, double b) {
        this.a = a;
        this.b = b;
        result = a / b;
        System.out.println(result);
    }

}

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        calculator obj = new calculator();


        obj.add(a, b);
        obj.sub(a, b);
        obj.mult(a, b);
        obj.div(a, b);
    }
}
// 35vs5ihq google class room password