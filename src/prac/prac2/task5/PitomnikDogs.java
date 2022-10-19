package prac.prac2.task5;

public class PitomnikDogs {
    public static void main(String[] args) {
        Dog[] d1 = new Dog[3];
        d1[0]= new Dog("Dog1", 3);
        d1[1]= new Dog("Dog2", 5);
        d1[2]= new Dog("Dog3", 8);
        System.out.println(d1[0]);
        System.out.println(d1[1]);
        System.out.println(d1[2]);
        System.out.println("В человеческих годах возраст собаки = " + d1[0].intoHumanAge());
    }
}