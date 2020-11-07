package com.company;

import javax.swing.*;
import java.awt.*;

class Layout extends JFrame {
    Layout() {
        BorderLayout layout = new BorderLayout(100, 100);
        JTextField text = new JTextField("EAST");
        add(text, BorderLayout.EAST);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JTextField text1 = new JTextField("WEST");
        add(text1, BorderLayout.WEST);
        JTextField text2 = new JTextField("                        CENTER");
        add(text2, BorderLayout.CENTER);
        JTextField text3 = new JTextField("                                        SOUTH");
        add(text3, BorderLayout.SOUTH);
        JTextField text4 = new JTextField("                                        NORTH");
        add(text4, BorderLayout.NORTH);
        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String [] args)
    {
        new Layout();
    }
}
