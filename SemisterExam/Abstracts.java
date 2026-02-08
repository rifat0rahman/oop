package SemisterExam;

abstract class Bank {
    abstract void calculate(int a);

    void deposite() {
        System.out.println("Deposite");
    }

    void basic() {
        System.out.println("Basic");
    }
}

class Access extends Bank {
    void access() {
        System.out.println("Access");
    }

    void calculate(int a) {
        System.out.println("Calculate");
    }
}

class Account extends Bank {
    void access() {
        System.out.println("Access");
    }

    void calculate(int a) {
        System.out.println("Calculate");
    }
}


public class Abstracts {
    public static void main(String[] args) {
        Bank ob = new Access();
        ob.calculate(23);
    }
}
