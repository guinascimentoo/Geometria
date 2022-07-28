package Entities;

public class Area {

    public static final double PI = 3.14159;
    public double a, b, c;

    public double square(){
        return (a * b);
    }

    public double rectangle(){
        return (a * b);
    }

    public static double circleRadius(double radius){
        return PI * (radius * radius);
    }

    public static double circleDiameter(double diameter){
        return PI * (diameter * diameter) / 4;
    }

    public double triangle(){
        return (a * b) / 2.0;
    }

    public double trapeze(){
        return ((a + b)* c) / 2.0;
    }
}