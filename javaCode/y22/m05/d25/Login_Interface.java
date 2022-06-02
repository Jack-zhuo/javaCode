package y22.m05.d25;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Login_Interface extends JFrame {

    JLabel jl1 = new JLabel("欢迎来到考试测试");
    JLabel jl2 = new JLabel("    ");
    JLabel jl3 = new JLabel("       ");
    JButton JB1 = new JButton("开始考试");
    JButton JB2 = new JButton("重置");
    JButton JB3 = new JButton("平均分查看");

    JPanel jp1 = new JPanel();
    JPanel jp2 = new JPanel();

    public Login_Interface() {

        this.setTitle("小学数学考试自动系统");
        this.setSize(500, 450);
        this.setLocationRelativeTo(null);  //将此窗口置于屏幕的中央
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(20,20));

        jl1.setFont(new Font("黑体",Font.BOLD,35));
        jl1.setForeground(Color.blue);
        jp1.add(jl1);
        jp1.setLayout(new GridBagLayout());
        this.add(jp1,BorderLayout.NORTH);

        jp2.add(JB3);
        jp2.add(jl3);
        jp2.add(JB1);
        jp2.add(jl2);
        jp2.add(JB2);
        this.add(jp2,BorderLayout.CENTER);

        JB1.addActionListener(new Handler(this));

//        //美化界面
//        try {
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {

        new Login_Interface();
    }
}
class Handler implements ActionListener{
    Login_Interface li;
    public Handler(Login_Interface li){
        this.li =li;

    }
    public void actionPerformed(ActionEvent e ){
        new GridLayoutDemo().designFrame();
        li.setVisible(false);
    }
}