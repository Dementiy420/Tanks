package com.omsPunk.Main;

import com.omsPunk.display.Display;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Main
{
    public static void main(String [] args)
    {
        Display.Create(700, 650, "Танки");

        Timer timer = new Timer(1000 / 60, new AbstractAction()
        {
            public void actionPerformed(ActionEvent e) {Display.render();}
        });
        timer.setRepeats(true);
        timer.start();
    }
}
