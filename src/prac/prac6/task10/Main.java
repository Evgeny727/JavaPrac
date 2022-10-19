package prac.prac6.task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Введите кол-во элементов для массива ");
        int n=in.nextInt();
        Shop s1= new Shop(n);
        System.out.println(s1);
        System.out.println("Введите номер действия: ");
        System.out.println("1 - Добавить компьютер");
        System.out.println("2 - Удалить компьютер");
        System.out.println("3 - Поиск компьютера");
        System.out.println("4 - Выйти из меню");
        while (true) {
            String name;
            n = in.nextInt();
            if (n == 4) {
                break;
            }
            switch (n){
                case 1:
                    System.out.println("Введите название компьютера");
                    name = in.nextLine();
                    if (name.isEmpty()) {
                        name = in.nextLine();
                    }
                    s1.addPC(name);
                    break;
                case 2:
                    System.out.println("Введите название компьютера");
                    name = in.nextLine();
                    if (name.isEmpty()) {
                        name = in.nextLine();
                    }
                    s1.deletePC(name);
                    break;
                case 3:
                    System.out.println("Введите название компьютера");
                    name = in.nextLine();
                    if (name.isEmpty()) {
                        name = in.nextLine();
                    }
                    s1.searchPC(name);
                    break;
            }
            System.out.println("Введите номер действия: ");
        }
    }
}
