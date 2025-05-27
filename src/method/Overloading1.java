package method;

public class Overloading1 {
    public static void main(String[] args) {
        System.out.println(add(2.5,1));
        System.out.println(add(1,2.5));
    }

    public static int add(int a, int b) {
        return a+b;
    }

    public static int add(int a, int b, int c) {
        return a+b+c;
    }

    public static double add(double a, int b) {
        return a+b;
    }

    public static double add(int a, double b) {
        return a+b;
    }

}
