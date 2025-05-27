package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("scanning:");
        int intValue = input.nextInt(); // 10\n 입력하면 10만 가져감
        input.nextLine(); // 남은 \n 처리
        System.out.println("scanned int = " + intValue);

        System.out.print("scanning:");
        String str = input.nextLine();
        System.out.println("scanned str = " + str);

    }
}
