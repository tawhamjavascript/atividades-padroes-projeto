package locadora;

import java.util.Iterator;

public interface Extrato {


    public String extrato();

    private String cabecalho() {
        return null;
    }

    private String corpo(Aluguel aluguel) {
        return null;
    }

    private String rodape() {
        return null;
    }

}
