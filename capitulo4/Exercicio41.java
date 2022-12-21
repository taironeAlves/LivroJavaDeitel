//Utilizando DrawLine para conectar os cantos de um painel.
import java.awt.Graphics;
import javax.swing.JPanel;

public class Exercicio41 extends JPanel {
    // desenha um X a partir dos cantos do painel
    public void paint(Graphics g) {
        // Chama paintCompone para assegurar que o painel e exibido corretamente
        super.paintComponent(g);
        
        
        int altura = getHeight();
        int passos = 0;
            
        while (altura - passos >= 0) {
    
            g.drawLine(0, 0, passos, altura - passos);
            System.out.println(altura - passos);
            passos = passos + 15;
    
        }

    }
}
