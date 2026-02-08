package Practice;

class A {
    A() {
        System.out.println("IN A CONSTRUCTOR");
    }

    A(int a, int b) {
        int sum = a + b;
        System.out.println("sum = ");
    }
    void show() {
        System.out.println("show");
    }
}

class Human extends A {
    Human() {
        System.out.println("IN HUMAN CONSTRUCTOR");
    }

    Human(int a, int b) {
        super(a, b);
        int sum = a + b;
        System.out.println("sum = " + sum);
    }

    void show() {
        super.show();
        System.out.println("show Human");
    }
}



public class Contructor1 {
    public static void main(String[] args) {
        Human ob = new Human();
        Human ob1 = new Human(12, 23);
        
        
        ob1.show();
    }   
}
