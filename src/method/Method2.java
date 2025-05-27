package method;

public class Method2 {
    public static void main(String[] args) {
        int i = 10;
        double d = 1.5;
        printInt((int) d);
        printDouble(i);
    }

    public static void printInt(int n) {
        System.out.println("printInt = " + n);
    }

    public static void printDouble(double d) {
        System.out.println("printDouble = " + d);
    }
}
