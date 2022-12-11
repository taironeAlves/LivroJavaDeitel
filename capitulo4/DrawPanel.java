
//Utilizando DrawLine para conectar os cantos de um painel.
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
    // desenha um X a partir dos cantos do painel
    public void paint(Graphics g) {
        // Chama paintCompone para assegurar que o painel e exibido corretamente
        super.paintComponent(g);
        int width = getWidth(); // largura total
        int height = getHeight(); // altura total

        // Densenha uma linha a apartir do canto superior esquerdo até o inferior
        // direito
        g.drawLine(0, 0, width, height);

        // Desenha uma linha a partir do canto inferior esquerdo até o superior direito.
        g.drawLine(0, height, width, 0);

    }
}
