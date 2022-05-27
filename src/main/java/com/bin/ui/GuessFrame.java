package com.bin.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {
    JTextField number = new JTextField(10);
    JButton button = new JButton("Guess");
    JLabel label1 = new JLabel("Hi1");
    JLabel label2 = new JLabel("Your number");
    Random r = new Random();
    int secret = r.nextInt(10)+1;
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
                if (num>secret){
                    label2.setText("Smaller");
                }else if (num<secret){
                    label2.setText("Bigger");
                }else  {
                    label2.setText("Bingo!");
                }
            }
        });
        label1.setText("Guess a number from 1 to 10");
        setLayout(new FlowLayout());
        add(label1);
        add(number);
        add(button);
        add(label2);
        setVisible(true);
    }

    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
    }
}