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

