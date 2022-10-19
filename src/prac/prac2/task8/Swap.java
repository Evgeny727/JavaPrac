package prac.prac2.task8;

public class Swap {

    public static void main(String[] args){
        String[] a = { "Some1 "," Some2 "," Some3 "," Some4 "," Some5 "," Some6 "};
        int n = a.length;
        String temp;

        for (int i = 0; i < n/2; i++) {
            temp = a[n-i-1];
            a[n-i-1] = a[i];
            a[i] = temp;
        }

        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
    }
}