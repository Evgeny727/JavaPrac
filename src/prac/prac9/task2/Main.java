package prac.prac9.task2;

public class Main {
    public static void main(String[] args) {
        SortingStudentsByGPA A = new SortingStudentsByGPA(5);
        System.out.println(A.toString());
        A.sort(0, 4);
        System.out.println(A.toString());
    }
}
