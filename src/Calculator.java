import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    public static String current = "";
    public static double current_ans = 0;
    public static double current_number = 0;
    public static double exp = 1;
    public String action = "plus";
    public Calculator(){
        super("calculator");
        setSize(300, 380);
        setLayout(null);
        Button button1 = new Button("1");
        button1.setBounds(25, 77, 50, 50);
        add(button1);
        Button button2 = new Button("2");
        button2.setBounds(77, 77, 50, 50);
        add(button2);
        Button button3 = new Button("3");
        button3.setBounds(129, 77, 50, 50);
        add(button3);
        Button button4 = new Button("4");
        button4.setBounds(25, 129, 50, 50);
        add(button4);
        Button button5 = new Button("5");
        button5.setBounds(77, 129, 50, 50);
        add(button5);
        Button button6 = new Button("6");
        button6.setBounds(129, 129, 50, 50);
        add(button6);
        Button button7 = new Button("7");
        button7.setBounds(25, 181, 50, 50);
        add(button7);
        Button button8 = new Button("8");
        button8.setBounds(77, 181, 50, 50);
        add(button8);
        Button button9 = new Button("9");
        button9.setBounds(129, 181, 50, 50);
        add(button9);
        Button button0 = new Button("0");
        button0.setBounds(77, 233, 50, 50);
        add(button0);

        Button button_plus = new Button("+");
        button_plus.setBounds(181, 77, 50, 50);
        add(button_plus);
        Button button_minus = new Button("-");
        button_minus.setBounds(181, 129, 50, 50);
        add(button_minus);
        Button button_multi = new Button("*");
        button_multi.setBounds(181, 181, 50, 50);
        add(button_multi);
        Button button_divide = new Button("/");
        button_divide.setBounds(181, 233, 50, 50);
        add(button_divide);
        Button button_equal = new Button("=");
        button_equal.setBounds(233, 181, 50, 102);
        add(button_equal);
        Button button_point = new Button(".");
        button_point.setBounds(25, 233, 50, 50);
        add(button_point);
        Button button_delete = new Button("del");
        button_delete.setBounds(233, 77, 50, 50);
        button_delete.setFont(new Font("Arial", Font.PLAIN, 11));
        add(button_delete);
        Button button_clear = new Button("C");
        button_clear.setBounds(233, 129, 50, 50);
        button_clear.setFont(new Font("Arial", Font.PLAIN, 15));
        add(button_clear);


        JTextField textField = new JTextField(20);
        textField.setBounds(25, 25, 208, 50);
        add(textField);
        textField.setFont(new Font("Arial", Font.PLAIN, 20));


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                textField.setText(current + "1");
                current += "1";
                if(exp != 1) { current_number = current_number+exp; exp/=10; }
                else current_number = 10*current_number+exp;
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                textField.setText(current + "2");
                current += "2";
                if(exp != 1) { current_number = current_number+3*exp; exp/=10; }
                else current_number = 10*current_number+2*exp;
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                textField.setText(current + "3");
                current += "3";
                if(exp != 1) { current_number = current_number+3*exp;exp/=10; }
                else current_number = 10*current_number+3*exp;
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                textField.setText(current + "4");
                current += "4";
                if(exp != 1) { current_number = current_number+4*exp;exp/=10; }
                else current_number = 10*current_number+4*exp;
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                textField.setText(current + "5");
                current += "5";
                if(exp != 1) { current_number = current_number+5*exp;exp/=10;}
                else current_number = 10*current_number+5*exp;
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                textField.setText(current + "6");
                current += "6";
                if(exp != 1) { current_number = current_number+6*exp;exp/=10; }
                else current_number = 10*current_number+6*exp;
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                textField.setText(current + "7");
                current += "7";
                if(exp != 1) { current_number = current_number+7*exp;exp/=10;}
                else current_number = 10*current_number+7*exp;
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                textField.setText(current + "8");
                current += "8";
                if(exp != 1) { current_number = current_number+8*exp; exp/=10; }
                else current_number = 10*current_number+8*exp;
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                textField.setText(current + "9");
                current += "9";
                if(exp != 1) { current_number = current_number+9*exp; exp/=10; }
                else current_number = 10*current_number+9*exp;
            }
        });
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                textField.setText(current + "0");
                current += "0";
                if(exp != 1) {exp/=10;}
                else current_number = 10*current_number;
            }
        });
        button_point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                textField.setText(current + ".");
                current += ".";
                exp=0.1;
            }
        });

        button_equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                doAction(action);

                if((current_ans*10) % 10 != 0) {
                    textField.setText(String.format("%.3f", current_ans));
                    current = String.format("%.3f", current_ans);
                }
                else {
                    textField.setText(String.format("%.0f", current_ans));
                    current = String.format("%.0f", current_ans);
                }
                action = "equal";
            }
        });
        button_divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                textField.setText(current + "/");
                current += "/";
                doAction(action);
                action = "divide";
            }
        });
        button_plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                textField.setText(current + "+");
                current += "+";
                doAction(action);
                action = "plus";
            }
        });
        button_minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                textField.setText(current + "-");
                current += "-";
                doAction(action);
                action = "minus";
            }
        });
        button_multi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                textField.setText(current + "*");
                current += "*";
                doAction(action);
                action = "multiple";
            }
        });
        button_delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                if(current.charAt(current.length()-1) <= '9' && current.charAt(current.length()-1) >= '0') {
                    if(exp == 1) current_number = (current_number - (current.charAt(current.length()-1) - '0'))/10;
                    else current_number = (current_number-(current.charAt(current.length()-1) - '0')*exp*10);
                }
                else {
                    return;
                }
                textField.setText(current.substring(0, current.length()-1));
                current = current.substring(0, current.length()-1);
            }
        });
        button_clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                current = "";
                textField.setText(current);
                action = "plus";
                current_number = 0;
                current_ans = 0;
            }
        });
    }
    public void doAction (String action) {
        if (action.equals("plus")) current_ans += current_number;
        else if(action.equals("minus")) current_ans -= current_number;
        else if(action.equals("multiple")) current_ans *= current_number;
        else if(action.equals("divide")) current_ans /= current_number;

        exp = 1;
        current_number = 0;
    }
    public static void main(String[] args) {
        Calculator app = new Calculator();
        app.setVisible(true);
    }
}