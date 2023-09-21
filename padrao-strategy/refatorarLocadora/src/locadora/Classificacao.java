package locadora;

public abstract class Classificacao {
    abstract int getCódigoDePreço();
    abstract double getValorDoAluguel(int diasAlugado);

    public int getPontosDeAlugadorFrequente(int diasAlugado) {
        return 1;
    }
}
