import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("ABC-1234", "Fiat", "Preto");
        LocalDateTime inicio = LocalDateTime.now();
        LocalDateTime fim = LocalDateTime.now().plusDays(16);


        Estacionamento estacionamento = new Estacionamento(inicio, fim, veiculo);

        BigDecimal valor = estacionamento.totalPagar();
        if (Objects.equals(valor, BigDecimal.ZERO)) {
            System.out.println("estacionamento inválido");

        }
        else {
            System.out.println("Valor a pagar: " + valor);
        }
    }
}