package prac.prac3.form_string;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Report {
    public static void generateReport(){
//        System.out.println(String.format("%-" + 20 + "s", "Howto") + "*");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Employee mass[] = new Employee[n];
        String name;
        double salary;
        for (int i = 0; i < n; i++) {
            name = sc.next();
            salary = sc.nextDouble();
            mass[i] = new Employee(name, salary);
        }
        for (int i = 0; i < n; i++) {
            String formattedDouble = new DecimalFormat("#0.00").format(mass[i].getSalary());
            System.out.println(String.format("%-" + 40 + "s",mass[i].getFullname()) + formattedDouble);
        }
    }
}
