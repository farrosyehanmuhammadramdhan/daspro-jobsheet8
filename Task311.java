import java.util.Scanner;

public class Task311 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        System.out.print("Enter the number of stores: ");
        int numStores = sc.nextInt();

        if (numStores < 1) {
            System.out.println("Number of stores must be at least 1.");
        } else {
            int totalItemsAllStores = 0;
            int maxItems = -1;
            int storewithMostItems = 0;

            // Outer Loop
            for (int i = 1; i <= numStores; i++) {
                int numCustomers;
                // Validation Number of Customers
                do {
                    System.out.print("Enter number of customers for Store " + i + ": ");
                    numCustomers = sc.nextInt();
                    if (numCustomers < 0) {
                        System.out.println("Number of customers cannot be negative!");
                    }
                } while (numCustomers < 0);

                int storeTotalItems = 0;

                // Middle Loop
                for (int j = 1; j <= numCustomers; j++) {
                    int items;
                    // Inner Loop
                    do {
                        System.out.print("  Enter items bought by Customer " + j + ": ");
                        items = sc.nextInt();
                        if (items < 0) {
                            System.out.println("  Number of items cannot be negative!");
                        }
                    } while (items < 0);

                    storeTotalItems += items;
                }

                System.out.println("Store " + i + " - customers: " + numCustomers + ", total items: " + storeTotalItems);

                totalItemsAllStores += storeTotalItems;

                if (storeTotalItems > maxItems) {
                    maxItems = storeTotalItems;
                    storewithMostItems = i;
                }
            }
            // Final Report
            System.out.println("Total items across all stores: " + totalItemsAllStores);
            System.out.println("Store with the most items: " + storewithMostItems);
        }

        sc.close();
    }
}
