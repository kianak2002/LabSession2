import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class EngineeringCalculator {
    //JFrame f;
    int calculation = 0;
    String num1 = "", num2 = "";
    String sign = "", answer = "";
    JTextArea input = new JTextArea();
    JPanel panel;
    JButton one;
    JButton two;
    JButton three;
    JButton four;
    JButton five;
    JButton six;
    JButton seven;
    JButton eight;
    JButton nine;
    JButton zero;

    JButton plus;
    JButton minus;
    JButton divide;
    JButton multiply;
    JButton equals;
    JButton log;
    JButton percentage;
    JButton sin;
    JButton tan;
    JButton shift;
    JTextArea display;


    public EngineeringCalculator(JFrame frame, JTabbedPane tp) {
        panel = new JPanel();



        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        zero = new JButton("0");

        plus = new JButton("+");
        minus = new JButton("-");
        divide = new JButton("/");
        multiply = new JButton("*");
        equals = new JButton("=");

        log = new JButton("log");
        percentage = new JButton("%");
        sin = new JButton("sin/cos");
        tan = new JButton("tan/cot");
        shift = new JButton("SHIFT");



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

        GridBagConstraints right = new GridBagConstraints();
        right.anchor = GridBagConstraints.WEST;
        GridBagConstraints left = new GridBagConstraints();
        left.anchor = GridBagConstraints.EAST;
        GridBagConstraints middle = new GridBagConstraints();
        middle.anchor = GridBagConstraints.CENTER;
        right.gridwidth = GridBagConstraints.REMAINDER;
        right.fill = GridBagConstraints.HORIZONTAL;



        display = new JTextArea(3,10);
        //display.setLocation(100,101);
        display.setEditable(false);
        display.setFont(new Font("Arial", 14,14));
        panel.add(display, right);

        ActionHandler handler = new ActionHandler();

        one.addActionListener(handler);
        two.addActionListener(handler);
        three.addActionListener(handler);
        four.addActionListener(handler);
        five.addActionListener(handler);
        six.addActionListener(handler);
        seven.addActionListener(handler);
        eight.addActionListener(handler);
        nine.addActionListener(handler);
        zero.addActionListener(handler);

        plus.addActionListener(handler);
        minus.addActionListener(handler);
        divide.addActionListener(handler);
        multiply.addActionListener(handler);
        equals.addActionListener(handler);


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

        tp.add("engineering", panel);
    }

    public class ActionHandler implements ActionListener, FocusListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            JButton action = new JButton();
            action = (JButton) event.getSource();
            if (event.getSource().equals(one) || event.getSource().equals(two) || event.getSource().equals(three)
                    || event.getSource().equals(four) || event.getSource().equals(five) || event.getSource().equals(six)
                    || event.getSource().equals(seven) || event.getSource().equals(eight) || event.getSource().equals(nine)
                    || event.getSource().equals(zero)) {
                if (sign.equals("")) {
                    num1 += action.getText();
                    display.setText(num1);
                }
                else {
                    num2 += action.getText();
                    display.setText(num1);
                }
            }

            if (event.getSource().equals(plus))
                sign = "+";
            if (event.getSource().equals(minus))
                sign = "-";
            if (event.getSource().equals(divide))
                sign = "/";
            if (event.getSource().equals(multiply))
                sign = "*";
            if (event.getSource().equals(log))
                sign = "log";
            if (event.getSource().equals(shift))
                sign = "S";
            if (sign.equals("S")){
                if (event.getSource().equals(sin))
                    sign = "cos";
                if (event.getSource().equals(tan))
                    sign = "cot";
            }
            else {
                if (event.getSource().equals(sin))
                    sign = "sin";
                if (event.getSource().equals(tan))
                    sign = "tan";
            }

            //answer = num1 + sign + num2;
            System.out.println(num1);
            System.out.println(num2);

            if(action.equals(equals)) {
                int newNum1 = Integer.parseInt(num1);
                int newNum2 = 0;
                if (!(sign.equals("log") && !sign.equals("sin") && !sign.equals("cos") && !sign.equals(tan) && !sign.equals("cot")))
                    newNum2 = Integer.parseInt(num2);
                if (sign.equals("+"))
                    calculation = newNum1 + newNum2;
                if (sign.equals("-"))
                    calculation = newNum1 - newNum2;
                if (sign.equals("*"))
                    calculation = newNum1 * newNum2;
                if (sign.equals("/"))
                    calculation = newNum1 / newNum2;
                if (sign.equals("log"))
                    calculation = (int) Math.log((newNum1));
                if (sign.equals("sin"))
                    calculation = (int) Math.sin(newNum1);
                if (sign.equals("cos"))
                    calculation = (int) Math.cos(newNum1);
                if (sign.equals("tan"))
                    calculation = (int)( Math.sin(newNum1)/Math.cos(newNum1));
                if (sign.equals("cot"))
                    calculation = (int)( Math.cos(newNum1)/Math.sin(newNum1));

                display.setText(" " + calculation);
                num1 = "";
                num2 = "";
                sign = "";
            }
        }

        @Override
        public void focusGained(FocusEvent e) {
            System.out.println("focus gained");
        }

        @Override
        public void focusLost(FocusEvent e) {
            System.out.println("focus lost");
        }
    }

}


