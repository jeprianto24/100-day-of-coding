package Animasi.Thread;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
    int xo = 40;
    int yo = 60;

    public void update(){
        xo += 2;
        yo += 2;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.green);
        g2d.fillOval(xo, yo, 80, 80);
        g2d.dispose();
    }

    public void delay(long l){
        try {
            Thread.sleep(l);
        } catch (InterruptedException ex) {

        }
    }
}

