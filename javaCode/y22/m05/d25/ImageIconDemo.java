package y22.m05.d25;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageIconDemo extends JFrame {
    public ImageIconDemo(){
        JFrame myLogin = new JFrame("登录页面");
        Container cp = myLogin.getContentPane();

        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JLabel zhanghao = new JLabel("账号：");
        JLabel mima = new JLabel("密码：");
        JTextField input1 = new JTextField();
        JPasswordField input2 = new JPasswordField();
        JButton jb = new JButton("登录");


        zhanghao.setFont(new Font("黑体",Font.BOLD,15));
        mima.setFont(new Font("黑体",Font.BOLD,15));

        zhanghao.setBounds(75,5,50,30);
        input1.setBounds(125,5,200,30);
        mima.setBounds(75,40,50,30);
        input2.setBounds(125,40,200,30);
        jb.setBounds(75,80,250,30);

        URL url = ImageIconDemo.class.getResource("top.jpg");
        ImageIcon imageIcon = new ImageIcon(url);
        JLabel topPic = new JLabel(imageIcon);
        jp1.add(topPic,BorderLayout.NORTH);
        jp2.setLayout(null);

        jp2.add(zhanghao);
        jp2.add(input1);
        jp2.add(mima);
        jp2.add(input2);
        jp2.add(jb);
        cp.add(jp1,BorderLayout.NORTH);
        cp.add(jp2,BorderLayout.CENTER);

        myLogin.setBounds(700,350,450,350);
        myLogin.setVisible(true);
    }

    public static void main(String[] args) {
        new ImageIconDemo();
    }
}
