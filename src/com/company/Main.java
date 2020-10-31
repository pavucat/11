package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class VerticalLayout implements LayoutManager
{
    private Dimension size = new Dimension();
    public void addLayoutComponent   (String name, Component comp) {}
    public void removeLayoutComponent(Component comp) {}
    public Dimension minimumLayoutSize(Container c) {
        return calculateBestSize(c);
    }
    public Dimension preferredLayoutSize(Container c) {
        return calculateBestSize(c);
    }
    public void layoutContainer(Container container)
    {
        Component list[] = container.getComponents();
        int currentY = 5;
        for (int i = 0; i < list.length; i++) {
            Dimension pref = list[i].getPreferredSize();
            list[i].setBounds(5, currentY, pref.width, pref.height);
            currentY += 5;
            currentY += pref.height;
        }
    }
    private Dimension calculateBestSize(Container c)
    {
        Component[] list = c.getComponents();
        int maxWidth = 0;
        for (int i = 0; i < list.length; i++) {
            int width = list[i].getWidth();
            if ( width > maxWidth )
                maxWidth = width;
        }
        size.width = maxWidth + 5;
        int height = 0;
        for (int i = 0; i < list.length; i++) {
            height += 5;
            height += list[i].getHeight();
        }
        size.height = height;
        return size;
    }
}
public class Main extends JFrame {
    public Main() {
        Random r = new Random();
        int x=r.nextInt(20);
        final int[] cnt = {0};
        JFrame frame = new JFrame("VerticalLayoutTest");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel contents = new JPanel(new VerticalLayout());
        frame.setContentPane(contents);
        frame.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JTextField text = new JTextField(2);
        JButton button = new JButton("ввод");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s;
                    s = text.getText();
                    System.out.println(x);
                    int a = Integer.parseInt(s);
                    if(a==x) {
                        System.out.println("OK");
                        button.setVisible(false);
                    }
                    else
                        System.out.println("TRY AGAIN");
                    cnt[0]++;
                    if(cnt[0] ==3)
                        button.setVisible(false);

            }
        });
        button.setPreferredSize(new Dimension(100,50));
        contents.add(button);
        contents.add(text);
    }
    public static void main(String[] args) {
	new Main();
    }
}
