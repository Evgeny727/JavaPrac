package prac.prac3.Math_Random.task2;

import java.util.Scanner;

public class Tester {
    private int n = 1;
    private Circle circle[];
    public Tester(){
        circle = new Circle[1];
        circle[0]  = new Circle();
    }
    public Tester(int n){
        this.n = n;
        circle = new Circle[n];
        Scanner sc =new Scanner(System.in);
        double x,y;
        for(int i=0; i<n; i++){
            System.out.println("Введите x:");
            if(sc.hasNextDouble()){
                x = sc.nextDouble();
                System.out.println("Введите y:");
                if(sc.hasNextDouble()){
                    y = sc.nextDouble();
                    circle[i] = new Circle(x,y);
                }
            }
            else circle[i] = new Circle();
        }
    }
    public void maxCircle(){
        double max = 0.0;
        double temp;
        for(int i=0; i<n; i++){
            temp = circle[i].getCircleLength();
            if(temp > max){
                max = temp;
            }
        }
        System.out.println("Длина самой большой окружности = " + max);
    }
    public void minCircle(){
        double min = 1.1;
        double temp;
        for(int i=0; i<n; i++){
            temp = circle[i].getCircleLength();
            if(temp < min){
                min = temp;
            }
        }
        System.out.println("Длина самой маленькой окружности = " + min);
    }
    public void sortCircle(){
        double temp1;
        double temp2;
        Circle ctemp;
        for(int i=0; i<n; i++){
            System.out.println(circle[i].getCircleLength());
        }
        for(int i=0; i<n-1; i++){
            for(int j=1; j<n; j++){
                temp1 = circle[i].getCircleLength();
                temp2 = circle[j].getCircleLength();
                if(temp1 > temp2){
                    ctemp = circle[i];
                    circle[i] = circle[j];
                    circle[j] = ctemp;
                }
            }
        }
    }
}
