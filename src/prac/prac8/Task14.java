package prac.prac8;

public class Task14 {
    public static String solution(int n) {
        if (n < 10) {
            return Integer.toString(n);
        } else {
            return solution(n / 10) + " " + n % 10;
        }
    }
    public static void main(String[] args) {
        System.out.println(solution(207));
    }
}
