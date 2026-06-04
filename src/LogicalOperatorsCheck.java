import java.util.Scanner;

public class LogicalOperatorsCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        // Using logical AND (&&) operator to confirm match
        boolean check = (num1 + num2 == num3) && (num3 - num2 == num1);

        if (check) {
            System.out.println("True: The third number is the sum of the first two.");
        } else {
            System.out.println("False: The third number is NOT the sum of the first two.");
        }
    }
}
