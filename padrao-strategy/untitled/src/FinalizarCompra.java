public class FinalizarCompra {

    Pagamento pagamento;

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void fecharCompra(Double preco) {

        if (pagamento.pagar(preco)) {
            System.out.println("Compra realizada com sucesso!");
        } else {
            System.out.println("Falha ao realizar compra!");
        }
    }
}
