import java.util.ArrayList;
import java.util.List;

public class Subscribed implements State {
    private Kiosk context;

    public Subscribed(Kiosk context) {
        this.context = context;
    }

    public void changeState() {
        context.setState(new Finished(context));
    }



    public String validate(List<String> input) {
        context.getCourse().addStudent(context.getStudent());
        changeState();
        return  "Aluno - " + context.getStudent().getRegistrationId() + '\n' +
                "Curso - " + context.getCourse().getName() + '\n' +
                "Valor - " + context.getCourse().getPrice() + '\n' +
                "Status - " + "Inscrito";
    }

    @Override
    public List<String> input() {
        // TODO Auto-generated method stub
        return new ArrayList<String>();
    }
}
