package lekcijaCetri;

public class Circle {

    double PI = 3.14;
    double r;

    //    Circle(){
    //        System.out.println("Tiek taisits jauns aplis...");
    //    }

    public Circle(double radiuss) {
        r = radiuss;
    }

    public double calculateArea() {
        return PI * (r * r);
    }

    public double calculateDiameter() {
        return r * 2;
    }

}
