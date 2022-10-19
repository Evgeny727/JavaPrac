package prac.prac3.Math_Random.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите кол-во окружностей:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Tester test = new Tester(n);
        test.maxCircle();
        test.minCircle();
        test.sortCircle();
    }
}
