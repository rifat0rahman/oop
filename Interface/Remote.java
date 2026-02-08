package Interface;

public class Remote implements Volume,Channel{
    public int Up(int i) {
        return i;
    }

    public int Down(int i) {
        return i;
    }
    
    public int Next(int i) {
        return i + 1;
    }
    
    public int Previous(int i) {
        return i - 1;
    }

    public int CurrentChannel(int i) {
        return i;
    }

    public int CurrentVolume(int i) {
        return i;
    }
}
