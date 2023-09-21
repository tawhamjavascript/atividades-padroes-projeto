public class PagamentoCredito implements Pagamento{
    private String numeroCartao;
    private String dataValidade;
    private String cvv;

    private Double limite = 1000.00;

    public PagamentoCredito(String numeroCartao, String dataValidade, String cvv) {
        this.numeroCartao = numeroCartao;
        this.dataValidade = dataValidade;
        this.cvv = cvv;
    }

    @Override
    public boolean pagar(Double valor) {
        if (valor > limite) {
            return false;
        }
        limite -= valor;
        return true;
    }
}
