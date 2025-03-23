# Inverted Right-Angle Triangle Pattern in Java

## Overview
This Java program prints an inverted right-angled number triangle based on the user input. The program takes an integer input `n` from the user and generates a pattern where each row contains numbers starting from `1` up to the row length, decreasing in length with each subsequent row.

## Code
```java
package number_patterns;

import java.util.Scanner;

public class Inverted_RightAngle_Triangle
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = s.nextInt();
        
        for(int i = 0; i <= n; i++)
        {
            int num = 1;
            for(int j = i; j < n; j++)
            {
                System.out.print(num++);
            }
            System.out.println();
        }
    }
}
```

## Explanation

### 1. **Scanner Class**
- The `Scanner` class is used to take user input.
- `Scanner s = new Scanner(System.in);` creates a Scanner object to read input from the keyboard.
- `int n = s.nextInt();` reads an integer from the user and stores it in variable `n`.
- The `Scanner` object is not closed in this program. It is a good practice to close it using `s.close();` to prevent resource leaks.

### 2. **Variables Used**
- `int n`: Stores the user input which determines the number of rows.
- `int num`: A temporary variable initialized to `1` in each iteration of the outer loop to print sequential numbers.

### 3. **For Loop Structure**

#### **Outer Loop (`for (int i = 0; i <= n; i++)`)**
- Controls the number of rows printed.
- Starts from `0` and runs until `i <= n`.
- Determines how many numbers will be printed in each row.

#### **Inner Loop (`for (int j = i; j < n; j++)`)**
- Controls the number of numbers printed per row.
- Starts from `i` and runs until `j < n`, ensuring that each row has decreasing length.
- Uses `System.out.print(num++)` to print sequential numbers from `1`.

### 4. **Printing Statements**
- `System.out.println("Enter the size");` prompts the user to enter a number.
- `System.out.print(num++);` prints numbers sequentially in each row.
- `System.out.println();` moves the cursor to the next line after completing a row.

## Example Output
### **Input:**
```
Enter the size
5
```
### **Output:**
```
12345
1234
123
12
1
```

## Conclusion
This program demonstrates the use of nested loops to generate patterns. The Scanner class helps take user input dynamically. The logic behind the inner loop ensures decreasing numbers in each row, forming the desired inverted triangle pattern.

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Inverted_RightAngle_Triangle.git
```
