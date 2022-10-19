package prac.prac4_1.task4;

import java.util.Scanner;

public class Matrix {
    private double [][] mass;
    private int row = 0;
    private int column = 0;

    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        mass = new double[row][column];
    }

    public void setMass() {
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                mass[i][j] = sc.nextDouble();
            }
        }
    }

    public double[][] getMass() {
        return mass;
    }
    public void add(Matrix matrix) {
        double[][] mass1 = matrix.getMass();
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                mass[i][j] += mass1[i][j];
            }
        }
    }
    public void multiply(int num) {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                mass[i][j] *= num;
            }
        }
    }
    public void printMatrix() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }
}
