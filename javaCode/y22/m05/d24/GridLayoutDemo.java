package y22.m05.d24;

import java.awt.*;
import javax.swing.*;
public class GridLayoutDemo {
    public void designFrame() {
        JFrame myWindow = new JFrame("计算器");

        Container cp = myWindow.getContentPane();
        cp.setLayout(new GridLayout(2,1,1,1));
        //设置面板的布局方式 GridLayout
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        JLabel l1 = new JLabel("总分:90");
        l1.setBounds(300,0,50,30);
        p1.add(l1);

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(1, 6, 5,5));
        p2.add(new JLabel("                   x"));
        p2.add(new JButton(" +"));
        p2.add(new JButton(" y"));
        p2.add(new JButton(" ="));
        p2.add(new JButton(" z"));
        p2.add(new JButton(" y or n"));
        cp.add(p1);
        cp.add(p2);

        //在窗口的中部放置面板容器
        myWindow.pack();
        myWindow.setVisible(true);
        myWindow.setDefaultCloseOperation(myWindow.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        GridLayoutDemo window1= new GridLayoutDemo();
        window1.designFrame();
    }
}
