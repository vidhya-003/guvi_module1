import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        double num1, num2;
        Scanner scanner = new Scanner(System.in); // Corrected 'system' to 'System'
        System.out.print("Enter a number1: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter a number2: ");
        num2 = scanner.nextDouble();
        scanner.close();
        double sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}
