import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER 5 DIGIT INTEGER: ");

        int num = scanner.nextInt();
        int digit;

        String incremented = "";

        for (int i = 0; i < 5; i++) {
            digit = num % 10;
            num /= 10;

            digit += 1;
            digit %= 10;

            incremented = Integer.toString(digit) + incremented;
        }

        System.out.println(incremented);
    }
}