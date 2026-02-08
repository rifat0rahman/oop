package SemisterExam;

class Bank {
    private void show() {
        System.out.println("Bank");
    }
    static void access() {
        System.out.println("Access");
    }
    public void basic() {
        System.out.println("Basic");
    }
}
class Access extends Bank {
    public void basic() {
        System.out.println("Access from Bank");
    }
} 

public class PolyOverriding {
    public static void main(String[] args) {
        Bank ob = new Access();
        ob.basic();
    }
    
}
