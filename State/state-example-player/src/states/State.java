package states;
import ui.Player;

/*
 * A classe de estado "base" declara métodos que todos os estados
 * concretos devem implementar e também fornece uma referência
 * anterior ao objeto de contexto associado com o estado.
 * Estados podem usar a referência anterior para realizar a
 * transição contexto para outro estado.
 */
public abstract class State {
    Player player;

    /**
     *  O contexto passa a si mesmo através do construtor do
     *  estado. Isso pode ajudar o estado a recuperar alguns
     *  dados de contexto úteis se for necessário.
     */
    State(Player player) {
        this.player = player;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();
}
