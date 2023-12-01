import javax.swing.*;

class FirstWindow extends JFrame {
    public FirstWindow(String title) {
        this.setTitle(title);
        this.setSize(300, 200);
        this.setLocation(100, 100);
        this.setVisible(true);
    }
}
public class example11_1{
    public static void main(String[] args) {
        FirstWindow f = new FirstWindow("窗体二");
    }
}
