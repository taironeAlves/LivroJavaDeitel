package capitulo3;

public class Exercicio313T {
    public static void main(String[] args) {

        Exercicio313 empregado1 = new Exercicio313("Tairone", "Alves", 3000.0);
        Exercicio313 empregado2 = new Exercicio313("Developer", "Java", 5000.0);

        // Exibe Salario
        exibirSalarios(empregado1);
        exibirSalarios(empregado2);

        empregado1.reauste(10);
        empregado2.reauste(10);

        
        exibirSalarios(empregado1);
        exibirSalarios(empregado2);
    }

    public static void exibirSalarios(Exercicio313 display) {
        System.out.printf("%s %s seu salario e R$%s%n", display.getNome(), display.getSobrenome(),
                display.getSalario());
    }
}
