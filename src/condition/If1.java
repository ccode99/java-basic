package condition;

public class If1 {
    public static void main(String[] args) {

        int age = 20;

        if (age < 18) {
            System.out.println("study");
        } else if (age > 65) {
            System.out.println("retire");
        } else {
            System.out.println("work");
        }

    }
}
