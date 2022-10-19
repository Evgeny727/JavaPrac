package prac.prac2.task4;

import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Введите кол-во элементов для массива ");
        int n=in.nextInt();
        Shop s1= new Shop(n);
        System.out.println(s1);
        s1.addPC("MyOwnPC");
        System.out.println(s1);
        s1.deletePC("PC3");
        System.out.println(s1);
        System.out.println("Введите назавание компьтера который надо найти");
        String name= in.next();
        if(s1.searchPC(name)>-1){
            System.out.println("Компьютер найден под " + s1.searchPC(name) + " номером");
        }
        else System.out.println("Компьютер не найден!");
    }
}