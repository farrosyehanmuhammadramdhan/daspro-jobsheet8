# WORKSHEET 8 - LOOPS 2

**Student Details:**

- **Name:** Farrosyehan Muhammad Ramdhan
- **Student ID (NIM):** 264107020186
- **Class / Attendance No.:** 1I / 11

---

## 1: PRACTICAL OBJECTIVES

The objectives of the practical session in this chapter are as follows:

1. Understand the concept of nested loops in algorithms
2. Understand the flow of nested loops
3. Recognize the syntax of nested loops
4. Be able to apply nested loops to solve a simple case study.

---

## 2: Experimental Results & Analysis

### 2.1 Experiment 1: Review of Loops 1
This experiment revisits the FOR loop before learning nested loops. The program prints the
character `*` `n` times horizontally (side by side). Use n as a positive integer input.

#### 2.1.1 Java Program Code

```java
import java.util.Scanner;

public class Star11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        sc.close();
    }
}

```

#### 2.1.2 Screenshot Output

The following shows the _output_ after the program is run:

![Output Experiment 1](/result-1.png)

#### 2.1.3 Answers to Questions

- **Question 1:** If the initialization `i = 1` is changed to `i = 0` without changing the condition, how many `*` characters are printed when `n = 5`? Explain.
  - **Answer:** The result will be 6 stars because the loop runs from `i = 0` to `i = 5`—meaning the count begins at 0—which results in a total of n + 1 executions (6 times).

- **Question 2:** If the condition `i <= n` is changed to `i < n`, how many times does the loop run when `n = 5`? Why is the result different?
  - **Answer:** The loop executes 4 times because the condition `i < 5` causes the loop to terminate when `i = 5` (as the condition becomes false), whereas `i <= 5` would still process the value `i = 5`.


- **Question 3:** Predict the output of the following code fragment when `n = 9`, then verify it by replacing the FOR loop in your program and running it.
  ```java
  for (int i = 2; i <= n; i += 2) {
    System.out.print(i + " ");
  }
  ```
    Modify this code so that it prints the odd positive numbers that do not exceed n.
  - **Answer:**
    - **Output:** 2  4  6  8
    - **Explanation:** Because this loop prints even values ​​with an increment of 2 (i += 2), starting from 2 up to a value less than or equal to 9.
    - **Modification:**
      ```java
      for (int i = 1; i <= n; i += 2) {
        System.out.print(i + " ");
      }
      ``` 
  

- **Question 4:** Explain why changing the increment i++ to i-- (with the condition still i <= n) makes the loop run endlessly, so that it does not stop in a reasonable time for positive n. Do not run that version; if it has already started running, stop the program by pressing Ctrl + C in the terminal.
  - **Answer:** This is because if `i` starts at a certain value and is continuously decremented (`i--`), its value will decrease to 0, -1, -2, and so on. For any positive value of `n`, the condition that `i` is less than or equal to `n` will always remain true, meaning this loop will never terminate.

---

### 2.2 Experiment 2: Rectangle Star Pattern (Nested FOR)
In this experiment a nested loop of FOR statements is used to print a rectangle of stars. The
number of rows and columns is entered separately, so the role of each loop can be observed
clearly: the outer loop controls the rows, while the inner loop controls the columns (recall the
shelf/locker analogy from the lecture material).

#### 2.2.1 Java Program Code

```java
import java.util.Scanner;

public class Rectangle11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the numbers of columns: ");
        int columns = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
```

#### 2.2.2 Screenshot Output

The following shows the _output_ after the program is run:

![Output Experiment 1](/result-2.png)

---

#### 2.2.3 Answers to Questions

- **Question 1:** Explain the function of the variables i and j in the program.
  - **Answer:**
    - **Explanation:**
      - Variable `i` : Acts as a counter in the outer loop to control the printing of rows.
      - Variable `j` : Functions as a counter within the inner loop to control the printing of columns.

    
  
- **Question 2:** How many times are the outer loop, the inner loop, and the statement print("*") executed for rows = 4 and columns = 7?
  - **Answer:**
    - **Explanation:** 
      - Outer Loop : Executed 4 times.
      - Inner Loop : Executed 4 X 7 = 28 times.
      - print("*") : Executed 28 times.


- **Question 3:** What happens if the bounds of the outer and inner loops are swapped (the outer loop uses columns and the inner loop uses rows)? Use rows = 3 and columns = 6 to explain.
  - **Answer:** 
    - **Result:** A printed pattern with a size of 6 rows and 3 columns.
    - **Explanation:** The outer loop will repeat 6 times (rows), and the inner loop will repeat 3 times per row (columns).
    

- **Question 4:** Explain the effect of removing `System out.println();` after the inner loop.
  - **Answer:** All `*` characters will be printed aligned in a single row without moving to a new line, so a rectangular shape will not be formed.

- **Question 5:** Modify the program so that the printed character is #.
  - **Answer:**
    ```java
    System.out.print("#");
    ```

### 2.3 Experiment 3: Debugging a Star Triangle – Nested WHILE
The starting code in this experiment is intentionally written so that it does not yet produce
the correct triangle format. Your task is to identify the errors and fix them without changing
the WHILE structure into FOR.

#### 2.3.1 Java Program Code

**Before Debug:**
```java
import java.util.Scanner;

public class Triangle11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        int i = 0;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
        }
        sc.close();
    }
}
```

**Debug Temporary:**
```java
import java.util.Scanner;

public class Triangle11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        int i = 0;
        while (i <= n) {
            System.out.print("[i=" + i + "] ");
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
        }
        sc.close();
    }
}
```
5. **Result:**
   - a. The outer loop executes 6 times—specifically for values ​​of i = 0, 1, 2, 3, 4, and 5. This number does not match the desired number of rows (5 rows) because the loop begins at 0 and uses the condition i <= n, resulting in a total of n + 1 iterations.
   - b. The number of `*` characters when `i = 0` is 0—meaning no `*` characters are printed—because the inner loop condition `j < i` (0 < 0) evaluates to false, causing the inner loop block to not execute at all.
   - c. All printed output appears in a single continuous line because the program code uses only the `System.out.print()` command and lacks a `System.out.println()` instruction after the inner loop to trigger a line break.

**Add println():**
```java
import java.util.Scanner;

public class Triangle11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        int i = 0;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
```

**Change the Initialization:**
```java
import java.util.Scanner;

public class Triangle11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
```

**Triangle Inverted:**
```java
import java.util.Scanner;

public class Triangle11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        int i = n;
        while (i >= 1) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
        sc.close();
    }
}
```

#### 2.3.2 Screenshot Output

The following shows the _output_ after the program is run:

**Before Debug:**
![Output Experiment 3.1](/result-3.1.png)

**Debug Temporary:**
![Output Experiment 3.2](/result-3.2.png)

**Add Println():**
![Output Experiment 3.3a](/result-3.3.a.png)

**Change the Initialization:**
![Output Experiment 3.3b](/result-3.3.b.png)

**Triangle Inverted:**
![Output Experiment 3.4](/result-3.4.png)



#### 2.3.3 Answers to Questions

- **Question 1:** Identify the mismatches in the initial output, and at least two fixes needed to produce a nested triangle pattern.
  - **Answer:**
    - **Explanation:** 
  
- **Question 2:** Explain the roles of the variables `i` and `j`. Why must the value of `j` be reset to 0 in every
iteration of the outer loop? What happens if `j` is not reset?
  - **Answer:** 
    


- **Question 3:** Explain the changes to the initialization, the condition, and the update of the outer loop that are needed to form the inverted triangle.
  - **Answer:** 
    






### 2.4 Experiment 4: Case Study of Group Project Scores
In assessing a group project, each group receives scores from a number of graders. The program receives the number of groups and the number of graders (the same for every group), then calculates the average score of each group and determines the group with the highest average. This case is solved with nested loops without storing all the scores: a WHILE (outer) for the groups, a FOR (middle) for the graders, and a DO-WHILE (inner) to repeat invalid score input.

#### 2.4.1 Java Program Code

```java
import java.util.Scanner;

public class GroupScore11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of groups: ");
        int numGroups = sc.nextInt();
        System.out.print("Enter the number of graders: ");
        int numGraders = sc.nextInt();

        
        if (numGroups <= 0 || numGraders <= 0) {
            System.out.println("Groups and graders must be > 0.");
        } else {
            
            int groupNo = 1;
            double highestAverage = -1;
            int bestGroup = 0;

            
            while (groupNo <= numGroups) {
                System.out.println("Group " + groupNo);
                double totalScore = 0; 

                for (int j = 1; j <= numGraders; j++) {
                    int score;
                    do {
                        System.out.print("  Score from Grader " + j + ": ");
                        score = sc.nextInt();
                        if (score < 0 || score > 100) {
                            System.out.println("  Score must be 0-100. Retry!");
                        }
                    } while (score < 0 || score > 100);

                    totalScore += score;
                }

                double averageScore = totalScore / numGraders;
                System.out.println("Group " + groupNo + ": average score = " + averageScore);

                if (averageScore > highestAverage) {
                    highestAverage = averageScore;
                    bestGroup = groupNo;
                }

                groupNo++; 
            }
            
            System.out.println("==============================");
            System.out.println("Best group      : " + bestGroup);
            System.out.println("Highest average : " + highestAverage);
        }

        sc.close();
    }
}

```

#### 2.4.2 Screenshot Output

The following shows the _output_ after the program is run:

![Output Experiment 4](/result-4.1.png)

![Output Experiment 4](/result-4.2.png)

![Output Experiment 4](/result-4.3.png)

#### 2.4.3 Answers to Questions

- **Question 1:** Why must `totalScore` be reset inside the outer loop, but `highestAverage` must not be reset for each group?
  - **Answer:** 
    - **Explanation:**
      - `totalScore` : It must be reset within the outer loop so that the accumulated value only calculates the total for the group currently being processed.
      
      - `highestAverage` : It is not reset, so that it retains the highest average value found across all groups.


- **Question 2:** For 3 groups and 2 graders (without any invalid input), how many times is the body of the `FOR` loop executed in total?
  - **Answer:** The number of executions is 3 X 2 = 6 times.

- **Question 3:** What happens if `totalScore` is declared as `int` and the average is calculated using integer division? Give an example of values.
  - **Answer:**
    - **Impact:** The average result will lose its decimal digits because integer division produces a whole number.
    - **Example:** If `totalScore = 17` and `numGraders = 2`, the result of the division is 8 (it should be 8.5)
    

- **Question 4:** Why is `highestAverage` given the initial value -1 rather than 0? Give an example of input that produces a wrong result if the initial value were 0.
  - **Answer:** 
    - **Impact:** The average result of the first group is always recorded as the initial highest value, even if the average is 0.
   - **Example wrong case if 0:** If the entire group has an average of 0 and the initial value of `highestAverage` is 0, the condition `averageScore > highestAverage` (0 > 0) evaluates to `false`, meaning the `bestGroup` variable will not be updated.

- **Question 5:** This program has three levels of loops. Name each type of loop and its role.
  - **Answer:**
    - WHILE (Outer) : Controlling the iteration to process each group
    - FOR (Middle) : Controlling the iteration of value readings from each Graders.
    - DO-WHILE (Inner) : Validate that the entered value falls within the range 0–100, and request the input again if it is invalid.

---

## 3: INDIVIDUAL ASSIGNMENT

The following is a list of tasks to be completed in this worksheet:

- [x] **Task 1:** Write a program that prints a number pattern from 1 up to the row number. Enter an integer `n` (n is at least 1). The first row prints 1, the second row prints 1 2, and so on up to row n. After the pattern is complete, display the total number of digits that have been printed. Save the file with the name: Task1StudentNo.java.
  
For `n = 5` : 
```text
Enter the value of n = 5
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
Total numbers printed: 15
```

- [x] **Task 2:** Write a program that displays a multiplication table of size n × n using nested FOR or WHILE
loops. The value of n is at least 3. Each position displays the product of its row number and
column number. Arrange the spacing so that the output is neat, then display the sum of all
the numbers in the table. Save the program with the file name: Task2StudentNo.java

For `n = 4` : 
```text
Enter the value of n = 4
   1   2   3   4
   2   4   6   8
   3   6   9  12
   4   8  12  16 
Total numbers printed: 100
```

**Hint :** to align the numbers to the right, use `System.out.printf("%4d", result);`, which prints a number with a width of 4 characters, or use the tab character `"\t"` as a separator.



- [x] **Task 3:** A shopping center has several stores. Each store serves a number of customers on the same day, and each customer buys several items. The program asks for the number of stores, then the number of customers at each store, and the number of items bought by each customer. Calculate and display the total number of customers and the total number of items for each store, the total number of items across all stores, and the number of the store with the most items. If several stores share the highest value, display the store with the smallest number. Save the program with the file name: Task3StudentNo.java.

Requirements: the number of stores is at least 1. The number of customers and the number of items per customer may be 0, but must not be negative. Use nested loops. The data does not need to be stored one by one; it is sufficient to accumulate it into the total variables.

Example: Store 1 has 2 customers who bought 3 and 2 items; Store 2 has 3 customers who bought 1, 4, and 2 items. The expected summary is:
```text
Store 1 - customers: 2, total items: 5
Store 2 - customers: 3, total items: 7
Total items across all stores: 12
Store with the most items: 2
```


### 3.1 Implementation of Task 1 Code

```java
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
```

### 3.2 Implementation of Task 2 Code

```java
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
```

### 3.3 Implementation of Task 3 Code

```java
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

```

## 4: CONCLUSION
Penguasaan Nested Loops sangat krusial dalam pemrograman Java karena merupakan dasar dalam pengelolaan data berdimensi banyak (seperti array 2D, matriks, tabel, dan struktur data bersarang). Kunci keberhasilan dalam mengimplementasikan nested loops terletak pada:

- Pemahaman alur eksekusi antar-tingkat perulangan.
- Ketelitian menentukan tempat pembentukan dan pembaharuan (resetting) variabel.
- Penerapan validasi input untuk menjaga integritas data program.
