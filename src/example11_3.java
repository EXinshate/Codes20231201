import javax.swing.*;
import java.awt.*;

public class example11_3 {
    public static void main(String[] args) {
        JFrame f = new JFrame("在窗体上添加面板");
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        JPanel p = new JPanel();
        p.setBackground(Color.red);
        p.setSize(100, 100);
        f.setLayout(null);
        f.getContentPane().add(p);
    }
}
