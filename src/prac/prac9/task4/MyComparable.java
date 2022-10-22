package prac.prac9.task4;

public class MyComparable implements Comparable{

    @Override
    public boolean comparable(boolean a, boolean b) {
        if (a == b) return true;
        else return false;
    }

    @Override
    public boolean comparable(byte a, byte b) {
        if (a == b) return true;
        else return false;
    }

    @Override
    public boolean comparable(short a, short b) {
        if (a == b) return true;
        else return false;
    }

    @Override
    public boolean comparable(int a, int b) {
        if (a == b) return true;
        else return false;
    }

    @Override
    public boolean comparable(float a, float b) {
        if (a == b) return true;
        else return false;
    }

    @Override
    public boolean comparable(double a, double b) {
        if (a == b) return true;
        else return false;
    }

    @Override
    public boolean comparable(char a, char b) {
        if (a == b) return true;
        else return false;
    }
}
