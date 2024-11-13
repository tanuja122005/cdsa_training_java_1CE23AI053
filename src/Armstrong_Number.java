import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int result = 0;
        int digits = String.valueOf(number).length();

        while (number != 0) {
            int remainder = number % 10;
            result += Math.pow(remainder, digits);
            number /= 10;
        }

        return result == originalNumber;
    }
}
