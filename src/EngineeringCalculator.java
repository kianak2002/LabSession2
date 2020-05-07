import javax.swing.*;
import java.awt.*;

public class EngineeringCalculator {
    //JFrame f;
    JTextArea input = new JTextArea();
    JPanel panel;
    JPanel panel2;

    public EngineeringCalculator(JFrame frame, JTabbedPane tp) {
        panel = new JPanel();



        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton zero = new JButton("0");

        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton divide = new JButton("/");
        JButton multiply = new JButton("*");
        JButton equals = new JButton("=");

        JButton log = new JButton("log");
        JButton percentage = new JButton("%");
        JButton sin = new JButton("sin/cos");
        JButton tan = new JButton("tan/cot");
        JButton shift = new JButton("SHIFT");



//        JScrollPane scrollPane = new JScrollPane(display);
//        //scrollPane.setPreferredSize(new Dimension(500, 400));
//        scrollPane.setSize(80, 50);
//        scrollPane.setLocation(150, 140);
//        frame.getContentPane().add(scrollPane);


        //JLabel label = new JLabel("Basic Calculator");
        //frame.getContentPane().add(BorderLayout.NORTH, label);

        //frame.getContentPane().add(BorderLayout.SOUTH, input);
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new GridBagLayout());


//        panel2 = new JPanel();
//        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
//        panel2.setBackground(Color.DARK_GRAY);
//        frame.getContentPane().add(BorderLayout.EAST, panel2);

        //frame.getContentPane().add(BorderLayout.CENTER, panel);

//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//        frame.setSize(500, 500);


        GridBagConstraints right = new GridBagConstraints();
        right.anchor = GridBagConstraints.WEST;
        GridBagConstraints left = new GridBagConstraints();
        left.anchor = GridBagConstraints.EAST;
        GridBagConstraints middle = new GridBagConstraints();
        middle.anchor = GridBagConstraints.CENTER;
        right.gridwidth = GridBagConstraints.REMAINDER;
        right.fill = GridBagConstraints.HORIZONTAL;



        JTextArea display = new JTextArea(3,10);
        //display.setLocation(100,101);
        display.setEditable(false);
        display.setFont(new Font("Arial", 14,14));
        panel.add(display, right);

        // add buttons
        panel.add(one, left);
        panel.add(two, middle);
        panel.add(three, right);
        panel.add(four, left);
        panel.add(five, middle);
        panel.add(six, right);
        panel.add(seven, left);
        panel.add(eight, middle);
        panel.add(nine, right);
        panel.add(zero, right);




        panel.add(equals);
        panel.add(plus);
        panel.add(minus);
        panel.add(divide);
        panel.add(multiply);
        panel.add(equals);
        panel.add(plus);
        panel.add(minus);
        panel.add(divide);
        panel.add(multiply);
        panel.add(log);
        panel.add(percentage);
        panel.add(sin);
        panel.add(tan);
        panel.add(shift);
//        display.add(panel);
//        display.add(panel2);
        tp.add("engineering", panel);
    }
}


