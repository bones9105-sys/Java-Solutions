import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double n1 = sc.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        double n2 = sc.nextDouble();

        switch (op) {
            case '+': System.out.println("Result: " + (n1 + n2)); break;
            case '-': System.out.println("Result: " + (n1 - n2)); break;
            case '*': System.out.println("Result: " + (n1 * n2)); break;
            case '/':
                if (n2 != 0) {
                    System.out.println("Result: " + (n1 / n2));
                } else {
                    System.out.println("Error: Division by zero is undefined.");
                }
                break;
            default: System.out.println("Invalid operator!");
        }
    }
}