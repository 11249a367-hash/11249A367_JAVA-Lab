AIM:
To create a user-defined package containing arithmetic operations and use it from another Java class.

ALGORITHM:
1. Create a package named arithmetic.
2. Create an Arithmetic class containing add, subtract, multiply and divide methods.
3. Compile the package class using the -d option.
4. Import the arithmetic package in the main program.
5. Create an Arithmetic object and call its methods.

CODE:
package add;
public class Add
{
int res;
public void addop(int a, int b)
{
res = a + b;
System.out.println("Add :"+res);
}
}
package sub;
public class Sub
{
int res;
public void subop(int a,int b)
{
res = a - b;
System.out.println("Sub:" + res);
}
}
package mul;
public class Mul
{
int res;
public void mulop(int a,int b)
{
res = a * b;
System.out.println("Mul :"+res);
}
}

package div;
public class Div
{
int res;
public void divop(int a,int b)
{
res = a / b;
System.out.println("Div :"+res);
}
}
import java.util.*;
import add.*;
import sub.*;
import mul.*;
import div.*;

public class ArithDemo
{
public static void main(String args[])
{
Add ad = new Add();
Sub su = new Sub();
Mul mu = new Mul();
Div di = new Div();
ad.addop(20,10);
su.subop(20,10);
mu.mulop(20,10);
di.divop(20,10);
}
}

OUTPUT:
Add :30
Sub:10
Mul :200
Div :2

RESULT:
The user-defined package is successfully created and used for arithmetic operations.
