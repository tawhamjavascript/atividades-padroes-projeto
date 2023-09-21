import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public Double calcularValorTotal() {
        return produtos.stream().mapToDouble(Produto::getPreco).sum();
    }

}
