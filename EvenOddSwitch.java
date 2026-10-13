AIM:
To determine whether a given integer is even or odd.

 ALGORITHM:
1. Read an integer.
2. Divide the number by 2 and find the remainder.
3. If the remainder is 0, the number is even.
4. Otherwise, the number is odd.
5. Display the result.

CODE:
import java.util.*;
class EvenOddSwitch
{
public static void main(String args[])
{
int n,i;
Scanner s = new Scanner(System.in);
n = s.nextInt();
switch(n%2)
{
case 0 :
System.out.println("This number is even");
break;
case 1 :
System.out.println("This number is odd");
break;
}
}
}
    
OUTPUT:
5
This number is odd

RESULT:
The given number is successfully identified as even or odd.
