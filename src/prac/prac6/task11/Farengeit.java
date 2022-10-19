package prac.prac6.task11;

public class Farengeit implements Convertable {
    @Override
    public double convert(int Celcia) {
        double farengeit = Celcia * 9 / 5 + 32;
        return farengeit;
    }
}
