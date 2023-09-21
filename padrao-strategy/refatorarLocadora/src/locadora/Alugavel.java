package locadora;

public interface Alugavel {
    public String getTítulo();
    public double valorDeUmAluguel(int diasAlugado);
    public int calcularPontosDeAlugadorFrequente(int diasAlugado);
}
