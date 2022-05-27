package com.bin.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {
    JTextField number = new JTextField(10);
    JButton button = new JButton("Guess");
    JLabel label = new JLabel("Hi");
    public GuessFrame() {
        super();
        setSize(650, 400);
        setLocation(300, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(number.getText());
                System.out.println(num);
            }
        });
        label.setText("number:");
        setLayout(new FlowLayout());
        add(label);
        add(number);
        add(button);
        setVisible(true);
    }

    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
    }
}