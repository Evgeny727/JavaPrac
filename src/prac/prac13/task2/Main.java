package prac.prac13.task2;

public class Main {
    public static void main(String[] args)
    {
        Person A = new Person("Карелин");
        System.out.println(A.toString());
        Person B = new Person("Иванов","Дмитрий");
        System.out.println(B.toString());
        Person C = new Person("Дмитриев", "Иванов", "Сергеевич");
        System.out.println(C.toString());
    }
}
