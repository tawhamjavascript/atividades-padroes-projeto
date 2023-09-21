import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Seja bem vindo a loja!");
        System.out.println("Escolha o(s) produto(s):");
        System.out.println("Arroz");
        System.out.println("Yakisoba");
        System.out.println("sushi");
        System.out.println("temaki");
        System.out.println("sushi burguer");
        System.out.println("temaki burguer");
        System.out.println("finalizar compra");

        Map<String, Double> produtos = new HashMap<>();
        produtos.put("Arroz", 10.00);
        produtos.put("Yakisoba", 20.00);
        produtos.put("sushi", 30.00);
        produtos.put("temaki", 40.00);
        produtos.put("sushi burguer", 50.00);
        produtos.put("temaki burguer", 60.00);

        Scanner sc = new Scanner(System.in);
        CarrinhoCompra carrinho = new CarrinhoCompra();
        String opcao = "";


        while (sc.hasNext()) {
            opcao = sc.nextLine();
            if (opcao.equals("finalizar compra")) {
                break;
            }
            carrinho.adicionarProduto(new Produto(opcao, produtos.get(opcao)));

        }

        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1 - PayPal");
        System.out.println("2 - Crédito");
        System.out.println("3 - Débito");

        opcao = sc.nextLine();
        FinalizarCompra finalizarCompra = new FinalizarCompra();

        if (opcao.equals("1")) {
            System.out.println("Digite seu email:");
            String email = sc.nextLine();
            System.out.println("Digite sua senha:");
            String senha = sc.nextLine();
            finalizarCompra.setPagamento(new PagamentoPayPal(email, senha));
        } else if (opcao.equals("2")) {
            System.out.println("Digite o número do cartão:");
            String numeroCartao = sc.nextLine();
            System.out.println("Digite o nome do titular:");
            String nomeTitular = sc.nextLine();
            System.out.println("Digite o código de segurança:");
            String codigoSeguranca = sc.nextLine();
            finalizarCompra.setPagamento(new PagamentoCredito(numeroCartao, nomeTitular, codigoSeguranca));
        } else if (opcao.equals("3")) {
            System.out.println("Digite o número do cartão:");
            String numeroCartao = sc.nextLine();
            System.out.println("Digite o nome do titular:");
            String nomeTitular = sc.nextLine();
            System.out.println("Digite o código de segurança:");
            String codigoSeguranca = sc.nextLine();
            finalizarCompra.setPagamento(new PagamentoDebito(numeroCartao, nomeTitular, codigoSeguranca));
        }



       finalizarCompra.fecharCompra(carrinho.calcularValorTotal());

    }
}