package prac.prac6.task5;

public class MovablePoint implements Movable{
    private int x = 0;
    private int y = 0;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void moveUP(int y) {
        this.y += y;
    }

    @Override
    public void moveDown(int y) {
        this.y -= y;
    }

    @Override
    public void moveRight(int x) {
        this.x += x;
    }

    @Override
    public void moveLeft(int x) {
        this.x += x;
    }
}
