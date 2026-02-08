package Practice;

class Human {
    private int age;
    private String name;

    public int getAge(int age) {
        this.age =age;
        return this.age;
    }

    public String getName(String n) {
        name = n;
        return name;
    }
    
}

public class Encapsulation {
    public static void main(String[] args) {
        Human ob = new Human();

        System.out.println(ob.getAge(10));
        System.out.println(ob.getName("Rifat"));
    }
}
