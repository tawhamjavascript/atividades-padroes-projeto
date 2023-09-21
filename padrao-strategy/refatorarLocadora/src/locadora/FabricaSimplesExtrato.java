package locadora;


public class FabricaSimplesExtrato {

    static TipoExtrato tipoExtrato;
    private FabricaSimplesExtrato(){};

    public static Extrato getExtrato(int tipo, Cliente cliente){
        if (tipo == TipoExtrato.SHELL.getTipo()){
            return new ExtratoShell(cliente);
        } else if (tipo == TipoExtrato.HTML.getTipo()){

            return new ExtratoHTML(cliente);
        }
        return null;
    }
}
