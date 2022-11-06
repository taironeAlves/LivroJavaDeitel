package capitulo3;
import java.util.Scanner;

public class Exercicio317T {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //Coletando informações da pessoa
        System.out.print("Qual o seu nome? ");
        String nome = input.nextLine();

        System.out.print("Qual seu sobrenome? ");
        String sobrenome = input.nextLine();

        System.out.print("Qual seu sexo? ");
        String sexo = input.nextLine();

        System.out.print("Digite o dia do seu nascimento ");
        int dia = input.nextInt();

        System.out.print("Digite o mes do seu nascimento ");
        int mes = input.nextInt();

        System.out.print("Digite o ano do seu nascimento ");
        int ano = input.nextInt();

        System.out.print("Digite sua altura ");
        double altura = input.nextDouble();
        
        System.out.print("Digite seu peso ");
        int peso = input.nextInt();

        Exercicio317 pessoa = new Exercicio317(nome, sobrenome, sexo, altura, peso, dia, mes, ano);

        System.out.printf("Você se chama %s %s%n",pessoa.getNome(), pessoa.getSobrenome());
        System.out.printf("E do sexo %s%n",pessoa.getSexo());
        System.out.printf("Nascido em %s/%s/%s%n",pessoa.getDia(), pessoa.getMes(), pessoa.getAno());
        System.out.printf("Sua altura E %s%n",pessoa.getAltura());
        System.out.printf("Seu peso E %s%n",pessoa.getPeso());
        System.out.printf("Sua idade E %s%n ",pessoa.getIdade());
        System.out.printf("Seu IMC E de %.2f%n ",pessoa.massaCorporal());
        System.out.printf("Sua frequencia cardiaca maxima E %s%n ",pessoa.frequenciaMaxima());
        System.out.println(pessoa.frequenciaAlvo());
        




       
    }
}
