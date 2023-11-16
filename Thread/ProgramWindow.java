package Animasi.Thread;
import javax.swing.JFrame;
public class ProgramWindow extends Thread {

    MyPanel panel;
    volatile boolean running = true;
    Thread thread;

    public ProgramWindow(){
        panel = new MyPanel();
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        while(running){
            panel.update();
            panel.repaint();
            panel.delay(100);
        }
    }

    public static void main(String[] args) {
        ProgramWindow pw = new ProgramWindow();
        JFrame jf = new JFrame("Ini window");
        jf.getContentPane().add(pw.panel);

        jf.setSize(800, 600);
        jf.setLocationRelativeTo(jf);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}

