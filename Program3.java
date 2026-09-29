// Grandparent level
class Grandparent {
    void showGrandparent() {
        System.out.println("Accessing Grandparent Class Method.");
    }
}

// Parent level inheriting Grandparent
class IntermediateParent extends Grandparent {
    void showParent() {
        System.out.println("Accessing Parent Class Method.");
    }
}

// Child level inheriting Parent
class UltimateChild extends IntermediateParent {
    void showChild() {
        System.out.println("Accessing Child Class Method.");
    }
}

// Main Execution Class
public class Program3 {
    public static void main(String[] args) {
        System.out.println("--- MULTILEVEL INHERITANCE ---");
        UltimateChild grandchildObj = new UltimateChild();
        grandchildObj.showGrandparent(); // From top level
        grandchildObj.showParent();      // From middle level
        grandchildObj.showChild();       // From bottom level
    }
}