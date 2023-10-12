public class Orange extends State {

    public Orange (Semaforo contexto) {

        super(contexto, Sinal.AMARELO.getTime(), 
        Sinal.AMARELO.getAcao(), Sinal.AMARELO.getTipo());
    }

    public void changeState() {
        this.contexto.setState(new Red(contexto));
    }

    public Integer time() {
        return this.time;    
    }   

    public State nextState() {
        return new Red(contexto);
    }
}
