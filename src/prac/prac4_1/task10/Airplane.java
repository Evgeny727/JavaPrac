package prac.prac4_1.task10;

public class Airplane extends Transport{
    public Airplane(String time, String cost){
        this.time = time;
        this.cost = cost;
    }
    @Override
    public String toString() {
        return "Самолет: " + "время перевозки: " + this.time + ", стоимость перевозки: " + this.cost;
    }
}
