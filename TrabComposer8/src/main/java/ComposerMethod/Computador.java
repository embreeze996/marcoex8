package ComposerMethod;

public class Computador {
    private Peca setup;

    public void setSetup(Peca setup) {
        this.setup = setup;
    }

    public String getSetup() {
        if (this.setup == null) {
            throw new NullPointerException("Setup não especificado");
        }
        return this.setup.getPeca();
    }
}
