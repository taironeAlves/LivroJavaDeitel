import java.util.Scanner;

/**
 * Exercicio4430
 */
public class Exercicio4430 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Number tem que ser int para desconsiderar os valores pós virgulas que serão
        // gerados mais abaixo.
        int number = 0;

        while (number <= 9999 || number >= 100000) {
            System.out.println("Digite um número de 5 digitos");
            number = input.nextInt();
            // A lógica aqui é feita com base nos cinco digitos. O programa tem que
            // determiniar se o usuário digitou os 5.
            // Neste caso é feito o valor máximo de 4 digito(9999) e o valor minimo de 6
            // digitos(100000). Então para determinar se o usuario digitou
            // 5 digitos tem que fazer um if validar se for menor ou igual e maior ou
            // igual.

            if (number <= 9999 || number >= 100000) {
                System.out.print("Esse não é um número de 5 digitos.");
            }
        }

        // Mantem o valor original do Number, porque mais abaixo seu valor será
        // modificado.
        int originalNumber = number;

        int reverseNumber = 0;

        while (number != 0) {
            // Todo resto de uma divisão por 10 é o último numero, independente da
            // quantidade de números.
            // É necessário que o tipo seja int para que desconsidere tudo depois da
            // virgula.
            int ultimoNumero = number % 10;

            // Essa fórmula é responsável por inverter um numero. Fiquei abismado com essa
            // lógica!
            reverseNumber = (reverseNumber * 10) + ultimoNumero;

            // number = number / 10. Como o Number é de 5 digitos o looping irá reduzi-lo
            // gradativamente para 0
            // Desconsiderando o pós virgula
            number /= 10;

            // System.out.printf("Ultimo numero é %s%n", ultimoNumero);
            // System.out.printf("Numero reverso é %s%n", reverseNumber);
            // System.out.printf("Number %s%n", number);

        }

        if (reverseNumber == originalNumber) {
            System.out.println("Este número é palíndromo");
        } else {
            System.out.println("Não é Palíndromo");
        }
    }
}