package y22.m05.d24;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestCalc {
    public static void main(String[] args) {
        new Calculator();
    }
}

class Calculator extends Frame{
    TextField num1;
    TextField num2;
    TextField num3;
    public Calculator(){
        loadFrame();
    }
    public void loadFrame(){
        num1 = new TextField(10);
        num2 = new TextField(10);
        num3 = new TextField(10);
        Button b = new Button("=");
        Label plus = new Label("+");

        setLayout(new FlowLayout());

        add(num1);
        add(plus);
        add(num2);
        add(b);
        add(num3);

        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(num1.getText());
                int n2 = Integer.parseInt(num2.getText());
                num3.setText(""+(n1+n2));
            }
        });

        setLocation(500,500);
        setVisible(true);
        pack();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

}

