import java.util.Scanner;

public class Task211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("The minimum value of n is 3.");
        } else {
            int totalSum = 0; //Akumulator

            // Outer Loop
            for (int i = 1; i <= n; i++) {
                // Inner Loop
                for (int j = 1; j <= n; j++) {
                    int product = i * j;
                    System.out.printf("%4d", product);
                    totalSum += product;
                }
                System.out.println(); // Switch to the new line
            }

            System.out.println("Total of all numbers: " + totalSum);
        }

        sc.close();
    }
}
