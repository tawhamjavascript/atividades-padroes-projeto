package locadora;

public class FabricaSimplesClassificacao {

    private FabricaSimplesClassificacao(){};

    public static Classificacao getClassificacao(int codigo){
        switch(codigo){
            case DVD.NORMAL:
                return new ClassificacaoNormal();
            case DVD.LANÇAMENTO:
                return new ClassificacaoLancamento();

            case DVD.INFANTIL:
                return new ClassificacaoInfantil();

            default:
                return null;
        }
    }
}
