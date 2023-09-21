public class FabricaSimplesContaEstacionamento {

    private FabricaSimplesContaEstacionamento() {}

    public static ContaEstacionamento addEstacionamentoConta(Long periodoHoras, Long periodoDias) {


        if (periodoHoras < 12) {
           return new ContaVeiculoHoras(periodoHoras);
        } else if (periodoHoras > 12 && periodoDias < 15) {
            return new ContaVeiculoDiario(periodoDias);
        } else if (periodoDias > 15) {
            return new ContaVeiculoMensal();
        }
        return new ContaEstacionamentoNullObject();
    }
}
