import java.util.Scanner;

public class Exercicio216 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x;
        int y;

        System.out.print("Digite o primeiro numero: ");
        x = input.nextInt();

        System.out.print("Digite o segundo numero: ");
        y = input.nextInt();

        if (x > y) {
            System.out.printf("%d é maior que %d%n", x, y);
        }

        if (x < y) {
            System.out.printf("%d é menor que %d%n", x, y);
        }

        if (x == y) {
            System.out.printf("%d e %d sao iguais %n", x, y);
        }
    }
}
