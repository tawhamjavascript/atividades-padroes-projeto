package locadora;

public  enum TipoExtrato {
    SHELL(0), HTML(1);
    private int tipo;
    TipoExtrato(int tipo){
        this.tipo = tipo;
    }
    public int getTipo(){
        return this.tipo;
    }

}
