AIM:
To write a Java program that determines if a user-input year is a leap year.

ALGORITHM:
  1. Start
2. Read the year (Y) from the user.
3. Check the condition:
	• If (Y % 400 == 0) OR (Y % 4 == 0 AND Y % 100 != 0)
	• True: Print "Leap Year".
	• False: Print "Not a Leap Year".
4. Stop

CODE:
import java.util.Scanner;
public class LeapYear
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.print("Enter any year:");
int year = s.nextInt();
boolean flag = false;
if(year % 400 == 0)
{
flag = true;
}
else if (year % 100 == 0)
{
flag = false;
}
else if(year % 4 == 0)
{
flag = true;
}
else
{
flag = false;
}
if(flag)
{
System.out.println("Year "+year+" is a Leap Year");
}
else
{
System.out.println("Year "+year+" is not a Leap Year");
}
}
}

OUTPUT:
Enter any Year : 2024
Year is 2024 Leap Year

RESULT:
The Java program was successfully executed, correctly identifying leap year.
