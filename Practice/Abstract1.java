package Practice;

abstract class Car {

    public abstract void drive();

    public void playMusic() {
        System.out.println("Music is playing");
    }
}

class BanglaCar extends Car { //concrete class
    public void drive() {
        System.out.println("Bangla car is driving");
    }
}

public class Abstract1 {
    public static void main(String[] args) {
        Car ob = new BanglaCar();
        ob.drive();
        ob.playMusic();
    }
}
