package pl.kelooystore.roadcalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartupGUI extends FrameTemplate
{

    private final String windowTitle = "Startup Window - RoadCalculator";
    private JPanel mainStartupPanel;
    private JButton forwardButton;
    private JButton exitButton;


    public StartupGUI()
    {
        setDefaultWindowProperties(windowTitle);
        add(mainStartupPanel);

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                System.exit(0);
            }
        });

        forwardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                hideWindow();
                ActionGUI appActionGUI = new ActionGUI();
            }
        });
    }

}