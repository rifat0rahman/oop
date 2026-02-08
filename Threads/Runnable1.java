package Threads;

class A implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("A says hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("B says yes sir");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Runnable1 {
    public static void main(String[] args) {
        A ob = new A();
        Runnable ob1 = new B(); // these are the runnable objects

        Thread t1 = new Thread(ob);
        Thread t2 = new Thread(ob1);

        t1.start();
        t2.start();
    }

}
