package today;

class A implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("A says hello");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("B says hello");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class runnable {
    public static void main(String[] args) {
        A ob = new A();
        B ob1 = new B();

        Thread t1 = new Thread(ob);
        Thread t2 = new Thread(ob1);

        t1.start();
        t2.start();
    }

}
