AIM:
To find the largest among three numbers.

ALGORITHM:
 1. Read three numbers.
2. Compare the first number with the other two.
3. Update the largest value whenever a larger number is found.
4. Display the largest number.

CODE:
import java.util.Scanner;
class LargestOfThreeNumbers
{
public static void main(String args[])
{
int x, y, z;
System.out.println("Enter three integers");
Scanner in = new Scanner(System.in);
x = in.nextInt();
y = in.nextInt();
z = in.nextInt();
if (x > y && x > z)
System.out.println("First number is largest.");
else if (y > x && y> z)
System.out.println("Second number is largest.");
else if (z > x && z > y)
System.out.println("Third number is largest.");
else
System.out.println("The numbers are not distinct.");
}
}

OUTPUT:
Enter three integers
45
0
100
Third number is largest.

RESULT:
The largest of the three numbers is successfully determined.
