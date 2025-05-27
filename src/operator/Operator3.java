package operator;

public class Operator3 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        
        boolean result1 = str1.equals(str2);
        System.out.println("result1 = " + result1);

        System.out.println(true && true);
        System.out.println(true || false);
        System.out.println(!false);
    }
}
