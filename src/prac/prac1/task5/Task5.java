package prac.prac1.task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Factorial f= new Factorial(n);
        int m=f.factorial();
        System.out.println("factorial " + n + " is " + m);
    }
}