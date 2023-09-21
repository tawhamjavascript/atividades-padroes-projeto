import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface ContaEstacionamento {

    public abstract BigDecimal valorConta();

    public abstract boolean isNull();
}
