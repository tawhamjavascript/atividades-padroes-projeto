package locadora;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Aluguel> itensAlugados = new ArrayList<Aluguel>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        itensAlugados.add(aluguel);
    }

    public Iterator<Aluguel> getItensAlugados() {
        return itensAlugados.iterator();
    }

    public double getValorTotal() {
        double valorTotal = 0.0;
        Iterator<Aluguel> alugueis = itensAlugados.iterator();
        while (alugueis.hasNext()) {
            Aluguel cada = alugueis.next();
            valorTotal += cada.valorDeUmAluguel();
        }
        return valorTotal;
    }

    public int getPontosTotaisDeAlugadorFrequente() {
        int pontosDeAlugadorFrequente = 0;
        Iterator<Aluguel> alugueis = itensAlugados.iterator();
        while (alugueis.hasNext()) {
            Aluguel cada = alugueis.next();
            pontosDeAlugadorFrequente += cada.calcularPontosDeAlugadorFrequente();
        }

        return pontosDeAlugadorFrequente;
    }

}
