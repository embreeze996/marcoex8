package ComposerMethod;

public abstract class Peca {

    private String descricao;

    public Peca(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getPeca();
}

