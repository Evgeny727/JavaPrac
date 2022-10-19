package prac.prac6.task4;

public class Main {
    public static void main(String[] args) {
        Computer c = new Computer();
        Table t = new Table();
        System.out.println("Цена компьютера: " + c.getPrice());
        System.out.println("Цена стола: " + t.getPrice());
    }
}
