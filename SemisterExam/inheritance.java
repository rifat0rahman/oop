package SemisterExam;

class Bank {
    final int MX_BALANCE = 1000;
    int current_balance = 200;

    public void show() {
        System.out.println("Bank from bank");
    }

    public void deposit(int balance) {
        if (current_balance + balance <= MX_BALANCE) {
            System.out.println("Balance deposited = " + (current_balance + balance) + "$ successfully");
            this.current_balance = current_balance + balance;
        }
        else {
            System.out.println("Your account limits has been reached");
        }
    }
}

class Access extends Bank {
    public void show() {
        System.out.println("Access from bank");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Access ob = new Access();
        ob.show();
        ob.deposit(200);
    }
}
