import ui.Player;
import ui.UI;

public class ClientePlayer {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
