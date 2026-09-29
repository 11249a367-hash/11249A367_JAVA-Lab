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
