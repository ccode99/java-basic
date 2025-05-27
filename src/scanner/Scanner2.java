package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("int:");
            int num = input.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
        }
        System.out.println("sum = " + sum);

    }
}
