package prac.prac6.task11;

public class Kelvin implements Convertable {
    @Override
    public double convert(int Celcia) {
        double kelvin = Celcia + 273.15;
        return kelvin;
    }
}
