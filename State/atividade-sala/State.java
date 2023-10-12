public abstract class State {
    protected Semaforo contexto;

    protected Integer time;
    protected String nome;
    protected String tipo;



    public State(Semaforo contexto, Integer time, String nome, String tipo) {
        this.contexto = contexto;
        this.time = time;
        this.nome = nome;
        this.tipo = tipo;
    }

    public abstract void changeState();
    public abstract Integer time();

    public abstract State nextState();
}
