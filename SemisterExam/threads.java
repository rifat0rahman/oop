package SemisterExam;

class A extends Thread {
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

class B extends Thread {
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

public class threads {
    public static void main(String[] args) {
        A ob = new A();
        B ob1 = new B();
        ob.setPriority(Thread.MAX_PRIORITY);
        ob.start();
        ob1.start();
    }
}
