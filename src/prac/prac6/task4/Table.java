package prac.prac6.task4;

public class Table implements Priceable{
    private int price = 1000;
    @Override
    public int getPrice() {
        return this.price;
    }
}
