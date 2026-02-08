package Practice;

import java.util.Scanner;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

class AdCalc extends Calculator {
    public int mult(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}

class A {

}

class B extends A {
}

class C extends B {
}

class VeryAd extends AdCalc {
    public int mod(int a, int b) {
        return a % b;
    }
}

public class Inheritance {
    public static void main(String[] args) {

        VeryAd ob = new VeryAd();

        int r1 = ob.add(10, 15);
        int r2 = ob.sub(20, 10);
        int r3 = ob.add(10, 15);
        int r4 = ob.sub(20, 10);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(ob.mod(10, 3));


        
    }
}
