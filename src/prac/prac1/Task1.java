package prac.prac1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for(int i=0;i<10;i++){
            a[i]=sc.nextInt();
            sum=sum + a[i];
        }
        double sred=sum/10.0;
        System.out.println("сумма = " + sum);
        System.out.println("среднее арифмитическое = " + sred);
    }
}