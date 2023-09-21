import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

public class ContaVeiculoDiario implements ContaEstacionamento{



    private Long periodoDias;

    public ContaVeiculoDiario(Long periodoDias) {
        this.periodoDias = periodoDias;

    }

    public boolean isNull() {
        return false;
    }


    public BigDecimal valorConta() {
        return Estacionamento.VALOR_DIARIA.multiply(new BigDecimal(periodoDias));
    }
}
