import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

public class Estacionamento {

    static final BigDecimal VALOR_HORA = new BigDecimal(5.0);
    static final BigDecimal VALOR_DIARIA = new BigDecimal(30.0);
    static final BigDecimal VALOR_MENSALIDADE = new BigDecimal(300.00);

    private ContaEstacionamento conta;

    private LocalDateTime entrada;
    private LocalDateTime saida;
    private Veiculo veiculo;

    public Estacionamento(LocalDateTime entrada, LocalDateTime saida, Veiculo veiculo) {
        this.entrada = entrada;
        this.saida = saida;
        this.veiculo = veiculo;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDateTime entrada) {
        this.entrada = entrada;
    }

    public LocalDateTime getSaida() {
        return saida;
    }

    public void setSaida(LocalDateTime saida) {
        this.saida = saida;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void setConta(ContaEstacionamento conta) {
        this.conta = conta;
    }

    public BigDecimal totalPagar() {
        long periodoHoras = Duration.between(entrada, saida).toHours();
        long periodoDias = Duration.between(entrada, saida).toDays();

        ContaEstacionamento conta = FabricaSimplesContaEstacionamento.addEstacionamentoConta(periodoHoras, periodoDias);
        return conta.valorConta();
    }
}
