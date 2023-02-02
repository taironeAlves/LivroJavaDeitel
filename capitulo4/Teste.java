import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;

        while (number <= 9999 || number >= 100000) {
            System.out.println("Digite um número de cinco dígitos: ");
            number = sc.nextInt();
            if (number <= 9999 || number >= 100000) {
                System.out.println("Erro: número inválido. Por favor, digite um número de cinco dígitos.");
            }
        }

        int originalNumber = number;
        int reverseNumber = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            number /= 10;
        }

        if (originalNumber == reverseNumber) {
            System.out.println("O número é um palíndromo");
        } else {
            System.out.println("O número não é um palíndromo");
        }
    }
}


/*
import java.util.Scanner;

public class Teste {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number;

    while (true) {
      System.out.print("Enter a five-digit integer: ");
      number = input.nextInt();

      if (number >= 10000 && number <= 99999) {
        break;
      } else {
        System.out.println("Invalid input. Try again.");
      }
    }

    int lastDigit = number % 10;
    int firstDigit = number / 10000;

    if (lastDigit == firstDigit) {
      int remainingNumber = number % 100;
      int middleNumber = remainingNumber / 10;
      int reverseMiddleNumber = middleNumber % 10 * 10 + middleNumber / 10;

      if (reverseMiddleNumber == remainingNumber) {
        System.out.println(number + " is a palindrome.");
      } else {
        System.out.println(number + " is not a palindrome.");
      }
    } else {
      System.out.println(number + " is not a palindrome.");
    }
  }
}
*/