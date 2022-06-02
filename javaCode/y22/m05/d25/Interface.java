package y22.m05.d25;

import java.awt.*;
import javax.swing.*;
public class Interface{
    public void designFrame() {
        JFrame myWindow = new JFrame();
        myWindow.setTitle("小学数学考试自动系统");
        myWindow.setSize(500, 450);
        myWindow.setLocationRelativeTo(null);  //将此窗口置于屏幕的中央
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setLayout(new BorderLayout(20, 20));

        JLabel jl1=new JLabel();
        JPanel jp1 = new JPanel();
        jl1.setFont(new Font("黑体", Font.BOLD, 35));
        jl1.setForeground(Color.blue);
        jp1.add(jl1);
        jp1.setLayout(new GridBagLayout());


        JLabel jl2=new JLabel();
        JPanel jp2 = new JPanel();
        jl2.setFont(new Font("黑体", Font.BOLD, 25));
        jl2.setForeground(Color.red);
        jp2.add(jl2);

//
//        JLName.setFont(new Font("黑体", Font.BOLD, 15));
//        jp3.add(JLName);
//        jp3.add(JTName);
//
//        JLMagic.setFont(new Font("黑体", Font.BOLD, 15));
//        jp4.add(JLMagic);
//        jp4.add(JTMagic);
//
//        JLClass.setFont(new Font("黑体", Font.BOLD, 15));
//        jp5.add(JLClass);
//        jp5.add(JTClass);
//
//        jp6.add(jp2);
//        jp6.add(jp3);
//        jp6.add(jp4);
//        jp6.add(jp5);
//        jp6.setLayout(new GridLayout(4, 2));
//        this.add(jp6, BorderLayout.CENTER);
//        jp6.setBorder(BorderFactory.createLoweredBevelBorder());

//        jp7.add(JBave);
//        jp7.add(jl4);
//        jp7.add(JB1);
//        jp7.add(jl3);
//        jp7.add(JB2);
//        this.add(jp7, BorderLayout.SOUTH);

//        //美化界面
//        try {
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        myWindow.pack();
        myWindow.setDefaultCloseOperation(myWindow.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

    public static void main(String[] args) {
        Interface windoe1=new Interface();
        windoe1.designFrame();
    }
}
