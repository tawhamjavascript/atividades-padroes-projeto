package locadora;

public class DVD implements Alugavel {
	public static final int NORMAL = 0;
	public static final int LANÇAMENTO = 1;
	public static final int INFANTIL = 2;
	  private String título;
	  private Classificacao códigoDePreço;

	  public DVD(String título, int códigoDePreço) {
	    this.título = título;
	    this.códigoDePreço = FabricaSimplesClassificacao.getClassificacao(códigoDePreço);

	  }
	 
	  public String getTítulo() {
	    return título;
	  }
	 
	  public Classificacao getCódigoDePreço() {
	    return códigoDePreço;
	  }

	public void setCódigoDePreço(int códigoDePreço) {
		this.códigoDePreço = FabricaSimplesClassificacao.getClassificacao(códigoDePreço);
	}

	public double valorDeUmAluguel(int diasAlugado) {
		return códigoDePreço.getValorDoAluguel(diasAlugado);
	}

	public int calcularPontosDeAlugadorFrequente(int diasAlugado) {
		return códigoDePreço.getPontosDeAlugadorFrequente(diasAlugado);
	}
}
