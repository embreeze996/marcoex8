package ComposerMethod;

import java.util.ArrayList;
import java.util.List;

public class ConjuntoPeca extends Peca {

    private List<Peca> pecas;

    public ConjuntoPeca(String descricao) {
        super(descricao);
        this.pecas = new ArrayList<Peca>();
    }

    public void addPeca(Peca peca) {
        this.pecas.add(peca);
    }

    public String getPeca() {
        String saida = "";
        saida = "Conjunto de Peças: " + this.getDescricao() + "\n";
        for (Peca peca : pecas) {
            saida += peca.getPeca();
        }
        return saida;
    }
}