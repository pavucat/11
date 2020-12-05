package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Text extends JFrame {
    Text()
    {
        JFrame frame = new JFrame();
        Font font1 = new Font("Verdana", Font.PLAIN, 11);
        JMenuBar menuBar = new JMenuBar();
        JTextArea textArea = new JTextArea();
        frame.add(textArea);

        JMenu fileMenu = new JMenu("Tool");
        fileMenu.setFont(font1);

        JMenu color = new JMenu("color");
        color.setFont(font1);
        fileMenu.add(color);

        JMenuItem black = new JMenuItem("black");
        black.setFont(font1);
        color.add(black);

        JMenuItem red = new JMenuItem("red");
        red.setFont(font1);
        color.add(red);

        JMenuItem blue = new JMenuItem("blue");
        blue.setFont(font1);
        color.add(blue);

        JMenu font = new JMenu("font");
        font.setFont(font1);
        fileMenu.add(font);

        JMenuItem TNR = new JMenuItem("TNR");
        TNR.setFont(font1);
        font.add(TNR);

        JMenuItem MSS = new JMenuItem("MSS");
        MSS.setFont(font1);
        font.add(MSS);

        JMenuItem CN = new JMenuItem("CN");
        CN.setFont(font1);
        font.add(CN);

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setFont(font1);
        fileMenu.add(exitItem);

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.RED);
            }
        });
        black.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLACK);
            }
        });
        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLUE);
            }
        });

        MSS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 24));
            }
        });

        TNR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 24));
            }
        });

        CN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("Courier New", Font.PLAIN, 24));
            }
        });

        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
    public static void main(String[] args)
    {
      new Text();
    }
}
