package prac.prac4_1.task4;

public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2,2);
        matrix1.setMass();
        Matrix matrix2 = new Matrix(2 , 2);
        matrix2.setMass();
        System.out.println("Первая матрица: ");
        matrix1.printMatrix();
        System.out.println("Вторая матрица: ");
        matrix2.printMatrix();
        matrix1.add(matrix2);
        System.out.println("Первая матрица после сложения: ");
        matrix1.printMatrix();
        matrix2.multiply(5);
        System.out.println("Вторая матрица после умножения на число: ");
        matrix2.printMatrix();
    }
}
