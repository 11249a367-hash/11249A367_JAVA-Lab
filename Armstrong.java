AIM:
To check whether a given number is an Armstrong number.

ALGORITHM:
1. Find the number of digits (n) in the input number.
2. Copy the original number to a temporary variable (as you will modify it during extraction).
3. Extract each digit from right to left using the modulo operator (% 10).
4. Raise the extracted digit to the power of n and add it to a running sum variable.
5. Remove the last digit from your temporary number by dividing it by 10 (/ 10).
6. Repeat steps 3-5 until the temporary number reaches 0.
7. Compare the final sum with the original number. If they match, it is an Armstrong number.

 PROGRAM:
import java.util.Scanner;

public class Armstrong {
    public static void main(String arg[]) {
        int n, nu, num = 0, rem;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any positive number: ");
        n = scan.nextInt();
        nu = n;
        while (nu != 0) {
            rem = nu % 10;
            num = num + rem * rem * rem;
            nu = nu / 10;
        }
        if (num == n) {
            System.out.print("Armstrong Number");
        } else {
            System.out.print("Not an Armstrong Number");
        }
    }
}

OUTPUT:
Enter any positive number: 153
Armstrong Number

RESULT:
The given number is successfully checked for the Armstrong property.
