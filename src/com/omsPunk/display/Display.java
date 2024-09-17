package com.omsPunk.display;
import javax.swing.*;
import java.awt.*;

public abstract class Display
{
    private static boolean enableDisplay = false;
    private static JFrame window;
    private static Canvas content;

    public static void Create(int w, int h, String title)
    {
        if (enableDisplay)
            return;

        window = new JFrame(title);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        content = new Canvas();

        Dimension size = new Dimension(w, h);
        content.setPreferredSize(size);

        window.setResizable(false);
        window.getContentPane().add(content);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}