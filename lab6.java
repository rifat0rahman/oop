abstract class Remote{
    abstract int Up(int i,int j);
    abstract int Down(int i,int j);
    
    int Next(int i) {
        return i + 1;
    }
    int Previous(int i) {
        return i - 1;
    }
}

abstract class RemoteFunction1 extends Remote {
    int Up(int i,int j) {
        return i + j;
    }

    abstract int Down(int i,int j);
}

class RemoteFunction2 extends RemoteFunction1 {
    int Down(int i, int j) {
        if (i > j) {
            return i - j;
        }
        else {
            return j - i;
        }
        
    }
}

public class lab6 extends RemoteFunction2 {
    public static void main(String[] args) {
        RemoteFunction2 ob = new RemoteFunction2();

        System.out.println("Current channel: 13");
        System.out.println("Next channel: " + ob.Next(13));
        System.out.println("Previous channel: " + ob.Previous(13));
        System.out.println("Up 5 channel: " + ob.Up(13,5));
        System.out.println("Down 5 channel: " + ob.Down(13,5));
    }
}