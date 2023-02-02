import java.util.Scanner;

/**
 * Exercicio4430
 */
public class Exercicio4430 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 12345;

        // while (number <= 9999 || number >= 100000) {
        //     System.out.println("Digite um número de 5 digitos");
        //     number = input.nextInt();
        //     // A lógica aqui é feita com base nos cinco digitos. O programa tem que
        //     // determiniar se o usuário digitou os 5.
        //     // Neste caso é feito o valor máximo de 4 digito(9999) e o valor minimo de 6
        //     // digitos(100000). Então para determinar se o usuario digitou
        //     // 5 digitos tem que fazer um if validar se for menor ou igual e maior ou igual.

        //     if (number <= 9999 || number >= 100000) {
        //         System.out.print("Esse não é um número de 5 digitos.");
        //     }
        // }
        
        int 
        // Todo resto de uma divisão por 10 é o último numero. 
        int ultimoNumero = number % 10;
        

        System.out.println(ultimoNumero);
    }
}