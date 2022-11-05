package capitulo3;

import java.util.Scanner;
public class Exercicio311 {
    public static void main(String[] args) {
        
        Account tairone = new Account("Tairone Alves Barreto", 200.21);

        // Exibe o saldo atual da conta
        System.out.printf("O saldo atual da conta e R$%s%n", tairone.getBalance() );

        
        // Saca valor da conta
        Scanner input = new Scanner(System.in);
        System.out.print("Qual valor do saque? ");
        double saque = input.nextDouble();

        tairone.withDraw(saque);

    }
}
