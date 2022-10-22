import java.util.Scanner;
public class Exercicio225 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int x;

        System.out.print("Digite um numero: ");
        x = input.nextInt();

        int resto = x % 2;

        if (resto == 0) {
            System.out.println("Este numero e par");
        }else {
            System.out.println("Estte numero e impar");
        }
    }
}
