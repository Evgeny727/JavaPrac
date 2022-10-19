package prac.prac2.task4;
import java.util.Vector;
import java.util.Scanner;

public class Shop implements ShopIntf {
    private Vector<String> vec = new Vector();
    public Shop(int n){
        Scanner in= new Scanner(System.in);
        String name;
        System.out.print("Введите " + n + " названий компьютеров ");
        for(int i=0;i<n;i++){
            name=in.next();
            vec.addElement(name);
        }
    }
    public void addPC(String name) {
        vec.addElement(name);
    }

    public void deletePC(String name) {
        if(vec.indexOf(name)>=0) {
            vec.remove(vec.indexOf(name));
        }
    }

    public int searchPC(String name) {
        int n = vec.indexOf(name);
        if(n>=0) {
            return vec.indexOf(name);
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Shop: " + "vec=" + vec;
    }
}