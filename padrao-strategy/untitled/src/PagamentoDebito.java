public class PagamentoDebito implements Pagamento {

    private String numeroCartao;
    private String dataValidade;
    private String cvv;

    private Double conta = 100.00;




    public PagamentoDebito(String numeroCartao, String dataValidade, String cvv) {
        this.numeroCartao = numeroCartao;
        this.dataValidade = dataValidade;
        this.cvv = cvv;
    }

    @Override
    public boolean pagar(Double valor) {
        if (valor > conta) {
            return false;
        }
        conta -= valor;
        return true;
    }
}
