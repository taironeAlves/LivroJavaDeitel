public class Exercicio4419 {
    private String vendedor;
    private double salarioSemanal = 200;
    private double totalVendas;

    public Exercicio4419(String vendedor){
        this.vendedor = vendedor;
            }

    public void adiconarVendas(double vendas){
        this.totalVendas += vendas;
    }

    public double comissao(){
        double m = 0.9;
        double valorReceber = (this.totalVendas * m) + this.salarioSemanal;
        return valorReceber;
    }
}
