import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author Meredith
 * @Date 2018/9/9 20:42
 * @Param
 * @Return
 * @Description:
 **/
class test_GUI
{
    private static String ID;
    private JFrame jFrame = new JFrame("登录");
    private Container c = jFrame.getContentPane();
    private JLabel a1 = new JLabel("用户名");
    private JTextField username = new JTextField();
    private JLabel a2 = new JLabel("密   码");
    private JPasswordField password = new JPasswordField();
    private JButton okbtn = new JButton("确定");
    private JButton cancelbtn = new JButton("取消");

    JTextField userText = new JTextField();
    JPasswordField passwordText = new JPasswordField();
    public static void main(String[] args)
    {
        test_GUI A=new test_GUI();
        // 创建 JFrame 实例
        JFrame frame = new JFrame("船只资料管理系统");
        // Setting the width and height of frame
        frame.setLocation(700, 395);//设置窗口居中显示
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        // 添加面板
        frame.add(panel);
        A.place_login(panel);
        // 设置界面可见
        frame.setVisible(true);

      // ID=A.place_login(panel).userText.getText();

    }

    public void place_login(JPanel panel)
    {

        panel.setLayout(null);

        // 创建 JLabel
        JLabel userLabel = new JLabel("用户名:");
        userLabel.setBounds(40, 20, 80, 25);
        panel.add(userLabel);
       // JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        // 输入密码的文本域
        JLabel passwordLabel = new JLabel("密码:");
        passwordLabel.setBounds(40, 50, 80, 25);
        panel.add(passwordLabel);
        //JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);
        // 创建登录按钮
        JButton loginButton = new JButton("登陆");
        loginButton.setBounds(190, 80, 70, 25);
        panel.add(loginButton);
        loginButton.addActionListener(new loginHandler());

        //创建注册按钮
        JButton signinButton = new JButton("注册");
        signinButton.setBounds(100, 80, 70, 25);
        panel.add(signinButton);
        signinButton.addActionListener(new signinHandler());
    }

     class loginHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            test_sql login=new test_sql();
            String ID=userText.getText();
            String password = new String(passwordText.getPassword());
            login.sqlLines="select 用户ID,密码 from 系统用户表 where 用户ID='"+ID+"' and 密码='"+password+"'";//SQL语句
            login.SQL();//执行SQL语句

            if(login.result[1]==null)
               JOptionPane.showMessageDialog(null, "密码错误,请重新输入", "密码错误", JOptionPane.ERROR_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "登陆成功", "登陆成功", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    class signinHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            test_sql signin=new test_sql();
            String ID=userText.getText();
            String password = new String(passwordText.getPassword());
            signin.sqlLines="select 用户ID,密码 from 系统用户表 where 用户ID='"+ID+"' and 密码='"+password+"'";//SQL语句
            signin.SQL();//执行SQL语句

            if(signin.result[1]==null)
                JOptionPane.showMessageDialog(null, "密码错误,请重新输入", "密码错误", JOptionPane.ERROR_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "登陆成功", "登陆成功", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
