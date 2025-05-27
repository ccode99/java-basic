package condition;

public class Switch1 {
    public static void main(String[] args) {

        int grade = 2;
        int money;
        switch (grade) {
            case 1:
                money = 1000;
                break;
            case 2:
                money = 2000;
                break;
            case 3:
                money = 3000;
                break;
            default:
                money = 500;
        }
        System.out.println(money);

        int money2 = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println(money2);

    }
}
