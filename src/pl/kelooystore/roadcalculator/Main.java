package pl.kelooystore.roadcalculator;

public class Main {

    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread().getName());
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
                System.out.println(Thread.currentThread().getName());
                StartupGUI appStartupGUI = new StartupGUI();
            }
        });
    }

}
