package pl.kelooystore.roadcalculator;

import javax.swing.*;

public class ActionGUI extends FrameTemplate
{
    private JPanel mainActionPanel;
    private JButton calculateButton;
    private JButton exitButton;
    private JButton openConverterButton;
    private JPanel buttonPanel;
    private JCheckBox bothSidesCheckBox;
    private JCheckBox considerWeightCheckBox;
    private JTextArea outputArea;
    private JPanel checkBoxPanel;
    private JButton clearButton;
    private JPanel inputPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private final String windowTitle = "Action Window - RoadCalculator";

    public ActionGUI()
    {
        setDefaultWindowProperties(windowTitle);
        add(mainActionPanel);
    }

}
