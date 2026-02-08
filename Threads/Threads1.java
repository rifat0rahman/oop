package Threads;


class A extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("A says hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }            
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("B says yes sir");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class Threads1 {
    public static void main(String[] args) {
        A ob = new A();
        B ob1 = new B();

        System.out.println(ob.getPriority());
        ob.setPriority(Thread.MAX_PRIORITY);

        ob.start();
        ob1.start();
    }
    
}
