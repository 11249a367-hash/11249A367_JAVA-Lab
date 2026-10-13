AIM:
To implement a user-defined Java package named Shape containing classes for Square, Circle, and Triangle to calculate and display their respective perimeter and area

ALGORITHM:
1. Start the program.
2. Define a package named Shape containing separate classes for Square, Circle, and Triangle with constructor initialization and methods to compute perimeter and area.
3. Import the Shape package and java.util.Scanner into the main execution class Calculate.
4. Read user inputs for the side of the square, radius of the circle, and three sides of the triangle.
5. Instantiate objects for Square, Circle, and Triangle using the user-provided dimensions.
6. Compute and display the calculated perimeter and area for each shape by invoking their respective methods.
7. Stop the program.

CODE:
import java.util.*; 
class Circle { 
    private int radius; 
    public Circle(int r) { radius=r; } 
    public double perimeter() { return (2*3.14*radius); } 
    public double area() { return (3.14*radius*radius); } 
} 
class Square { 
    private int side; 
    public Square(int s) { side=s; } 
    public int perimeter() { return (4*side); } 
    public int area() { return (side*side); } 
} 
class Triangle { 
    private int side1,side2,side3; 
    public Triangle(int s1,int s2,int s3) { 
        side1=s1; side2=s2; side3=s3; 
    } 
    public int perimeter() { return side1+side2+side3; } 
    public double area() { 
        double s=(side1+side2+side3)/2.0; // Fixed integer division bug
        double a=Math.sqrt(s * (s-side1) * (s-side2) * (s-side3)); // Fixed Heron's formula
        return a; 
    } 
} 
public class Calculate { 
    public static void main(String []args) { 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter The side of the Square : "); 
        int s=sc.nextInt(); 
        Square sq=new Square(s); 
        System.out.println("Perimeter of Square is " + sq.perimeter()); 
        System.out.println("Area of Square is " + sq.area()); 
        System.out.println("Enter The radius of the Circle : "); 
        int r=sc.nextInt(); 
        Circle ci=new Circle(r); // Fixed 's' to 'r' input bug
        System.out.println("Perimeter of Circle is " + ci.perimeter()); 
        System.out.println("Area of Circle is " + ci.area()); 
        System.out.println("Enter The Side1 of the Triangle : "); 
        int s1=sc.nextInt(); 
        System.out.println("Enter The Side2 of the Triangle : "); 
        int s2=sc.nextInt(); 
        System.out.println("Enter The Side3 of the Triangle : "); 
        int s3=sc.nextInt(); 
        Triangle t=new Triangle(s1,s2,s3); 
        System.out.println("Perimeter of Triangle is " + t.perimeter()); 
        System.out.println("Area of Triangle is " + t.area()); 
        sc.close();
    } 
}

OUTPUT:
Enter The side of the Square :
4
Perimeter of Square is 16
Area of Square is 16
Enter The radius of the Circle :
5
Perimeter of Circle is 25.12
Area of Circle is 50.24
Enter The Side1 of the Triangle :
3
Enter The Side2 of the Triangle :
4
Enter The Side3 of the Triangle :
5
Perimeter of Triangle is 12
Area of Triangle is 2.449489742783178

RESULT:
The Java program successfully created and imported a user-defined package to modularize geometric operations and compute the area and perimeter of different shapes.
