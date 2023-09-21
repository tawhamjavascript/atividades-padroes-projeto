package locadora;

public class ClassificacaoNormal extends Classificacao {
    public int getCódigoDePreço() {
        return 1;
    }

    public double getValorDoAluguel(int diasAlugado) {
        double valor = 2;
        if (diasAlugado > 2) {
            valor += (diasAlugado - 2) * 1.5;
        }
        return valor;
    }
}
