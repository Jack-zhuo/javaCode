package y22.m05.d25;

import java.awt.*;
import javax.swing.*;
public class GridLayoutDemo {
    public void designFrame() {
        JFrame myWindow = new JFrame("小学算术运算测试");
        myWindow.setBounds(700,300,500,600);
        Container cp = myWindow.getContentPane();
        
        cp.setLayout(new GridLayout(12,1,1,1));
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1, 6, 5, 5));
        p1.add(new JLabel("x"));
        p1.add(new JLabel("+"));
        p1.add(new JLabel("y"));
        p1.add(new JLabel("="));
        p1.add(new JTextField("z"));
        p1.add(new JLabel("F or T"));



        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(1, 6, 5, 5));
        p2.add(new JLabel("x"));
        p2.add(new JLabel("+"));
        p2.add(new JLabel("y"));
        p2.add(new JLabel("="));
        p2.add(new JTextField("z"));
        p2.add(new JLabel("F or T"));

        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(1, 6, 5, 5));
        p3.add(new JLabel("x"));
        p3.add(new JLabel("+"));
        p3.add(new JLabel("y"));
        p3.add(new JLabel("="));
        p3.add(new JTextField("z"));
        p3.add(new JLabel("F or T"));


        JPanel p4 = new JPanel();
        p4.setLayout(new GridLayout(1, 6, 5, 5));
        p4.add(new JLabel("x"));
        p4.add(new JLabel("+"));
        p4.add(new JLabel("y"));
        p4.add(new JLabel("="));
        p4.add(new JTextField("z"));
        p4.add(new JLabel("F or T"));


        JPanel p5 = new JPanel();
        p5.setLayout(new GridLayout(1, 6, 5, 5));
        p5.add(new JLabel("x"));
        p5.add(new JLabel("+"));
        p5.add(new JLabel("y"));
        p5.add(new JLabel("="));
        p5.add(new JTextField("z"));
        p5.add(new JLabel("F or T"));

        JPanel p6 = new JPanel();
        p6.setLayout(new GridLayout(1, 6, 5, 5));
        p6.add(new JLabel("x"));
        p6.add(new JLabel("+"));
        p6.add(new JLabel("y"));
        p6.add(new JLabel("="));
        p6.add(new JTextField("z"));
        p6.add(new JLabel("F or T"));


        JPanel p7 = new JPanel();
        p7.setLayout(new GridLayout(1, 6, 5, 5));
        p7.add(new JLabel("x"));
        p7.add(new JLabel("+"));
        p7.add(new JLabel("y"));
        p7.add(new JLabel("="));
        p7.add(new JTextField("z"));
        p7.add(new JLabel("F or T"));


        JPanel p8 = new JPanel();
        p8.setLayout(new GridLayout(1, 6, 5, 5));
        p8.add(new JLabel("x"));
        p8.add(new JLabel("+"));
        p8.add(new JLabel("y"));
        p8.add(new JLabel("="));
        p8.add(new JTextField("z"));
        p8.add(new JLabel("F or T"));


        JPanel p9 = new JPanel();
        p9.setLayout(new GridLayout(1, 6, 5, 5));
        p9.add(new JLabel("x"));
        p9.add(new JLabel("+"));
        p9.add(new JLabel("y"));
        p9.add(new JLabel("="));
        p9.add(new JTextField("z"));
        p9.add(new JLabel("F or T"));


        JPanel p10 = new JPanel();
        p10.setLayout(new GridLayout(1, 6, 5, 5));
        p10.add(new JLabel("x"));
        p10.add(new JLabel("+"));
        p10.add(new JLabel("y"));
        p10.add(new JLabel("="));
        p10.add(new JTextField("z"));
        p10.add(new JLabel("F or T"));


        cp.add(p1);
        cp.add(p2);
        cp.add(p3);
        cp.add(p4);
        cp.add(p5);
        cp.add(p6);
        cp.add(p7);
        cp.add(p8);
        cp.add(p9);
        cp.add(p10);

        JPanel p11 = new JPanel();
        p11.setLayout(null);
        p11.setSize(500,100);
        JLabel l1=new JLabel("总分：");
        l1.setBounds(0,0,50,30);
        p11.add(l1);

        cp.add(p11);


//        JPanel p1 = new JPanel();
//        p1.setLayout(null);
//        JLabel l1 = new JLabel("总分:90");
//        l1.setBounds(300,0,50,30);
//        p1.add(l1);

        //myWindow.pack();
        myWindow.setVisible(true);
        myWindow.setDefaultCloseOperation(myWindow.EXIT_ON_CLOSE);
    }
}
