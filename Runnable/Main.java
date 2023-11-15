package Animasi.Runnable;
import javax.swing.JFrame;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Ini judul window");

        MyPanel panel = new MyPanel();
        jf.getContentPane().add(panel);

        jf.setSize(800, 600);
        jf.setLocationRelativeTo(jf);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
