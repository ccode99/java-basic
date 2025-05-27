package loop;

public class While1 {
    public static void main(String[] args) {

        int i = 0;
        int sum = 0;
        while (i < 3) {
            sum += i++;
        }
        System.out.println(sum);

        do {
            System.out.println("1st");
        } while (i < 0);

    }
}
