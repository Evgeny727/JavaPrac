package prac.prac4_1.task10;

public class Ship extends Transport{
    public Ship(String time, String cost){
        this.time = time;
        this.cost = cost;
    }
    @Override
    public String toString() {
        return "Корабль: " + "время перевозки: " + this.time + ", стоимость перевозки: " + this.cost;
    }
}
