package prac.prac6.task5;

public class Main {
    public static void main(String[] args) {
        MovableCircle c = new MovableCircle(3,3);
        MovablePoint p = new MovablePoint(2,2);
        System.out.println("Центр окружности: " + c.getCenter().getX() + " " + c.getCenter().getY());
        System.out.println("Координаты точки: " + p.getX() + " " + p.getY());
        p.moveRight(3);
        p.moveUP(5);
        System.out.println("Координаты точки: " + p.getX() + " " + p.getY());
    }
}
