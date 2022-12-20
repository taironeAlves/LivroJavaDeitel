public class Exercicio228 {
    public static void main(String[] args) {
        
        // raio
        int raio = 5;

        //diamentro
        int diametro = 2 * raio;

        //circunferencia
        double circunferencia = 2 * Math.PI * raio;

        //area
        double area = Math.PI *(raio * raio);

        System.out.printf("O raio é: %d%n", raio);
        System.out.printf("O diametro e: %d%n", diametro);
        System.out.printf("O circunferecia e: %f%n", circunferencia);
        System.out.printf("A area e: %f%n", area);

    }
}
