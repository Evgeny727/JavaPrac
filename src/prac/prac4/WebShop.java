package prac.prac4;

import java.util.Scanner;
import java.util.Vector;

enum catalogList {Computers, Consoles, GPU, CPU;
    public static void outList(){
        for(catalogList cList : catalogList.values()){
            System.out.print(cList + " ");
        }
        System.out.println();
    }
}

enum computersList{TopPc, MiddlePc, LowPc;
    public static void outList(){
        for(computersList compList : computersList.values()){
            System.out.print(compList + " ");
        }
        System.out.println();
    }
}

enum consolesList{Ps5, Ps4, Xbox;
    public static void outList(){
        for(consolesList consList : consolesList.values()){
            System.out.print(consList + " ");
        }
        System.out.println();
    }
}

enum gpuList{RTX3090,RTX3080, RTX3070, RTX3060;
    public static void outList(){
        for(gpuList vcList : gpuList.values()){
            System.out.print(vcList + " ");
        }
        System.out.println();
    }
}

enum cpuList{Intel, AMD;
    public static void outList(){
        for(cpuList cpList : cpuList.values()){
            System.out.print(cpList + " ");
        }
        System.out.println();
    }
}

public class WebShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String login = null;
        String password = null;
        while (true) {
            System.out.println("Введите логин");
            login = sc.nextLine();
            if(!"login".equals(login)) {
                System.out.println("Логин не верный!");
            } else {
                break;
            }
        }
        while (true) {
            System.out.println("Введите пароль");
            password = sc.nextLine();
            if (!"password".equals(password)) {
                System.out.println("Пароль не верный!");
            } else {
                break;
            }
        }
        System.out.println("С возращением " + login + "!");
        System.out.println("Введите номер действия: ");
        System.out.println("1 - Просмотр списка каталогов");
        System.out.println("2 - Просмотр списка товаров 1 каталога");
        System.out.println("3 - Просмотр списка товаров 2 каталога");
        System.out.println("4 - Просмотр списка товаров 3 каталога");
        System.out.println("5 - Просмотр списка товаров 4 каталога");
        System.out.println("6 - Выйти из меню");
        int n;
        while (true) {
            n = sc.nextInt();
            if (n == 6) {
                break;
            }
            switch (n){
                case 1:
                    System.out.print("Список каталогов: ");
                    catalogList.outList();
                    break;
                case 2:
                    System.out.print("Список товаров каталога " + catalogList.Computers + ": ");
                    computersList.outList();
                    break;
                case 3:
                    System.out.print("Список товаров каталога " + catalogList.Consoles + ": ");
                    consolesList.outList();
                    break;
                case 4:
                    System.out.print("Список товаров каталога " + catalogList.GPU + ": ");
                    gpuList.outList();
                    break;
                case 5:
                    System.out.print("Список товаров каталога " + catalogList.CPU + ": ");
                    cpuList.outList();
                    break;
            }
            System.out.println("Введите номер действия: ");
        }
        Vector vec = new Vector(0);
        String result = null;
        result = sc.nextLine();
        while (true) {
            System.out.println("Введите название товара для добавления в корзину(для выхода из корзины введите exit):");
            result = sc.nextLine();
            if (!"exit".equals(result)) {
                vec.addElement(result);
            }
            else {
                break;
            }
        }
        if (vec.capacity() > 0){
            System.out.print("Содержимое корзины: ");
            for (int i = 0; i < vec.size(); i++) {
                System.out.print(vec.get(i) + " ");
            }
            System.out.println();
            System.out.println("Хотите ли купить товар в корзине?(yes/no): ");
            String symbol;
            symbol = sc.nextLine();
            if("yes".equals(symbol)){
                System.out.println("Спасибо за покупку! :)");
            }
            else {
                System.out.println("До свидания!");
            }
        }
        else {
            System.out.println("Товар в корзине отсутствует :(");
            System.out.println("До свидания!");
        }
    }
}
