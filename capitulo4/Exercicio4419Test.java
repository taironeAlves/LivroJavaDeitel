import java.util.Scanner;
public class Exercicio4419Test {
    public static void main(String[] args) {
        int m = 0;

        Scanner s = new Scanner(System.in);

        System.out.print("Qual o nome do vendedor? ");
        
        String b = s.nextLine();

        Exercicio4419 f = new Exercicio4419(b);

        while (m == 0){
            System.out.println("Digite -1 para sair");

            System.out.println("Qual o valor da venda? ");
            Double g = s.nextDouble();

            if(s.nextDouble() == -1){
                break;
            }else {
                f.adiconarVendas(g);
            }
        }
        system.out.printf("%s vocẽ irá receber esta semana a quantia de R$ %s")

    }
}
