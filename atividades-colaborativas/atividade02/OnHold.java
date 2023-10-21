import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OnHold implements State {

    private Kiosk context;

    public OnHold(Kiosk context) {
        this.context = context;
    }

    

    public void changeState() {
        context.setState(new Identified(context));
    }

    public String validate(List<String> input) {
        String matricula = input.get(0);
        if(matricula.matches("\\d{11}")) {
            context.setStudent(new Student(matricula));
            changeState();

            return "Matricula válida";        
        } else {
            return "Matricula inválida";
        }
    }

    public List<String> input() {
        return new ArrayList<String>(Arrays.asList("Digite sua matricula: "));
        
    }
}
