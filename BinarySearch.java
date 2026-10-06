AIM:
To search for an element in a sorted array using the binary search technique.

ALGORITHM:
1. Read the number of elements and a sorted array.
2. Read the element to be searched.
3. Set low = 0 and high = n - 1.
4. Find mid = (low + high) / 2.
5. If a[mid] equals the key, report the position.
6. If the key is greater, search the right half; otherwise search the left half.
7. Repeat until the element is found or low becomes greater than high.

 PROGRAM: 
import java.util.Scanner;
class BinarySearch
{
public static void main(String ar[])
{ int i,mid,first,last,x,n,flag=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of elements:");
  n=sc.nextInt();
  int a[]=new int[n];
  System.out.println("Enter elements of array:");
  for(i=0;i<n;++i)
   a[i]=sc.nextInt();
   System.out.println("Enter element to search:");
   x=sc.nextInt();
   first=0;
   last=n-1;
   while(first<=last)
   {
   mid=(first+last)/2;
   if(a[mid]>x)
   last=mid-1;
   else
   if(a[mid]<x)
   first=mid+1;
   else
    {
    flag=1;
    System.out.println("element found" );
    break;
  }
}

if(flag==0)
System.out.println("element not found");
}
}

OUTPUT:
Enter number of elements:
4
Enter elements of array:
2 7 5 9
Enter element to search:
7
element found

RESULT:
The required element is successfully searched using binary search.
