package capitulo3;

public class Exercicio312 {
    private String numero;
    private String descricao;
    private int quantidade;
    private double precoItem;

    public Exercicio312(String numero, String descricao, int quantidade, Double precoItem) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoItem = precoItem;

    }

    public double getInvoiceAmount(int quantidade) {

        double precoItem = getPrecoItem();
        double valorFinal;

        if (quantidade <= 0) {
            quantidade = 0;
        }

        if (precoItem <= 0) {
            precoItem = 0.0;
        }
        valorFinal = quantidade * precoItem;

        return valorFinal;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String Numero) {
        this.numero = Numero;
    }

    public String getDescicao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoItem() {
        return this.precoItem;
    }

    public void setPrecoItem(Double precoItem) {
        this.precoItem = precoItem;
    }

}
