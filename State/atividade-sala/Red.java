public class Red extends State {

    public Red(Semaforo contexto) {
        
        super(contexto, Sinal.VERMELHO.getTime(), 
        Sinal.VERMELHO.getAcao(), Sinal.VERMELHO.getTipo());
    }

    public void changeState() {
        this.contexto.setState(new Green(this.contexto));
            
    }

    @Override
    public Integer time() {
        // TODO Auto-generated method 
        
        return this.time;
        
    }

    public State nextState() {
        return new Green(contexto);
    }



    
    
    
}
