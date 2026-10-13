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
