package prac.prac14;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task4 {
    public static void main(String[] args)
    {
        System.out.print("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern p1 = Pattern.compile("(\\w?\\s*\\d+\\s*\\+\\s*\\d+\\s*\\w?)");
        Matcher m1 = p1.matcher(str);
        boolean a = false;
        while (m1.find())
        {
            a = true;
        }
        if (a == true)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}