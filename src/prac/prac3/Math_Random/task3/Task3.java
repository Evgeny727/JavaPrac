package prac.prac3.Math_Random.task3;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int mass[] = new int[4];
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            mass[i] = 10 + rand.nextInt(90);
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        boolean b = true;
        for (int i = 0; i < 3; i++) {
            if(mass[i] > mass[i+1]) b = false;
        }
        if(b){
            System.out.print("Массив является строго возрастающей последовательностью");
        }
        else System.out.print("Массив не является строго возрастающей последовательностью");
    }
}
