package prac.prac6.task4;

public class Computer implements Priceable {
    private int price = 100000;
    @Override
    public int getPrice() {
        return this.price;
    }
}
