import java.awt.Graphics;
import javax.swing.JPanel;
import java.lang.Math;

public class Exercicio41 extends JPanel {
    public void paint (Graphics g){
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();


        g.drawLine(0, 0, width, height);

    }

    
}
