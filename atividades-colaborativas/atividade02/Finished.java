import java.util.ArrayList;
import java.util.List;

public class Finished implements State {
    
    private Kiosk context;
    
    public Finished(Kiosk context) {
        this.context = context;
    }
    
    public void changeState() {
        context.setState(new OnHold(context));
    }
    
    public String validate(List<String> input) {
        changeState();
        return "Inscrição finalizada! \n";

    }

    public List<String> input() {
        return new ArrayList<String>();
        
    }
}
