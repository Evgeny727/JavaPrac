package prac.prac13.task3;

public class Main {
    public static void main(String[] args)
    {
        Address A = new Address();
        A.setAddress1("Россия   , Москва   , Москва   , Таганская   , 62, 0   ");
        System.out.println(A.toString());
        Address B = new Address();
        B.setAddress2("Россия   , Москва   . Москва   ; Таганская   , 62. 0   ");
        System.out.println(B.toString());
    }
}
