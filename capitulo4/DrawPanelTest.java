import javax.swing.JFrame;
public class DrawPanelTest {
    public static void main(String[] args) {
        //Cria um painel que conte nosso desenho
        DrawPanel panel = new DrawPanel();

        //cria um novo quadro para armazenar o painel
        JFrame application = new JFrame();

        //configura o frame para ser encerrado quando ele é fechado
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);//adiciona o painel ao frame()
        application.setSize(1000,1000); //configura o tamnaho do frame(quadro de fotos)
        application.setVisible(true);//torna o frame visivel.
    }
}
