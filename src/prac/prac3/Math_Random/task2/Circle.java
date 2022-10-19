package prac.prac3.Math_Random.task2;

public class Circle {
    private Point cCenter;
    private double radius = 0.0;
    private double circleLength = 0.0;
    public Circle(){
        cCenter = new Point();
        radius = Math.random();
        circleLength = 2 * Math.PI * radius;
    }
    public Circle(double x, double y){
        cCenter = new Point(x,y);
        radius = Math.random();
        circleLength = 2 * Math.PI * radius;
    }

    public double getCircleLength() {
        return circleLength;
    }
}
