public class Cliente {

    private Veiculo veiculo;

    private Estacionamento estacionamento;

    public Cliente(Veiculo veiculo, Estacionamento estacionamento) {
        this.veiculo = veiculo;
        this.estacionamento = estacionamento;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Estacionamento getEstacionamento() {
        return estacionamento;
    }

    public void setEstacionamento(Estacionamento estacionamento) {
        this.estacionamento = estacionamento;
    }
}
