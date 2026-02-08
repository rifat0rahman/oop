interface Analog{
    int add(int a, int b);
    int sub(int a, int b);
    int mult(int a, int b);
    int div(int a, int b);
}

interface Scientific{
    int mod(int a, int b);
    int pow(int a, int b);
}

class Calculator implements Analog, Scientific{
    public int add(int a, int b){
        return a + b;
    }
    public int sub(int a, int b){
        return a - b;
    }
    public int mult(int a, int b){
        return a * b;
    }
    public int div(int a, int b){
        return a / b;
    }
    public int mod(int a, int b){
        return a % b;
    }
    public int pow(int a, int b){
        return (int)Math.pow(a, b);
    }
}



public class Main{ 
    public static void main(String[] args) {
        Calculator ob = new Calculator();

        System.out.println(ob.add(10, 20));
        System.out.println(ob.sub(10, 20));
        System.out.println(ob.mult(10, 20));
        System.out.println(ob.div(10, 20));
        System.out.println(ob.mod(10, 20));
    }
}