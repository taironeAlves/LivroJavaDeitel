public class Exercicio4425 {
    public static void main(String[] args) {
        int count = 1;

        while (count <= 10 ) {
            System.out.println(count % 2 == 1 ? "****": "++++++++");
            ++count;
        }
    }
}
