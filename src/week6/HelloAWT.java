package week6;

import java.awt.*;
import java.awt.event.*;

public class HelloAWT extends Frame implements ActionListener {
    TextField nameField;
    Label messageLabel;

    HelloAWT() {

        setTitle("AWT Example");
        setSize(300, 200);
        setLayout(new FlowLayout());

        Label nameLabel = new Label("Enter your name:");
        nameField = new TextField(15);
        Button submitButton = new Button("Submit");
        messageLabel = new Label("");

        add(nameLabel);
        add(nameField);
        add(submitButton);
        add(messageLabel);

        submitButton.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        messageLabel.setText("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        new HelloAWT();
    }
}
