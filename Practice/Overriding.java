package Practice;

class A {
    public void show() {
        System.out.println("A");
    }
    public void config(int a) {
        System.out.println("A");
    }
}

class B extends A {
    @Override()
    public void show() {
        System.out.println("B");
    }
}

public class Overriding {
    public static void main(String[] args) {
        A ob = new A();
        ob.show();
    }   
}
