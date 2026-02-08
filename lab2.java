class Triangle{
    int b, h;
    double result;

    double area(int b, int h) {
        return .5 * b * h;
    }
}


public class lab2 {
    public static void main(String[] args){
        Triangle ob = new Triangle();

        System.out.println(ob.area(4,4 ));
    }
}
