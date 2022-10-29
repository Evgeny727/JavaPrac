package prac.prac14;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args)
    {
        System.out.print("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        int[] result = new int['я' - 'а' + 1];
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'а' && ch <= 'я'){
                result[ch - 'а']++;
            }
        }
        for(int i = 0; i < result.length; i++){
            System.out.println((char) (i + 'а') + " = " + result[i]);
        }

    }
}