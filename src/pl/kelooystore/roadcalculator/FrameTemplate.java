package pl.kelooystore.roadcalculator;

import javax.swing.*;
import java.awt.*;

public abstract class FrameTemplate extends JFrame
{

    public void setDefaultWindowProperties(String windowTitle)
    {
        setSize(800,600);
        setTitle(windowTitle);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        showWindow();
    }

    public void showWindow()
    {
        setVisible(true);
    }

    public void hideWindow()
    {
        setVisible(false);
    }

}
