import javax.swing.JFrame;

public class Exercicio41Test {
    public static void main(String[] args) {
        
        Exercicio41 panel = new Exercicio41();

        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);//adiciona o painel ao frame()
        application.setSize(500,500); //configura o tamnaho do frame(quadro de fotos)
        application.setVisible(true);//torna o frame visivel.

    }
}
