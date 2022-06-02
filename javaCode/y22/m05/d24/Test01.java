package y22.m05.d24;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test01{
    public static void main(String[] args) {

        new MyFrame(100,100,200,200,Color.red);
        new MyFrame(100,200,200,200,Color.red);
        new MyFrame(200,100,200,200,Color.red);
        new MyFrame(200,200,200,200,Color.red);
    }
}
class MyFrame extends Frame{
    static int id = 0;
    public MyFrame(int x,int y,int w,int h,Color color){
         super("窗口"+(++id));
         setBounds(x,y,w,h);
         setBackground(color);
         setVisible(true);
         addWindowListener(new WindowAdapter() {
             @Override
             public void windowClosing(WindowEvent e) {
                 System.exit(0);
             }
         });
    }
}