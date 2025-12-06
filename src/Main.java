import com.sun.javafx.binding.StringFormatter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    public static String current = "";
    public static double current_ans = 0;
    public static double current_number = 0;
    public Main(){
        super("fack");
        setSize(400, 500);
        setLayout(null);
        setBackground(Color.black);

        Button button1 = new Button("1");
        button1.setBounds(100, 100, 50, 50);
        add(button1);
        Button button2 = new Button("2");
        button2.setBounds(152, 100, 50, 50);
        add(button2);
        Button button3 = new Button("3");
        button3.setBounds(204, 100, 50, 50);
        add(button3);
        Button button4 = new Button("4");
        button4.setBounds(100, 152, 50, 50);
        add(button4);
        Button button5 = new Button("5");
        button5.setBounds(152, 152, 50, 50);
        add(button5);
        Button button6 = new Button("6");
        button6.setBounds(204, 152, 50, 50);
        add(button6);
        Button button7 = new Button("7");
        button7.setBounds(100, 204, 50, 50);
        add(button7);
        Button button8 = new Button("8");
        button8.setBounds(152, 204, 50, 50);
        add(button8);
        Button button9 = new Button("9");
        button9.setBounds(204, 204, 50, 50);
        add(button9);
        Button button0 = new Button("0");
        button0.setBounds(152, 256, 50, 50);
        add(button0);
        Button button_plus = new Button("+");
        button_plus.setBounds(256, 100, 50, 50);
        add(button_plus);
        Button button_minus = new Button("-");
        button_minus.setBounds(256, 152, 50, 50);
        add(button_minus);
        Button button_multi = new Button("*");
        button_multi.setBounds(256, 204, 50, 50);
        add(button_multi);
        Button button_equal = new Button("=");
        button_equal.setBounds(256, 256, 50, 50);
        add(button_equal);

        JTextField textField = new JTextField(20);
        textField.setBounds(100, 50, 207, 50);
        add(textField);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                textField.setText(current + "1");
                current += "1";
                current_number = 10*current_number+1;
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                textField.setText(current + "2");
                current += "2";
                current_number = 10*current_number+2;
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                textField.setText(current + "3");
                current += "3";
                current_number = 10*current_number+3;
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                textField.setText(current + "4");
                current += "4";
                current_number = 10*current_number+4;
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                textField.setText(current + "5");
                current += "5";
                current_number = 10*current_number+5;
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                textField.setText(current + "6");
                current += "6";
                current_number = 10*current_number+6;
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                textField.setText(current + "7");
                current += "7";
                current_number = 10*current_number+7;
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                textField.setText(current + "8");
                current += "8";
                current_number = 10*current_number+8;
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                textField.setText(current + "9");
                current += "9";
                current_number = 10*current_number+9;
            }
        });
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                textField.setText(current + "0");
                current += "0";
                current_number = 10*current_number;
            }
        });

        button_equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                current_ans += current_number;
                textField.setText(String.format("%.0f", current_ans));
                current = String.format("%.0f", current_ans);
                current_number = 0;
            }
        });
        button_plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                textField.setText(current + "+");
                current += "+";
                current_ans += current_number;
                current_number = 0;
            }
        });
        button_minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                textField.setText(current + "-");
                current += "-";
                current_ans += current_number;
                current_number = 0;
            }
        });



    }
    public static void main(String[] args) {
        Main app = new Main();
        app.setVisible(true);
    }
}