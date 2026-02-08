package SemisterExam;

class SimpleException {
    void show() {
        try {
            int a = 10, b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Can't devide by zero " + e);
        } finally {
            System.out.println("Finally");
        }

    }
}

class ThrowException {
    void check(int age) {
        try {
            if (age < 18) {
                throw new ArithmeticException("You are not eligible to vote from throw");
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}

class ThrowsException {

    void check(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("You are not eligible to vote from throws");
        }
    }

    void show() throws ClassNotFoundException {
        Class.forName("Demo");
    }

}

public class Exceptions {
    public static void main(String[] args) {
        SimpleException obj1 = new SimpleException();
        obj1.show();

        ThrowException obj2 = new ThrowException();
        obj2.check(15);

        ThrowsException obj3 = new ThrowsException();
        
        try{
            obj3.check(15);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        

        try{
            obj3.show();
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
    }
}
