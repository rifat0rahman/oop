package SemisterExam;

class Access {
    void show() {
        System.out.println("Access Denied! Enter your password");
    }

    void show(String Password) {
        System.out.println("Access Successfull");
    }
}

public class PolyOverloading {
    public static void main(String[] args) {
        Access ob = new Access();
        ob.show();
        ob.show("Rifat");   
    }
}
