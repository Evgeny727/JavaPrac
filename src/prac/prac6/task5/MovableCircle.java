package prac.prac6.task5;

public class MovableCircle implements Movable {
    private MovablePoint center = new MovablePoint(0,0);
    public MovableCircle(int x, int y) {
        if(x > 0){
            center.moveRight(x);
        }
        else {
            center.moveLeft(x);
        }
        if(y > 0){
            center.moveUP(y);
        }
        else {
            center.moveDown(y);
        }
    }
    public MovablePoint getCenter() {
        return this.center;
    }
    @Override
    public void moveUP(int dot) {

    }

    @Override
    public void moveDown(int dot) {

    }

    @Override
    public void moveRight(int dot) {

    }

    @Override
    public void moveLeft(int dot) {

    }
}
