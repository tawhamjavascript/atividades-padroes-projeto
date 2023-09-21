import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ContaVeiculoMensal implements ContaEstacionamento {

    public boolean isNull() {
        return false;
    }
    public BigDecimal valorConta() {
        return Estacionamento.VALOR_MENSALIDADE;
    }
}
