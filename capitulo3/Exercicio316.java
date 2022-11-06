package capitulo3;

public class Exercicio316 {
    private String nome;
    private String sobrenome;
    private int dia;
    private int mes;
    private int ano;

    public Exercicio316(String nome, String sobrenome, int dia, int mes, int ano) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }

    public int getIdade(){
        int ano = getAno();
        int novaIdade = 0;
        if (ano < 0) {
            System.out.println("Voce nem nasceu ainda kkk");
        }else{
            novaIdade = 2022 - ano;
        }
        return novaIdade;

    }

    public int frequenciaMaxima(){
        int idade = getIdade();
        int freMax = 220 - idade;

        return freMax;
    }

    public String frequenciaAlvo() {
        int freMaxx = frequenciaMaxima();

        double a = freMaxx;

        double freAlvoMin = a * (50.0 / 100.0) ;

        double freAlvoMax = a * (85.0 / 100.0);

        String resp ="Sua frequencia cardiaca tem que ser entre " + String.valueOf(freAlvoMin) + " e " + String.valueOf(freAlvoMax) + " Batimentos por minuto"; 
        
        return resp;
       
       
    }

    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
