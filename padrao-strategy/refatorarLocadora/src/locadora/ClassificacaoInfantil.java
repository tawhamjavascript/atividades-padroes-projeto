package locadora;

public class ClassificacaoInfantil extends Classificacao {
    public int getCódigoDePreço() {
        return 0;
    }

    public double getValorDoAluguel(int diasAlugado) {
        double valor = 1.5;
        if (diasAlugado > 3) {
            valor += (diasAlugado - 3) * 1.5;
        }
        return valor;
    }
}
