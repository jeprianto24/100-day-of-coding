import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class day48 extends JFrame {

    public day48() {
        setTitle("2D Graphics");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new DrawingPanel());
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            day48 example = new day48();
            example.setVisible(true);
        });
    }
}

class DrawingPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g.setColor(Color.BLUE);
        g.fillRect(50, 50, 100, 100);

        g.setColor(Color.RED);
        g.fillOval(200, 50, 100, 100);

        g.setColor(Color.black);
        g.drawLine(50, 200, 300, 200);

        g.setColor(Color.BLACK);
        g.drawString("Hello, Jep!", 150, 300);
    }
}
