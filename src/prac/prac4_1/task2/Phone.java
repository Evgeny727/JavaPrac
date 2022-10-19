package prac.prac4_1.task2;

public class Phone {
    private String number;
    private String model;
    private String weight = "1 kg";

    public Phone(String number, String model, String weight) {
        this(number,model);
        this.weight = weight;
    }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone() {
        number = "8800";
        model = "Samsung";
        weight = "1.2 kg";
    }

    @Override
    public String toString() {
        return "Phone: " + "number = " + number + ", model = " + model + ", weight = " + weight;
    }
    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }
    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " " + number);
    }
    public String getNumber() {
        return number;
    }
    public void sendMessage(String...numbers) {
        System.out.println("Сообщение будет отправлено на следующие номера: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
    }
}
