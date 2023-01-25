/**
 * Exercicio4429
 */
public class Exercicio4429 {

    public static void main(String[] args) {
        int lado = 10;

        for (int j = 0; j < lado; j++) {
            if (j == 0 || j == (lado - 1)) {
                for (int a = 0; a < lado; a++) {
                    System.out.print("*");
                }
            } else {
                for (int a = 0; a < lado; a++) {
                    if (a == 0 || a == (lado - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}