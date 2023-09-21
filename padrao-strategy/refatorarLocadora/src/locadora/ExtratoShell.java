package locadora;


import java.util.Iterator;

public class ExtratoShell implements Extrato{

    private Cliente cliente;
    private String fimDeLinha = System.getProperty("line.separator");

    public ExtratoShell(Cliente cliente) {
        this.cliente = cliente;
    }

    public String extrato() {
        String result = cabecalho();
        Iterator<Aluguel> alugueis = cliente.getItensAlugados();
        while (alugueis.hasNext()) {
            Aluguel aluguel = alugueis.next();
            result += corpo(aluguel);
        }
        result += rodape();
        return result;

    }

    private String cabecalho() {
        return "Registro de Alugueis de " +
                cliente.getNome() + fimDeLinha;
    }

    private String corpo(Aluguel aluguel) {
        return "\t" + aluguel.getAlugavel().getTítulo() + "\t R$ " +
                aluguel.valorDeUmAluguel() + fimDeLinha;
    }

    private String rodape() {
        return "Valor total pago: R$ " + cliente.getValorTotal() +
                fimDeLinha + "Voce acumulou " + cliente.getPontosTotaisDeAlugadorFrequente() +
                " pontos de alugador frequente";
    }
}
