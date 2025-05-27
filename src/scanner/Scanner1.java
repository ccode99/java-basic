package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("scanning:");
        String str = scanner.nextLine();
        System.out.println("scanned str = " + str);

        System.out.print("scanning:");
        int intValue = scanner.nextInt();
        System.out.println("scanned int = " + intValue);

        System.out.print("scanning:");
        double doubleValue = scanner.nextDouble();
        System.out.println("scanned double = " + doubleValue);

    }
}
