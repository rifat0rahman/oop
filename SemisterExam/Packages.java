package SemisterExam;
import tools.Calculator;

public class Packages {
    public static void main(String[] args) {
        SimpleException obj = new SimpleException();
        obj.show();

        Calculator obj2 = new Calculator();
        System.out.println(obj2.add(10, 20));
    }
}
