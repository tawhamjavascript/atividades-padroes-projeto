import java.math.BigDecimal;

public class ContaEstacionamentoNullObject implements ContaEstacionamento{



    public boolean isNull() {
        return true;
    }

    public BigDecimal valorConta() {
        return BigDecimal.ZERO;
    }
}
