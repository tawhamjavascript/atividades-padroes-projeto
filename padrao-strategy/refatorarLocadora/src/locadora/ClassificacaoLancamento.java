package locadora;

public class ClassificacaoLancamento extends Classificacao {

    public int getCódigoDePreço() {
        return 2;
    }

    public double getValorDoAluguel(int diasAlugado) {
        return diasAlugado * 3;
    }

    @Override
    public int getPontosDeAlugadorFrequente(int diasAlugado) {
        return (diasAlugado > 1) ? 2 : 1;
    }
}
