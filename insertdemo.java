AIM:
To configure a Java GUI window showcasing five distinct operational zones utilizing the BorderLayout positioning manager along with a cyan background highlight and customized window margins

ALGORITHM:
1. Start the application.
2. Create a Frame window, set its background to cyan, and layout to BorderLayout.
3. Add 4 Buttons to the boundary zones: NORTH, SOUTH, EAST, and WEST.
4. Add a multi-line TextArea to the remaining focal zone: CENTER.
5. Configure spacing margins around the outer frame edges using getInsets().
6. Set frame size, attach a window close listener, and make it visible.
7. End the application

CODE:
import java.awt.*;
import java.awt.event.*;

public class insertdemo extends Frame {

    // Constructor replaces the applet init() method
    public insertdemo() {
        setTitle("Border Layout Demo");
        setSize(400, 200);
        setBackground(Color.cyan);
        setLayout(new BorderLayout());

        add(new Button("this is cross the top"), BorderLayout.NORTH);
        add(new Button("the footer messsage might go here"), BorderLayout.SOUTH);
        add(new Button("RIGHT"), BorderLayout.EAST);
        add(new Button("LEFT"), BorderLayout.WEST);

        String msg = "the reasonable man adapts\n\n";
        add(new TextArea(msg), BorderLayout.CENTER);

        // Allows the window to close when you click the 'X' button
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        setVisible(true);
    }

    public Insets getInsets() {
        // Increased the top inset slightly to clear the Frame title bar
        return new Insets(40, 10, 10, 10);
    }

    // Main entry point for the application
    public static void main(String[] args) {
        new insertdemo();
    }
}

RESULT:
We successfully executed border layout program using java.
