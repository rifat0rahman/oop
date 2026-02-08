import java.util.Scanner;

class Triangle {
    double b, h;
    double result;

    Triangle(double b, double h) {
        result = .5 * b * h;
        System.out.println("Area 1= " + result);
    }

    double area(double b, double h) {
        return .5 * b * h;
    }

    void area_3(double b,double h) {
        this.b = b;
        this.h = h;
        result = .5 * b * h;
        System.out.println("Area 2 = " + result);

    }
}

public class lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double b = sc.nextDouble();
        double h = sc.nextDouble();


        Triangle ob = new Triangle(b,h);

        System.out.println("Area 2 = "+ob.area(b, h));
        ob.area_3(b, h);
    }
}