AIM:
To write a Java program to sort the elements of an array in ascending order.

ALGORITHM:
1. Start with an unsorted array of size N.
2. Loop through the array from the first element to the last (i from 0 to N-1).
3. Compare adjacent elements (j and j + 1).
4. Swap them if the left element is larger than the right element (arr[j] > arr[j+1]).
5. Repeat steps 3 and 4 until the entire array is scanned without any swaps.
6. Stop; the array is now in ascending order.

 PROGRAM: 
import java.util.Scanner;
public class
AscendingOrder
{
  public static void main(String[] args)
  {
    int n,temp;
    Scanner s = new Scanner(System.in);
    System.out.print("enter no. of elements you want in array:"); 
    n = s.nextInt();
    int a[] = new int[n];
    System.out.println("enter all the elements:");
    for (int i = 0; i < n; i++)
    {
      a[i] = s.nextInt();
    }
    for (int i = 0; i < n; i++)
    {
      for (int j = i + 1;j < n; j++)
      {
        if(a[i] > a[j])
        {
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
    System.out.print("Ascending Order:");
    for (int i = 0; i < n - 1;i++)
    {
      System.out.print(a[i]+",");
    }
    System.out.print(a[n - 1]);
  }
} 

OUTPUT:
enter no. of elements you want in array:5
enter all the elements:
7 4 6 2 1
Ascending Order:1,2,4,6,7

RESULT:
  The array elements are successfully sorted in ascending order.
