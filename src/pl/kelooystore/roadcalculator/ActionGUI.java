package pl.kelooystore.roadcalculator;

import javax.swing.*;

public class ActionGUI extends StartupGUI
{
    private JPanel mainActionPanel;
    private JButton calculateButton;
    private JButton exitButton;
    private final String windowTitle = "Action Window - RoadCalculator";

    public ActionGUI()
    {
        setDefaultWindowProperties(windowTitle);
        add(getPanel(mainActionPanel));
    }

    @Override
    protected JPanel getPanel(JPanel actionPanel)
    {
        return actionPanel;
    }
}
