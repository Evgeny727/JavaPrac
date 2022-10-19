package prac.prac1;
import java.util.Scanner;
import java.util.Vector;

public class Task2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Vector v=new Vector();
        int c;
        do{
            c=sc.nextInt();
            v.addElement(c);
        }while(sc.hasNextInt());
        int max=0,min=0;
        for(int i=0; i<v.size();i++){
            c=(int)v.get(i);
            if(i==0){
                min=c;
            }
            if(c > max){
                max=c;
            }
            else if(c<min){
                min=c;
            }
        }
        v.clear();
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
