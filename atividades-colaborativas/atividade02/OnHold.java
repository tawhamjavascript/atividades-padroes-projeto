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

    public boolean validateRegistration(String matricula) {

        RepositoryStudents repositoryStudents = RepositoryStudents.getInstance();
        context.setStudent(matricula);

        if (repositoryStudents.contains(matricula)) {
            changeState();
            return true;
        } 
        else {
            return false;
        }
    }


    public boolean validateCourse(String course) throws Exception {

        throw new UnsupportedOperationException("Não pode validar curso no estado emEspera");
    }

    public boolean validateCreditCard(CreditCard card) throws Exception {
    
        throw new UnsupportedOperationException("Não pode validar cartão no estado emEspera");
    }

    public String createTicket() throws Exception {
     
        throw new UnsupportedOperationException("Não pode criar ticket no estado emEspera");
    }

    
}
