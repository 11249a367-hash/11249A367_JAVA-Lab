AIM:
To demonstrate multilevel inheritance in Java by creating a linear chain of inheritance across three or more classes.

ALGORITHM:
1. Start the program.
2. Define a Base Class (e.g., Animal) with a foundational method (e.g., eat()).
3. Define an Intermediate Class (e.g., Dog) that inherits from the Base Class and adds its own method (e.g., bark()).
4. Define a Derived Class (e.g., Puppy) that inherits from the Intermediate Class and adds its own method (e.g., weep()).
5. Create a Main class and instantiate an object of the topmost derived class (Puppy).
6. Invoke all methods in the chain (eat(), bark(), and weep()) using the derived class object to prove multi-level access.
7. Stop the program.

CODE:
class Grandparent {
    void showGrandparent() {
        System.out.println("Accessing Grandparent Class Method.");
    }
}

class IntermediateParent extends Grandparent {
    void showParent() {
        System.out.println("Accessing Parent Class Method.");
    }
}

class UltimateChild extends IntermediateParent {
    void showChild() {
        System.out.println("Accessing Child Class Method.");
    }
}

public class Program3 {
    public static void main(String[] args) {
        System.out.println("--- MULTILEVEL INHERITANCE ---");
        UltimateChild grandchildObj = new UltimateChild();
        grandchildObj.showGrandparent(); 
        grandchildObj.showParent();     
        grandchildObj.showChild();      
    }
}

OUTPUT:
--- MULTILEVEL INHERITANCE ---
Accessing Grandparent class method
Accessing parent class method
Accessing child class method
RESULT:
The program successfully demonstrated multilevel inheritance by establishing a class chain where the bottom-most derived object accessed methods from all parent levels.
