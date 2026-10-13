AIM:
To generate the Fibonacci series up to a specified number of terms.

ALGORITHM:
1. Read the number of terms.
2. Initialize the first two terms as 0 and 1.
3. Print the current term.
4. Calculate the next term as the sum of the previous two terms.
5. Repeat until the required number of terms is printed.

CODE:
import java.util.Scanner;
public class FibonacciSeries {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Enter the value of n: ");
int n = s.nextInt();
fibonacci(n);
}
public static void fibonacci(int n) {
if (n == 0) {
System.out.println("0");
} else if (n == 1) {
System.out.println("0 1");
} else {
System.out.print("0 1 ");
int a = 0;
int b = 1;
for (int i = 1; i < n; i++) {
int nextNumber = a + b;
System.out.print(nextNumber + "");
a = b;
b = nextNumber;
}
}
}
}

OUTPUT:
Enter the value of n: 5
0 1 1 2 3 5

RESULT:
The Fibonacci series is successfully generated for the specified number of terms.
