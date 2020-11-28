package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mouse extends Frame implements MouseMotionListener {
    Mouse() {
    }
    public static void main(String [] args)
    {
        //new Layouts();
        //BorderLayout layout = new BorderLayout(100, 100);
        JFrame frame = new JFrame();
        Mouse m = new Mouse();
        JLabel text = new JLabel("EAST");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(text, BorderLayout.EAST);
        JLabel text1 = new JLabel("WEST");
        frame.add(text1, BorderLayout.WEST);
        JLabel text2 = new JLabel("                        CENTER");
        frame.add(text2, BorderLayout.CENTER);
        JLabel text3 = new JLabel("                                        SOUTH");
        frame.add(text3, BorderLayout.SOUTH);
        JLabel text4 = new JLabel("                                        NORTH");
        frame.add(text4, BorderLayout.NORTH);
        frame.setSize(300, 300);
        frame.addMouseMotionListener(m);
        frame.show();
        System.out.println(text.getX());
    }
    public void mouseMoved(MouseEvent me) {
        if(me.getX()>60&&me.getX()<225&&me.getY()>0&&me.getY()<60) {
            JOptionPane.showMessageDialog(Mouse.this, "Welcome to the North");
        }
        if(me.getX()>60&&me.getX()<225&&me.getY()>60&&me.getY()<225) {
            JOptionPane.showMessageDialog(Mouse.this, "Welcome to the Center");
        }
        if(me.getX()>225&&me.getX()<300&&me.getY()>60&&me.getY()<225) {
            JOptionPane.showMessageDialog(Mouse.this, "Welcome to the East");
        }
        if(me.getX()>0&&me.getX()<60&&me.getY()>60&&me.getY()<225) {
            JOptionPane.showMessageDialog(Mouse.this, "Welcome to the West");
        }
        if(me.getX()>60&&me.getX()<225&&me.getY()>225&&me.getY()<300) {
            JOptionPane.showMessageDialog(Mouse.this, "Welcome to the South");
        }
    }
    public void mouseDragged(MouseEvent me) {
    }
}

