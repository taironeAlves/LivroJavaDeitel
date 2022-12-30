import java.util.Scanner;
public class Exercicio4418Test {
    public static void main(String[] args) {
        Exercicio4418 z = new Exercicio4418(102030, 1000, 0, 0, 1200);
        
        Scanner b = new Scanner(System.in);

        System.out.print("Qual o valor da compra? ");
        int c = b.nextInt();

        z.novoSasldo(c);
    }
}
