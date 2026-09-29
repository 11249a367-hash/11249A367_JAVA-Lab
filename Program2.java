// Parent Component
class Parent {
    void showParent() {
        System.out.println("Accessing Parent Class Method.");
    }
}

// Child Component inheriting Parent
class Child extends Parent {
    void showChild() {
        System.out.println("Accessing Child Class Method.");
    }
}

// Main Execution Class
public class Program2 {
    public static void main(String[] args) {
        System.out.println("--- SINGLE INHERITANCE ---");
        Child childObj = new Child();
        childObj.showParent(); // Inherited method
        childObj.showChild();  // Child's own method
    }
}

