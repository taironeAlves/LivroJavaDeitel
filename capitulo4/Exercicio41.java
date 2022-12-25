//Utilizando DrawLine para conectar os cantos de um painel.
import java.awt.Graphics;
import javax.swing.JPanel;

public class Exercicio41 extends JPanel {
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
        
        System.out.println(larguraDividida);
        System.out.println(altura); 
        while (contador <= 15) {
    
            //Linhas esquerda-superior
            g.drawLine(0, 0, totalLargura, (altura - totalAltura));
       
            //Linhas direita-superior
            g.drawLine(width, 0, totalLargura, totalAltura); 
           
            //Linhas inferior-esquerda
            g.drawLine(0, altura, totalLargura, totalAltura); 

            //Linhas inferior-direita
            g.drawLine(width, altura ,totalLargura, (altura - totalAltura)); 

            totalLargura += larguraDividida ;
            totalAltura += alturaDividida ;
            contador++;
            
        }

    }
}