package prac.prac6.task6_9;

public class Main {
    public static void main(String[] args) {
        Printable mass[] = new Printable[6];
        mass[0] = new Book();
        mass[1] = new Book();
        mass[2] = new Book();
        mass[3] = new Shop();
        mass[4] = new Shop();
        mass[5] = new Shop();
        for (int i = 0; i < 6; i++) {
            mass[i].print();
        }
    }
}
