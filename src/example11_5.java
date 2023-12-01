import javax.swing.*;
import java.awt.*;

public class example11_5 {
    public static void main(String[] args) {
        JFrame f = new JFrame("在窗体上添加面板");
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        f.setLayout(null);
        f.getContentPane().setBackground(Color.green);
        f.setSize(300,300);
        p1.setLayout(null);
        p1.setBackground(Color.red);
        p1.setSize(200, 200);
        p2.setBackground(Color.yellow);
        p2.setSize(100,100);
        p1.add(p2);
        f.getContentPane().add(p1);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
