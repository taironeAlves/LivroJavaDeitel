import javax.swing.JFrame;
public class Exercicio41Test {
    public static void main(String[] args) {
        //Cria um painel que conte nosso desenho
        Exercicio41 panel = new Exercicio41();

        //cria um novo quadro para armazenar o painel
        JFrame application = new JFrame();

        //configura o fream para ser encerrado quando ele é fechado
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);//adiciona o painel ao frame()
        application.setSize(500,500); //configura o tamnaho do frame(janela)
        application.setVisible(true);//torna o frame visivel.
    }
}
