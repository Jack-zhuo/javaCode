package y22.m05.d25;

import javax.swing.*;
import java.awt.*;

public class JFrame01 {
    public static void main(String[] args) {
        new myJFrame().init();
    }
}
class myJFrame{
    public void init(){
        JFrame j1 = new JFrame("窗口1");
        j1.setVisible(true);
        j1.setBounds(100,100,500,500);
        j1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container cp = j1.getContentPane();
       cp.setBackground(Color.red);
//        j1.add(new JButton("卓越爱你"));
    }
}