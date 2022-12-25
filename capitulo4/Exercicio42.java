//Utilizando DrawLine para conectar os cantos de um painel.
import java.awt.Graphics;
import javax.swing.JPanel;

public class Exercicio42 extends JPanel {
    // desenha um X a partir dos cantos do painel
    public void paint(Graphics g) {
        // Chama paintCompone para assegurar que o painel e exibido corretamente
        super.paintComponent(g);
        
        int altura = getHeight();
        int width = getWidth();
        
        int contador = 0;
        int larguraDividida = width / 15;
        int alturaDividida = altura / 15;
        int totalAltura = alturaDividida;
        int totalLargura = larguraDividida;
        
        // // g.drawLine();
        // g.drawLine(0, 0, totalLargura, getHeight());
        // g.drawLine(0, getHeight(), totalLargura, 0);
        // // g.drawLine(getWidth(),0, totalLargura, getHeight() );

        while (contador <= 15) {
    
            //Esquerdo Superior
            g.drawLine(0, totalAltura, totalLargura, getHeight());
       
            //Esquerdo Inferior
            g.drawLine(0, getHeight() - totalLargura, totalLargura, 0 );

            //Direito Superior
            g.drawLine(getWidth(), totalAltura, getWidth() - totalLargura, getHeight());

            //Direito Inferior
            g.drawLine(getWidth(), getHeight() - totalAltura, getWidth() - totalLargura, 0 );
          
            totalLargura += larguraDividida ;
            totalAltura += alturaDividida ;
            contador++;
            
        }

    }
}