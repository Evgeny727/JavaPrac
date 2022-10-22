package prac.prac8;

import java.util.Scanner;

public class Task13 {
    public static void solution() {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        if (num1 != 0) {
            int num2 = in.nextInt();
            if (num2 != 0) {
                System.out.println(num2);
                solution();
            }
        }
    }

    public static void main(String[] args) {
        solution();
    }
}
