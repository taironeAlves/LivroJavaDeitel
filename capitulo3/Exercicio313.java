package capitulo3;

public class Exercicio313 {
    private String nome;
    private String sobrenome;
    private double salario;

    public Exercicio313(String nome, String sobrenome, Double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;

    }

    public double reauste(double aumento) {
        double salario = getSalario();
        Double novoSalario = salario + (salario * (aumento / 100));
        setSalario(novoSalario);

        return novoSalario;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public Double getSalario() {
        return this.salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSalario(Double salario) {
        if (salario < 0) {
            System.out.println("Salario não pode ser menor que zero");
        } else {
            this.salario = salario;
        }

    }

}
