package prac.prac4_1.task10;

public class Train extends Transport{
    public Train(String time, String cost){
        this.time = time;
        this.cost = cost;
    }
    @Override
    public String toString() {
        return "Поезд: " + "время перевозки: " + this.time + ", стоимость перевозки: " + this.cost;
    }
}
