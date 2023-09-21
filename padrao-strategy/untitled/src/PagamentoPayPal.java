public class PagamentoPayPal implements Pagamento{
    private String email;
    private String senha;

    private Double saldo = 1000.00;

    public PagamentoPayPal(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    @Override
    public boolean pagar(Double valor) {
        autenticacao();
        if (valor > saldo) {
            return false;
        }
        saldo -= valor;
        return true;
    }

    public void autenticacao() {
        System.out.println("Autenticado com sucesso!");
    }
}
