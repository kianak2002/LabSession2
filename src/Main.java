import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

        JFrame frame = new JFrame();
        frame.setSize(1000,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTabbedPane tp1 = new JTabbedPane(SwingConstants.TOP);

        EngineeringCalculator engineeringCalculator = new EngineeringCalculator(frame, tp1);
        BasicCalculatorDesign basicCalculatorDesign = new BasicCalculatorDesign(frame, tp1);

        frame.add(tp1);
        //frame.add(tp2);

        frame.setVisible(true);
    }
}
