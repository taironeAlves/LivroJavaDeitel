package capitulo3;

public class Exercicio316T {
    public static void main(String[] args) {
      
        Exercicio316 pessoa = new Exercicio316("Tairone", "Alves", 26, 07, 1987);

        System.out.println(pessoa.frequenciaAlvo());

        System.out.printf("%nSua frequencia cardiaca maxima e %s batimentos por minuto.%n", pessoa.frequenciaMaxima());
        
    }
}
