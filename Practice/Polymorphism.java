package Practice;

class A {
    void show() {
        System.out.println("A");
    }
}

class B extends A {
    void show() {
        System.out.println("B");
    }
}

class C extends A {
    void show() {
        System.out.println("C");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        A ob = new A();
        ob.show();

        ob = new B();
        ob.show();

        ob = new C();
        ob.show();
    }
}
