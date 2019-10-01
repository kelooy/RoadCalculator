package pl.kelooystore.roadcalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartupGUI extends JFrame
{

    private final String windowTitle = "Startup Window - RoadCalculator";
    private JPanel mainStartupPanel;
    private JButton forwardButton;
    private JButton exitButton;

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

    protected JPanel getPanel(JPanel startupPanel)
    {
        return startupPanel;
    }

    public StartupGUI()
    {
        setDefaultWindowProperties(windowTitle);
        add(getPanel(mainStartupPanel));

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