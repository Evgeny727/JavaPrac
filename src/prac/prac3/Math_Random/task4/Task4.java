package prac.prac3.Math_Random.task4;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.print("Введите целое число: ");
        n = sc.nextInt();
        int mass[] = new int[n];
        Random rand = new Random();
        System.out.println("Массив: ");
        for (int i = 0; i < n; i++) {
            mass[i] = rand.nextInt(n+1);
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        Vector vec = new Vector();
        for (int i = 0; i < n; i++) {
            if(mass[i] % 2 == 0){
                vec.addElement(mass[i]);
            }
        }
        for (int i = 0; i < vec.size(); i++) {
            System.out.print(vec.get(i) + " ");
        }
    }
}
