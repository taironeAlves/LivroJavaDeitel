public class Exercicio445 {
    public static void main(String[] args) {
        int sum = 0;
        int x = 0;

        sum += x;
        System.out.printf("A soma é %s%n", sum);

        while (x < 11) {
            sum += x;
            System.out.printf("A soma agora é %s%n", sum); 

            x++;
        }
    }
}
