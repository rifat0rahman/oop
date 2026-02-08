package Practice;

import java.util.Scanner;

class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double add(double a, double b,double c) {
        return a + b + c;
    }
}

public class Overloading {
    public static void main(String[] args) {

        Calculator ob = new Calculator();
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        System.out.println("Sum : " + ob.add(a, b));
        System.out.println("Subtraction : " + ob.add(a, b,c));

    }
}
