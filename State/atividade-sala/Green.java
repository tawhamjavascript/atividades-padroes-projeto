public class Green extends State {

    public Green(Semaforo context) {
        super(context, Sinal.VERDE.getTime(), 
        Sinal.VERDE.getAcao(), Sinal.VERDE.getTipo());

    }

    @Override
    public void changeState() {
        // TODO Auto-generated method stub
        this.contexto.setState(new Orange(contexto));
    }

    @Override
    public Integer time() {
        // TODO Auto-generated method stub
    
        return this.time;
    }

    public State nextState() {
        return new Orange(contexto);
    }

}
