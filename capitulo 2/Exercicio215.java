import java.util.Scanner;

public class Exercicio215 {
    public static void main(String[] args) {
        
        Scanner resp = new Scanner(System.in);

        int x;
        int y;

        System.out.print("Digite o primeiro numero: ");
        x = resp.nextInt();

        System.out.print("Digite o segundo numero: ");
        y = resp.nextInt();

        System.out.printf("O valor da soma dos dois numeros é %d%n", (y+x));
        System.out.printf("O valor do produto dos dois numeros é %d%n", (y*x));
        System.out.printf("O valor da diferença dos dois numeros é %d%n", (x-y));
        System.out.printf("O valor do quociente dos dois numeros é %d%n", (x/y));
    }
}
