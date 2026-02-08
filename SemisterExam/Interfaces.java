package SemisterExam;

interface Bank {
    void deposit(int balance);
    void withdraw(int balance);
}

interface User {
    void account(int account, int pin);
    void access(int account, int pin);
}


class Account implements Bank, User {

    public void account(int account, int pin) {
        System.out.println("Account created successfully");
    }
    public void access(int account, int pin) {
        System.out.println("Access granted");
    }

    public void deposit(int balance) {
        System.out.println("Deposit");
    }

    public void withdraw(int balance) {
        System.out.println("Withdraw");
    }
}


public class Interfaces {
    public static void main(String[] args) {
        Account ob = new Account();
        ob.account(12345, 1234);
        ob.access(12345, 1234);
        ob.deposit(200);
        ob.withdraw(100);
    }
}
