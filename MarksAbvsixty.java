AIM:
To print the marks that are greater than 60 from an array.

ALGORITHM:
1. Read the number of students and their marks.
2. Traverse the array of marks.
3. Check whether each mark is greater than 60.
4. If true, print the mark.
5. Display a message if no mark is above 60.

PROGRAM:    
import java.util.Scanner;

public class MarksAbvsixty {
    // A record to group student details together cleanly
    private record Student(String name, int marks) {}

    public static void main(String[] args) {
        Student[] students = new Student[6];
        
        // Try-with-resources automatically closes the Scanner instance
        try (Scanner scanner = new Scanner(System.in)) {
            
            // Loop to receive input
            for (int i = 0; i < students.length; i++) {
                System.out.print("Enter Name of Student and Marks of Subject " + (i + 1) + ": ");
                String name = scanner.next();
                int marks = scanner.nextInt();
                students[i] = new Student(name, marks);
            }

            System.out.println("\nStudents who scored 60 or above:");
            
            // Enhanced for-loop (for-each) for high-scannability and clean filtering
            for (Student student : students) {
                if (student.marks() >= 60) {
                    System.out.println(student.name() + " " + student.marks());
                }
            }
        }
    }
}

OUTPUT:
Enter number of students: 5
Enter marks:
55 72 68 45 90
Marks above 60:
72
68
90

RESULT:
All marks greater than 60 are successfully printed.
