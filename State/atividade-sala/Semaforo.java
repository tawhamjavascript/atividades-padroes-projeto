import java.util.HashMap;
import java.util.Map;

import java.lang.Thread;

public class Semaforo {
	
	private String numTombamento = null;

	private State state; 
	
	public Semaforo(String numTombamento) {

        this.numTombamento = numTombamento;
        // tempo de transicao em segund
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void efetuarTransicao() {
		this.state.changeState();
	}

	
	public String getNumTombamento() {
		return numTombamento;
	}

	public void setNumTombamento(String numTombamento) {
		this.numTombamento = numTombamento;
	}
	
	public State getEstadoAtual() {
		return this.state;
		
	}

	private void resetStateSemafaro() {
		while(!(this.state instanceof Red)) {
			this.efetuarTransicao();
		}
	}
	
	public void setup(Sinal estagio, int novo_tempo_transicao) {
		estagio.setTime(novo_tempo_transicao);

	}
	
	public void exibir() {
		System.out.println(" vermelho  ( " + (state instanceof Red? "X": " ") + " )");
		System.out.println(" amarelo   ( " + (state instanceof Orange?"X":" ") + " )");
		System.out.println(" verde     ( " + (state instanceof Green ?"X":" ") + " )");
	}
	

	
	public void showVisorRegressivo() {
		for (int i = state.time(); i > 0; i--) {
			System.out.println(i + " segundo(s)");
			try {
				// 1000 milisegundos equivale a 1 segundo
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public void start() {
		this.start(45);
	}

	public void start(int time_in_seconds) {
		while(time_in_seconds > 0) {
			System.out.println("Tempo restante da simulacao: " + time_in_seconds + " segundos");
			System.out.println( getEstadoAtual().nome + " : " + getEstadoAtual().time() + " segundos.");
			exibir();
			time_in_seconds -= getEstadoAtual().time();
			showVisorRegressivo();
			efetuarTransicao();
			System.out.println();
			
		}
		
	}
	
	public String toString() {
		String s = "";
		s += "Numero Tombamento: " + numTombamento + "\n";
		s += "Tempo de permanencia em cada estagio:\n";
		State state = this.state;

		while(!(state instanceof Red)) {
			state = state.nextState();
		}

		do {
			s += state.tipo + " : " + state.time() + " segundos\n";
			state = state.nextState();
		} while(!(state instanceof Red));
		
		return s;
	}
}
