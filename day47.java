import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class day47 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Window");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Halo, ini GUI sederhana");

        JButton button = new JButton("Klik Saya");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Tombol telah diklik!");
            }
        });
        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }
}
