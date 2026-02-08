package SemisterExam;

import java.util.Scanner;

class Bank {
    final int MX_BALANCE = 1000;
    private int current_balance = 200;
    private int pin = 1234;
    private int account = 12345;

    public void deposit(int balance) {
        if (current_balance + balance <= MX_BALANCE) {
            System.out.println("Balance deposited successfully");
            this.current_balance = current_balance + balance;
        } else {
            System.out.println("Your account limits has been reached");
        }
    }

    int getBalance() {
        return current_balance;
    }
    int getPin() {
        return pin;
    }
    int getAccount() {
        return account;
    }
}
class Access extends Bank {
    public void show_balance(int account, int pin) {

        if (getAccount() == account && getPin() == pin) {
            System.out.println("Total bank balance = " + getBalance() + "$");
        }
        else {
            System.out.println("Access Denied! Enter your password");
        }
    }
}


public class encapsulation {
    public static void main(String[] args) {
        Access ob = new Access();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your account number: ");
        int account = sc.nextInt();
        System.out.println("Enter your pin number: ");
        int pin = sc.nextInt();

        System.out.println("Enter your balance amount: ");
        int balance = sc.nextInt();
        

        ob.deposit(balance);
        ob.show_balance(12345, 1234);
    }
}
