package prac.prac4_1.task10;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("2 часа", "1000 рублей");
        Airplane airplane = new Airplane("1.5 часа", "2000 рублей");
        Train train = new Train("1 час", "500 рублей");
        Ship ship = new Ship("2.5 часа", "3000 рублей");
        System.out.println(car);
        System.out.println(airplane);
        System.out.println(train);
        System.out.println(ship);
    }
}
