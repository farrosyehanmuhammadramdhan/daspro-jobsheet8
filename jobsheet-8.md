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
    


## 3: INDIVIDUAL ASSIGNMENT

The following is a list of tasks to be completed in this worksheet:

- [x] **Task 1:** 
- [x] **Task 2:** 
- [x] **Task 3:**


### 3.1 Implementation of Task 1 Code

```java

```

### 3.2 Implementation of Task 2 Code

```java

```


## 4: CONCLUSION

