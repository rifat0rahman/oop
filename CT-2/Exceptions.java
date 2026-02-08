
class Excep {
    void show() {
        try {
            int a = 10, b = 10;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Can't devide by zero");
        } catch (Exception e) {
            System.out.println("The error is: " + e);
        }
    }
}

class ExcepThrow {
    void show() {
        try {
            int a = 10, b = 10;
            int sum = a / b;
            System.out.println(sum);
            if (sum == 1) {
                throw new ArithmeticException("Can not be 1");
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("The error is: " + e);
        }
    }
}

class ExcepThrows {
    void show() throws ClassNotFoundException{
        Class.forName("Demo");
    }
}


public class Exceptions {
    public static void main(String[] args) {
         
        Excep ob = new Excep();
        ob.show();

        ExcepThrow ob1 = new ExcepThrow();
        ob1.show();

        ExcepThrows ob2 = new ExcepThrows();

        try{
            ob2.show();
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
        
    }
}
