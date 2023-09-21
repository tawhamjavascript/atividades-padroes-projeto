package locadora;

public class Aluguel {
	   private Alugavel alugavel;
	   private int diasAlugado;
	 
	   public Aluguel(Alugavel alugavel, int diasAlugado) {
	      this.alugavel = alugavel;
	      this.diasAlugado = diasAlugado;
	   }
	 
	   public Alugavel getAlugavel() {
	      return alugavel;
	   }
	 
	   public int getDiasAlugado() {
	      return diasAlugado;
	   }

	public double valorDeUmAluguel() {
		   return alugavel.valorDeUmAluguel(diasAlugado);

	}

	public int calcularPontosDeAlugadorFrequente() {
		return alugavel.calcularPontosDeAlugadorFrequente(diasAlugado);
	}
}
