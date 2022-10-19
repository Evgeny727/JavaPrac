package prac.prac1.task5;

public class Factorial {
    private int n;
    public Factorial(int n){
        this.n=n;
    }
    public int factorial(){
        int result = 1;
        for (int i = 1; i <=n; i++){
            result = result*i;
        }
        return result;
    }
}