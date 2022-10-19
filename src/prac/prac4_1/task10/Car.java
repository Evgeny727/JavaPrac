package prac.prac4_1.task10;

public class Car extends Transport{
    public Car(String time, String cost){
        this.time = time;
        this.cost = cost;
    }
    @Override
    public String toString() {
        return "Автомобиль: " + "время перевозки: " + this.time + ", стоимость перевозки: " + this.cost;
    }
}
