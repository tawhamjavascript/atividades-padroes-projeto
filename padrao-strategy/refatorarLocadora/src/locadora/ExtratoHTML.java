package locadora;

import java.util.Iterator;

public class ExtratoHTML implements Extrato {
    private Cliente cliente;
    private String fimDeLinha = System.getProperty("line.separator");

    public ExtratoHTML(Cliente cliente) {
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
    
    protected String cabecalho() {
        return "<H1>Registro de Alugueis de <EM>" +
                cliente.getNome() + "</EM></H1><P>" + fimDeLinha;
    }

    protected String corpo(Aluguel aluguel) {
        return aluguel.getAlugavel().getTítulo() + ": R$ " +
                aluguel.valorDeUmAluguel() + "<BR>"+ fimDeLinha;
    }

    protected String rodape() {
        return "<P>Valor total pago: <EM>R$ " + cliente.getValorTotal() +
                "</EM>"+ fimDeLinha + "<P>Voce acumulou <EM>" + cliente.getPontosTotaisDeAlugadorFrequente() +
                " pontos </EM> de alugador frequente";
    }
}
