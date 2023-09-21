import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

public class ContaVeiculoHoras implements ContaEstacionamento {
    private Long periodoHoras;
    public ContaVeiculoHoras(Long periodoHoras) {
        this.periodoHoras = periodoHoras;

    }
    public boolean isNull() {
        return false;
    }

    public BigDecimal valorConta() {
        return Estacionamento.VALOR_DIARIA.multiply(new BigDecimal(periodoHoras));
    }
}
