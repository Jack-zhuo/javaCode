package y22.m05.d30;

import utils.JDBCUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Register extends JFrame {
    private JFrame mywindows;
    private JButton b1;
    private JButton b2;
    private JLabel username;
    private JLabel password;
    private JTextField f1;
    private JTextField f2;
    private JTextField f3;
     Process pro;


    public static void main(String[] args) {
        Register register = new Register();
        register.design();
    }
    public Register(){
         pro = new Process();
    }
    public void design() {
        mywindows = new JFrame("登录");
        // JPanel p=new JPanel();
        b1 = new JButton("登录");
        b2 = new JButton("取消");
        username = new JLabel("用户");
        password = new JLabel("密码");
        f1 = new JTextField(20);
        f2 = new JTextField(20);

        mywindows.setBounds(500, 400, 250, 200);
        b1.setBounds(50, 100, 60, 30);
        b2.setBounds(120, 100, 60, 30);
        username.setBounds(40, 30, 60, 20);
        password.setBounds(40, 60, 60, 20);
        f1.setBounds(80, 30, 100, 20);
        f2.setBounds(80, 60, 100, 20);

        mywindows.setLayout(null);
        Container cp = mywindows.getContentPane();

        cp.add(b1);
        cp.add(b2);
        cp.add(username);
        cp.add(password);
        //cp.add(p,"Center");
        cp.add(f1);
        cp.add(f2);

        mywindows.setVisible(true);

        b1.addActionListener(new Handler());
    }

    class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Process pro = new Process();



            if (f1.getText().equals("2") && f2.getText().equals("2")) {
                JFrame windows = new JFrame("公司人事管理系统");
                Container panel = windows.getContentPane();
                windows.setBounds(400, 500, 400, 500);
                JButton b1 = new JButton("添加员工信息");
                JButton b2 = new JButton("查询员工信息");
                JButton b3 = new JButton("修改员工信息");
                JButton b4 = new JButton("删除员工信息");

                panel.add(b1);
                panel.add(b2);
                panel.add(b3);
                panel.add(b4);

                panel.setLayout(null);

                b1.setBounds(100, 80, 150, 40);
                b2.setBounds(100, 140, 150, 40);
                b3.setBounds(100, 200, 150, 40);
                b4.setBounds(100, 260, 150, 40);

                windows.setVisible(true);

                b1.addActionListener(new Handler1());
                b2.addActionListener(new Handler2());
                b3.addActionListener(new Handler3());
                b4.addActionListener(new Handler4());


            } else {
                JOptionPane.showMessageDialog(new JFrame("登录失败"), "登录失败");
            }
        }
    }

    class Handler1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            JFrame windows;
            // JPanel panel;
            JLabel l1;
            JLabel l2;
            JLabel l3;
            JTextField f1;
            JTextField f2;
            JTextField f3;
            JButton b1;


            windows = new JFrame("员工信息添加界面");
            // panel=new JPanel();
            l1 = new JLabel("请输入员工号");
            l2 = new JLabel("请输入员工姓名");
            l3 = new JLabel("请输入员工职位");
            f1 = new JTextField(20);
            f2 = new JTextField(20);
            f3 = new JTextField(20);

            b1 = new JButton("添加");

            Container p = windows.getContentPane();
            windows.setBounds(350, 400, 550, 320);
            windows.setLayout(null);
            l1.setBounds(90, 70, 100, 20);
            f1.setBounds(180, 70, 140, 20);

            l2.setBounds(90, 90, 100, 20);
            f2.setBounds(180, 90, 140, 20);


            l3.setBounds(90, 110, 100, 20);
            f3.setBounds(180, 110, 140, 20);

            b1.setBounds(210, 180, 85, 25);

            p.add(l1);
            p.add(f1);

            p.add(b1);

            p.add(l2);
            p.add(f2);

            p.add(l3);
            p.add(f3);

            windows.setVisible(true);

            b1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    pro.insert(f1.getText(), f2.getText(), f3.getText());
                    JOptionPane.showMessageDialog(null,pro.Search(f1.getText()));
                }
            });

        }


    }

    class Handler2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame windows;
            // JPanel panel;
            JLabel l1;
            JTextField f1;
            JButton b1;


            windows = new JFrame("员工信息查询界面");
            // panel=new JPanel();
            l1 = new JLabel("请输入员工号");
            f1 = new JTextField(20);
            b1 = new JButton("查询");

            Container p = windows.getContentPane();
            windows.setBounds(350, 400, 550, 320);
            windows.setLayout(null);
            l1.setBounds(100, 70, 100, 20);
            f1.setBounds(180, 70, 110, 20);
            b1.setBounds(315, 70, 60, 20);

            p.add(l1);

            p.add(f1);

            p.add(b1);

            b1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    String s = pro.Search(f1.getText());
                    JOptionPane.showMessageDialog(null,s);

                }
            });


            windows.setVisible(true);

        }

    }


    class Handler3 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame windows;
            // JPanel panel;
            JLabel l1;
            JLabel l2;
            JTextField f1;
            JTextField f2;

            JButton b1;


            windows = new JFrame("员工职位修改界面");
            // panel=new JPanel();
            l1 = new JLabel("请输入员工号");
            l2 = new JLabel("请输入员工新职位");

            f1 = new JTextField(20);
            f2 = new JTextField(20);

            b1 = new JButton("修改");

            Container p = windows.getContentPane();
            windows.setBounds(350, 400, 550, 320);
            windows.setLayout(null);
            l1.setBounds(100, 70, 100, 20);
            l2.setBounds(80, 90, 100, 20);
            f1.setBounds(180, 70, 100, 20);
            f2.setBounds(180, 90, 100, 20);
            b1.setBounds(315, 70, 60, 20);

            p.add(l1);

            p.add(l2);

            p.add(f2);

            p.add(f1);

            p.add(b1);

            b1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    String s = pro.Shift(f1.getText(), f2.getText());
                    JOptionPane.showMessageDialog(null,s);
                }
            });


            windows.setVisible(true);
        }
    }


    class Handler4 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame windows;
            // JPanel panel;
            JLabel l1;
            JTextField f1;
            JButton b1;


            windows = new JFrame("员工信息删除界面");
            // panel=new JPanel();
            l1 = new JLabel("请输入员工号");
            f1 = new JTextField(20);
            b1 = new JButton("删除");

            Container p = windows.getContentPane();
            windows.setBounds(350, 400, 550, 320);
            windows.setLayout(null);
            l1.setBounds(100, 70, 100, 20);
            f1.setBounds(180, 70, 110, 20);
            b1.setBounds(315, 70, 60, 20);

            p.add(l1);

            p.add(f1);

            p.add(b1);

            b1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        JDBCUtils.runUpdate("delete from company where id='"+f1.getText()+"'");
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }

//                    String s = pro.Delete(f1.getText());
//                    JOptionPane.showMessageDialog(null,s);
                }
            });


            windows.setVisible(true);
        }
    }
}

