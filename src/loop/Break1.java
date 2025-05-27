package loop;

public class Break1 {

    public static void main(String[] args) {
        int sum = 0;

        while (true) {
            System.out.println(++sum);
            if (sum >= 10) {
                break;
            }
        }

        sum = 0;
        while (true) {
            System.out.println(++sum);
            if (sum >= 10) {
                continue;
            }
        }

    }
}
