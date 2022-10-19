package prac.prac6.task11;

public class Main {
    public static void main(String[] args) {
        Kelvin k = new Kelvin();
        Farengeit f = new Farengeit();
        System.out.println("10 градусов по Цельсию = " + k.convert(10) + " по Кельвину");
        System.out.println("10 градусов по Цельсию = " + f.convert(10) + " по Фаренгейту");
    }
}
