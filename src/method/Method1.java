package method;

public class Method1 {
    public static void main(String[] args) {
        int num1 = add(3,4);
        System.out.println("num1 = 3 + 4 = " + num1);

        int num2 = 10;
        changeNumber(num2);
        System.out.println("num2 = " + num2);
    }

    public static int add(int a, int b) {
        return a+b;
    }

    public static void changeNumber(int c) {
        c += 1;
        System.out.println("c in function = " + c);
    }
}
