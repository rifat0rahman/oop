package SemisterExam;

import java.util.Scanner;

class Maths {
    void Largest() {
        int arr[] = { 10, 25, 5, 40, 30 };
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest number is: " + max);
    }

    void Minimum() {
        int arr[] = { 10, 25, 5, 40, 30 };
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Largest number is: " + min);
    }

    void reverse(int num) {
        int rev = 0;
        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println("Reverse number is: " + rev);
    }
    
    void Cont() {
        int arr[] = { 10, 25, 5, 40, 30 };
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                continue;
            }
           System.out.println(arr[i]);
        }
        System.out.println("Largest number is: " + min);
    }
}

class Information {
    void Information(String name, int age, String address) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

public class maths  {
    public static void main(String[] args) {
        Maths ob = new Maths();
        ob.Largest();
        ob.Minimum();
        ob.reverse(1234);
        ob.Cont();

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your address: ");
        String address = sc.nextLine();

        Information obj = new Information();
        obj.Information(name, age, address);

    }
}
