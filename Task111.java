import java.util.Scanner;

public class Task111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        int totalNumbers = 0;

        // Outer Loop control row
        for (int i = 1; i <= n; i++) {
            // Inner Loop number per column
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                totalNumbers++;
            }
            System.out.println();
        }

        System.out.println("Total numbers printed: " + totalNumbers);

        sc.close();
    }
}
