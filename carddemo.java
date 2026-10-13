AIM:
To build a Java AWT user interface that stacks multiple components sequentially like a deck of cards using CardLayout, allowing the user to cycle through different buttons on a single panel by clicking them.

ALGORITHM:
1. Start the application.
2. Create a Frame and a container Panel managed by a CardLayout.
3. Create 3 Buttons, register them to an ActionListener, and add them to the panel.
4. Add the panel directly onto the parent frame container.
5. Listen for clicks: When a button is pressed, trigger actionPerformed() and call next() to show the next card.
6. Set frame size, handle window closing, and make it visible.
7. End the application.

CODE:
import java.awt.*;
import java.awt.event.*;

public class carddemo extends Frame implements ActionListener {
    Button b1, b2, b3; // Removed unused b4
    Panel buttonPanel;
    CardLayout buttonCardLayout;

    // Constructor handles window setup instead of init()
    public carddemo() {
        setTitle("Card Layout Demo");
        setSize(250, 150);
        
        buttonPanel = new Panel();
        add(buttonPanel);
        
        buttonCardLayout = new CardLayout();
        buttonPanel.setLayout(buttonCardLayout);
        
        b1 = new Button("first Button");
        b1.addActionListener(this);
        buttonPanel.add(b1, "first Button");
        
        b2 = new Button("second Button");
        b2.addActionListener(this);
        buttonPanel.add(b2, "second Button");
        
        b3 = new Button("third button");
        b3.addActionListener(this);
        buttonPanel.add(b3, "third Button");

        // Allows the window to close when you click the 'X' button
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        buttonCardLayout.next(buttonPanel);
    }

    // Main entry point for the desktop application
    public static void main(String[] args) {
        new carddemo();
    }
}

RESULT:
We successfully executed card layout program using java.
