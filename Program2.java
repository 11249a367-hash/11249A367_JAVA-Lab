AIM:
To demonstrate single inheritance in Java where one subclass inherits from one superclass.

ALGORITHM:
1. Start the program.
2. Define a Superclass (e.g., Animal) with a member variable or method (e.g., eat()).
3. Define a Subclass (e.g., Dog) that inherits from the superclass using the extends keyword, and add a specific method (e.g., bark()).
4. Create a Main class and instantiate an object of the subclass (Dog).
5. Invoke both the inherited method (eat()) and the subclass's own method (bark()) using the subclass object.

CODE:
class Parent {
    void showParent() {
        System.out.println("Accessing Parent Class Method.");
    }
}

class Child extends Parent {
    void showChild() {
        System.out.println("Accessing Child Class Method.");
    }
}

public class Program2 {
    public static void main(String[] args) {
        System.out.println("--- SINGLE INHERITANCE ---");
        Child childObj = new Child();
        childObj.showParent(); 
        childObj.showChild();  
    }
}

OUTPUT:
--- SINGLE INHERITANCE ---
Accessing Parent Class Method
Accessing Child Class Method

RESULT:
The program successfully demonstrated single inheritance by allowing the subclass object to access both its own methods and its parent class methods.
