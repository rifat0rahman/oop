package Interface;

public class Main {
    public static void main(String[] args) {
        Remote ob = new Remote();

        System.out.println("Current Volume: "+ob.CurrentVolume(13));
        System.out.println("Up 5 Volume: " + ob.Up(13));
        System.out.println("Down 5 Volume: " + ob.Down(13));

        System.out.println("Current channel:" + ob.CurrentChannel(13));
        System.out.println("Next channel: " + ob.Next(13));
        System.out.println("Previous channel: " + ob.Previous(13));
        
    }
}
