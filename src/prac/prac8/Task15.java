package prac.prac8;

public class Task15 {
    public static int solution(int n) {
        if (n < 10) {
            return n;
        }
        else {
            System.out.print(n % 10 + " ");
            return solution(n / 10);
        }
    }
    public static void main(String[] args) {
        System.out.println(solution(374));
    }
}
