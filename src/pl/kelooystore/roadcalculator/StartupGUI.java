package pl.kelooystore.roadcalculator;

import javax.swing.*;
import java.awt.*;

public class StartupGUI extends JFrame
{

    public void setDefaultWindowProperties()
    {
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public StartupGUI()
    {
        setDefaultWindowProperties();
    }

}
