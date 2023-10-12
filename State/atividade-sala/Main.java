

public class Main {

	public static void main(String[] args) {
		Sinal estado = Sinal.VERMELHO;
		System.out.println(estado.getAcao());
		
		Semaforo epitacio = new Semaforo("nfn");
		epitacio.setState(new Red(epitacio));
		System.out.println("Estado Atual: " + epitacio.getEstadoAtual().tipo);
		System.out.println("Significado : " + epitacio.getEstadoAtual().nome);
		//epitacio.exibir();
		
		epitacio.start();
		
		System.out.println("Fim da simulacao.");
		
		System.out.println(epitacio);
				

	}

}
