AIM:
To design a Java AWT window application that arranges ten component buttons in a structured grid pattern consisting of 5 rows and 2 columns using GridLayout and applies border spacing with Insets.

ALGORITHM:
1. Start the application.
2. Create a Frame window and set its layout to GridLayout(5, 2).
3. Instantiate 10 Buttons with labels from 'A' to 'J'.
4. Add all buttons sequentially to the frame layout.
5. Apply padding margins around the frame window using the getInsets() method.
6. Set frame size, attach a window close listener, and make it visible.
7. End the application.

CODE:
import java.awt.*;
import java.awt.event.*;

public class gld extends Frame {

    public gld() {
        setTitle("Applet Converted to Frame");
        setSize(300, 300);
        setLayout(new GridLayout(5, 2));

        Button b1 = new Button("A");
        Button b2 = new Button("B");
        Button b3 = new Button("C");
        Button b4 = new Button("D");
        Button b5 = new Button("E");
        Button b6 = new Button("F");
        Button b7 = new Button("G");
        Button b8 = new Button("H");
        Button b9 = new Button("I");
        Button b10 = new Button("J");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);

        // Add padding/insets approximation or close window behavior
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        setVisible(true);
    }

    public Insets getInsets() {
        return new Insets(40, 20, 20, 20); // Adjusted top inset to prevent title bar overlap
    }

    public static void main(String[] args) {
        new gld();
    }
}

RESULT:
We successfully executed grid programm using java.
