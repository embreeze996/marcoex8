package ComposerMethod;

public class NotaFiscal extends Peca {

    private int preco;

    public NotaFiscal(String descricao, int preco) {
        super(descricao);
        this.preco = preco;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getPeca() {
        return "Nota Fiscal: " + this.getDescricao() + " - preço: " + this.preco + "\n";
    }

}
