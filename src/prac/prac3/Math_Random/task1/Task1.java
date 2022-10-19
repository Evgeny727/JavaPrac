package prac.prac3.Math_Random.task1;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        double mass1[] = new double[10];
        System.out.println("Массив с помощью класса Random:");
        for(int i=0; i<10; i++){
            mass1[i]=rand.nextDouble();
            System.out.println(mass1[i]);
        }
        double mass2[] = new double[10];
        System.out.println("Массив с помощью метода Math.random():");
        for(int i=0; i<10; i++){
            mass2[i]=Math.random();
            System.out.println(mass2[i]);
        }
    }
}
