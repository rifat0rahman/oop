package SemisterExam;
import java.util.Scanner;


class Bank {
    public void show(String name) {
        System.out.println(name);
    }
}
public class BasicStructure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the bank name: ");
        String name = sc.nextLine();

        Bank obj = new Bank();
        obj.show(name);
    }
}
