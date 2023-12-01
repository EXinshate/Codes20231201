import javax.swing.*;

public class example11_2 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("对话框小程序");
        f.setSize(300, 200);
        f.setLocation(100, 100);
        f.setVisible(true);
        JDialog dl = new JDialog(f, "对话框", true);
        dl.setSize(200,100);
        dl.setLocation(100, 150);
        dl.setVisible(true);
    }
}
