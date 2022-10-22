import java.util.Scanner;

public class Execicio217 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int z;

        System.out.print("Digite o primeiro numero: ");
        x = input.nextInt();

        System.out.print("Digite o segundo numero: ");
        y = input.nextInt();

        System.out.print("Digite o terceiro numero: ");
        z = input.nextInt();

        //soma
        System.out.printf("A soma é %d%n", (x +y+z));
        
        //media
        System.out.printf("A media é %d%n", ((x+y+z)/3));


        //multiplicacao
        System.out.printf("O produto é %d%n", (x*y*z));



        if (x > y && x > z) {
            System.out.printf("%d é maior %n", x);
        }

        if (x < y && x < z) {
            System.out.printf("%d é menor %n", x);
        }

        if (y > x && y > z) {
            System.out.printf("%d é maior %n", y);
        }

        if (y < x && y < z ) {
            System.out.printf("%d é menor %n", y);
        }

        if (z > x && z > y) {
            System.out.printf("%d é maior %n", z);
        }

        if (y < x && y < z ) {
            System.out.printf("%d é menor %n", z);
        }

       
    }
}
