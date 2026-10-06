AIM:
To find the smallest and largest elements in an integer array.

ALGORITHM:
 1. Read the array elements.
2. Initialize smallest and largest with the first element.
3. Traverse the remaining elements.
4. If an element is smaller than smallest, update smallest.
5. If an element is larger than largest, update largest.
6. Display the smallest and largest values. 

 PROGRAM: 
public class LargestSmallest
{
  public static void main(String[] args)
  {
    int a[] = new int[] { 23, 34, 13, 64, 72, 90, 10, 15, 9, 27 };
    int sum = 0;
    int min = a[0];
    int max = a[0];
    for (int i = 1; i < a.length; i++)
    {
      if (a[i] > max)
      {
        max = a[i];
      }
      if (a[i] < min)
      {
        min = a[i];
      }
      sum = sum + a[i];
    }
    System.out.println("The sum is : " + sum);
    System.out.println("Largest Number in a given array is : " + max);
    System.out.println("Smallest Number in a given array is : " + min);
 }
}

OUTPUT:
The sum is : 334
Largest Number in a given array is : 90
Smallest Number in a given array is : 9

RESULT:
The smallest and largest elements are successfully identified.
