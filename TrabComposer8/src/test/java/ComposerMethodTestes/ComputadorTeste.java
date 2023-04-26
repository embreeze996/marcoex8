package ComposerMethodTestes;

import ComposerMethod.Computador;
import ComposerMethod.ConjuntoPeca;
import ComposerMethod.NotaFiscal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputadorTeste {

    @Test
    void deveRetornarSetupComputador() {
        ConjuntoPeca conjuntoPeca1 = new ConjuntoPeca("Solid State Drive (SSD)");

        ConjuntoPeca conjuntoPeca2 = new ConjuntoPeca("Placa Mãe");
        NotaFiscal notaFiscal21 = new NotaFiscal("Comprador: Leo", 550);
       conjuntoPeca2.addPeca(notaFiscal21);

       ConjuntoPeca conjuntoPeca3 = new ConjuntoPeca("Unidade de Processamento Central (CPU)");
        NotaFiscal notaFiscal31 = new NotaFiscal("Comprador: Lucas", 600);
        NotaFiscal notaFiscal32 = new NotaFiscal("Comprador: Alfredo", 600);
      conjuntoPeca3.addPeca(notaFiscal31);
        conjuntoPeca3.addPeca(notaFiscal32);

        ConjuntoPeca setup = new ConjuntoPeca("Computador Montado");
       setup.addPeca(conjuntoPeca1);
        setup.addPeca(conjuntoPeca2);
        setup.addPeca(conjuntoPeca3);

       Computador computador = new Computador();
        computador.setSetup(setup);

        assertEquals("Conjunto de Peças: Computador Montado\n" +
                "Conjunto de Peças: Solid State Drive (SSD)\n" +
                "Conjunto de Peças: Placa Mãe\n" +
                "Nota Fiscal: Comprador: Leo - preço: 550\n" +
                "Conjunto de Peças: Unidade de Processamento Central (CPU)\n" +
                "Nota Fiscal: Comprador: Lucas - preço: 600\n" +
                "Nota Fiscal: Comprador: Alfredo - preço: 600\n", computador.getSetup());
    }

    @Test
    void deveRetornarExecaoComputadoraSemSetup() {
        try {
            Computador computador = new Computador();
           computador.getSetup();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Setup não especificado", e.getMessage());
        }
    }
}