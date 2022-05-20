package com.bin.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class MainWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        System.out.println("?");
        frame.setSize(400,300);
        frame.setLocation(200, 200);
        JButton button = new JButton("ok");
        frame.add(button);
        //MyActionListener listener = new MyActionListener();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("HEllO");
            }
        });
        frame.setLayout(new FlowLayout());
        //frame.add(new Button("TEST"));
        //frame.add(new Button("TEST"));
        //original    frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
