/**
 * Exercicio4432
 */
public class Exercicio4432 {

    public static void main(String[] args) {

        for (int cont = 0; cont < 4; cont++) {
            for (int a = 0; a < 9; a++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int a = 0; a < 9; a++) {
                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}