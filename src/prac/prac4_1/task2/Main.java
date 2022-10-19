package prac.prac4_1.task2;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("8999","Iphone", "1.5 kg");
        Phone phone2 = new Phone("8903", "Xiaomi");
        Phone phone3 = new Phone();
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        phone1.receiveCall("Ivan");
        System.out.println(phone1.getNumber());
        phone2.receiveCall("Evgeny");
        System.out.println(phone2.getNumber());
        phone3.receiveCall("Anonim");
        System.out.println(phone3.getNumber());
        phone1.receiveCall("Ivan", phone2.getNumber());
        phone2.receiveCall("Evgeny", phone3.getNumber());
        phone3.receiveCall("Anonim", phone1.getNumber());
        phone1.sendMessage("8800", "8903", "8999", "8904");
    }
}
