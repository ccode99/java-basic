package variable;

public class Var3 {
    public static void main(String[] args) {

        int a = 2147483647;
        System.out.println(++a); //overflow


        long b = 2147483648L;
        int c = (int) b; //casting
        System.out.println(c);
    }
}
