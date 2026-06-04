import java.util.Scanner;

public class FitnessTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] steps = new int[7];
        int total = 0;
        int highest = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Enter steps walked on day " + (i + 1) + ": ");
            steps[i] = sc.nextInt();
            total += steps[i];

            if (steps[i] > highest) {
                highest = steps[i];
            }
        }

        double average = (double) total / 7;

        System.out.println("\n--- Results ---");
        System.out.println("Total steps: " + total);
        System.out.printf("Average steps: %.2f\n", average);
        System.out.println("Highest number of steps: " + highest);
    }
}