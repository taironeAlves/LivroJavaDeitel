package capitulo3;

public class Exercicio312T {
    public static void main(String[] args) {
       
        Exercicio312 invoice = new Exercicio312("10", "Produtos de otima qualidade ", -10, -10.0);

        //gets
        System.out.printf("numero %s%n", invoice.getNumero());

        //sets
        String numero = "20";
        invoice.setNumero(numero);

        System.out.printf("numero %s%n", invoice.getNumero());
        
        double valorInvoce = invoice.getInvoiceAmount(10);
        System.out.printf("O valor dos produtos e R$%s:",valorInvoce );
    }
}
