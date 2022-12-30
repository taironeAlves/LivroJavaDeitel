import java.lang.reflect.Constructor;

public class Exercicio4418 {
    private int numeroDaConta;
    private int saldoMes;
    private int totalItensMes;
    private int totalCreditoMes;
    private int limiteCredito;

    public Exercicio4418(int numeroDaConta, int saldoMes, int totalItensMes, int totalCreditoMes, int limiteCredito) {
        this.numeroDaConta = numeroDaConta;
        this.saldoMes = saldoMes;
        this.totalItensMes = totalItensMes;
        this.totalCreditoMes = totalCreditoMes;
        this.limiteCredito = limiteCredito;

    }

    public int getNumeroConta() {
        return this.numeroDaConta;
    }

    public void setNumeroConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getSaldoMes() {
        return this.saldoMes;
    }

    public void setSaldoMes(int saldoMes) {
        this.saldoMes = saldoMes;
    }

    public int getTotalItensMes() {
        return this.totalItensMes;
    }

    public void setTotalItensMes(int totalItensMes) {
        this.totalItensMes = totalItensMes;
    }

    public int totalCreditoMes(){
        return this.totalCreditoMes;
    }

    public void setCreditoMes( int totalCreditoMes) {
        this.totalCreditoMes = totalCreditoMes;
    }

    public int getLimiteCredito() {
        return this.limiteCredito;
    }

    public void setLimiteCredito(int limiteCredito) {
        this.limiteCredito = limiteCredito;
    }  

    public void novoSasldo(int despesa) {
        int m = getSaldoMes();
        int n = m + despesa;

        if( n > getLimiteCredito()){
            System.out.println("Limite de Credito excedido");
        } else{
            setSaldoMes(n);
            System.out.printf("Este é o seu novo saldo %s%n",getSaldoMes());
            
        }
    
    }
}
