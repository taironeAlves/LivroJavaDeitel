//Utilizando DrawLine para conectar os cantos de um painel.
import java.awt.Graphics;
import javax.swing.JPanel;

public class TesteTairone extends JPanel {
    // desenha um X a partir dos cantos do painel
    public void paint(Graphics g) {
        // Chama paintCompone para assegurar que o painel e exibido corretamente
        super.paintComponent(g);
        
        int altura = getHeight();
        int width = getWidth();
        
        int contador = 0;
        int larguraDividida = width / 15;
        int alturaDividida = altura / 15;
        int totalAltura = 0;
        int totalLargura = 0;
        
        //Retângulo principal
        g.drawLine(100, 100, 100, getHeight() - 100);
        g.drawLine(100, getHeight() -100, getWidth() - 100, getHeight() -100);
        g.drawLine(getWidth() - 100, 100, getWidth() - 100, getHeight() -100);
        g.drawLine(100, 100, getWidth() - 100, 100);
        
        //Losango
        g.drawLine(100, getHeight() / 2 , getWidth() / 2, 100 );
        g.drawLine(getWidth() / 2, 100 , getWidth() - 100, getHeight() / 2);
        g.drawLine(getWidth() - 100, getHeight() / 2, getWidth() / 2, getHeight() - 100 );
        g.drawLine(getWidth() /2, getHeight() - 100, 100, getHeight() / 2 );


        System.out.println(larguraDividida);
        System.out.println(altura); 
      
       
    }
}