import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class example11_4 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("FlowLayout举例");
        FlowLayout f1 = new FlowLayout(FlowLayout.CENTER,  2, 3);
        jf.setLayout(f1);
        JButton btn1 = new JButton("按钮1");
        JButton btn2 = new JButton("按钮2");
        JButton btn3 = new JButton("按钮3");
        jf.add(btn1);
        jf.add(btn2);
        jf.add(btn3);
        jf.setBounds(100, 200, 350, 100);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
