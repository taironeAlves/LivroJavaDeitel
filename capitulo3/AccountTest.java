package capitulo3;

import java.util.Scanner;

public class AccountTest {
   public static void main(String[] args) {

      // create an Account object and assign it to myAccount
      Account account1 = new Account("Tairone Alves Barreto", 50.0);
      Account account2 = new Account("Desenvolverdor JAVA MAN!", -10.0);

      // Exibo o saldo inicial de cada conta
      System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
      System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());

      // create a Scanner object to obtain input from the command window
      Scanner input = new Scanner(System.in);

      System.out.print("Enter deposit amount for acoount1: ");
      double depositAmount = input.nextDouble();
      System.out.printf("%nadding %.2f to account1 balance %n%n", depositAmount);
      account1.deposit(depositAmount);

      // Exibe o saldo
      System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
      System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());

      // Account 2
      System.out.print("Enter deposit amount for acoount2: ");
      depositAmount = input.nextDouble();
      System.out.printf("%nadding %.2f to account2 balance %n%n", depositAmount);
      account2.deposit(depositAmount);

      // Exibe o saldo
      System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
      System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());

      // Saque conta 1
      System.out.print("Enter withDraw: ");
      double withDraw = input.nextDouble();

      account1.withDraw(withDraw);
      System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());


   }
}